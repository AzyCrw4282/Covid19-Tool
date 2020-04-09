import uk.ac.rhul.cs.csle.art.ARTException;
import uk.ac.rhul.cs.csle.artlexer.ARTLexerBase;
import uk.ac.rhul.cs.csle.art.ARTGrammar;
import uk.ac.rhul.cs.csle.art.ARTModeGrammarKind;
import uk.ac.rhul.cs.csle.artgll.*;
import uk.ac.rhul.cs.csle.artgraph.*;
import uk.ac.rhul.cs.csle.arttext.*;
import uk.ac.rhul.cs.csle.artvalue.*;
import uk.ac.rhul.cs.csle.art.ARTBitSet;
/*******************************************************************************
*
* ARTGeneratedLexer.java
*
*******************************************************************************/
public class ARTGeneratedLexer extends ARTLexerBase {
public void artLexicaliseBuiltinInstances() throws ARTException {
  artBuiltin_ID();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_ID);
  artBuiltin_INTEGER();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_INTEGER);
  artBuiltin_REAL();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_REAL);
  artBuiltin_STRING_DQ();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_STRING_DQ);
}

public void artLexicalisePreparseWhitespaceInstances() throws ARTException {
  artBuiltin_COMMENT_LINE_C();
  artBuiltin_COMMENT_NEST_ART();
  artBuiltin_WHITESPACE();
}

};
