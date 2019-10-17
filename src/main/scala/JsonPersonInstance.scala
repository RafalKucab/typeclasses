
import JsonBaseInstances._

object JsonPersonInstance {

  implicit val personJsonWriter = new JsonWriter[Person] {
    override def write(person: Person): Json = JsObject(Map(
      "name" -> stringJsonWriter.write(person.name),
      "age" -> numberJsonWriter.write(person.age)
    ))
  }
}
