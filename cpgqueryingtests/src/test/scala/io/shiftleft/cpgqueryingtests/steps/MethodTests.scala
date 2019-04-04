package io.shiftleft.cpgqueryingtests.steps

import io.shiftleft.cpgqueryingtests.codepropertygraph.CpgTestFixture
import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.{Languages, NodeKeys, NodeTypes}
import io.shiftleft.queryprimitives.steps.Implicits._
import org.scalatest.{Matchers, WordSpec}
import java.io._
import org.json4s._
import org.json4s.native.JsonMethods._

class MethodTests extends WordSpec with Matchers {
  val fixture = CpgTestFixture("method")

  "Method traversals" should {
    "expand to type declaration" in {
      val queryResult: List[nodes.TypeDecl] =
        fixture.cpg.method.name("methodWithLiteral").definingTypeDecl.toList

      queryResult.size shouldBe 1
      queryResult.head.name shouldBe "TestGraph"
    }

    "expand to literal" in {
      val queryResult: List[nodes.Literal] =
        fixture.cpg.method.name("methodWithLiteral").literal.toList

      queryResult.size shouldBe 1
      queryResult.head.code shouldBe "\"myLiteral\""
    }

    "expand to namespace" in {
      val queryResult: Set[String] = fixture.cpg.method.namespace.name.l.distinct.toSet
      queryResult shouldBe Set("io.shiftleft.testcode.method", "java.lang")
    }

    "filter by name" in {
      val methods: List[nodes.Method] =
        fixture.cpg.method.name("methodWithLiteral").toList
      methods.size shouldBe 1
      verifyMainMethod(methods.head)
    }

    "filter by name with regex" in {
      val methods: List[nodes.Method] =
        fixture.cpg.method.name(".*methodWithLiteral.*").toList
      methods.size shouldBe 1
      verifyMainMethod(methods.head)
    }

    def verifyMainMethod(main: nodes.Method) = {
      main.name shouldBe "methodWithLiteral"
      main.fullName shouldBe
        "io.shiftleft.testcode.method.TestGraph.methodWithLiteral:java.lang.String()"
    }

    "expand to top level expressions" in {
      val expressions: List[nodes.Expression] =
        fixture.cpg.method.name("multipleTopLevelExpressionMethod").topLevelExpressions.toList

      expressions.size shouldBe 3
      expressions.map(_.code).toSet shouldBe
        Set("this.someFunction(\"FOO\")", "this.someFunction(\"BAR\")", "return")
    }

    "expand to first expression" in {
      val expressions: List[nodes.Expression] =
        fixture.cpg.method.name("methodForCfgTest").cfgFirst.toList

      expressions.size shouldBe 1
      expressions.head.code shouldBe "temp"
    }

    "expand to last expression" in {
      val expressions: List[nodes.Expression] =
        fixture.cpg.method.name("methodForCfgTest").cfgLast.toList

      expressions.size shouldBe 1
      expressions.head.code shouldBe "return"
    }

    "filter for external/internal methods" in {
      val externals = fixture.cpg.method.external.fullName.l
      externals.size shouldBe 1
      externals.head shouldBe "java.lang.Object.<init>:void()"

      val internals = fixture.cpg.method.internal.fullName.l
      internals.size should be > 0
      internals should not contain "java.lang.Object.<init>:void()"

      val allMethods = fixture.cpg.method
        .fullNameNot("<operator>.*")
        .fullName
        .l

      (internals ++ externals).toSet shouldBe allMethods.toSet
    }
  }

}