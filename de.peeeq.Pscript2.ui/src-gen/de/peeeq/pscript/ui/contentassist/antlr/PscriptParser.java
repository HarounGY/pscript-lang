/*
* generated by Xtext
*/
package de.peeeq.pscript.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.peeeq.pscript.services.PscriptGrammarAccess;

public class PscriptParser extends AbstractContentAssistParser {
	
	@Inject
	private PscriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.peeeq.pscript.ui.contentassist.antlr.internal.InternalPscriptParser createParser() {
		de.peeeq.pscript.ui.contentassist.antlr.internal.InternalPscriptParser result = new de.peeeq.pscript.ui.contentassist.antlr.internal.InternalPscriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getImportStringAccess().getAlternatives_2(), "rule__ImportString__Alternatives_2");
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getTypeDefAccess().getAlternatives(), "rule__TypeDef__Alternatives");
					put(grammarAccess.getClassDefAccess().getAlternatives_6(), "rule__ClassDef__Alternatives_6");
					put(grammarAccess.getClassSlotsAccess().getAlternatives(), "rule__ClassSlots__Alternatives");
					put(grammarAccess.getClassMemberAccess().getAlternatives(), "rule__ClassMember__Alternatives");
					put(grammarAccess.getVarDefAccess().getAlternatives_1(), "rule__VarDef__Alternatives_1");
					put(grammarAccess.getStatementsAccess().getAlternatives_1(), "rule__Statements__Alternatives_1");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getStmtChangeRefCountAccess().getAlternatives_0(), "rule__StmtChangeRefCount__Alternatives_0");
					put(grammarAccess.getLocalVarDefAccess().getAlternatives(), "rule__LocalVarDef__Alternatives");
					put(grammarAccess.getOpAssignmentAccess().getAlternatives(), "rule__OpAssignment__Alternatives");
					put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
					put(grammarAccess.getOpComparisonAccess().getAlternatives(), "rule__OpComparison__Alternatives");
					put(grammarAccess.getOpAdditiveAccess().getAlternatives(), "rule__OpAdditive__Alternatives");
					put(grammarAccess.getOpMultiplicativeAccess().getAlternatives(), "rule__OpMultiplicative__Alternatives");
					put(grammarAccess.getExprSignAccess().getAlternatives(), "rule__ExprSign__Alternatives");
					put(grammarAccess.getExprNotAccess().getAlternatives(), "rule__ExprNot__Alternatives");
					put(grammarAccess.getExprSingleAccess().getAlternatives(), "rule__ExprSingle__Alternatives");
					put(grammarAccess.getExprSingleAccess().getBoolValAlternatives_5_1_0(), "rule__ExprSingle__BoolValAlternatives_5_1_0");
					put(grammarAccess.getExprAtomicAccess().getAlternatives(), "rule__ExprAtomic__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
					put(grammarAccess.getPackageDeclarationAccess().getGroup_5(), "rule__PackageDeclaration__Group_5__0");
					put(grammarAccess.getPackageDeclarationAccess().getGroup_7(), "rule__PackageDeclaration__Group_7__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getImportStringAccess().getGroup(), "rule__ImportString__Group__0");
					put(grammarAccess.getInitBlockAccess().getGroup(), "rule__InitBlock__Group__0");
					put(grammarAccess.getNativeFuncAccess().getGroup(), "rule__NativeFunc__Group__0");
					put(grammarAccess.getNativeFuncAccess().getGroup_4(), "rule__NativeFunc__Group_4__0");
					put(grammarAccess.getNativeFuncAccess().getGroup_4_1(), "rule__NativeFunc__Group_4_1__0");
					put(grammarAccess.getNativeFuncAccess().getGroup_6(), "rule__NativeFunc__Group_6__0");
					put(grammarAccess.getNativeTypeAccess().getGroup(), "rule__NativeType__Group__0");
					put(grammarAccess.getNativeTypeAccess().getGroup_3(), "rule__NativeType__Group_3__0");
					put(grammarAccess.getClassDefAccess().getGroup(), "rule__ClassDef__Group__0");
					put(grammarAccess.getVarDefAccess().getGroup(), "rule__VarDef__Group__0");
					put(grammarAccess.getVarDefAccess().getGroup_1_0(), "rule__VarDef__Group_1_0__0");
					put(grammarAccess.getVarDefAccess().getGroup_1_1(), "rule__VarDef__Group_1_1__0");
					put(grammarAccess.getVarDefAccess().getGroup_1_1_2(), "rule__VarDef__Group_1_1_2__0");
					put(grammarAccess.getTypeExprAccess().getGroup(), "rule__TypeExpr__Group__0");
					put(grammarAccess.getTypeExprAccess().getGroup_1(), "rule__TypeExpr__Group_1__0");
					put(grammarAccess.getTypeExprAccess().getGroup_1_1(), "rule__TypeExpr__Group_1_1__0");
					put(grammarAccess.getConstructorDefAccess().getGroup(), "rule__ConstructorDef__Group__0");
					put(grammarAccess.getConstructorDefAccess().getGroup_2(), "rule__ConstructorDef__Group_2__0");
					put(grammarAccess.getConstructorDefAccess().getGroup_2_1(), "rule__ConstructorDef__Group_2_1__0");
					put(grammarAccess.getOnDestroyDefAccess().getGroup(), "rule__OnDestroyDef__Group__0");
					put(grammarAccess.getFuncDefAccess().getGroup(), "rule__FuncDef__Group__0");
					put(grammarAccess.getFuncDefAccess().getGroup_3(), "rule__FuncDef__Group_3__0");
					put(grammarAccess.getFuncDefAccess().getGroup_3_1(), "rule__FuncDef__Group_3_1__0");
					put(grammarAccess.getFuncDefAccess().getGroup_5(), "rule__FuncDef__Group_5__0");
					put(grammarAccess.getParameterDefAccess().getGroup(), "rule__ParameterDef__Group__0");
					put(grammarAccess.getStatementsAccess().getGroup(), "rule__Statements__Group__0");
					put(grammarAccess.getStmtChangeRefCountAccess().getGroup(), "rule__StmtChangeRefCount__Group__0");
					put(grammarAccess.getStmtDestroyAccess().getGroup(), "rule__StmtDestroy__Group__0");
					put(grammarAccess.getStmtReturnAccess().getGroup(), "rule__StmtReturn__Group__0");
					put(grammarAccess.getStmtIfAccess().getGroup(), "rule__StmtIf__Group__0");
					put(grammarAccess.getStmtIfAccess().getGroup_6(), "rule__StmtIf__Group_6__0");
					put(grammarAccess.getStmtWhileAccess().getGroup(), "rule__StmtWhile__Group__0");
					put(grammarAccess.getLocalVarDefAccess().getGroup_0(), "rule__LocalVarDef__Group_0__0");
					put(grammarAccess.getLocalVarDefAccess().getGroup_0_4(), "rule__LocalVarDef__Group_0_4__0");
					put(grammarAccess.getLocalVarDefAccess().getGroup_1(), "rule__LocalVarDef__Group_1__0");
					put(grammarAccess.getLocalVarDefAccess().getGroup_1_3(), "rule__LocalVarDef__Group_1_3__0");
					put(grammarAccess.getStmtSetOrCallOrVarDefAccess().getGroup(), "rule__StmtSetOrCallOrVarDef__Group__0");
					put(grammarAccess.getStmtSetOrCallOrVarDefAccess().getGroup_2(), "rule__StmtSetOrCallOrVarDef__Group_2__0");
					put(grammarAccess.getOpAssignmentAccess().getGroup_0(), "rule__OpAssignment__Group_0__0");
					put(grammarAccess.getOpAssignmentAccess().getGroup_1(), "rule__OpAssignment__Group_1__0");
					put(grammarAccess.getOpAssignmentAccess().getGroup_2(), "rule__OpAssignment__Group_2__0");
					put(grammarAccess.getExprOrAccess().getGroup(), "rule__ExprOr__Group__0");
					put(grammarAccess.getExprOrAccess().getGroup_1(), "rule__ExprOr__Group_1__0");
					put(grammarAccess.getExprAndAccess().getGroup(), "rule__ExprAnd__Group__0");
					put(grammarAccess.getExprAndAccess().getGroup_1(), "rule__ExprAnd__Group_1__0");
					put(grammarAccess.getExprEqualityAccess().getGroup(), "rule__ExprEquality__Group__0");
					put(grammarAccess.getExprEqualityAccess().getGroup_1(), "rule__ExprEquality__Group_1__0");
					put(grammarAccess.getOpEqualityAccess().getGroup_0(), "rule__OpEquality__Group_0__0");
					put(grammarAccess.getOpEqualityAccess().getGroup_1(), "rule__OpEquality__Group_1__0");
					put(grammarAccess.getExprComparisonAccess().getGroup(), "rule__ExprComparison__Group__0");
					put(grammarAccess.getExprComparisonAccess().getGroup_1(), "rule__ExprComparison__Group_1__0");
					put(grammarAccess.getOpComparisonAccess().getGroup_0(), "rule__OpComparison__Group_0__0");
					put(grammarAccess.getOpComparisonAccess().getGroup_1(), "rule__OpComparison__Group_1__0");
					put(grammarAccess.getOpComparisonAccess().getGroup_2(), "rule__OpComparison__Group_2__0");
					put(grammarAccess.getOpComparisonAccess().getGroup_3(), "rule__OpComparison__Group_3__0");
					put(grammarAccess.getExprAdditiveAccess().getGroup(), "rule__ExprAdditive__Group__0");
					put(grammarAccess.getExprAdditiveAccess().getGroup_1(), "rule__ExprAdditive__Group_1__0");
					put(grammarAccess.getOpAdditiveAccess().getGroup_0(), "rule__OpAdditive__Group_0__0");
					put(grammarAccess.getOpAdditiveAccess().getGroup_1(), "rule__OpAdditive__Group_1__0");
					put(grammarAccess.getExprMultAccess().getGroup(), "rule__ExprMult__Group__0");
					put(grammarAccess.getExprMultAccess().getGroup_1(), "rule__ExprMult__Group_1__0");
					put(grammarAccess.getOpMultiplicativeAccess().getGroup_0(), "rule__OpMultiplicative__Group_0__0");
					put(grammarAccess.getOpMultiplicativeAccess().getGroup_1(), "rule__OpMultiplicative__Group_1__0");
					put(grammarAccess.getOpMultiplicativeAccess().getGroup_2(), "rule__OpMultiplicative__Group_2__0");
					put(grammarAccess.getOpMultiplicativeAccess().getGroup_3(), "rule__OpMultiplicative__Group_3__0");
					put(grammarAccess.getOpMultiplicativeAccess().getGroup_4(), "rule__OpMultiplicative__Group_4__0");
					put(grammarAccess.getExprSignAccess().getGroup_0(), "rule__ExprSign__Group_0__0");
					put(grammarAccess.getExprNotAccess().getGroup_0(), "rule__ExprNot__Group_0__0");
					put(grammarAccess.getExprMemberAccess().getGroup(), "rule__ExprMember__Group__0");
					put(grammarAccess.getExprMemberAccess().getGroup_1(), "rule__ExprMember__Group_1__0");
					put(grammarAccess.getExprMemberRightAccess().getGroup(), "rule__ExprMemberRight__Group__0");
					put(grammarAccess.getExprMemberRightAccess().getGroup_1(), "rule__ExprMemberRight__Group_1__0");
					put(grammarAccess.getExprMemberRightAccess().getGroup_1_1(), "rule__ExprMemberRight__Group_1_1__0");
					put(grammarAccess.getExprMemberRightAccess().getGroup_1_1_1(), "rule__ExprMemberRight__Group_1_1_1__0");
					put(grammarAccess.getExprSingleAccess().getGroup_1(), "rule__ExprSingle__Group_1__0");
					put(grammarAccess.getExprSingleAccess().getGroup_2(), "rule__ExprSingle__Group_2__0");
					put(grammarAccess.getExprSingleAccess().getGroup_3(), "rule__ExprSingle__Group_3__0");
					put(grammarAccess.getExprSingleAccess().getGroup_4(), "rule__ExprSingle__Group_4__0");
					put(grammarAccess.getExprSingleAccess().getGroup_5(), "rule__ExprSingle__Group_5__0");
					put(grammarAccess.getExprSingleAccess().getGroup_6(), "rule__ExprSingle__Group_6__0");
					put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
					put(grammarAccess.getExprAtomicAccess().getGroup_1(), "rule__ExprAtomic__Group_1__0");
					put(grammarAccess.getExprAtomicAccess().getGroup_1_2(), "rule__ExprAtomic__Group_1_2__0");
					put(grammarAccess.getExprAtomicAccess().getGroup_2(), "rule__ExprAtomic__Group_2__0");
					put(grammarAccess.getExprAtomicAccess().getGroup_2_4(), "rule__ExprAtomic__Group_2_4__0");
					put(grammarAccess.getExprAtomicAccess().getGroup_2_4_1(), "rule__ExprAtomic__Group_2_4_1__0");
					put(grammarAccess.getExprAtomicAccess().getGroup_3(), "rule__ExprAtomic__Group_3__0");
					put(grammarAccess.getExprFunctionCallAccess().getGroup(), "rule__ExprFunctionCall__Group__0");
					put(grammarAccess.getExprFunctionCallAccess().getGroup_3(), "rule__ExprFunctionCall__Group_3__0");
					put(grammarAccess.getExprFunctionCallAccess().getGroup_3_1(), "rule__ExprFunctionCall__Group_3_1__0");
					put(grammarAccess.getProgramAccess().getPackagesAssignment_1(), "rule__Program__PackagesAssignment_1");
					put(grammarAccess.getProgramAccess().getPackagesAssignment_2(), "rule__Program__PackagesAssignment_2");
					put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2(), "rule__PackageDeclaration__NameAssignment_2");
					put(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_5_1(), "rule__PackageDeclaration__ImportsAssignment_5_1");
					put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_7_0(), "rule__PackageDeclaration__ElementsAssignment_7_0");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getInitBlockAccess().getNameAssignment_0(), "rule__InitBlock__NameAssignment_0");
					put(grammarAccess.getInitBlockAccess().getBodyAssignment_3(), "rule__InitBlock__BodyAssignment_3");
					put(grammarAccess.getNativeFuncAccess().getNameAssignment_2(), "rule__NativeFunc__NameAssignment_2");
					put(grammarAccess.getNativeFuncAccess().getParametersAssignment_4_0(), "rule__NativeFunc__ParametersAssignment_4_0");
					put(grammarAccess.getNativeFuncAccess().getParametersAssignment_4_1_1(), "rule__NativeFunc__ParametersAssignment_4_1_1");
					put(grammarAccess.getNativeFuncAccess().getTypeAssignment_6_1(), "rule__NativeFunc__TypeAssignment_6_1");
					put(grammarAccess.getNativeTypeAccess().getNameAssignment_2(), "rule__NativeType__NameAssignment_2");
					put(grammarAccess.getNativeTypeAccess().getSuperNameAssignment_3_1(), "rule__NativeType__SuperNameAssignment_3_1");
					put(grammarAccess.getClassDefAccess().getUnmanagedAssignment_1(), "rule__ClassDef__UnmanagedAssignment_1");
					put(grammarAccess.getClassDefAccess().getNameAssignment_3(), "rule__ClassDef__NameAssignment_3");
					put(grammarAccess.getClassDefAccess().getMembersAssignment_6_1(), "rule__ClassDef__MembersAssignment_6_1");
					put(grammarAccess.getVarDefAccess().getConstantAssignment_1_0_0(), "rule__VarDef__ConstantAssignment_1_0_0");
					put(grammarAccess.getVarDefAccess().getTypeAssignment_1_0_1(), "rule__VarDef__TypeAssignment_1_0_1");
					put(grammarAccess.getVarDefAccess().getNameAssignment_1_0_2(), "rule__VarDef__NameAssignment_1_0_2");
					put(grammarAccess.getVarDefAccess().getEAssignment_1_0_4(), "rule__VarDef__EAssignment_1_0_4");
					put(grammarAccess.getVarDefAccess().getTypeAssignment_1_1_0(), "rule__VarDef__TypeAssignment_1_1_0");
					put(grammarAccess.getVarDefAccess().getNameAssignment_1_1_1(), "rule__VarDef__NameAssignment_1_1_1");
					put(grammarAccess.getVarDefAccess().getEAssignment_1_1_2_1(), "rule__VarDef__EAssignment_1_1_2_1");
					put(grammarAccess.getTypeExprAccess().getNameAssignment_0(), "rule__TypeExpr__NameAssignment_0");
					put(grammarAccess.getTypeExprAccess().getArrayAssignment_1_0(), "rule__TypeExpr__ArrayAssignment_1_0");
					put(grammarAccess.getTypeExprAccess().getSizesAssignment_1_1_1(), "rule__TypeExpr__SizesAssignment_1_1_1");
					put(grammarAccess.getConstructorDefAccess().getParametersAssignment_2_0(), "rule__ConstructorDef__ParametersAssignment_2_0");
					put(grammarAccess.getConstructorDefAccess().getParametersAssignment_2_1_1(), "rule__ConstructorDef__ParametersAssignment_2_1_1");
					put(grammarAccess.getConstructorDefAccess().getBodyAssignment_6(), "rule__ConstructorDef__BodyAssignment_6");
					put(grammarAccess.getOnDestroyDefAccess().getBodyAssignment_3(), "rule__OnDestroyDef__BodyAssignment_3");
					put(grammarAccess.getFuncDefAccess().getNameAssignment_1(), "rule__FuncDef__NameAssignment_1");
					put(grammarAccess.getFuncDefAccess().getParametersAssignment_3_0(), "rule__FuncDef__ParametersAssignment_3_0");
					put(grammarAccess.getFuncDefAccess().getParametersAssignment_3_1_1(), "rule__FuncDef__ParametersAssignment_3_1_1");
					put(grammarAccess.getFuncDefAccess().getTypeAssignment_5_1(), "rule__FuncDef__TypeAssignment_5_1");
					put(grammarAccess.getFuncDefAccess().getBodyAssignment_8(), "rule__FuncDef__BodyAssignment_8");
					put(grammarAccess.getParameterDefAccess().getTypeAssignment_1(), "rule__ParameterDef__TypeAssignment_1");
					put(grammarAccess.getParameterDefAccess().getNameAssignment_2(), "rule__ParameterDef__NameAssignment_2");
					put(grammarAccess.getStatementsAccess().getStatementsAssignment_1_1(), "rule__Statements__StatementsAssignment_1_1");
					put(grammarAccess.getStmtChangeRefCountAccess().getIncreaseAssignment_0_0(), "rule__StmtChangeRefCount__IncreaseAssignment_0_0");
					put(grammarAccess.getStmtChangeRefCountAccess().getDecreaseAssignment_0_1(), "rule__StmtChangeRefCount__DecreaseAssignment_0_1");
					put(grammarAccess.getStmtChangeRefCountAccess().getObjAssignment_1(), "rule__StmtChangeRefCount__ObjAssignment_1");
					put(grammarAccess.getStmtDestroyAccess().getObjAssignment_1(), "rule__StmtDestroy__ObjAssignment_1");
					put(grammarAccess.getStmtReturnAccess().getEAssignment_2(), "rule__StmtReturn__EAssignment_2");
					put(grammarAccess.getStmtIfAccess().getCondAssignment_1(), "rule__StmtIf__CondAssignment_1");
					put(grammarAccess.getStmtIfAccess().getThenBlockAssignment_4(), "rule__StmtIf__ThenBlockAssignment_4");
					put(grammarAccess.getStmtIfAccess().getElseBlockAssignment_6_3(), "rule__StmtIf__ElseBlockAssignment_6_3");
					put(grammarAccess.getStmtWhileAccess().getCondAssignment_1(), "rule__StmtWhile__CondAssignment_1");
					put(grammarAccess.getStmtWhileAccess().getBodyAssignment_4(), "rule__StmtWhile__BodyAssignment_4");
					put(grammarAccess.getLocalVarDefAccess().getConstantAssignment_0_1(), "rule__LocalVarDef__ConstantAssignment_0_1");
					put(grammarAccess.getLocalVarDefAccess().getTypeAssignment_0_2(), "rule__LocalVarDef__TypeAssignment_0_2");
					put(grammarAccess.getLocalVarDefAccess().getNameAssignment_0_3(), "rule__LocalVarDef__NameAssignment_0_3");
					put(grammarAccess.getLocalVarDefAccess().getEAssignment_0_4_1(), "rule__LocalVarDef__EAssignment_0_4_1");
					put(grammarAccess.getLocalVarDefAccess().getTypeAssignment_1_1(), "rule__LocalVarDef__TypeAssignment_1_1");
					put(grammarAccess.getLocalVarDefAccess().getNameAssignment_1_2(), "rule__LocalVarDef__NameAssignment_1_2");
					put(grammarAccess.getLocalVarDefAccess().getEAssignment_1_3_1(), "rule__LocalVarDef__EAssignment_1_3_1");
					put(grammarAccess.getStmtSetOrCallOrVarDefAccess().getEAssignment_1(), "rule__StmtSetOrCallOrVarDef__EAssignment_1");
					put(grammarAccess.getStmtSetOrCallOrVarDefAccess().getOpAssignmentAssignment_2_1(), "rule__StmtSetOrCallOrVarDef__OpAssignmentAssignment_2_1");
					put(grammarAccess.getStmtSetOrCallOrVarDefAccess().getRightAssignment_2_2(), "rule__StmtSetOrCallOrVarDef__RightAssignment_2_2");
					put(grammarAccess.getExprOrAccess().getOpAssignment_1_1(), "rule__ExprOr__OpAssignment_1_1");
					put(grammarAccess.getExprOrAccess().getRightAssignment_1_2(), "rule__ExprOr__RightAssignment_1_2");
					put(grammarAccess.getExprAndAccess().getOpAssignment_1_1(), "rule__ExprAnd__OpAssignment_1_1");
					put(grammarAccess.getExprAndAccess().getRightAssignment_1_2(), "rule__ExprAnd__RightAssignment_1_2");
					put(grammarAccess.getExprEqualityAccess().getOpAssignment_1_1(), "rule__ExprEquality__OpAssignment_1_1");
					put(grammarAccess.getExprEqualityAccess().getRightAssignment_1_2(), "rule__ExprEquality__RightAssignment_1_2");
					put(grammarAccess.getExprComparisonAccess().getOpAssignment_1_1(), "rule__ExprComparison__OpAssignment_1_1");
					put(grammarAccess.getExprComparisonAccess().getRightAssignment_1_2(), "rule__ExprComparison__RightAssignment_1_2");
					put(grammarAccess.getExprAdditiveAccess().getOpAssignment_1_1(), "rule__ExprAdditive__OpAssignment_1_1");
					put(grammarAccess.getExprAdditiveAccess().getRightAssignment_1_2(), "rule__ExprAdditive__RightAssignment_1_2");
					put(grammarAccess.getExprMultAccess().getOpAssignment_1_1(), "rule__ExprMult__OpAssignment_1_1");
					put(grammarAccess.getExprMultAccess().getRightAssignment_1_2(), "rule__ExprMult__RightAssignment_1_2");
					put(grammarAccess.getExprSignAccess().getOpAssignment_0_1(), "rule__ExprSign__OpAssignment_0_1");
					put(grammarAccess.getExprSignAccess().getRightAssignment_0_2(), "rule__ExprSign__RightAssignment_0_2");
					put(grammarAccess.getExprNotAccess().getRightAssignment_0_2(), "rule__ExprNot__RightAssignment_0_2");
					put(grammarAccess.getExprMemberAccess().getMessageAssignment_1_2(), "rule__ExprMember__MessageAssignment_1_2");
					put(grammarAccess.getExprMemberRightAccess().getNameValAssignment_0(), "rule__ExprMemberRight__NameValAssignment_0");
					put(grammarAccess.getExprMemberRightAccess().getParamsAssignment_1_1_0(), "rule__ExprMemberRight__ParamsAssignment_1_1_0");
					put(grammarAccess.getExprMemberRightAccess().getParamsAssignment_1_1_1_1(), "rule__ExprMemberRight__ParamsAssignment_1_1_1_1");
					put(grammarAccess.getExprSingleAccess().getIntValAssignment_2_1(), "rule__ExprSingle__IntValAssignment_2_1");
					put(grammarAccess.getExprSingleAccess().getNumValAssignment_3_1(), "rule__ExprSingle__NumValAssignment_3_1");
					put(grammarAccess.getExprSingleAccess().getStrValAssignment_4_1(), "rule__ExprSingle__StrValAssignment_4_1");
					put(grammarAccess.getExprSingleAccess().getBoolValAssignment_5_1(), "rule__ExprSingle__BoolValAssignment_5_1");
					put(grammarAccess.getExprSingleAccess().getNameValAssignment_6_2(), "rule__ExprSingle__NameValAssignment_6_2");
					put(grammarAccess.getExprAtomicAccess().getNameValAssignment_1_1(), "rule__ExprAtomic__NameValAssignment_1_1");
					put(grammarAccess.getExprAtomicAccess().getArrayIndizesAssignment_1_2_1(), "rule__ExprAtomic__ArrayIndizesAssignment_1_2_1");
					put(grammarAccess.getExprAtomicAccess().getClassDefAssignment_2_2(), "rule__ExprAtomic__ClassDefAssignment_2_2");
					put(grammarAccess.getExprAtomicAccess().getParamsAssignment_2_4_0(), "rule__ExprAtomic__ParamsAssignment_2_4_0");
					put(grammarAccess.getExprAtomicAccess().getParamsAssignment_2_4_1_1(), "rule__ExprAtomic__ParamsAssignment_2_4_1_1");
					put(grammarAccess.getExprFunctionCallAccess().getNameValAssignment_1(), "rule__ExprFunctionCall__NameValAssignment_1");
					put(grammarAccess.getExprFunctionCallAccess().getParamsAssignment_3_0(), "rule__ExprFunctionCall__ParamsAssignment_3_0");
					put(grammarAccess.getExprFunctionCallAccess().getParamsAssignment_3_1_1(), "rule__ExprFunctionCall__ParamsAssignment_3_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.peeeq.pscript.ui.contentassist.antlr.internal.InternalPscriptParser typedParser = (de.peeeq.pscript.ui.contentassist.antlr.internal.InternalPscriptParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PscriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PscriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
