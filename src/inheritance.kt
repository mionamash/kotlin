open class parent{

    val dad="He likes to swim"
    val mom="She loves cooking"
}
class girl:parent(){
    fun cooking(){
        println(mom)
    }

}
class boy:parent(){
    fun swim(){
        println(dad)
    }

}

fun main(args: Array<String>) {
    val obj1=girl()
    obj1.cooking()
}