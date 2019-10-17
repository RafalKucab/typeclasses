package sort

object CustomerSortOps {

  implicit val customerSortByAge = new Ordering[Customer] {
    override def compare(x: Customer, y: Customer): Int = {
      if (x.age < y.age) -1 else 1
    }
  }

  implicit val customerSortByFirstName = new Ordering[Customer] {
    override def compare(x: Customer, y: Customer): Int = {
      if (x.firstName == y.firstName)
        0
      else if (x.firstName > y.firstName)
        1
      else
       -1
    }
  }

}
