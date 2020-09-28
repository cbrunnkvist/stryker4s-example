package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    println("HELLOSPEC STARTED")
    Hello.greeting shouldEqual "hello"
    println("HELLOSPEC FINISHED")
  }
}
