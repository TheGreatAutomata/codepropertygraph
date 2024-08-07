package io.shiftleft.codepropertygraph.generated.nodes

import overflowdb._
import scala.jdk.CollectionConverters._

object Member {
  def apply(graph: Graph, id: Long) = new Member(graph, id)

  val Label = "MEMBER"

  object PropertyNames {
    val AstParentFullName       = "AST_PARENT_FULL_NAME"
    val AstParentType           = "AST_PARENT_TYPE"
    val Code                    = "CODE"
    val ColumnNumber            = "COLUMN_NUMBER"
    val DynamicTypeHintFullName = "DYNAMIC_TYPE_HINT_FULL_NAME"
    val FullName                = "FULL_NAME"
    val IndexOrder              = "INDEX_ORDER"
    val LineNumber              = "LINE_NUMBER"
    val MemberOffset            = "MEMBER_OFFSET"
    val Name                    = "NAME"
    val Order                   = "ORDER"
    val PossibleTypes           = "POSSIBLE_TYPES"
    val TypeFullName            = "TYPE_FULL_NAME"
    val all: Set[String] = Set(
      AstParentFullName,
      AstParentType,
      Code,
      ColumnNumber,
      DynamicTypeHintFullName,
      FullName,
      IndexOrder,
      LineNumber,
      MemberOffset,
      Name,
      Order,
      PossibleTypes,
      TypeFullName
    )
    val allAsJava: java.util.Set[String] = all.asJava
  }

  object Properties {
    val AstParentFullName       = new overflowdb.PropertyKey[String]("AST_PARENT_FULL_NAME")
    val AstParentType           = new overflowdb.PropertyKey[String]("AST_PARENT_TYPE")
    val Code                    = new overflowdb.PropertyKey[String]("CODE")
    val ColumnNumber            = new overflowdb.PropertyKey[Integer]("COLUMN_NUMBER")
    val DynamicTypeHintFullName = new overflowdb.PropertyKey[IndexedSeq[String]]("DYNAMIC_TYPE_HINT_FULL_NAME")
    val FullName                = new overflowdb.PropertyKey[String]("FULL_NAME")
    val IndexOrder              = new overflowdb.PropertyKey[scala.Int]("INDEX_ORDER")
    val LineNumber              = new overflowdb.PropertyKey[Integer]("LINE_NUMBER")
    val MemberOffset            = new overflowdb.PropertyKey[scala.Int]("MEMBER_OFFSET")
    val Name                    = new overflowdb.PropertyKey[String]("NAME")
    val Order                   = new overflowdb.PropertyKey[scala.Int]("ORDER")
    val PossibleTypes           = new overflowdb.PropertyKey[IndexedSeq[String]]("POSSIBLE_TYPES")
    val TypeFullName            = new overflowdb.PropertyKey[String]("TYPE_FULL_NAME")

  }

  object PropertyDefaults {
    val AstParentFullName = "<empty>"
    val AstParentType     = "<empty>"
    val Code              = "<empty>"
    val FullName          = "<empty>"
    val IndexOrder        = -1: Int
    val MemberOffset      = -1: Int
    val Name              = "<empty>"
    val Order             = -1: Int
    val TypeFullName      = "<empty>"
  }

  val layoutInformation = new NodeLayoutInformation(
    Label,
    PropertyNames.allAsJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.EvalType.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.InMacro.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.TaggedBy.layoutInformation
    ).asJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Length.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LengthExp.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ref.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.SpecializePara.layoutInformation
    ).asJava
  )

  object Edges {
    val Out: Array[String] = Array("AST", "EVAL_TYPE", "IN_MACRO", "TAGGED_BY")
    val In: Array[String]  = Array("AST", "LENGTH", "LENGTH_EXP", "REF", "SPECIALIZE_PARA")
  }

  val factory = new NodeFactory[MemberDb] {
    override val forLabel = Member.Label

    override def createNode(ref: NodeRef[MemberDb]) =
      new MemberDb(ref.asInstanceOf[NodeRef[NodeDb]])

    override def createNodeRef(graph: Graph, id: Long) = Member(graph, id)
  }
}

trait MemberBase extends AbstractNode with AstNodeBase with DeclarationBase {
  def asStored: StoredNode = this.asInstanceOf[StoredNode]

  def astParentFullName: String
  def astParentType: String
  def code: String
  def columnNumber: Option[Integer]
  def dynamicTypeHintFullName: IndexedSeq[String]
  def fullName: String
  def indexOrder: scala.Int
  def lineNumber: Option[Integer]
  def memberOffset: scala.Int
  def name: String
  def order: scala.Int
  def possibleTypes: IndexedSeq[String]
  def typeFullName: String

}

class Member(graph_4762: Graph, id_4762: Long /*cf https://github.com/scala/bug/issues/4762 */ )
    extends NodeRef[MemberDb](graph_4762, id_4762)
    with MemberBase
    with StoredNode
    with AstNode
    with Declaration {
  override def astParentFullName: String                   = get().astParentFullName
  override def astParentType: String                       = get().astParentType
  override def code: String                                = get().code
  override def columnNumber: Option[Integer]               = get().columnNumber
  override def dynamicTypeHintFullName: IndexedSeq[String] = get().dynamicTypeHintFullName
  override def fullName: String                            = get().fullName
  override def indexOrder: scala.Int                       = get().indexOrder
  override def lineNumber: Option[Integer]                 = get().lineNumber
  override def memberOffset: scala.Int                     = get().memberOffset
  override def name: String                                = get().name
  override def order: scala.Int                            = get().order
  override def possibleTypes: IndexedSeq[String]           = get().possibleTypes
  override def typeFullName: String                        = get().typeFullName
  override def propertyDefaultValue(propertyKey: String) = {
    propertyKey match {
      case "AST_PARENT_FULL_NAME" => Member.PropertyDefaults.AstParentFullName
      case "AST_PARENT_TYPE"      => Member.PropertyDefaults.AstParentType
      case "CODE"                 => Member.PropertyDefaults.Code
      case "FULL_NAME"            => Member.PropertyDefaults.FullName
      case "INDEX_ORDER"          => Member.PropertyDefaults.IndexOrder
      case "MEMBER_OFFSET"        => Member.PropertyDefaults.MemberOffset
      case "NAME"                 => Member.PropertyDefaults.Name
      case "ORDER"                => Member.PropertyDefaults.Order
      case "TYPE_FULL_NAME"       => Member.PropertyDefaults.TypeFullName
      case _                      => super.propertyDefaultValue(propertyKey)
    }
  }

  def astOut: Iterator[AstNode] = get().astOut
  override def _astOut          = get()._astOut

  /** Traverse to ANNOTATION via AST OUT edge.
    */
  def _annotationViaAstOut: overflowdb.traversal.Traversal[Annotation] = get()._annotationViaAstOut

  /** Traverse to CALL via AST OUT edge.
    */
  def _callViaAstOut: overflowdb.traversal.Traversal[Call] = get()._callViaAstOut

  /** Traverse to MODIFIER via AST OUT edge.
    */
  def _modifierViaAstOut: overflowdb.traversal.Traversal[Modifier] = get()._modifierViaAstOut

  def evalTypeOut: Iterator[Type] = get().evalTypeOut
  override def _evalTypeOut       = get()._evalTypeOut

  /** Traverse to member type Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  /** Traverse to member type */
  @overflowdb.traversal.help.Doc(info = """Traverse to member type""")
  def typ: overflowdb.traversal.Traversal[Type] = get().typ

  def inMacroOut: Iterator[MacroDecl] = get().inMacroOut
  override def _inMacroOut            = get()._inMacroOut

  def taggedByOut: Iterator[Tag] = get().taggedByOut
  override def _taggedByOut      = get()._taggedByOut

  /** Traverse to TAG via TAGGED_BY OUT edge.
    */
  def _tagViaTaggedByOut: overflowdb.traversal.Traversal[Tag] = get()._tagViaTaggedByOut

  def astIn: Iterator[AstNode] = get().astIn
  override def _astIn          = get()._astIn

  /** The type declaration this member is defined in Traverse to TYPE_DECL via AST IN edge.
    */
  /** The type declaration this member is defined in */
  @overflowdb.traversal.help.Doc(info = """The type declaration this member is defined in""")
  def typeDecl: TypeDecl = get().typeDecl

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def _unknownViaAstIn: overflowdb.traversal.Traversal[Unknown] = get()._unknownViaAstIn

  def lengthIn: Iterator[Type] = get().lengthIn
  override def _lengthIn       = get()._lengthIn

  def lengthExpIn: Iterator[Type] = get().lengthExpIn
  override def _lengthExpIn       = get()._lengthExpIn

  def refIn: Iterator[Call] = get().refIn
  override def _refIn       = get()._refIn

  /** Traverse to CALL via REF IN edge.
    */
  def _callViaRefIn: overflowdb.traversal.Traversal[Call] = get()._callViaRefIn

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
    Member.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "id"
      case 1  => "astParentFullName"
      case 2  => "astParentType"
      case 3  => "code"
      case 4  => "columnNumber"
      case 5  => "dynamicTypeHintFullName"
      case 6  => "fullName"
      case 7  => "indexOrder"
      case 8  => "lineNumber"
      case 9  => "memberOffset"
      case 10 => "name"
      case 11 => "order"
      case 12 => "possibleTypes"
      case 13 => "typeFullName"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0  => id
      case 1  => astParentFullName
      case 2  => astParentType
      case 3  => code
      case 4  => columnNumber
      case 5  => dynamicTypeHintFullName
      case 6  => fullName
      case 7  => indexOrder
      case 8  => lineNumber
      case 9  => memberOffset
      case 10 => name
      case 11 => order
      case 12 => possibleTypes
      case 13 => typeFullName
    }

  override def productPrefix = "Member"
  override def productArity  = 14
}

class MemberDb(ref: NodeRef[NodeDb]) extends NodeDb(ref) with StoredNode with AstNode with Declaration with MemberBase {

  override def layoutInformation: NodeLayoutInformation = Member.layoutInformation

  private var _astParentFullName: String                   = Member.PropertyDefaults.AstParentFullName
  def astParentFullName: String                            = _astParentFullName
  private var _astParentType: String                       = Member.PropertyDefaults.AstParentType
  def astParentType: String                                = _astParentType
  private var _code: String                                = Member.PropertyDefaults.Code
  def code: String                                         = _code
  private var _columnNumber: Integer                       = null
  def columnNumber: Option[Integer]                        = Option(_columnNumber)
  private var _dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  def dynamicTypeHintFullName: IndexedSeq[String]          = _dynamicTypeHintFullName
  private var _fullName: String                            = Member.PropertyDefaults.FullName
  def fullName: String                                     = _fullName
  private var _indexOrder: scala.Int                       = Member.PropertyDefaults.IndexOrder
  def indexOrder: scala.Int                                = _indexOrder
  private var _lineNumber: Integer                         = null
  def lineNumber: Option[Integer]                          = Option(_lineNumber)
  private var _memberOffset: scala.Int                     = Member.PropertyDefaults.MemberOffset
  def memberOffset: scala.Int                              = _memberOffset
  private var _name: String                                = Member.PropertyDefaults.Name
  def name: String                                         = _name
  private var _order: scala.Int                            = Member.PropertyDefaults.Order
  def order: scala.Int                                     = _order
  private var _possibleTypes: IndexedSeq[String]           = collection.immutable.ArraySeq.empty
  def possibleTypes: IndexedSeq[String]                    = _possibleTypes
  private var _typeFullName: String                        = Member.PropertyDefaults.TypeFullName
  def typeFullName: String                                 = _typeFullName

  /** faster than the default implementation */
  override def propertiesMap: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    properties.put("AST_PARENT_FULL_NAME", astParentFullName)
    properties.put("AST_PARENT_TYPE", astParentType)
    properties.put("CODE", code)
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    if (this._dynamicTypeHintFullName != null && this._dynamicTypeHintFullName.nonEmpty) {
      properties.put("DYNAMIC_TYPE_HINT_FULL_NAME", dynamicTypeHintFullName)
    }
    properties.put("FULL_NAME", fullName)
    properties.put("INDEX_ORDER", indexOrder)
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    properties.put("MEMBER_OFFSET", memberOffset)
    properties.put("NAME", name)
    properties.put("ORDER", order)
    if (this._possibleTypes != null && this._possibleTypes.nonEmpty) { properties.put("POSSIBLE_TYPES", possibleTypes) }
    properties.put("TYPE_FULL_NAME", typeFullName)

    properties
  }

  /** faster than the default implementation */
  override def propertiesMapForStorage: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    if (!(("<empty>") == astParentFullName)) { properties.put("AST_PARENT_FULL_NAME", astParentFullName) }
    if (!(("<empty>") == astParentType)) { properties.put("AST_PARENT_TYPE", astParentType) }
    if (!(("<empty>") == code)) { properties.put("CODE", code) }
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    if (this._dynamicTypeHintFullName != null && this._dynamicTypeHintFullName.nonEmpty) {
      properties.put("DYNAMIC_TYPE_HINT_FULL_NAME", dynamicTypeHintFullName)
    }
    if (!(("<empty>") == fullName)) { properties.put("FULL_NAME", fullName) }
    if (!((-1: Int) == indexOrder)) { properties.put("INDEX_ORDER", indexOrder) }
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    if (!((-1: Int) == memberOffset)) { properties.put("MEMBER_OFFSET", memberOffset) }
    if (!(("<empty>") == name)) { properties.put("NAME", name) }
    if (!((-1: Int) == order)) { properties.put("ORDER", order) }
    if (this._possibleTypes != null && this._possibleTypes.nonEmpty) { properties.put("POSSIBLE_TYPES", possibleTypes) }
    if (!(("<empty>") == typeFullName)) { properties.put("TYPE_FULL_NAME", typeFullName) }

    properties
  }

  import overflowdb.traversal._
  def astOut: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](0)
  override def _astOut          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](0)
  def _annotationViaAstOut: overflowdb.traversal.Traversal[Annotation] = astOut.collectAll[Annotation]
  def _callViaAstOut: overflowdb.traversal.Traversal[Call]             = astOut.collectAll[Call]
  def _modifierViaAstOut: overflowdb.traversal.Traversal[Modifier]     = astOut.collectAll[Modifier]

  def evalTypeOut: Iterator[Type]               = createAdjacentNodeScalaIteratorByOffSet[Type](1)
  override def _evalTypeOut                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](1)
  def typ: overflowdb.traversal.Traversal[Type] = evalTypeOut.collectAll[Type]

  def inMacroOut: Iterator[MacroDecl] = createAdjacentNodeScalaIteratorByOffSet[MacroDecl](2)
  override def _inMacroOut            = createAdjacentNodeScalaIteratorByOffSet[StoredNode](2)

  def taggedByOut: Iterator[Tag]                              = createAdjacentNodeScalaIteratorByOffSet[Tag](3)
  override def _taggedByOut                                   = createAdjacentNodeScalaIteratorByOffSet[StoredNode](3)
  def _tagViaTaggedByOut: overflowdb.traversal.Traversal[Tag] = taggedByOut.collectAll[Tag]

  def astIn: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](4)
  override def _astIn          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](4)
  def typeDecl: TypeDecl = try { astIn.collectAll[TypeDecl].next() }
  catch {
    case e: java.util.NoSuchElementException =>
      throw new overflowdb.SchemaViolationException(
        "IN edge with label AST to an adjacent TYPE_DECL is mandatory, but not defined for this MEMBER node with id=" + id,
        e
      )
  }
  def _unknownViaAstIn: overflowdb.traversal.Traversal[Unknown] = astIn.collectAll[Unknown]

  def lengthIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](5)
  override def _lengthIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](5)

  def lengthExpIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](6)
  override def _lengthExpIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](6)

  def refIn: Iterator[Call]                               = createAdjacentNodeScalaIteratorByOffSet[Call](7)
  override def _refIn                                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](7)
  def _callViaRefIn: overflowdb.traversal.Traversal[Call] = refIn.collectAll[Call]

  def specializeParaIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](8)
  override def _specializeParaIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](8)

  override def label: String = {
    Member.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "id"
      case 1  => "astParentFullName"
      case 2  => "astParentType"
      case 3  => "code"
      case 4  => "columnNumber"
      case 5  => "dynamicTypeHintFullName"
      case 6  => "fullName"
      case 7  => "indexOrder"
      case 8  => "lineNumber"
      case 9  => "memberOffset"
      case 10 => "name"
      case 11 => "order"
      case 12 => "possibleTypes"
      case 13 => "typeFullName"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0  => id
      case 1  => astParentFullName
      case 2  => astParentType
      case 3  => code
      case 4  => columnNumber
      case 5  => dynamicTypeHintFullName
      case 6  => fullName
      case 7  => indexOrder
      case 8  => lineNumber
      case 9  => memberOffset
      case 10 => name
      case 11 => order
      case 12 => possibleTypes
      case 13 => typeFullName
    }

  override def productPrefix = "Member"
  override def productArity  = 14

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[MemberDb]

  override def property(key: String): Any = {
    key match {
      case "AST_PARENT_FULL_NAME"        => this._astParentFullName
      case "AST_PARENT_TYPE"             => this._astParentType
      case "CODE"                        => this._code
      case "COLUMN_NUMBER"               => this._columnNumber
      case "DYNAMIC_TYPE_HINT_FULL_NAME" => this._dynamicTypeHintFullName
      case "FULL_NAME"                   => this._fullName
      case "INDEX_ORDER"                 => this._indexOrder
      case "LINE_NUMBER"                 => this._lineNumber
      case "MEMBER_OFFSET"               => this._memberOffset
      case "NAME"                        => this._name
      case "ORDER"                       => this._order
      case "POSSIBLE_TYPES"              => this._possibleTypes
      case "TYPE_FULL_NAME"              => this._typeFullName

      case _ => null
    }
  }

  override protected def updateSpecificProperty(key: String, value: Object): Unit = {
    key match {
      case "AST_PARENT_FULL_NAME" => this._astParentFullName = value.asInstanceOf[String]
      case "AST_PARENT_TYPE"      => this._astParentType = value.asInstanceOf[String]
      case "CODE"                 => this._code = value.asInstanceOf[String]
      case "COLUMN_NUMBER"        => this._columnNumber = value.asInstanceOf[Integer]
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
      case "FULL_NAME"     => this._fullName = value.asInstanceOf[String]
      case "INDEX_ORDER"   => this._indexOrder = value.asInstanceOf[scala.Int]
      case "LINE_NUMBER"   => this._lineNumber = value.asInstanceOf[Integer]
      case "MEMBER_OFFSET" => this._memberOffset = value.asInstanceOf[scala.Int]
      case "NAME"          => this._name = value.asInstanceOf[String]
      case "ORDER"         => this._order = value.asInstanceOf[scala.Int]
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
    this._astParentFullName = newNode.asInstanceOf[NewMember].astParentFullName
    this._astParentType = newNode.asInstanceOf[NewMember].astParentType
    this._code = newNode.asInstanceOf[NewMember].code
    this._columnNumber = newNode.asInstanceOf[NewMember].columnNumber.orNull
    this._dynamicTypeHintFullName =
      if (newNode.asInstanceOf[NewMember].dynamicTypeHintFullName != null)
        newNode.asInstanceOf[NewMember].dynamicTypeHintFullName
      else collection.immutable.ArraySeq.empty
    this._fullName = newNode.asInstanceOf[NewMember].fullName
    this._indexOrder = newNode.asInstanceOf[NewMember].indexOrder
    this._lineNumber = newNode.asInstanceOf[NewMember].lineNumber.orNull
    this._memberOffset = newNode.asInstanceOf[NewMember].memberOffset
    this._name = newNode.asInstanceOf[NewMember].name
    this._order = newNode.asInstanceOf[NewMember].order
    this._possibleTypes =
      if (newNode.asInstanceOf[NewMember].possibleTypes != null) newNode.asInstanceOf[NewMember].possibleTypes
      else collection.immutable.ArraySeq.empty
    this._typeFullName = newNode.asInstanceOf[NewMember].typeFullName

    graph.indexManager.putIfIndexed("FULL_NAME", newNode.asInstanceOf[NewMember].fullName, this.ref)
  }

}
