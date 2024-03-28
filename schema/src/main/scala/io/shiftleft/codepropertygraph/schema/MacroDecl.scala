package io.shiftleft.codepropertygraph.schema

import io.shiftleft.codepropertygraph.schema.Method.Schema
import overflowdb.schema.Property.ValueType
import overflowdb.schema.EdgeType.Cardinality
import overflowdb.schema.{NodeType, SchemaBuilder, SchemaInfo}
import io.shiftleft.codepropertygraph.schema.CpgSchema.PropertyDefaults

object MacroDecl extends SchemaBase {
  def apply(builder: SchemaBuilder, base: Base.Schema, typeSchema: Type.Schema, fs: FileSystem.Schema, ast: Ast.Schema, sc: Shortcuts.Schema, ns: Namespace.Schema) =
    new Schema(builder, base, typeSchema, fs, ast, sc, ns)

  def docIndex: Int                        = 50020
  override def providedByFrontend: Boolean = true

  override def description: String =
    """
      |The Macro Layer
      |""".stripMargin

  class Schema(builder: SchemaBuilder, base: Base.Schema, typeDeclSchema: Type.Schema, fs: FileSystem.Schema, ast: Ast.Schema, sc: Shortcuts.Schema, ns: Namespace.Schema) {

    import base._
    import typeDeclSchema._
    import fs._
    import ast._
    import sc._
    import ns._

    implicit private val schemaInfo: SchemaInfo = SchemaInfo.forClass(getClass)

    val macroDecl: NodeType = builder
      .addNodeType(
        name = "MACRO_DECL",
        comment =
          """MACRO_DECL
            |""".stripMargin
      )
      .protoId(50021)
      .addProperties(isExternal, fullName, lineNumberEnd, columnNumberEnd, filename)
      .addProperties(astParentType, astParentFullName)
      .addProperties(offset, offsetEnd)
      .extendz(astNode)
      .extendz(declaration)

    val macroFullName = builder
      .addProperty(
        name = "MACRO_FULL_NAME",
        valueType = ValueType.String,
        comment =
          """MACRO_FULL_NAME
            |""".stripMargin
      )
      .mandatory(PropertyDefaults.String)
      .protoId(50022)

    val macroRef: NodeType = builder
      .addNodeType(
        name = "MACRO_REF",
        comment =
          """MACRO_REF
            |""".stripMargin
      )
      .protoId(50023)
      .addProperties(macroFullName)
      .extendz(expression)

    val inMacro = builder
      .addEdgeType(name = "IN_MACRO", comment = "IN_MACRO")
      .protoId(50024)

    macroDecl
      .addOutEdge(
        edge = ast.ast,
        inNode = block,
        cardinalityOut = Cardinality.One,
        cardinalityIn = Cardinality.One,
        stepNameOut = "block",
        stepNameOutDoc = "Root of the macro body"
      )
      .addOutEdge(
        edge = sourceFile,
        inNode = file,
        stepNameIn = "macroDecl"
      )

    astNode
      .addOutEdge(edge = inMacro, inNode = macroDecl);

    file
      .addOutEdge(edge = contains, inNode = macroDecl)

    block
      .addOutEdge(edge = ast.ast, inNode = macroDecl)

    namespaceBlock
      .addOutEdge(edge = ast.ast, inNode = macroDecl, cardinalityIn = Cardinality.ZeroOrOne)

    macroDecl
      .addOutEdge(edge = contains, inNode = identifier)
      .addOutEdge(edge = contains, inNode = methodRef)
      .addOutEdge(edge = contains, inNode = unknown)
      .addOutEdge(edge = contains, inNode = block)
      .addOutEdge(edge = contains, inNode = typeRef)

    macroRef
      .addOutEdge(edge = ref, inNode = macroDecl);
  }
}
