fun main(args: Array<String>) {
    val s1 = readLine()!!
    val arr = s1.toList()
    var result: String = ""

    for (i in arr){
        result += if (i.isUpperCase()){
            i.toLowerCase()
        }else{
            i.toUpperCase()
        }
    }
    print(result)
}