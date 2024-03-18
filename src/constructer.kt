class safaristudents(val jina:String,val miaka:Int,val jinsia:String){

}

fun main(args: Array<String>) {
    val myobj=safaristudents("naomi",26,"female")
    println("My name is ${myobj.jina}")
    println("Am ${myobj.miaka} years old")
    println("I am a  ${myobj.jinsia}")


    val myobj2=safaristudents("John",16,"male")
    println("My name is ${myobj2.jina}")
    println("Am ${myobj2.miaka} years old")
    println("I am a  ${myobj2.jinsia}")

}

