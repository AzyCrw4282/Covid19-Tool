///******************************************************************************
// * ARTAssB.java
// *
// * This is a test harness for ART generated Java parsers, minimised for assignment B
// *
// * (c) Adrian Johnstone 2013-20
// *****************************************************************************/
//import java.io.FileNotFoundException;
//
//import uk.ac.rhul.cs.csle.art.ARTException;
//import uk.ac.rhul.cs.csle.artgll.ARTGLLRDT;
//import uk.ac.rhul.cs.csle.artgll.ARTGLLRDTVertex;
//import uk.ac.rhul.cs.csle.arttext.ARTText;
//
//
////this is the class that uses parsers and lexer and prints the derivation tree.
//
//public class ARTAssB {
//
//  public static void main(String[] args) throws ARTException, FileNotFoundException {
//
//   System.out.println("Greetings from Adrian's CS3480 test harness");
//
//   ARTGeneratedParser parser = new ARTGeneratedParser(new ARTGeneratedLexer());
//
//    try {
//      parser.artParse(ARTText.readFile(args[0]));
//    } catch (ARTException e) {
//      System.out.println(e.getMessage());
//    }
//
//    if (parser.artIsInLanguage)
//      System.out.println("Generated parser: accept");
//    else {
//      System.out.println("Generated parser: reject");
//    }
//
//    parser.artDerivationSelectFirst();
//
//    parser.artRenderSPPF("dtCore.dot", parser.artRenderKindDerivation);
//
//    ARTGLLRDT tree = parser.artEvaluator();
//    if (tree != null) tree.printDot("rdtEvaluator_GLL.dot");
//
//    //Uncomment thisblock to see trees on the console
//    /*
//    printTreeAsTerm(tree);
//    System.out.println();
//    visitTree(tree);
//    */
//  }
//
//  static void visitTree(ARTGLLRDT tree) {
//    visitTree(tree, tree.getRoot(), 0);
//  }
//
//  static void visitTree(ARTGLLRDT tree, ARTGLLRDTVertex vertex, int level) {
//    if (vertex == null) return;
//    // Preorder printout
//    for (int i = 0; i < level; i++)
//      System.out.print("  ");
//    System.out.printf("%d: %s%n", vertex.getKey(), vertex.getPayload().toString(tree));
//    visitTree(tree, vertex.getChild(), level + 1);
//    visitTree(tree, vertex.getSibling(), level);
//  }
//
//  static void printTreeAsTerm(ARTGLLRDT tree) {
//    printTreeAsTerm(tree, tree.getRoot());
//  }
//
//  static void printTreeAsTerm(ARTGLLRDT tree, ARTGLLRDTVertex vertex) {
//    if (vertex == null) return;
//    // Preorder printout
//    System.out.print(vertex.getPayload().toString(tree));
//    if (vertex.getChild() != null) {
//      System.out.print("(");
//      printTreeAsTerm(tree, vertex.getChild());
//      System.out.print(")");
//    }
//    if (vertex.getSibling() != null) {
//      System.out.print(", ");
//      printTreeAsTerm(tree, vertex.getSibling());
//    }
//  }
//}
