class safari{


    //  data member
    var nambari:Int=9

    // member function
    fun square():Int{
        return nambari*nambari
    }

}
class morn{
    // data object
    var number:Int=3
    var number1:Int=4
    // member function

    fun addition():Int{
        return number+number1
    }

}

fun main(args: Array<String>) {
    // instance of my object
    val myobj=safari()
    println(myobj.square())
}