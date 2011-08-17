/*
 * generated by Xtext
 */
package de.peeeq.pscript.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.peeeq.pscript.ast.CST2AST
import de.peeeq.pscript.ast.ACompilationUnit
import de.peeeq.pscript.ast.APackage
import de.peeeq.pscript.ast.AElement
import com.google.inject.Guice
import de.peeeq.pscript.PscriptRuntimeModule
import de.peeeq.pscript.intermediateLang.IntermediateCodeGenerator
import de.peeeq.pscript.backend.jass.JassPrinter
import de.peeeq.pscript.intermediateLang.ILprog
import de.peeeq.pscript.intermediateLang.ILglobalVar
import de.peeeq.pscript.types.PscriptType
import de.peeeq.pscript.intermediateLang.ILfunction
import de.peeeq.pscript.intermediateLang.ILvar
import java.util.List
import de.peeeq.pscript.intermediateLang.ILStatement
import de.peeeq.pscript.intermediateLang.Ilbinary
import de.peeeq.pscript.intermediateLang.IlbuildinFunctionCall
import de.peeeq.pscript.intermediateLang.ILcopy
import de.peeeq.pscript.intermediateLang.ILexitwhen
import de.peeeq.pscript.intermediateLang.ILfunctionCall
import de.peeeq.pscript.intermediateLang.ILif
import de.peeeq.pscript.intermediateLang.ILloop
import de.peeeq.pscript.intermediateLang.ILreturn
import de.peeeq.pscript.intermediateLang.IlsetConst
import de.peeeq.pscript.intermediateLang.Ilunary
import de.peeeq.pscript.intermediateLang.Iloperator
import de.peeeq.pscript.intermediateLang.ILconst
import de.peeeq.pscript.types.PScriptTypeVoid
import de.peeeq.pscript.types.PScriptTypeArray

class PscriptGenerator implements IGenerator {
	
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val injector = Guice::createInjector(new PscriptRuntimeModule());		
		val iLconverter = injector.getInstance(typeof(IntermediateCodeGenerator));
		
		val iLprog = iLconverter.translateProg(resource);
		
		fsa.generateFile("output.j", printProg(iLprog));
		
//		val sb = new StringBuilder();
//		val printer = new JassPrinter(sb);
//		printer.printProg(iLprog);
//		
//		fsa.generateFile("output.j", sb.toString);
		
		
	}
	
	def printProg(ILprog prog) '''
		globals
		�FOR g:prog.globals�
			�g.printGlobal(prog)�
		�ENDFOR�
		
		endglobals
		�FOR f:prog.functions�
			�f.printFunction(prog)�
		�ENDFOR�
	'''
	
	def printGlobal(ILvar g, ILprog prog) '''
		�g.type.printType(prog)� �g.name�	
	'''
	
	def dispatch printType(PscriptType type, ILprog prog)  {
		if (type == null)
			'''nothing'''
		else
			'''�prog.lookupNativeTranslation(type)�'''
	}
	
	def dispatch printType(PScriptTypeVoid type, ILprog prog)  '''nothing'''
	def dispatch printType(PScriptTypeArray type, ILprog prog)  '''�type.baseType.printType(prog)� array'''
	
	
	def printFunction(ILfunction f, ILprog prog) '''
		function �f.name� takes �printParams(f, prog)� returns �f.returnType.printType(prog)�
			�FOR l:f.locals�
				local �l.type.printType(prog)� �l.name�
			�ENDFOR�
			�f.body.printStatements(prog)�
		endfunction
	'''
	
	def printParams(ILfunction f, ILprog prog) {
		if (f.params == null || f.params.size == 0) '''nothing'''
		else printParams(f.params, prog)
	}
	
	def printParams(List<ILvar> params, ILprog prog) 
		'''	�FOR p:params SEPARATOR ', '��p.type.printType(prog)� �p.name��ENDFOR� '''
		
	def printStatements(List<ILStatement> statements, ILprog prog) '''
		�FOR s:statements�
			�s.printStatement(prog)�
		�ENDFOR�
	'''
	
	// abstract:
	def dispatch printStatement(ILStatement s, ILprog prog) '''
		// not implemented: �s�
	'''
	
	def dispatch printStatement(de.peeeq.pscript.intermediateLang.ILsetBinary s, ILprog prog) '''
		set �s.getResultVar.name� = �s.getLeft.name� �s.getOp.printOp� �s.getRight.name�
	'''
	
	def dispatch printStatement(IlbuildinFunctionCall s, ILprog prog) { 
		if (s.resultVar == null) '''
			call �s.funcName�(�s.args.printArguments(prog)�)
			'''
		else '''
			set �s.resultVar.name� = �s.funcName�(�s.args.printArguments(prog)�)
		'''
	}
	
	def printArguments(List<ILvar> args, ILprog prog) 
		'''�FOR a:args SEPARATOR ', '��a.name��ENDFOR�'''
	
	def dispatch printStatement(de.peeeq.pscript.intermediateLang.ILsetVar s, ILprog prog) '''
		set �s.getResultVar.name� = �s.getVar.name�
	'''
	def dispatch printStatement(ILexitwhen s, ILprog prog) '''
		exitwhen �s.^var.name�
	'''
	def dispatch printStatement(ILfunctionCall s, ILprog prog) { 
		if (s.resultVar == null) '''
			call �s.name�(�s.args.printArguments(prog)�)
			'''
		else '''
			set �s.resultVar.name� = �s.name�(�s.args.printArguments(prog)�)
		'''
	}


	def dispatch printStatement(ILif s, ILprog prog) '''
		if �s.cond.name� then
			�s.thenBlock.printStatements(prog)�
		else
			�s.elseBlock.printStatements(prog)�
		endif
	'''
	def dispatch printStatement(ILloop s, ILprog prog) '''
		loop
			�s.loopBody.printStatements(prog)�
		endloop
	'''
	def dispatch printStatement(ILreturn s, ILprog prog) '''
		return �if (s.^var != null) s.^var.name�
	'''
	def dispatch printStatement(IlsetConst s, ILprog prog) '''
		set �s.resultVar.name� = �s.constant.translateConstant�
	'''
	
	def translateConstant(ILconst c) { 
		c.print
	}
	
	
	def dispatch printStatement(de.peeeq.pscript.intermediateLang.IlsetUnary s, ILprog prog) '''
		set �s.getResultVar.name� = �s.getOp.printOp�  �s.getRight.name�
	'''
	
	def printOp(Iloperator op) {
		if (op==Iloperator::OR) '''or'''
		else if (op==Iloperator::AND) '''and'''
		else if (op==Iloperator::NOT) '''not'''
		else if (op==Iloperator::PLUS) '''+'''
		else if (op==Iloperator::MINUS) '''-'''
		else if (op==Iloperator::MULT) '''*'''
		else if (op==Iloperator::DIV_INT) '''/'''
		else if (op==Iloperator::DIV_REAL) '''/'''
		else if (op==Iloperator::MOD_INT) '''MOD''' // TODO 
		else if (op==Iloperator::MOD_REAL) '''MOD''' // TODO 
		else if (op==Iloperator::EQUALITY) '''=='''
		else if (op==Iloperator::UNEQUALITY) '''!='''
		else if (op==Iloperator::LESS) '''<'''
		else if (op==Iloperator::LESS_EQ) '''<='''
		else if (op==Iloperator::GREATER) '''>'''
		else if (op==Iloperator::GREATER_EQ) '''>='''
		else throw new Error("unknown operator");
	}
	
	
	
	/* 
	def prettyPrint(ACompilationUnit c) '''
		�FOR p:c�
			�p.printPackage�
		�ENDFOR�
	'''
	
	def printPackage(APackage p) '''
		�FOR e:p.elements�
			�e.printEntity�
		�ENDFOR�
	'''
	
	def dispatch printEntity(AElement e) '''
		// not implemented �e�
	''' 
	
	*/
}
