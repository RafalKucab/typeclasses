
import JsonPersonInstance._
import JsonObject._
import JsonSyntax._

object JsonMain extends App {

  val person = Person("Jan Frodeno", 38)

  toJson(person)

  person.toJson
}
