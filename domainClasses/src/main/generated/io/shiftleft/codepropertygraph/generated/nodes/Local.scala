package io.shiftleft.codepropertygraph.generated.nodes

import overflowdb._
import scala.jdk.CollectionConverters._

object Local {
  def apply(graph: Graph, id: Long) = new Local(graph, id)

  val Label = "LOCAL"

  object PropertyNames {
    val ClosureBindingId        = "CLOSURE_BINDING_ID"
    val Code                    = "CODE"
    val ColumnNumber            = "COLUMN_NUMBER"
    val DynamicTypeHintFullName = "DYNAMIC_TYPE_HINT_FULL_NAME"
    val FullName                = "FULL_NAME"
    val LineNumber              = "LINE_NUMBER"
    val Name                    = "NAME"
    val Order                   = "ORDER"
    val PossibleTypes           = "POSSIBLE_TYPES"
    val TypeFullName            = "TYPE_FULL_NAME"
    val all: Set[String] = Set(
      ClosureBindingId,
      Code,
      ColumnNumber,
      DynamicTypeHintFullName,
      FullName,
      LineNumber,
      Name,
      Order,
      PossibleTypes,
      TypeFullName
    )
    val allAsJava: java.util.Set[String] = all.asJava
  }

  object Properties {
    val ClosureBindingId        = new overflowdb.PropertyKey[String]("CLOSURE_BINDING_ID")
    val Code                    = new overflowdb.PropertyKey[String]("CODE")
    val ColumnNumber            = new overflowdb.PropertyKey[Integer]("COLUMN_NUMBER")
    val DynamicTypeHintFullName = new overflowdb.PropertyKey[IndexedSeq[String]]("DYNAMIC_TYPE_HINT_FULL_NAME")
    val FullName                = new overflowdb.PropertyKey[String]("FULL_NAME")
    val LineNumber              = new overflowdb.PropertyKey[Integer]("LINE_NUMBER")
    val Name                    = new overflowdb.PropertyKey[String]("NAME")
    val Order                   = new overflowdb.PropertyKey[scala.Int]("ORDER")
    val PossibleTypes           = new overflowdb.PropertyKey[IndexedSeq[String]]("POSSIBLE_TYPES")
    val TypeFullName            = new overflowdb.PropertyKey[String]("TYPE_FULL_NAME")

  }

  object PropertyDefaults {
    val Code         = "<empty>"
    val FullName     = "<empty>"
    val Name         = "<empty>"
    val Order        = -1: Int
    val TypeFullName = "<empty>"
  }

  val layoutInformation = new NodeLayoutInformation(
    Label,
    PropertyNames.allAsJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.CapturedBy.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.EvalType.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.InMacro.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.TaggedBy.layoutInformation
    ).asJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Length.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LengthExp.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ref.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.SpecializePara.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.TemplatePara.layoutInformation
    ).asJava
  )

  object Edges {
    val Out: Array[String] = Array("AST", "CAPTURED_BY", "EVAL_TYPE", "IN_MACRO", "TAGGED_BY")
    val In: Array[String]  = Array("AST", "LENGTH", "LENGTH_EXP", "REF", "SPECIALIZE_PARA", "TEMPLATE_PARA")
  }

  val factory = new NodeFactory[LocalDb] {
    override val forLabel = Local.Label

    override def createNode(ref: NodeRef[LocalDb]) =
      new LocalDb(ref.asInstanceOf[NodeRef[NodeDb]])

    override def createNodeRef(graph: Graph, id: Long) = Local(graph, id)
  }
}

trait LocalBase extends AbstractNode with AstNodeBase with DeclarationBase {
  def asStored: StoredNode = this.asInstanceOf[StoredNode]

  def closureBindingId: Option[String]
  def code: String
  def columnNumber: Option[Integer]
  def dynamicTypeHintFullName: IndexedSeq[String]
  def fullName: String
  def lineNumber: Option[Integer]
  def name: String
  def order: scala.Int
  def possibleTypes: IndexedSeq[String]
  def typeFullName: String

}

class Local(graph_4762: Graph, id_4762: Long /*cf https://github.com/scala/bug/issues/4762 */ )
    extends NodeRef[LocalDb](graph_4762, id_4762)
    with LocalBase
    with StoredNode
    with AstNode
    with Declaration {
  override def closureBindingId: Option[String]            = get().closureBindingId
  override def code: String                                = get().code
  override def columnNumber: Option[Integer]               = get().columnNumber
  override def dynamicTypeHintFullName: IndexedSeq[String] = get().dynamicTypeHintFullName
  override def fullName: String                            = get().fullName
  override def lineNumber: Option[Integer]                 = get().lineNumber
  override def name: String                                = get().name
  override def order: scala.Int                            = get().order
  override def possibleTypes: IndexedSeq[String]           = get().possibleTypes
  override def typeFullName: String                        = get().typeFullName
  override def propertyDefaultValue(propertyKey: String) = {
    propertyKey match {
      case "CODE"           => Local.PropertyDefaults.Code
      case "FULL_NAME"      => Local.PropertyDefaults.FullName
      case "NAME"           => Local.PropertyDefaults.Name
      case "ORDER"          => Local.PropertyDefaults.Order
      case "TYPE_FULL_NAME" => Local.PropertyDefaults.TypeFullName
      case _                => super.propertyDefaultValue(propertyKey)
    }
  }

  def astOut: Iterator[Call] = get().astOut
  override def _astOut       = get()._astOut

  /** Traverse to CALL via AST OUT edge.
    */
  def _callViaAstOut: overflowdb.traversal.Traversal[Call] = get()._callViaAstOut

  def capturedByOut: Iterator[ClosureBinding] = get().capturedByOut
  override def _capturedByOut                 = get()._capturedByOut

  /** Traverse to CLOSURE_BINDING via CAPTURED_BY OUT edge.
    */
  def _closureBindingViaCapturedByOut: overflowdb.traversal.Traversal[ClosureBinding] =
    get()._closureBindingViaCapturedByOut

  def evalTypeOut: Iterator[Type] = get().evalTypeOut
  override def _evalTypeOut       = get()._evalTypeOut

  /** The type of the local. Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  /** The type of the local. */
  @overflowdb.traversal.help.Doc(info = """The type of the local.""")
  def typ: overflowdb.traversal.Traversal[Type] = get().typ

  def inMacroOut: Iterator[MacroDecl] = get().inMacroOut
  override def _inMacroOut            = get()._inMacroOut

  def taggedByOut: Iterator[Tag] = get().taggedByOut
  override def _taggedByOut      = get()._taggedByOut

  /** Traverse to TAG via TAGGED_BY OUT edge.
    */
  def _tagViaTaggedByOut: overflowdb.traversal.Traversal[Tag] = get()._tagViaTaggedByOut

  def astIn: Iterator[Expression] = get().astIn
  override def _astIn             = get()._astIn

  /** The block in which local is declared. Traverse to BLOCK via AST IN edge.
    */
  /** The block in which local is declared. */
  @overflowdb.traversal.help.Doc(info = """The block in which local is declared.""")
  def definingBlock: overflowdb.traversal.Traversal[Block] = get().definingBlock

  /** Traverse to CONTROL_STRUCTURE via AST IN edge.
    */
  def _controlStructureViaAstIn: overflowdb.traversal.Traversal[ControlStructure] = get()._controlStructureViaAstIn

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def _unknownViaAstIn: overflowdb.traversal.Traversal[Unknown] = get()._unknownViaAstIn

  def lengthIn: Iterator[Type] = get().lengthIn
  override def _lengthIn       = get()._lengthIn

  def lengthExpIn: Iterator[Type] = get().lengthExpIn
  override def _lengthExpIn       = get()._lengthExpIn

  def refIn: Iterator[StoredNode] = get().refIn
  override def _refIn             = get()._refIn

  /** Traverse to CLOSURE_BINDING via REF IN edge.
    */
  def _closureBindingViaRefIn: overflowdb.traversal.Traversal[ClosureBinding] = get()._closureBindingViaRefIn

  /** Places (identifier) where this local is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  /** Places (identifier) where this local is being referenced */
  @overflowdb.traversal.help.Doc(info = """Places (identifier) where this local is being referenced""")
  def referencingIdentifiers: overflowdb.traversal.Traversal[Identifier] = get().referencingIdentifiers

  def specializeParaIn: Iterator[Type] = get().specializeParaIn
  override def _specializeParaIn       = get()._specializeParaIn

  def templateParaIn: Iterator[AstNode] = get().templateParaIn
  override def _templateParaIn          = get()._templateParaIn

  /** Traverse to METHOD via TEMPLATE_PARA IN edge.
    */
  def _methodViaTemplateParaIn: overflowdb.traversal.Traversal[Method] = get()._methodViaTemplateParaIn

  /** Traverse to TYPE_DECL via TEMPLATE_PARA IN edge.
    */
  def _typeDeclViaTemplateParaIn: overflowdb.traversal.Traversal[TypeDecl] = get()._typeDeclViaTemplateParaIn

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
    Local.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "id"
      case 1  => "closureBindingId"
      case 2  => "code"
      case 3  => "columnNumber"
      case 4  => "dynamicTypeHintFullName"
      case 5  => "fullName"
      case 6  => "lineNumber"
      case 7  => "name"
      case 8  => "order"
      case 9  => "possibleTypes"
      case 10 => "typeFullName"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0  => id
      case 1  => closureBindingId
      case 2  => code
      case 3  => columnNumber
      case 4  => dynamicTypeHintFullName
      case 5  => fullName
      case 6  => lineNumber
      case 7  => name
      case 8  => order
      case 9  => possibleTypes
      case 10 => typeFullName
    }

  override def productPrefix = "Local"
  override def productArity  = 11
}

class LocalDb(ref: NodeRef[NodeDb]) extends NodeDb(ref) with StoredNode with AstNode with Declaration with LocalBase {

  override def layoutInformation: NodeLayoutInformation = Local.layoutInformation

  private var _closureBindingId: String                    = null
  def closureBindingId: Option[String]                     = Option(_closureBindingId)
  private var _code: String                                = Local.PropertyDefaults.Code
  def code: String                                         = _code
  private var _columnNumber: Integer                       = null
  def columnNumber: Option[Integer]                        = Option(_columnNumber)
  private var _dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  def dynamicTypeHintFullName: IndexedSeq[String]          = _dynamicTypeHintFullName
  private var _fullName: String                            = Local.PropertyDefaults.FullName
  def fullName: String                                     = _fullName
  private var _lineNumber: Integer                         = null
  def lineNumber: Option[Integer]                          = Option(_lineNumber)
  private var _name: String                                = Local.PropertyDefaults.Name
  def name: String                                         = _name
  private var _order: scala.Int                            = Local.PropertyDefaults.Order
  def order: scala.Int                                     = _order
  private var _possibleTypes: IndexedSeq[String]           = collection.immutable.ArraySeq.empty
  def possibleTypes: IndexedSeq[String]                    = _possibleTypes
  private var _typeFullName: String                        = Local.PropertyDefaults.TypeFullName
  def typeFullName: String                                 = _typeFullName

  /** faster than the default implementation */
  override def propertiesMap: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    closureBindingId.map { value => properties.put("CLOSURE_BINDING_ID", value) }
    properties.put("CODE", code)
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    if (this._dynamicTypeHintFullName != null && this._dynamicTypeHintFullName.nonEmpty) {
      properties.put("DYNAMIC_TYPE_HINT_FULL_NAME", dynamicTypeHintFullName)
    }
    properties.put("FULL_NAME", fullName)
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    properties.put("NAME", name)
    properties.put("ORDER", order)
    if (this._possibleTypes != null && this._possibleTypes.nonEmpty) { properties.put("POSSIBLE_TYPES", possibleTypes) }
    properties.put("TYPE_FULL_NAME", typeFullName)

    properties
  }

  /** faster than the default implementation */
  override def propertiesMapForStorage: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    closureBindingId.map { value => properties.put("CLOSURE_BINDING_ID", value) }
    if (!(("<empty>") == code)) { properties.put("CODE", code) }
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    if (this._dynamicTypeHintFullName != null && this._dynamicTypeHintFullName.nonEmpty) {
      properties.put("DYNAMIC_TYPE_HINT_FULL_NAME", dynamicTypeHintFullName)
    }
    if (!(("<empty>") == fullName)) { properties.put("FULL_NAME", fullName) }
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    if (!(("<empty>") == name)) { properties.put("NAME", name) }
    if (!((-1: Int) == order)) { properties.put("ORDER", order) }
    if (this._possibleTypes != null && this._possibleTypes.nonEmpty) { properties.put("POSSIBLE_TYPES", possibleTypes) }
    if (!(("<empty>") == typeFullName)) { properties.put("TYPE_FULL_NAME", typeFullName) }

    properties
  }

  import overflowdb.traversal._
  def astOut: Iterator[Call]                               = createAdjacentNodeScalaIteratorByOffSet[Call](0)
  override def _astOut                                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](0)
  def _callViaAstOut: overflowdb.traversal.Traversal[Call] = astOut.collectAll[Call]

  def capturedByOut: Iterator[ClosureBinding] = createAdjacentNodeScalaIteratorByOffSet[ClosureBinding](1)
  override def _capturedByOut                 = createAdjacentNodeScalaIteratorByOffSet[StoredNode](1)
  def _closureBindingViaCapturedByOut: overflowdb.traversal.Traversal[ClosureBinding] =
    capturedByOut.collectAll[ClosureBinding]

  def evalTypeOut: Iterator[Type]               = createAdjacentNodeScalaIteratorByOffSet[Type](2)
  override def _evalTypeOut                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](2)
  def typ: overflowdb.traversal.Traversal[Type] = evalTypeOut.collectAll[Type]

  def inMacroOut: Iterator[MacroDecl] = createAdjacentNodeScalaIteratorByOffSet[MacroDecl](3)
  override def _inMacroOut            = createAdjacentNodeScalaIteratorByOffSet[StoredNode](3)

  def taggedByOut: Iterator[Tag]                              = createAdjacentNodeScalaIteratorByOffSet[Tag](4)
  override def _taggedByOut                                   = createAdjacentNodeScalaIteratorByOffSet[StoredNode](4)
  def _tagViaTaggedByOut: overflowdb.traversal.Traversal[Tag] = taggedByOut.collectAll[Tag]

  def astIn: Iterator[Expression]                          = createAdjacentNodeScalaIteratorByOffSet[Expression](5)
  override def _astIn                                      = createAdjacentNodeScalaIteratorByOffSet[StoredNode](5)
  def definingBlock: overflowdb.traversal.Traversal[Block] = astIn.collectAll[Block]
  def _controlStructureViaAstIn: overflowdb.traversal.Traversal[ControlStructure] = astIn.collectAll[ControlStructure]
  def _unknownViaAstIn: overflowdb.traversal.Traversal[Unknown]                   = astIn.collectAll[Unknown]

  def lengthIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](6)
  override def _lengthIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](6)

  def lengthExpIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](7)
  override def _lengthExpIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](7)

  def refIn: Iterator[StoredNode] = createAdjacentNodeScalaIteratorByOffSet[StoredNode](8)
  override def _refIn             = createAdjacentNodeScalaIteratorByOffSet[StoredNode](8)
  def _closureBindingViaRefIn: overflowdb.traversal.Traversal[ClosureBinding] = refIn.collectAll[ClosureBinding]
  def referencingIdentifiers: overflowdb.traversal.Traversal[Identifier]      = refIn.collectAll[Identifier]

  def specializeParaIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](9)
  override def _specializeParaIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](9)

  def templateParaIn: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](10)
  override def _templateParaIn          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](10)
  def _methodViaTemplateParaIn: overflowdb.traversal.Traversal[Method]     = templateParaIn.collectAll[Method]
  def _typeDeclViaTemplateParaIn: overflowdb.traversal.Traversal[TypeDecl] = templateParaIn.collectAll[TypeDecl]

  override def label: String = {
    Local.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "id"
      case 1  => "closureBindingId"
      case 2  => "code"
      case 3  => "columnNumber"
      case 4  => "dynamicTypeHintFullName"
      case 5  => "fullName"
      case 6  => "lineNumber"
      case 7  => "name"
      case 8  => "order"
      case 9  => "possibleTypes"
      case 10 => "typeFullName"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0  => id
      case 1  => closureBindingId
      case 2  => code
      case 3  => columnNumber
      case 4  => dynamicTypeHintFullName
      case 5  => fullName
      case 6  => lineNumber
      case 7  => name
      case 8  => order
      case 9  => possibleTypes
      case 10 => typeFullName
    }

  override def productPrefix = "Local"
  override def productArity  = 11

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[LocalDb]

  override def property(key: String): Any = {
    key match {
      case "CLOSURE_BINDING_ID"          => this._closureBindingId
      case "CODE"                        => this._code
      case "COLUMN_NUMBER"               => this._columnNumber
      case "DYNAMIC_TYPE_HINT_FULL_NAME" => this._dynamicTypeHintFullName
      case "FULL_NAME"                   => this._fullName
      case "LINE_NUMBER"                 => this._lineNumber
      case "NAME"                        => this._name
      case "ORDER"                       => this._order
      case "POSSIBLE_TYPES"              => this._possibleTypes
      case "TYPE_FULL_NAME"              => this._typeFullName

      case _ => null
    }
  }

  override protected def updateSpecificProperty(key: String, value: Object): Unit = {
    key match {
      case "CLOSURE_BINDING_ID" => this._closureBindingId = value.asInstanceOf[String]
      case "CODE"               => this._code = value.asInstanceOf[String]
      case "COLUMN_NUMBER"      => this._columnNumber = value.asInstanceOf[Integer]
      case "DYNAMIC_TYPE_HINT_FULL_NAME" =>
        this._dynamicTypeHintFullName = value match {
          case null                                             => collection.immutable.ArraySeq.empty
          case singleValue: String                              => collection.immutable.ArraySeq(singleValue)
          case coll: IterableOnce[Any] if coll.iterator.isEmpty => collection.immutable.ArraySeq.empty
          case arr: Array[_] if arr.isEmpty                     => collection.immutable.ArraySeq.empty
          case arr: Array[_] => collection.immutable.ArraySeq.unsafeWrapArray(arr).asInstanceOf[IndexedSeq[String]]
          case jCollection: java.lang.Iterable[_] =>
            if (jCollection.iterator.hasNext) {
              collection.immutable.ArraySeq.unsafeWrapArray(
                jCollection.asInstanceOf[java.util.Collection[String]].iterator.asScala.toArray
              )
            } else collection.immutable.ArraySeq.empty
          case iter: Iterable[_] =>
            if (iter.nonEmpty) {
              collection.immutable.ArraySeq.unsafeWrapArray(iter.asInstanceOf[Iterable[String]].toArray)
            } else collection.immutable.ArraySeq.empty
        }
      case "FULL_NAME"   => this._fullName = value.asInstanceOf[String]
      case "LINE_NUMBER" => this._lineNumber = value.asInstanceOf[Integer]
      case "NAME"        => this._name = value.asInstanceOf[String]
      case "ORDER"       => this._order = value.asInstanceOf[scala.Int]
      case "POSSIBLE_TYPES" =>
        this._possibleTypes = value match {
          case null                                             => collection.immutable.ArraySeq.empty
          case singleValue: String                              => collection.immutable.ArraySeq(singleValue)
          case coll: IterableOnce[Any] if coll.iterator.isEmpty => collection.immutable.ArraySeq.empty
          case arr: Array[_] if arr.isEmpty                     => collection.immutable.ArraySeq.empty
          case arr: Array[_] => collection.immutable.ArraySeq.unsafeWrapArray(arr).asInstanceOf[IndexedSeq[String]]
          case jCollection: java.lang.Iterable[_] =>
            if (jCollection.iterator.hasNext) {
              collection.immutable.ArraySeq.unsafeWrapArray(
                jCollection.asInstanceOf[java.util.Collection[String]].iterator.asScala.toArray
              )
            } else collection.immutable.ArraySeq.empty
          case iter: Iterable[_] =>
            if (iter.nonEmpty) {
              collection.immutable.ArraySeq.unsafeWrapArray(iter.asInstanceOf[Iterable[String]].toArray)
            } else collection.immutable.ArraySeq.empty
        }
      case "TYPE_FULL_NAME" => this._typeFullName = value.asInstanceOf[String]

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
    this._closureBindingId = newNode.asInstanceOf[NewLocal].closureBindingId.orNull
    this._code = newNode.asInstanceOf[NewLocal].code
    this._columnNumber = newNode.asInstanceOf[NewLocal].columnNumber.orNull
    this._dynamicTypeHintFullName =
      if (newNode.asInstanceOf[NewLocal].dynamicTypeHintFullName != null)
        newNode.asInstanceOf[NewLocal].dynamicTypeHintFullName
      else collection.immutable.ArraySeq.empty
    this._fullName = newNode.asInstanceOf[NewLocal].fullName
    this._lineNumber = newNode.asInstanceOf[NewLocal].lineNumber.orNull
    this._name = newNode.asInstanceOf[NewLocal].name
    this._order = newNode.asInstanceOf[NewLocal].order
    this._possibleTypes =
      if (newNode.asInstanceOf[NewLocal].possibleTypes != null) newNode.asInstanceOf[NewLocal].possibleTypes
      else collection.immutable.ArraySeq.empty
    this._typeFullName = newNode.asInstanceOf[NewLocal].typeFullName

    graph.indexManager.putIfIndexed("FULL_NAME", newNode.asInstanceOf[NewLocal].fullName, this.ref)
  }

}
