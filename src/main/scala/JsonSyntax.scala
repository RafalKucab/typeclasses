
object JsonSyntax {

  implicit class JsonSyntaxOps[A](value: A) {
    def toJson(implicit writer: JsonWriter[A]): Json =
      writer.write(value)
  }

}
