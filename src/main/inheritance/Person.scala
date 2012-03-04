package main.inheritance

/**
 * Created with IntelliJ IDEA.
 * User: Kalloli
 * Date: 3/3/12
 * Time: 7:41 PM
 * To change this template use File | Settings | File Templates.
 */

abstract class Person(firstName: String,  lastName: String) {
  def fullName = firstName + " " + lastName
  val checkIfOveridden = "lol"
}

class Male(firstName: String,  lastName : String) extends Person(firstName, lastName) {
  override val fullName = "Haha overriden";
  override val checkIfOveridden = "babsba";
}

object Runner {
  def main(args: Array[String]) {
    val basu = new Male("Basavaraj", "Kalloli");
    println(basu.fullName)
    println(basu.checkIfOveridden)
  }
}


