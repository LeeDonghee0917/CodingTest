fun main(args: Array<String>) {
    //val (a, b) = readLine()!!.split(' ').map(String::toInt)
    //println(a + b)
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    if(a>= -100000 && b<= 100000){
        println("a = ${a}")
        println("b = ${b}")
    }
}