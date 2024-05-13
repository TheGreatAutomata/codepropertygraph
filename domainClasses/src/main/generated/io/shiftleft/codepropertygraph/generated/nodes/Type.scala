package io.shiftleft.codepropertygraph.generated.nodes

import overflowdb._
import scala.jdk.CollectionConverters._

object Type {
  def apply(graph: Graph, id: Long) = new Type(graph, id)

  val Label = "TYPE"

  object PropertyNames {
    val FullName                         = "FULL_NAME"
    val Name                             = "NAME"
    val TypeDeclFullName                 = "TYPE_DECL_FULL_NAME"
    val all: Set[String]                 = Set(FullName, Name, TypeDeclFullName)
    val allAsJava: java.util.Set[String] = all.asJava
  }

  object Properties {
    val FullName         = new overflowdb.PropertyKey[String]("FULL_NAME")
    val Name             = new overflowdb.PropertyKey[String]("NAME")
    val TypeDeclFullName = new overflowdb.PropertyKey[String]("TYPE_DECL_FULL_NAME")

  }

  object PropertyDefaults {
    val FullName         = "<empty>"
    val Name             = "<empty>"
    val TypeDeclFullName = "<empty>"
  }

  val layoutInformation = new NodeLayoutInformation(
    Label,
    PropertyNames.allAsJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.ArrayOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ast.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Length.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LengthExp.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LReferenceOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.PointerOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ref.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.RReferenceOf.layoutInformation
    ).asJava,
    List(
      io.shiftleft.codepropertygraph.generated.edges.AliasOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.ArrayOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.EvalType.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.InheritsFrom.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.LReferenceOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.PointerOf.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.Ref.layoutInformation,
      io.shiftleft.codepropertygraph.generated.edges.RReferenceOf.layoutInformation
    ).asJava
  )

  object Edges {
    val Out: Array[String] =
      Array("ARRAY_OF", "AST", "LENGTH", "LENGTH_EXP", "L_REFERENCE_OF", "POINTER_OF", "REF", "R_REFERENCE_OF")
    val In: Array[String] = Array(
      "ALIAS_OF",
      "ARRAY_OF",
      "EVAL_TYPE",
      "INHERITS_FROM",
      "L_REFERENCE_OF",
      "POINTER_OF",
      "REF",
      "R_REFERENCE_OF"
    )
  }

  val factory = new NodeFactory[TypeDb] {
    override val forLabel = Type.Label

    override def createNode(ref: NodeRef[TypeDb]) =
      new TypeDb(ref.asInstanceOf[NodeRef[NodeDb]])

    override def createNodeRef(graph: Graph, id: Long) = Type(graph, id)
  }
}

trait TypeBase extends AbstractNode {
  def asStored: StoredNode = this.asInstanceOf[StoredNode]

  def fullName: String
  def name: String
  def typeDeclFullName: String

}

class Type(graph_4762: Graph, id_4762: Long /*cf https://github.com/scala/bug/issues/4762 */ )
    extends NodeRef[TypeDb](graph_4762, id_4762)
    with TypeBase
    with StoredNode {
  override def fullName: String         = get().fullName
  override def name: String             = get().name
  override def typeDeclFullName: String = get().typeDeclFullName
  override def propertyDefaultValue(propertyKey: String) =
    propertyKey match {
      case "FULL_NAME"           => Type.PropertyDefaults.FullName
      case "NAME"                => Type.PropertyDefaults.Name
      case "TYPE_DECL_FULL_NAME" => Type.PropertyDefaults.TypeDeclFullName
      case _                     => super.propertyDefaultValue(propertyKey)
    }

  def arrayOfOut: Iterator[Type] = get().arrayOfOut
  override def _arrayOfOut       = get()._arrayOfOut

  /** Traverse to TYPE via ARRAY_OF OUT edge.
    */
  def _typeViaArrayOfOut: overflowdb.traversal.Traversal[Type] = get()._typeViaArrayOfOut

  def astOut: Iterator[TypeArgument] = get().astOut
  override def _astOut               = get()._astOut

  /** Traverse to TYPE_ARGUMENT via AST OUT edge.
    */
  def _typeArgumentViaAstOut: overflowdb.traversal.Traversal[TypeArgument] = get()._typeArgumentViaAstOut

  def lengthOut: Iterator[AstNode] = get().lengthOut
  override def _lengthOut          = get()._lengthOut

  /** Traverse to AST_NODE via LENGTH OUT edge.
    */
  def _astNodeViaLengthOut: overflowdb.traversal.Traversal[AstNode] = get()._astNodeViaLengthOut

  def lengthExpOut: Iterator[AstNode] = get().lengthExpOut
  override def _lengthExpOut          = get()._lengthExpOut

  /** Traverse to AST_NODE via LENGTH_EXP OUT edge.
    */
  def _astNodeViaLengthExpOut: overflowdb.traversal.Traversal[AstNode] = get()._astNodeViaLengthExpOut

  def lReferenceOfOut: Iterator[Type] = get().lReferenceOfOut
  override def _lReferenceOfOut       = get()._lReferenceOfOut

  /** Traverse to TYPE via L_REFERENCE_OF OUT edge.
    */
  def _typeViaLReferenceOfOut: overflowdb.traversal.Traversal[Type] = get()._typeViaLReferenceOfOut

  def pointerOfOut: Iterator[Type] = get().pointerOfOut
  override def _pointerOfOut       = get()._pointerOfOut

  /** Traverse to TYPE via POINTER_OF OUT edge.
    */
  def _typeViaPointerOfOut: overflowdb.traversal.Traversal[Type] = get()._typeViaPointerOfOut

  def refOut: Iterator[TypeDecl] = get().refOut
  override def _refOut           = get()._refOut

  /** Type declaration which is referenced by this type. Traverse to TYPE_DECL via REF OUT edge.
    */
  /** Type declaration which is referenced by this type. */
  @overflowdb.traversal.help.Doc(info = """Type declaration which is referenced by this type.""")
  def referencedTypeDecl: overflowdb.traversal.Traversal[TypeDecl] = get().referencedTypeDecl

  def rReferenceOfOut: Iterator[Type] = get().rReferenceOfOut
  override def _rReferenceOfOut       = get()._rReferenceOfOut

  /** Traverse to TYPE via R_REFERENCE_OF OUT edge.
    */
  def _typeViaRReferenceOfOut: overflowdb.traversal.Traversal[Type] = get()._typeViaRReferenceOfOut

  def aliasOfIn: Iterator[TypeDecl] = get().aliasOfIn
  override def _aliasOfIn           = get()._aliasOfIn

  /** Direct alias type declarations. Traverse to TYPE_DECL via ALIAS_OF IN edge.
    */
  /** Direct alias type declarations. */
  @overflowdb.traversal.help.Doc(info = """Direct alias type declarations.""")
  def aliasTypeDecl: overflowdb.traversal.Traversal[TypeDecl] = get().aliasTypeDecl

  def arrayOfIn: Iterator[Type] = get().arrayOfIn
  override def _arrayOfIn       = get()._arrayOfIn

  /** Traverse to TYPE via ARRAY_OF IN edge.
    */
  def _typeViaArrayOfIn: overflowdb.traversal.Traversal[Type] = get()._typeViaArrayOfIn

  def evalTypeIn: Iterator[AstNode] = get().evalTypeIn
  override def _evalTypeIn          = get()._evalTypeIn

  /** Traverse to ARRAY_INITIALIZER via EVAL_TYPE IN edge.
    */
  def _arrayInitializerViaEvalTypeIn: overflowdb.traversal.Traversal[ArrayInitializer] =
    get()._arrayInitializerViaEvalTypeIn

  /** Traverse to BLOCK via EVAL_TYPE IN edge.
    */
  def _blockViaEvalTypeIn: overflowdb.traversal.Traversal[Block] = get()._blockViaEvalTypeIn

  /** Traverse to CALL via EVAL_TYPE IN edge.
    */
  def _callViaEvalTypeIn: overflowdb.traversal.Traversal[Call] = get()._callViaEvalTypeIn

  /** Traverse to CONTROL_STRUCTURE via EVAL_TYPE IN edge.
    */
  def _controlStructureViaEvalTypeIn: overflowdb.traversal.Traversal[ControlStructure] =
    get()._controlStructureViaEvalTypeIn

  /** Traverse to IDENTIFIER via EVAL_TYPE IN edge.
    */
  def _identifierViaEvalTypeIn: overflowdb.traversal.Traversal[Identifier] = get()._identifierViaEvalTypeIn

  /** Traverse to LITERAL via EVAL_TYPE IN edge.
    */
  def _literalViaEvalTypeIn: overflowdb.traversal.Traversal[Literal] = get()._literalViaEvalTypeIn

  /** Traverse to LOCAL via EVAL_TYPE IN edge.
    */
  def _localViaEvalTypeIn: overflowdb.traversal.Traversal[Local] = get()._localViaEvalTypeIn

  /** Traverse to MEMBER via EVAL_TYPE IN edge.
    */
  def _memberViaEvalTypeIn: overflowdb.traversal.Traversal[Member] = get()._memberViaEvalTypeIn

  /** Traverse to METHOD_PARAMETER_IN via EVAL_TYPE IN edge.
    */
  def _methodParameterInViaEvalTypeIn: overflowdb.traversal.Traversal[MethodParameterIn] =
    get()._methodParameterInViaEvalTypeIn

  /** Traverse to METHOD_PARAMETER_OUT via EVAL_TYPE IN edge.
    */
  def _methodParameterOutViaEvalTypeIn: overflowdb.traversal.Traversal[MethodParameterOut] =
    get()._methodParameterOutViaEvalTypeIn

  /** Traverse to METHOD_REF via EVAL_TYPE IN edge.
    */
  def _methodRefViaEvalTypeIn: overflowdb.traversal.Traversal[MethodRef] = get()._methodRefViaEvalTypeIn

  /** Traverse to METHOD_RETURN via EVAL_TYPE IN edge.
    */
  def _methodReturnViaEvalTypeIn: overflowdb.traversal.Traversal[MethodReturn] = get()._methodReturnViaEvalTypeIn

  /** Traverse to TYPE_REF via EVAL_TYPE IN edge.
    */
  def _typeRefViaEvalTypeIn: overflowdb.traversal.Traversal[TypeRef] = get()._typeRefViaEvalTypeIn

  /** Traverse to UNKNOWN via EVAL_TYPE IN edge.
    */
  def _unknownViaEvalTypeIn: overflowdb.traversal.Traversal[Unknown] = get()._unknownViaEvalTypeIn

  def inheritsFromIn: Iterator[TypeDecl] = get().inheritsFromIn
  override def _inheritsFromIn           = get()._inheritsFromIn

  /** Traverse to TYPE_DECL via INHERITS_FROM IN edge.
    */
  def _typeDeclViaInheritsFromIn: overflowdb.traversal.Traversal[TypeDecl] = get()._typeDeclViaInheritsFromIn

  def lReferenceOfIn: Iterator[Type] = get().lReferenceOfIn
  override def _lReferenceOfIn       = get()._lReferenceOfIn

  /** Traverse to TYPE via L_REFERENCE_OF IN edge.
    */
  def _typeViaLReferenceOfIn: overflowdb.traversal.Traversal[Type] = get()._typeViaLReferenceOfIn

  def pointerOfIn: Iterator[Type] = get().pointerOfIn
  override def _pointerOfIn       = get()._pointerOfIn

  /** Traverse to TYPE via POINTER_OF IN edge.
    */
  def _typeViaPointerOfIn: overflowdb.traversal.Traversal[Type] = get()._typeViaPointerOfIn

  def refIn: Iterator[TypeArgument] = get().refIn
  override def _refIn               = get()._refIn

  /** Traverse to TYPE_ARGUMENT via REF IN edge.
    */
  def _typeArgumentViaRefIn: overflowdb.traversal.Traversal[TypeArgument] = get()._typeArgumentViaRefIn

  def rReferenceOfIn: Iterator[Type] = get().rReferenceOfIn
  override def _rReferenceOfIn       = get()._rReferenceOfIn

  /** Traverse to TYPE via R_REFERENCE_OF IN edge.
    */
  def _typeViaRReferenceOfIn: overflowdb.traversal.Traversal[Type] = get()._typeViaRReferenceOfIn

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
    Type.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "id"
      case 1 => "fullName"
      case 2 => "name"
      case 3 => "typeDeclFullName"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => id
      case 1 => fullName
      case 2 => name
      case 3 => typeDeclFullName
    }

  override def productPrefix = "Type"
  override def productArity  = 4
}

class TypeDb(ref: NodeRef[NodeDb]) extends NodeDb(ref) with StoredNode with TypeBase {

  override def layoutInformation: NodeLayoutInformation = Type.layoutInformation

  private var _fullName: String         = Type.PropertyDefaults.FullName
  def fullName: String                  = _fullName
  private var _name: String             = Type.PropertyDefaults.Name
  def name: String                      = _name
  private var _typeDeclFullName: String = Type.PropertyDefaults.TypeDeclFullName
  def typeDeclFullName: String          = _typeDeclFullName

  /** faster than the default implementation */
  override def propertiesMap: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    properties.put("FULL_NAME", fullName)
    properties.put("NAME", name)
    properties.put("TYPE_DECL_FULL_NAME", typeDeclFullName)

    properties
  }

  /** faster than the default implementation */
  override def propertiesMapForStorage: java.util.Map[String, Any] = {
    val properties = new java.util.HashMap[String, Any]
    if (!(("<empty>") == fullName)) { properties.put("FULL_NAME", fullName) }
    if (!(("<empty>") == name)) { properties.put("NAME", name) }
    if (!(("<empty>") == typeDeclFullName)) { properties.put("TYPE_DECL_FULL_NAME", typeDeclFullName) }

    properties
  }

  import overflowdb.traversal._
  def arrayOfOut: Iterator[Type]                               = createAdjacentNodeScalaIteratorByOffSet[Type](0)
  override def _arrayOfOut                                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](0)
  def _typeViaArrayOfOut: overflowdb.traversal.Traversal[Type] = arrayOfOut.collectAll[Type]

  def astOut: Iterator[TypeArgument] = createAdjacentNodeScalaIteratorByOffSet[TypeArgument](1)
  override def _astOut               = createAdjacentNodeScalaIteratorByOffSet[StoredNode](1)
  def _typeArgumentViaAstOut: overflowdb.traversal.Traversal[TypeArgument] = astOut.collectAll[TypeArgument]

  def lengthOut: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](2)
  override def _lengthOut          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](2)
  def _astNodeViaLengthOut: overflowdb.traversal.Traversal[AstNode] = lengthOut.collectAll[AstNode]

  def lengthExpOut: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](3)
  override def _lengthExpOut          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](3)
  def _astNodeViaLengthExpOut: overflowdb.traversal.Traversal[AstNode] = lengthExpOut.collectAll[AstNode]

  def lReferenceOfOut: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](4)
  override def _lReferenceOfOut       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](4)
  def _typeViaLReferenceOfOut: overflowdb.traversal.Traversal[Type] = lReferenceOfOut.collectAll[Type]

  def pointerOfOut: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](5)
  override def _pointerOfOut       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](5)
  def _typeViaPointerOfOut: overflowdb.traversal.Traversal[Type] = pointerOfOut.collectAll[Type]

  def refOut: Iterator[TypeDecl] = createAdjacentNodeScalaIteratorByOffSet[TypeDecl](6)
  override def _refOut           = createAdjacentNodeScalaIteratorByOffSet[StoredNode](6)
  def referencedTypeDecl: overflowdb.traversal.Traversal[TypeDecl] = refOut.collectAll[TypeDecl]

  def rReferenceOfOut: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](7)
  override def _rReferenceOfOut       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](7)
  def _typeViaRReferenceOfOut: overflowdb.traversal.Traversal[Type] = rReferenceOfOut.collectAll[Type]

  def aliasOfIn: Iterator[TypeDecl]                           = createAdjacentNodeScalaIteratorByOffSet[TypeDecl](8)
  override def _aliasOfIn                                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](8)
  def aliasTypeDecl: overflowdb.traversal.Traversal[TypeDecl] = aliasOfIn.collectAll[TypeDecl]

  def arrayOfIn: Iterator[Type]                               = createAdjacentNodeScalaIteratorByOffSet[Type](9)
  override def _arrayOfIn                                     = createAdjacentNodeScalaIteratorByOffSet[StoredNode](9)
  def _typeViaArrayOfIn: overflowdb.traversal.Traversal[Type] = arrayOfIn.collectAll[Type]

  def evalTypeIn: Iterator[AstNode] = createAdjacentNodeScalaIteratorByOffSet[AstNode](10)
  override def _evalTypeIn          = createAdjacentNodeScalaIteratorByOffSet[StoredNode](10)
  def _arrayInitializerViaEvalTypeIn: overflowdb.traversal.Traversal[ArrayInitializer] =
    evalTypeIn.collectAll[ArrayInitializer]
  def _blockViaEvalTypeIn: overflowdb.traversal.Traversal[Block] = evalTypeIn.collectAll[Block]
  def _callViaEvalTypeIn: overflowdb.traversal.Traversal[Call]   = evalTypeIn.collectAll[Call]
  def _controlStructureViaEvalTypeIn: overflowdb.traversal.Traversal[ControlStructure] =
    evalTypeIn.collectAll[ControlStructure]
  def _identifierViaEvalTypeIn: overflowdb.traversal.Traversal[Identifier] = evalTypeIn.collectAll[Identifier]
  def _literalViaEvalTypeIn: overflowdb.traversal.Traversal[Literal]       = evalTypeIn.collectAll[Literal]
  def _localViaEvalTypeIn: overflowdb.traversal.Traversal[Local]           = evalTypeIn.collectAll[Local]
  def _memberViaEvalTypeIn: overflowdb.traversal.Traversal[Member]         = evalTypeIn.collectAll[Member]
  def _methodParameterInViaEvalTypeIn: overflowdb.traversal.Traversal[MethodParameterIn] =
    evalTypeIn.collectAll[MethodParameterIn]
  def _methodParameterOutViaEvalTypeIn: overflowdb.traversal.Traversal[MethodParameterOut] =
    evalTypeIn.collectAll[MethodParameterOut]
  def _methodRefViaEvalTypeIn: overflowdb.traversal.Traversal[MethodRef]       = evalTypeIn.collectAll[MethodRef]
  def _methodReturnViaEvalTypeIn: overflowdb.traversal.Traversal[MethodReturn] = evalTypeIn.collectAll[MethodReturn]
  def _typeRefViaEvalTypeIn: overflowdb.traversal.Traversal[TypeRef]           = evalTypeIn.collectAll[TypeRef]
  def _unknownViaEvalTypeIn: overflowdb.traversal.Traversal[Unknown]           = evalTypeIn.collectAll[Unknown]

  def inheritsFromIn: Iterator[TypeDecl] = createAdjacentNodeScalaIteratorByOffSet[TypeDecl](11)
  override def _inheritsFromIn           = createAdjacentNodeScalaIteratorByOffSet[StoredNode](11)
  def _typeDeclViaInheritsFromIn: overflowdb.traversal.Traversal[TypeDecl] = inheritsFromIn.collectAll[TypeDecl]

  def lReferenceOfIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](12)
  override def _lReferenceOfIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](12)
  def _typeViaLReferenceOfIn: overflowdb.traversal.Traversal[Type] = lReferenceOfIn.collectAll[Type]

  def pointerOfIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](13)
  override def _pointerOfIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](13)
  def _typeViaPointerOfIn: overflowdb.traversal.Traversal[Type] = pointerOfIn.collectAll[Type]

  def refIn: Iterator[TypeArgument] = createAdjacentNodeScalaIteratorByOffSet[TypeArgument](14)
  override def _refIn               = createAdjacentNodeScalaIteratorByOffSet[StoredNode](14)
  def _typeArgumentViaRefIn: overflowdb.traversal.Traversal[TypeArgument] = refIn.collectAll[TypeArgument]

  def rReferenceOfIn: Iterator[Type] = createAdjacentNodeScalaIteratorByOffSet[Type](15)
  override def _rReferenceOfIn       = createAdjacentNodeScalaIteratorByOffSet[StoredNode](15)
  def _typeViaRReferenceOfIn: overflowdb.traversal.Traversal[Type] = rReferenceOfIn.collectAll[Type]

  override def label: String = {
    Type.Label
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "id"
      case 1 => "fullName"
      case 2 => "name"
      case 3 => "typeDeclFullName"
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => id
      case 1 => fullName
      case 2 => name
      case 3 => typeDeclFullName
    }

  override def productPrefix = "Type"
  override def productArity  = 4

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[TypeDb]

  override def property(key: String): Any = {
    key match {
      case "FULL_NAME"           => this._fullName
      case "NAME"                => this._name
      case "TYPE_DECL_FULL_NAME" => this._typeDeclFullName

      case _ => null
    }
  }

  override protected def updateSpecificProperty(key: String, value: Object): Unit = {
    key match {
      case "FULL_NAME"           => this._fullName = value.asInstanceOf[String]
      case "NAME"                => this._name = value.asInstanceOf[String]
      case "TYPE_DECL_FULL_NAME" => this._typeDeclFullName = value.asInstanceOf[String]

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
    this._fullName = newNode.asInstanceOf[NewType].fullName
    this._name = newNode.asInstanceOf[NewType].name
    this._typeDeclFullName = newNode.asInstanceOf[NewType].typeDeclFullName

    graph.indexManager.putIfIndexed("FULL_NAME", newNode.asInstanceOf[NewType].fullName, this.ref)
  }

}
