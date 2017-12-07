import scala.scalajs.js
import js._
// bring lift into scope, doesn't matter which one
import io.monadless.stdlib.MonadlessOption._

class TestJS (
  val name: js.UndefOr[String] = js.undefined
) extends js.Object

object test {
  val x = lift {
    new TestJS(name="blah")
  }
}
