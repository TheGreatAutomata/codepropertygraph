package io.shiftleft.codepropertygraph.generated.edges

import overflowdb._
import scala.jdk.CollectionConverters._

object InMacro {
  val Label = "IN_MACRO"

  object PropertyNames {

    val all: Set[String]                 = Set()
    val allAsJava: java.util.Set[String] = all.asJava
  }

  object Properties {}

  object PropertyDefaults {}

  val layoutInformation = new EdgeLayoutInformation(Label, PropertyNames.allAsJava)

  val factory = new EdgeFactory[InMacro] {
    override val forLabel = InMacro.Label

    override def createEdge(graph: Graph, outNode: NodeRef[NodeDb], inNode: NodeRef[NodeDb]) =
      new InMacro(graph, outNode, inNode)
  }
}

class InMacro(_graph: Graph, _outNode: NodeRef[NodeDb], _inNode: NodeRef[NodeDb])
    extends Edge(_graph, InMacro.Label, _outNode, _inNode, InMacro.PropertyNames.allAsJava) {

  override def propertyDefaultValue(propertyKey: String) =
    propertyKey match {

      case _ => super.propertyDefaultValue(propertyKey)
    }

}
