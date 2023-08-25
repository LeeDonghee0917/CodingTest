fun main(args: Array<String>) {
    var (a, b) = readLine()!!.split(' ').map(String::toInt)
    if(a in 1 .. 100){
        if(b in 1 .. 100){
            var result = a + b
            println("$a + $b = $result")
        }
        
    }
    
}