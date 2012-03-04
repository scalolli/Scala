package main.inheritance.equality

/**
 * Created with IntelliJ IDEA.
 * User: Basu
 * Date: 3/4/12
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */

class Person(val name: String, val age: Int) {
  override def equals(that: Any): Boolean = that match {
    case person: Person => this.name == person.name && this.age == person.age
    case _ => false
  }
}

object Person {
  def main(args: Array[String]) {
    val personOne = new Person("Basu", 25)
    val personTwo = new Person("Basu", 25)
    println("PersonOne equals PersonTwo is " + (personOne == personTwo))
  }
}
