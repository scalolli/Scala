/**
 * Created with IntelliJ IDEA.
 * User: Kalloli
 * Date: 3/4/12
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */


class Cat {
  val dangerous = false
}

class Tiger(override val dangerous: Boolean) extends Cat {

}

class SimpleBean(var propertyOne : Int,  val propertyTwo: Int)

object Runner {
  def main(args: Array[String]) {
    val tiger = new Tiger(true)
    val simpleBean = new SimpleBean(12, 12)
    println("Properties of simple bean are propertyOne: " + simpleBean.propertyOne + " propertyTwo: " + simpleBean.propertyTwo)

    val triangle = new Triangle(new Point(1,2), new Point(2,3), new Point(3,4))
    println("Created a triangle")

    val triangle2 = new Triangle(new Point(2,3))
  }
}

abstract class Shape(val numberOfVertices: Int,  val name: String)

class Point(val x : Int, val y: Int)

class Triangle(points : Point*) extends Shape(3, "Triangle") {
  assert (points.size == 3)
}



