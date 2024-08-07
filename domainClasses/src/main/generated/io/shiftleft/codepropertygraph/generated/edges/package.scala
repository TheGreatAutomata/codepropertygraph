package io.shiftleft.codepropertygraph.generated.edges

import overflowdb._
import scala.jdk.CollectionConverters._

object PropertyErrorRegister {
  private var errorMap = Set[(Class[?], String)]()
  private val logger   = org.slf4j.LoggerFactory.getLogger(getClass)

  def logPropertyErrorIfFirst(clazz: Class[?], propertyName: String): Unit = {
    if (!errorMap.contains((clazz, propertyName))) {
      logger.warn("Property " + propertyName + " is deprecated for " + clazz.getName + ".")
      errorMap += ((clazz, propertyName))
    }
  }
}

object Factories {
  lazy val all: Seq[EdgeFactory[?]] = Seq(
    AliasOf.factory,
    Argument.factory,
    ArrayOf.factory,
    Ast.factory,
    Binds.factory,
    BindsTo.factory,
    Call.factory,
    Capture.factory,
    CapturedBy.factory,
    Cdg.factory,
    Cfg.factory,
    Condition.factory,
    Contains.factory,
    Dominate.factory,
    EvalType.factory,
    Imports.factory,
    InMacro.factory,
    InheritsFrom.factory,
    IsCallForImport.factory,
    LReferenceOf.factory,
    Length.factory,
    LengthExp.factory,
    ParameterLink.factory,
    PointerOf.factory,
    PostDominate.factory,
    RReferenceOf.factory,
    ReachingDef.factory,
    Receiver.factory,
    Ref.factory,
    SourceFile.factory,
    SpecializeOf.factory,
    SpecializePara.factory,
    TaggedBy.factory,
    TemplatePara.factory
  )
  lazy val allAsJava: java.util.List[EdgeFactory[?]] = all.asJava
}
