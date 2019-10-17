package sort

import CustomerSortOps.customerSortByFirstName

object SortMain extends App {

  val customers = List(
    Customer("Jan", "Frodeno", 38),
    Customer("Lionel", "Sanders", 31),
    Customer("Daniela", "Ryf", 32)
  )

  val sortedCustomers = customers.sorted

  println(sortedCustomers.mkString("\n"))
}
