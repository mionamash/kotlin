fun main(args: Array<String>) {
//  mutable variables/changable

    var myname="Naomi"
    myname="Alex"
    println("my name is" +myname)
    println("my name is $myname")

    // immutable variable
    val school="hezta"
    println("i study at $school")

    var num1=27
    var num2=56
    println("the sum of $num2 and $num1 is ${num2 + num1}")
    println("the difference of $num2 and $num1 is ${num2 - num1}")
    println("the multiple of $num2 and $num1 is ${num2 * num1}")
    println("the quotient of $num2 and $num1 is ${num2 / num1}")

}