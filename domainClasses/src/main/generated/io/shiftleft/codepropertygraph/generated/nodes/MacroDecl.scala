package io.shiftleft.codepropertygraph.generated.nodes

import overflowdb._
import scala.jdk.CollectionConverters._

object MacroDecl {
  def apply(graph: Graph, id: Long) = new MacroDecl(graph, id)

  val Label = "MACRO_DECL"

  object PropertyNames {
    val AstParentFullName = "AST_PARENT_FULL_NAME"
    val AstParentType     = "AST_PARENT_TYPE"
    val Code              = "CODE"
    val ColumnNumber      = "COLUMN_NUMBER"
    val ColumnNumberEnd   = "COLUMN_NUMBER_END"
    val Filename          = "FILENAME"
    val FullName          = "FULL_NAME"
    val IsExternal        = "IS_EXTERNAL"
    val LineNumber        = "LINE_NUMBER"
    val LineNumberEnd     = "LINE_NUMBER_END"
    val Name              = "NAME"
    val Offset            = "OFFSET"
    val OffsetEnd         = "OFFSET_END"
    val Order             = "ORDER"
    val all: Set[String] = Set(
      AstParentFullName,
      AstParentType,
      Code,
      ColumnNumber,
      ColumnNumberEnd,
      Filename,
      FullName,
      IsExternal,
      LineNumber,
      LineNumberEnd,
      Name,
      Offset,
      OffsetEnd,
      Order
    )
    val allAsJava: java.util.Set[String] = all.asJava
  }

  object Properties {
    val AstParentFullName = new overflowdb.PropertyKey[String]("AST_PARENT_FULL_NAME")
    val AstParentType     = new overflowdb.PropertyKey[String]("AST_PARENT_TYPE")
    val Code              = new overflowdb.PropertyKey[String]("CODE")
    val ColumnNumber      = new overflowdb.PropertyKey[Integer]("COLUMN_NUMBER")
    val ColumnNumberEnd   = new overflowdb.PropertyKey[Integer]("COLUMN_NUMBER_END")
    val Filename          = new overflowdb.PropertyKey[String]("FILENAME")
    val FullName          = new overflowdb.PropertyKey[String]("FULL_NAME")
    val IsExternal        = new overflowdb.PropertyKey[Boolean]("IS_EXTERNAL")
    val LineNumber        = new overflowdb.PropertyKey[Integer]("LINE_NUMBER")
    val LineNumberEnd     = new overflowdb.PropertyKey[Integer]("LINE_NUMBER_END")
    val Name              = new overflowdb.PropertyKey[String]("NAME")
    val Offset            = new overflowdb.PropertyKey[Integer]("OFFSET")
    val OffsetEnd         = new overflowdb.PropertyKey[Integer]("OFFSET_END")
    val Order             = new overflowdb.PropertyKey[scala.Int]("ORDER")

  }

  object PropertyDefaults {
    val AstParentFullName = "<empty>"
    val AstParentType     = "<empty>"
    val Code              = "<empty>"
    val Filename          = "<empty>"
    val FullName          = "<empty>"
    val IsExternal        = false
    val Name              = "<empty>"
    val Order             = -1: Int
  }

  val layoutInformation = new NodeLayoutInformation(
    Label,
    PropertyNames.allAsJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Contains.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.InMacro.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.SourceFile.layoutInformation
    ).asJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Contains.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.InMacro.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Length.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LengthExp.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ref.layoutInformation
    ).asJava
  )

  object Edges {
    val Out: Array[String] = Array("AST", "CONTAINS", "IN_MACRO", "SOURCE_FILE")
    val In: Array[String]  = Array("AST", "CONTAINS", "IN_MACRO", "LENGTH", "LENGTH_EXP", "REF")
  }

  val factory = new NodeFactory[MacroDeclDb] {
    override val forLabel = MacroDecl.Label

    override def createNode(ref: NodeRef[MacroDeclDb]) =
      new MacroDeclDb(ref.asInstanceOf[NodeRef[NodeDb]])

    override def createNodeRef(graph: Graph, id: Long) = MacroDecl(graph, id)
  }
}

trait MacroDeclBase extends AbstractNode with AstNodeBase with DeclarationBase {
  def asStored: StoredNode = this.asInstanceOf[StoredNode]

  def astParentFullName: String
  def astParentType: String
  def code: String
  def columnNumber: Option[Integer]
  def columnNumberEnd: Option[Integer]
  def filename: String
  def fullName: String
  def isExternal: Boolean
  def lineNumber: Option[Integer]
  def lineNumberEnd: Option[Integer]
  def name: String
  def offset: Option[Integer]
  def offsetEnd: Option[Integer]
  def order: scala.Int

}

class MacroDecl(graph_4762: Graph, id_4762: Long /*cf https://github.com/scala/bug/issues/4762 */ )
    extends NodeRef[MacroDeclDb](graph_4762, id_4762)
    with MacroDeclBase
    with StoredNode
    with AstNode
    with Declaration {
  override def astParentFullName: String        = get().astParentFullName
  override def astParentType: String            = get().astParentType
  override def code: String                     = get().code
  override def columnNumber: Option[Integer]    = get().columnNumber
  override def columnNumberEnd: Option[Integer] = get().columnNumberEnd
  override def filename: String                 = get().filename
  override def fullName: String                 = get().fullName
  override def isExternal: Boolean              = get().isExternal
  override def lineNumber: Option[Integer]      = get().lineNumber
  override def lineNumberEnd: Option[Integer]   = get().lineNumberEnd
  override def name: String                     = get().name
  override def offset: Option[Integer]          = get().offset
  override def offsetEnd: Option[Integer]       = get().offsetEnd
  override def order: scala.Int                 = get().order
  override def propertyDefaultValue(propertyKey: String) =
    propertyKey match {
      case "AST_PARENT_FULL_NAME" => MacroDecl.PropertyDefaults.AstParentFullName
      case "AST_PARENT_TYPE"      => MacroDecl.PropertyDefaults.AstParentType
      case "CODE"                 => MacroDecl.PropertyDefaults.Code
      case "FILENAME"             => MacroDecl.PropertyDefaults.Filename
      case "FULL_NAME"            => MacroDecl.PropertyDefaults.FullName
      case "IS_EXTERNAL"          => MacroDecl.PropertyDefaults.IsExternal
      case "NAME"                 => MacroDecl.PropertyDefaults.Name
      case "ORDER"                => MacroDecl.PropertyDefaults.Order
      case _                      => super.propertyDefaultValue(propertyKey)
    }

  def astOut: Iterator[Block] = get().astOut
  override def _astOut        = get()._astOut

  /** Root of the macro body Traverse to BLOCK via AST OUT edge.
    */
  /** Root of the macro body */
  @overflowdb.traversal.help.Doc(info = """Root of the macro body""")
  def block: Block = get().block

  def containsOut: Iterator[Expression] = get().containsOut
  override def _containsOut             = get()._containsOut

  /** Traverse to BLOCK via CONTAINS OUT edge.
    */
  def _blockViaContainsOut: overflowdb.traversal.Traversal[Block] = get()._blockViaContainsOut

  /** Traverse to IDENTIFIER via CONTAINS OUT edge.
    */
  def _identifierViaContainsOut: overflowdb.traversal.Traversal[Identifier] = get()._identifierViaContainsOut

  /** Traverse to METHOD_REF via CONTAINS OUT edge.
    */
  def _methodRefViaContainsOut: overflowdb.traversal.Traversal[MethodRef] = get()._methodRefViaContainsOut

  /** Traverse to TYPE_REF via CONTAINS OUT edge.
    */
  def _typeRefViaContainsOut: overflowdb.traversal.Traversal[TypeRef] = get()._typeRefViaContainsOut

  /** Traverse to UNKNOWN via CONTAINS OUT edge.
    */
  def _unknownViaContainsOut: overflowdb.traversal.Traversal[Unknown] = get()._unknownViaContainsOut

  def inMacroOut: Iterator[MacroDecl] = get().inMacroOut
  override def _inMacroOut            = get()._inMacroOut

  def sourceFileOut: Iterator[File] = get().sourceFileOut
  override def _sourceFileOut       = get()._sourceFileOut

  /** Traverse to FILE via SOURCE_FILE OUT edge.
    */
  def _fileViaSourceFileOut: overflowdb.traversal.Traversal[File] = get()._fileViaSourceFileOut

  def astIn: Iterator[AstNode] = get().astIn
  override def _astIn          = get()._astIn

  /** Traverse to BLOCK via AST IN edge.
    */
  def _blockViaAstIn: overflowdb.traversal.Traversal[Block] = get()._blockViaAstIn

  /** Traverse to NAMESPACE_BLOCK via AST IN edge.
    */
  def _namespaceBlockViaAstIn: Option[NamespaceBlock] = get()._namespaceBlockViaAstIn

  def containsIn: Iterator[File] = get().containsIn
  override def _containsIn       = get()._containsIn

  /** Traverse to FILE via CONTAINS IN edge.
    */
  def _fileViaContainsIn: overflowdb.traversal.Traversal[File] = get()._fileViaContainsIn

  def inMacroIn: Iterator[AstNode] = get().inMacroIn
  override def _inMacroIn          = get()._inMacroIn

  /** Traverse to AST_NODE via IN_MACRO IN edge.
    */
  def _astNodeViaInMacroIn: overflowdb.traversal.Traversal[AstNode] = get()._astNodeViaInMacroIn

  def lengthIn: Iterator[Type] = get().lengthIn
  override def _lengthIn       = get()._lengthIn

  def lengthExpIn: Iterator[Type] = get().lengthExpIn
  override def _lengthExpIn       = get()._lengthExpIn

  def refIn: Iterator[MacroRef] = get().refIn
  override def _refIn           = get()._refIn

  /** Traverse to MACRO_REF via REF IN edge.
    */
  def _macroRefViaRefIn: overflowdb.traversal.Traversal[MacroRef] = get()._macroRefViaRefIn

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
    MacroDecl.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "id"
      case 1  => "astParentFullName"
      case 2  => "astParentType"
      case 3  => "code"
      case 4  => "columnNumber"
      case 5  => "columnNumberEnd"
      case 6  => "filename"
      case 7  => "fullName"
      case 8  => "isExternal"
      case 9  => "lineNumber"
      case 10 => "lineNumberEnd"
      case 11 => "name"
      case 12 => "offset"
      case 13 => "offsetEnd"
      case 14 => "order"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0  => id
      case 1  => astParentFullName
      case 2  => astParentType
      case 3  => code
      case 4  => columnNumber
      case 5  => columnNumberEnd
      case 6  => filename
      case 7  => fullName
      case 8  => isExternal
      case 9  => lineNumber
      case 10 => lineNumberEnd
      case 11 => name
      case 12 => offset
      case 13 => offsetEnd
      case 14 => order
    }

  override def productPrefix = "MacroDecl"
  override def productArity  = 15
}

class MacroDeclDb(ref: NodeRef[NodeDb])
    extends NodeDb(ref)
    with StoredNode
    with AstNode
    with Declaration
    with MacroDeclBase {

  override def layoutInformation: NodeLayoutInformation = MacroDecl.layoutInformation

  private var _astParentFullName: String = MacroDecl.PropertyDefaults.AstParentFullName
  def astParentFullName: String          = _astParentFullName
  private var _astParentType: String     = MacroDecl.PropertyDefaults.AstParentType
  def astParentType: String              = _astParentType
  private var _code: String              = MacroDecl.PropertyDefaults.Code
  def code: String                       = _code
  private var _columnNumber: Integer     = null
  def columnNumber: Option[Integer]      = Option(_columnNumber)
  private var _columnNumberEnd: Integer  = null
  def columnNumberEnd: Option[Integer]   = Option(_columnNumberEnd)
  private var _filename: String          = MacroDecl.PropertyDefaults.Filename
  def filename: String                   = _filename
  private var _fullName: String          = MacroDecl.PropertyDefaults.FullName
  def fullName: String                   = _fullName
  private var _isExternal: Boolean       = MacroDecl.PropertyDefaults.IsExternal
  def isExternal: Boolean                = _isExternal
  private var _lineNumber: Integer       = null
  def lineNumber: Option[Integer]        = Option(_lineNumber)
  private var _lineNumberEnd: Integer    = null
  def lineNumberEnd: Option[Integer]     = Option(_lineNumberEnd)
  private var _name: String              = MacroDecl.PropertyDefaults.Name
  def name: String                       = _name
  private var _offset: Integer           = null
  def offset: Option[Integer]            = Option(_offset)
  private var _offsetEnd: Integer        = null
  def offsetEnd: Option[Integer]         = Option(_offsetEnd)
  private var _order: scala.Int          = MacroDecl.PropertyDefaults.Order
  def order: scala.Int                   = _order

  /** faster than the default implementation */
  override def propertiesMap: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    properties.put("AST_PARENT_FULL_NAME", astParentFullName)
    properties.put("AST_PARENT_TYPE", astParentType)
    properties.put("CODE", code)
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    columnNumberEnd.map { value => properties.put("COLUMN_NUMBER_END", value) }
    properties.put("FILENAME", filename)
    properties.put("FULL_NAME", fullName)
    properties.put("IS_EXTERNAL", isExternal)
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    lineNumberEnd.map { value => properties.put("LINE_NUMBER_END", value) }
    properties.put("NAME", name)
    offset.map { value => properties.put("OFFSET", value) }
    offsetEnd.map { value => properties.put("OFFSET_END", value) }
    properties.put("ORDER", order)

    properties
  }

  /** faster than the default implementation */
  override def propertiesMapForStorage: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    if (!(("<empty>") == astParentFullName)) { properties.put("AST_PARENT_FULL_NAME", astParentFullName) }
    if (!(("<empty>") == astParentType)) { properties.put("AST_PARENT_TYPE", astParentType) }
    if (!(("<empty>") == code)) { properties.put("CODE", code) }
    columnNumber.map { value => properties.put("COLUMN_NUMBER", value) }
    columnNumberEnd.map { value => properties.put("COLUMN_NUMBER_END", value) }
    if (!(("<empty>") == filename)) { properties.put("FILENAME", filename) }
    if (!(("<empty>") == fullName)) { properties.put("FULL_NAME", fullName) }
    if (!((false) == isExternal)) { properties.put("IS_EXTERNAL", isExternal) }
    lineNumber.map { value => properties.put("LINE_NUMBER", value) }
    lineNumberEnd.map { value => properties.put("LINE_NUMBER_END", value) }
    if (!(("<empty>") == name)) { properties.put("NAME", name) }
    offset.map { value => properties.put("OFFSET", value) }
    offsetEnd.map { value => properties.put("OFFSET_END", value) }
    if (!((-1: Int) == order)) { properties.put("ORDER", order) }

    properties
  }

  import overflowdb.traversal._
  def astOut: Iterator[Block] = createAdjacentNodeScalaIteratorByOffSet[Block](0)
  override def _astOut        = createAdjacentNodeScalaIteratorByOffSet[StoredNode](0)
  def block: Block = try { astOut.collectAll[Block].next() }
  catch {
    case e: java.util.NoSuchElementException =>
      throw new overflowdb.SchemaViolationException(
        "OUT edge with label AST to an adjacent BLOCK is mandatory, but not defined for this MACRO_DECL node with id=" + id,
        e
      )
  }

  def containsOut: Iterator[Expression] = createAdjacentNodeScalaIteratorByOffSet[Expression](1)
  override def _containsOut             = createAdjacentNodeScalaIteratorByOffSet[StoredNode](1)
  def _blockViaContainsOut: overflowdb.traversal.Traversal[Block]           = containsOut.collectAll[Block]
  def _identifierViaContainsOut: overflowdb.traversal.Traversal[Identifier] = containsOut.collectAll[Identifier]
  def _methodRefViaContainsOut: overflowdb.traversal.Traversal[MethodRef]   = containsOut.collectAll[MethodRef]
  def _typeRefViaContainsOut: overflowdb.traversal.Traversal[TypeRef]       = containsOut.collectAll[TypeRef]
  def _unknownViaContainsOut: overflowdb.traversal.Traversal[Unknown]       = containsOut.collectAll[Unknown]

  def inMacroOut: Iterator[MacroDecl] = createAdjacentNodeScalaIteratorByOffSet[MacroDecl](2)
  override def _inMacroOut            = createAdjacentNodeScalaIteratorByOffSet[StoredNode](2)

  def sourceFileOut: Iterator[File] = createAdjacentNodeScalaIteratorByOffSet[File](3)
  override def _sourceFileOut       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](3)
  def _fileViaSourceFileOut: overflowdb.traversal.Traversal[File] = sourceFileOut.collectAll[File]

  def astIn: Iterator[AstNode]                              = createAdjacentNodeScalaIteratorByOffSet[AstNode](4)
  override def _astIn                                       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](4)
  def _blockViaAstIn: overflowdb.traversal.Traversal[Block] = astIn.collectAll[Block]
  def _namespaceBlockViaAstIn: Option[NamespaceBlock]       = astIn.collectAll[NamespaceBlock].nextOption()

  def containsIn: Iterator[File]                               = createAdjacentNodeScalaIteratorByOffSet[File](5)
  override def _containsIn                                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](5)
  def _fileViaContainsIn: overflowdb.traversal.Traversal[File] = containsIn.collectAll[File]

  def inMacroIn: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](6)
  override def _inMacroIn          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](6)
  def _astNodeViaInMacroIn: overflowdb.traversal.Traversal[AstNode] = inMacroIn.collectAll[AstNode]

  def lengthIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](7)
  override def _lengthIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](7)

  def lengthExpIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](8)
  override def _lengthExpIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](8)

  def refIn: Iterator[MacroRef] = createAdjacentNodeScalaIteratorByOffSet[MacroRef](9)
  override def _refIn           = createAdjacentNodeScalaIteratorByOffSet[StoredNode](9)
  def _macroRefViaRefIn: overflowdb.traversal.Traversal[MacroRef] = refIn.collectAll[MacroRef]

  override def label: String = {
    MacroDecl.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "id"
      case 1  => "astParentFullName"
      case 2  => "astParentType"
      case 3  => "code"
      case 4  => "columnNumber"
      case 5  => "columnNumberEnd"
      case 6  => "filename"
      case 7  => "fullName"
      case 8  => "isExternal"
      case 9  => "lineNumber"
      case 10 => "lineNumberEnd"
      case 11 => "name"
      case 12 => "offset"
      case 13 => "offsetEnd"
      case 14 => "order"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0  => id
      case 1  => astParentFullName
      case 2  => astParentType
      case 3  => code
      case 4  => columnNumber
      case 5  => columnNumberEnd
      case 6  => filename
      case 7  => fullName
      case 8  => isExternal
      case 9  => lineNumber
      case 10 => lineNumberEnd
      case 11 => name
      case 12 => offset
      case 13 => offsetEnd
      case 14 => order
    }

  override def productPrefix = "MacroDecl"
  override def productArity  = 15

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[MacroDeclDb]

  override def property(key: String): Any = {
    key match {
      case "AST_PARENT_FULL_NAME" => this._astParentFullName
      case "AST_PARENT_TYPE"      => this._astParentType
      case "CODE"                 => this._code
      case "COLUMN_NUMBER"        => this._columnNumber
      case "COLUMN_NUMBER_END"    => this._columnNumberEnd
      case "FILENAME"             => this._filename
      case "FULL_NAME"            => this._fullName
      case "IS_EXTERNAL"          => this._isExternal
      case "LINE_NUMBER"          => this._lineNumber
      case "LINE_NUMBER_END"      => this._lineNumberEnd
      case "NAME"                 => this._name
      case "OFFSET"               => this._offset
      case "OFFSET_END"           => this._offsetEnd
      case "ORDER"                => this._order

      case _ => null
    }
  }

  override protected def updateSpecificProperty(key: String, value: Object): Unit = {
    key match {
      case "AST_PARENT_FULL_NAME" => this._astParentFullName = value.asInstanceOf[String]
      case "AST_PARENT_TYPE"      => this._astParentType = value.asInstanceOf[String]
      case "CODE"                 => this._code = value.asInstanceOf[String]
      case "COLUMN_NUMBER"        => this._columnNumber = value.asInstanceOf[Integer]
      case "COLUMN_NUMBER_END"    => this._columnNumberEnd = value.asInstanceOf[Integer]
      case "FILENAME"             => this._filename = value.asInstanceOf[String]
      case "FULL_NAME"            => this._fullName = value.asInstanceOf[String]
      case "IS_EXTERNAL"          => this._isExternal = value.asInstanceOf[Boolean]
      case "LINE_NUMBER"          => this._lineNumber = value.asInstanceOf[Integer]
      case "LINE_NUMBER_END"      => this._lineNumberEnd = value.asInstanceOf[Integer]
      case "NAME"                 => this._name = value.asInstanceOf[String]
      case "OFFSET"               => this._offset = value.asInstanceOf[Integer]
      case "OFFSET_END"           => this._offsetEnd = value.asInstanceOf[Integer]
      case "ORDER"                => this._order = value.asInstanceOf[scala.Int]

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
    this._astParentFullName = newNode.asInstanceOf[NewMacroDecl].astParentFullName
    this._astParentType = newNode.asInstanceOf[NewMacroDecl].astParentType
    this._code = newNode.asInstanceOf[NewMacroDecl].code
    this._columnNumber = newNode.asInstanceOf[NewMacroDecl].columnNumber.orNull
    this._columnNumberEnd = newNode.asInstanceOf[NewMacroDecl].columnNumberEnd.orNull
    this._filename = newNode.asInstanceOf[NewMacroDecl].filename
    this._fullName = newNode.asInstanceOf[NewMacroDecl].fullName
    this._isExternal = newNode.asInstanceOf[NewMacroDecl].isExternal
    this._lineNumber = newNode.asInstanceOf[NewMacroDecl].lineNumber.orNull
    this._lineNumberEnd = newNode.asInstanceOf[NewMacroDecl].lineNumberEnd.orNull
    this._name = newNode.asInstanceOf[NewMacroDecl].name
    this._offset = newNode.asInstanceOf[NewMacroDecl].offset.orNull
    this._offsetEnd = newNode.asInstanceOf[NewMacroDecl].offsetEnd.orNull
    this._order = newNode.asInstanceOf[NewMacroDecl].order

    graph.indexManager.putIfIndexed("FULL_NAME", newNode.asInstanceOf[NewMacroDecl].fullName, this.ref)
  }

}
