/**
 * Created with IntelliJ IDEA.
 * User: Basu
 * Date: 3/3/12
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */

def add(x:Int)(y:Int) = x+y
val addByTwo = add(2)_
println("Currying example: " + addByTwo(3))

