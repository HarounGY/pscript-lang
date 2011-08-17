/*
* generated by Xtext
*/
package de.peeeq.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.peeeq.services.JassToPscriptGrammarAccess;

public class JassToPscriptParser extends AbstractContentAssistParser {
	
	@Inject
	private JassToPscriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.peeeq.ui.contentassist.antlr.internal.InternalJassToPscriptParser createParser() {
		de.peeeq.ui.contentassist.antlr.internal.InternalJassToPscriptParser result = new de.peeeq.ui.contentassist.antlr.internal.InternalJassToPscriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLiteralAccess().getBoolValAlternatives_1_1_0(), "rule__Literal__BoolValAlternatives_1_1_0");
					put(grammarAccess.getReturnTypeAccess().getAlternatives(), "rule__ReturnType__Alternatives");
					put(grammarAccess.getFormalParametersAccess().getAlternatives(), "rule__FormalParameters__Alternatives");
					put(grammarAccess.getGlobalBlockAccess().getGroup(), "rule__GlobalBlock__Group__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getMultAccess().getGroup(), "rule__Mult__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2(), "rule__FunctionCall__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2_1(), "rule__FunctionCall__Group_2_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getLiteralAccess().getGroup_1(), "rule__Literal__Group_1__0");
					put(grammarAccess.getNativeDefAccess().getGroup(), "rule__NativeDef__Group__0");
					put(grammarAccess.getReturnTypeAccess().getGroup_0(), "rule__ReturnType__Group_0__0");
					put(grammarAccess.getFormalParametersAccess().getGroup_0(), "rule__FormalParameters__Group_0__0");
					put(grammarAccess.getFormalParametersAccess().getGroup_1(), "rule__FormalParameters__Group_1__0");
					put(grammarAccess.getFormalParametersAccess().getGroup_1_1(), "rule__FormalParameters__Group_1_1__0");
					put(grammarAccess.getFormalParameterAccess().getGroup(), "rule__FormalParameter__Group__0");
					put(grammarAccess.getTypeDefAccess().getGroup(), "rule__TypeDef__Group__0");
					put(grammarAccess.getProgAccess().getElemsAssignment(), "rule__Prog__ElemsAssignment");
					put(grammarAccess.getGlobalBlockAccess().getVarsAssignment_2(), "rule__GlobalBlock__VarsAssignment_2");
					put(grammarAccess.getConstantAccess().getTypeAssignment_1(), "rule__Constant__TypeAssignment_1");
					put(grammarAccess.getConstantAccess().getNameAssignment_2(), "rule__Constant__NameAssignment_2");
					put(grammarAccess.getConstantAccess().getValueAssignment_4(), "rule__Constant__ValueAssignment_4");
					put(grammarAccess.getMultAccess().getLeftAssignment_0(), "rule__Mult__LeftAssignment_0");
					put(grammarAccess.getMultAccess().getRightAssignment_2(), "rule__Mult__RightAssignment_2");
					put(grammarAccess.getFunctionCallAccess().getNameAssignment_0(), "rule__FunctionCall__NameAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0(), "rule__FunctionCall__ParametersAssignment_2_0");
					put(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1(), "rule__FunctionCall__ParametersAssignment_2_1_1");
					put(grammarAccess.getLiteralAccess().getIntValAssignment_0_1(), "rule__Literal__IntValAssignment_0_1");
					put(grammarAccess.getLiteralAccess().getBoolValAssignment_1_1(), "rule__Literal__BoolValAssignment_1_1");
					put(grammarAccess.getNativeDefAccess().getNameAssignment_2(), "rule__NativeDef__NameAssignment_2");
					put(grammarAccess.getNativeDefAccess().getParamsAssignment_4(), "rule__NativeDef__ParamsAssignment_4");
					put(grammarAccess.getNativeDefAccess().getReturnTypeAssignment_6(), "rule__NativeDef__ReturnTypeAssignment_6");
					put(grammarAccess.getReturnTypeAccess().getNameAssignment_1(), "rule__ReturnType__NameAssignment_1");
					put(grammarAccess.getFormalParametersAccess().getParametersAssignment_1_0(), "rule__FormalParameters__ParametersAssignment_1_0");
					put(grammarAccess.getFormalParametersAccess().getParametersAssignment_1_1_1(), "rule__FormalParameters__ParametersAssignment_1_1_1");
					put(grammarAccess.getFormalParameterAccess().getTypeAssignment_0(), "rule__FormalParameter__TypeAssignment_0");
					put(grammarAccess.getFormalParameterAccess().getNameAssignment_1(), "rule__FormalParameter__NameAssignment_1");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_1(), "rule__TypeDef__NameAssignment_1");
					put(grammarAccess.getTypeDefAccess().getExtendNameAssignment_3(), "rule__TypeDef__ExtendNameAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.peeeq.ui.contentassist.antlr.internal.InternalJassToPscriptParser typedParser = (de.peeeq.ui.contentassist.antlr.internal.InternalJassToPscriptParser) parser;
			typedParser.entryRuleProg();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JassToPscriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JassToPscriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
