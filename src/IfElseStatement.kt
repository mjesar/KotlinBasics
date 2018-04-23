import javafx.beans.binding.When


fun main(args: Array<String>){

    var a = 2
    var b = 4

    println("If Else Statements \n")
    if (a==b){
        println("A is equal to B\n")
    }else{
        println("A is not equal to B\n")
    }

    println("Switch/When statements"+"\n")

    // IF ELSE AS EXPRESSION

    var result :Int= 0

    result= if(a>b){
        a
    }else{
        b
    }
    println(result)

    // SWITCH CASE WHEN

    var res :String = ""

    res= when (a){

       1 -> "A==1"
       2 -> "A==2"
       else -> "Not a single match"

//        1 -> println("A==1")
//        2 -> println("A==2\n")
//        else -> println("Not a single match")
    }

    println(res)




}
