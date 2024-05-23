package io.shiftleft.codepropertygraph.generated.nodes

object AstNode {
  object PropertyNames {
    val Code             = "CODE"
    val ColumnNumber     = "COLUMN_NUMBER"
    val LineNumber       = "LINE_NUMBER"
    val Order            = "ORDER"
    val all: Set[String] = Set(Code, ColumnNumber, LineNumber, Order)
  }

  object Properties {
    val Code         = new overflowdb.PropertyKey[String]("CODE")
    val ColumnNumber = new overflowdb.PropertyKey[Integer]("COLUMN_NUMBER")
    val LineNumber   = new overflowdb.PropertyKey[Integer]("LINE_NUMBER")
    val Order        = new overflowdb.PropertyKey[scala.Int]("ORDER")
  }

  object PropertyDefaults {
    val Code  = "<empty>"
    val Order = -1: Int
  }

  object Edges {
    val Out: Array[String] = Array("IN_MACRO")
    val In: Array[String]  = Array("LENGTH", "LENGTH_EXP", "SPECIALIZE_PARA")
  }

}

trait AstNodeBase extends AbstractNode {
  def code: String
  def columnNumber: Option[Integer]
  def lineNumber: Option[Integer]
  def order: scala.Int
}

trait AstNodeNew extends NewNode {
  def code_=(value: String): Unit
  def columnNumber_=(value: Option[Integer]): Unit
  def lineNumber_=(value: Option[Integer]): Unit
  def order_=(value: scala.Int): Unit
  def code: String
  def columnNumber: Option[Integer]
  def lineNumber: Option[Integer]
  def order: scala.Int
}

trait AstNode extends StoredNode with AstNodeBase {
  import overflowdb.traversal._
  def inMacroOut: Iterator[_ <: StoredNode]

  /** Traverse to AST_NODE via IN_MACRO OUT edge.
    */
  def _astNodeViaInMacroOut: overflowdb.traversal.Traversal[AstNode] =
    inMacroOut.collectAll[AstNode]

  /** Traverse to DECLARATION via IN_MACRO OUT edge.
    */
  def _declarationViaInMacroOut: overflowdb.traversal.Traversal[Declaration] =
    inMacroOut.collectAll[Declaration]

  /** Traverse to MACRO_DECL via IN_MACRO OUT edge.
    */
  def _macroDeclViaInMacroOut: overflowdb.traversal.Traversal[MacroDecl] =
    inMacroOut.collectAll[MacroDecl]

  def lengthIn: Iterator[_ <: StoredNode]

  /** Traverse to TYPE via LENGTH IN edge.
    */
  def _typeViaLengthIn: overflowdb.traversal.Traversal[Type] =
    lengthIn.collectAll[Type]

  def lengthExpIn: Iterator[_ <: StoredNode]

  /** Traverse to TYPE via LENGTH_EXP IN edge.
    */
  def _typeViaLengthExpIn: overflowdb.traversal.Traversal[Type] =
    lengthExpIn.collectAll[Type]

  def specializeParaIn: Iterator[_ <: StoredNode]

  /** Traverse to TYPE via SPECIALIZE_PARA IN edge.
    */
  def _typeViaSpecializeParaIn: overflowdb.traversal.Traversal[Type] =
    specializeParaIn.collectAll[Type]

}
