
object JsonObject {

  def toJson[A](value: A)(implicit writer: JsonWriter[A]): Json =
    writer.write(value)

}
