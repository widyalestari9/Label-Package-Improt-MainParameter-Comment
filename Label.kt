fun LabelBreak(){
    loopI@ for(i in 1..10){
        loopI@ for (j in 1..10){
            if(i > 5){
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun main(){

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Widya") test@{
        if (it == ""){
            return@test
        } else {
            println("Widya")
        }
    }
}
//fun main(){
//    loopI@ for (i in 1..10){
//        loopJ@ for (j in 1..10){
//            println("$i * $j = ${i * j}")
//            if(j == 5){
//                continue@loopI
//            }
//        }
//    }
//
//}