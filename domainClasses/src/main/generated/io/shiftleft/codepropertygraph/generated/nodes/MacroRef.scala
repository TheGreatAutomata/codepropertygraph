package io.shiftleft.codepropertygraph.generated.nodes

import overflowdb._
import scala.jdk.CollectionConverters._

object MacroRef {
  def apply(graph: Graph, id: Long) = new MacroRef(graph, id)

  val Label = "MACRO_REF"

  object PropertyNames {
    val ArgumentIndex    = "ARGUMENT_INDEX"
    val ArgumentName     = "ARGUMENT_NAME"
    val Code             = "CODE"
    val ColumnNumber     = "COLUMN_NUMBER"
    val LineNumber       = "LINE_NUMBER"
    val MacroFullName    = "MACRO_FULL_NAME"
    val Order            = "ORDER"
    val all: Set[String] = Set(ArgumentIndex, ArgumentName, Code, ColumnNumber, LineNumber, MacroFullName, Order)
    val allAsJava: java.util.Set[String] = all.asJava
  }

  object Properties {
    val ArgumentIndex = new overflowdb.PropertyKey[scala.Int]("ARGUMENT_INDEX")
    val ArgumentName  = new overflowdb.PropertyKey[String]("ARGUMENT_NAME")
    val Code          = new overflowdb.PropertyKey[String]("CODE")
    val ColumnNumber  = new overflowdb.PropertyKey[Integer]("COLUMN_NUMBER")
    val LineNumber    = new overflowdb.PropertyKey[Integer]("LINE_NUMBER")
    val MacroFullName = new overflowdb.PropertyKey[String]("MACRO_FULL_NAME")
    val Order         = new overflowdb.PropertyKey[scala.Int]("ORDER")

  }

  object PropertyDefaults {
    val ArgumentIndex = -1: Int
    val Code          = "<empty>"
    val MacroFullName = "<empty>"
    val Order         = -1: Int
  }

  val layoutInformation = new NodeLayoutInformation(
    Label,
    PropertyNames.allAsJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Argument.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.InMacro.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ref.layoutInformation
    ).asJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Cfg.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Length.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LengthExp.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.ReachingDef.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.SpecializePara.layoutInformation
    ).asJava
  )

  object Edges {
    val Out: Array[String] = Array("ARGUMENT", "IN_MACRO", "REF")
    val In: Array[String]  = Array("AST", "CFG", "LENGTH", "LENGTH_EXP", "REACHING_DEF", "SPECIALIZE_PARA")
  }

  val factory = new NodeFactory[MacroRefDb] {
    override val forLabel = MacroRef.Label

    override def createNode(ref: NodeRef[MacroRefDb]) =
      new MacroRefDb(ref.asInstanceOf[NodeRef[NodeDb]])

    override def createNodeRef(graph: Graph, id: Long) = MacroRef(graph, id)
  }
}

trait MacroRefBase extends AbstractNode with ExpressionBase {
  def asStored: StoredNode = this.asInstanceOf[StoredNode]

  def argumentIndex: scala.Int
  def argumentName: Option[String]
  def code: String
  def columnNumber: Option[Integer]
  def lineNumber: Option[Integer]
  def macroFullName: String
  def order: scala.Int

}

class MacroRef(graph_4762: Graph, id_4762: Long /*cf https://github.com/scala/bug/issues/4762 */ )
    extends NodeRef[MacroRefDb](graph_4762, id_4762)
    with MacroRefBase
    with StoredNode
    with Expression {
  override def argumentIndex: scala.Int      = get().argumentIndex
  override def argumentName: Option[String]  = get().argumentName
  override def code: String                  = get().code
  override def columnNumber: Option[Integer] = get().columnNumber
  override def lineNumber: Option[Integer]   = get().lineNumber
  override def macroFullName: String         = get().macroFullName
  override def order: scala.Int              = get().order
  override def propertyDefaultValue(propertyKey: String) =
    propertyKey match {
      case "ARGUMENT_INDEX"  => MacroRef.PropertyDefaults.ArgumentIndex
      case "CODE"            => MacroRef.PropertyDefaults.Code
      case "MACRO_FULL_NAME" => MacroRef.PropertyDefaults.MacroFullName
      case "ORDER"           => MacroRef.PropertyDefaults.Order
      case _                 => super.propertyDefaultValue(propertyKey)
    }

  def argumentOut: Iterator[TemplateDom] = get().argumentOut
  override def _argumentOut              = get()._argumentOut

  def inMacroOut: Iterator[MacroDecl] = get().inMacroOut
  override def _inMacroOut            = get()._inMacroOut

  def refOut: Iterator[MacroDecl] = get().refOut
  override def _refOut            = get()._refOut

  /** Traverse to MACRO_DECL via REF OUT edge.
    */
  def _macroDeclViaRefOut: overflowdb.traversal.Traversal[MacroDecl] = get()._macroDeclViaRefOut

  def astIn: Iterator[TemplateDom] = get().astIn
  override def _astIn              = get()._astIn

  def cfgIn: Iterator[CfgNode] = get().cfgIn
  override def _cfgIn          = get()._cfgIn

  def lengthIn: Iterator[Type] = get().lengthIn
  override def _lengthIn       = get()._lengthIn

  def lengthExpIn: Iterator[Type] = get().lengthExpIn
  override def _lengthExpIn       = get()._lengthExpIn

  def reachingDefIn: Iterator[TemplateDom] = get().reachingDefIn
  override def _reachingDefIn              = get()._reachingDefIn

  def specializeParaIn: Iterator[Type] = get().specializeParaIn
  override def _specializeParaIn       = get()._specializeParaIn

  // In view of https://github.com/scala/bug/issues/4762 it is advisable to use different variable names in
  // patterns like `class Base(x:Int)` and `class Derived(x:Int) extends Base(x)`.
  // This must become `class Derived(x_4762:Int) extends Base(x_4762)`.
  // Otherwise, it is very hard to figure out whether uses of the identifier `x` refer to the base class x
  // or the derived class x.
  // When using that pattern, the class parameter `x_47672` should only be used in the `extends Base(x_4762)`
  // clause and nowhere else. Otherwise, the compiler may well decide that this is not just a constructor
  // parameter but also a field of the class, and we end up with two `x` fields. At best, this wastes memory;
  // at worst both fields go out-of-sync for hard-to-debug correctness bugs.

  override def fromNewNode(newNode: NewNode, mapping: NewNode => StoredNode): Unit = get().fromNewNode(newNode, mapping)
  override def canEqual(that: Any): Boolean                                        = get.canEqual(that)
  override def label: String = {
    MacroRef.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "id"
      case 1 => "argumentIndex"
      case 2 => "argumentName"
      case 3 => "code"
      case 4 => "columnNumber"
      case 5 => "lineNumber"
      case 6 => "macroFullName"
      case 7 => "order"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => id
      case 1 => argumentIndex
      case 2 => argumentName
      case 3 => code
      case 4 => columnNumber
      case 5 => lineNumber
      case 6 => macroFullName
      case 7 => order
    }

  override def productPrefix = "MacroRef"
  override def productArity  = 8
}

class MacroRefDb(ref: NodeRef[NodeDb]) extends NodeDb(ref) with StoredNode with Expression with MacroRefBase {

  override def layoutInformation: NodeLayoutInformation = MacroRef.layoutInformation

  private var _argumentIndex: scala.Int = MacroRef.PropertyDefaults.ArgumentIndex
  def argumentIndex: scala.Int          = _argumentIndex
  private var _argumentName: String     = null
  def argumentName: Option[String]      = Option(_argumentName)
  private var _code: String             = MacroRef.PropertyDefaults.Code
  def code: String                      = _code
  private var _columnNumber: Integer    = null
  def columnNumber: Option[Integer]     = Option(_columnNumber)
  private var _lineNumber: Integer      = null
  def lineNumber: Option[Integer]       = Option(_lineNumber)
  private var _macroFullName: String    = MacroRef.PropertyDefaults.MacroFullName
  def macroFullName: String             = _macroFullName
  private var _order: scala.Int         = MacroRef.PropertyDefaults.Order
  def order: scala.Int                  = _order

  /** faster than the default implementation */
  override def propertiesMap: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    properties.put("ARGUMENT_INDEX", argumentIndex)
    argumentName.map { value => properties.put("ARGUMENT_NAME", value) }
    properties.put("CODE", code)
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    properties.put("MACRO_FULL_NAME", macroFullName)
    properties.put("ORDER", order)

    properties
  }

  /** faster than the default implementation */
  override def propertiesMapForStorage: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    if (!((-1: Int) == argumentIndex)) { properties.put("ARGUMENT_INDEX", argumentIndex) }
    argumentName.map { value => properties.put("ARGUMENT_NAME", value) }
    if (!(("<empty>") == code)) { properties.put("CODE", code) }
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    if (!(("<empty>") == macroFullName)) { properties.put("MACRO_FULL_NAME", macroFullName) }
    if (!((-1: Int) == order)) { properties.put("ORDER", order) }

    properties
  }

  import overflowdb.traversal._
  def argumentOut: Iterator[TemplateDom] = createAdjacentNodeScalaIteratorByOffSet[TemplateDom](0)
  override def _argumentOut              = createAdjacentNodeScalaIteratorByOffSet[StoredNode](0)

  def inMacroOut: Iterator[MacroDecl] = createAdjacentNodeScalaIteratorByOffSet[MacroDecl](1)
  override def _inMacroOut            = createAdjacentNodeScalaIteratorByOffSet[StoredNode](1)

  def refOut: Iterator[MacroDecl] = createAdjacentNodeScalaIteratorByOffSet[MacroDecl](2)
  override def _refOut            = createAdjacentNodeScalaIteratorByOffSet[StoredNode](2)
  def _macroDeclViaRefOut: overflowdb.traversal.Traversal[MacroDecl] = refOut.collectAll[MacroDecl]

  def astIn: Iterator[TemplateDom] = createAdjacentNodeScalaIteratorByOffSet[TemplateDom](3)
  override def _astIn              = createAdjacentNodeScalaIteratorByOffSet[StoredNode](3)

  def cfgIn: Iterator[CfgNode] = createAdjacentNodeScalaIteratorByOffSet[CfgNode](4)
  override def _cfgIn          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](4)

  def lengthIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](5)
  override def _lengthIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](5)

  def lengthExpIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](6)
  override def _lengthExpIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](6)

  def reachingDefIn: Iterator[TemplateDom] = createAdjacentNodeScalaIteratorByOffSet[TemplateDom](7)
  override def _reachingDefIn              = createAdjacentNodeScalaIteratorByOffSet[StoredNode](7)

  def specializeParaIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](8)
  override def _specializeParaIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](8)

  override def label: String = {
    MacroRef.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "id"
      case 1 => "argumentIndex"
      case 2 => "argumentName"
      case 3 => "code"
      case 4 => "columnNumber"
      case 5 => "lineNumber"
      case 6 => "macroFullName"
      case 7 => "order"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => id
      case 1 => argumentIndex
      case 2 => argumentName
      case 3 => code
      case 4 => columnNumber
      case 5 => lineNumber
      case 6 => macroFullName
      case 7 => order
    }

  override def productPrefix = "MacroRef"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[MacroRefDb]

  override def property(key: String): Any = {
    key match {
      case "ARGUMENT_INDEX"  => this._argumentIndex
      case "ARGUMENT_NAME"   => this._argumentName
      case "CODE"            => this._code
      case "COLUMN_NUMBER"   => this._columnNumber
      case "LINE_NUMBER"     => this._lineNumber
      case "MACRO_FULL_NAME" => this._macroFullName
      case "ORDER"           => this._order

      case _ => null
    }
  }

  override protected def updateSpecificProperty(key: String, value: Object): Unit = {
    key match {
      case "ARGUMENT_INDEX"  => this._argumentIndex = value.asInstanceOf[scala.Int]
      case "ARGUMENT_NAME"   => this._argumentName = value.asInstanceOf[String]
      case "CODE"            => this._code = value.asInstanceOf[String]
      case "COLUMN_NUMBER"   => this._columnNumber = value.asInstanceOf[Integer]
      case "LINE_NUMBER"     => this._lineNumber = value.asInstanceOf[Integer]
      case "MACRO_FULL_NAME" => this._macroFullName = value.asInstanceOf[String]
      case "ORDER"           => this._order = value.asInstanceOf[scala.Int]

      case _ => PropertyErrorRegister.logPropertyErrorIfFirst(getClass, key)
    }
  }

  override def removeSpecificProperty(key: String): Unit =
    this.updateSpecificProperty(key, null)

  override def _initializeFromDetached(
    data: overflowdb.DetachedNodeData,
    mapper: java.util.function.Function[overflowdb.DetachedNodeData, Node]
  ) =
    fromNewNode(data.asInstanceOf[NewNode], nn => mapper.apply(nn).asInstanceOf[StoredNode])

  override def fromNewNode(newNode: NewNode, mapping: NewNode => StoredNode): Unit = {
    this._argumentIndex = newNode.asInstanceOf[NewMacroRef].argumentIndex
    this._argumentName = newNode.asInstanceOf[NewMacroRef].argumentName.orNull
    this._code = newNode.asInstanceOf[NewMacroRef].code
    this._columnNumber = newNode.asInstanceOf[NewMacroRef].columnNumber.orNull
    this._lineNumber = newNode.asInstanceOf[NewMacroRef].lineNumber.orNull
    this._macroFullName = newNode.asInstanceOf[NewMacroRef].macroFullName
    this._order = newNode.asInstanceOf[NewMacroRef].order

  }

}
