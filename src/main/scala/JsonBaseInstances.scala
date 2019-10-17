
object JsonBaseInstances {

  implicit val stringJsonWriter = new JsonWriter[String] {
    override def write(value: String): Json = JsString(value)
  }

  implicit val numberJsonWriter = new JsonWriter[Int] {
    override def write(value: Int): Json = JsNumber(value)
  }
}
