

fun main(args : Array<String>){

    //String
    var name: String ="Ali"


    //constant
    val constant = 12

    //integer
    var num = 23

    //print
    println("Name "+name+num)

    // print max and min value
    println("Max value: "+Int.MAX_VALUE)
    println("Min value: "+ Int.MIN_VALUE)

    // ARRAY


    var myArray = arrayOf("Ali",1,3,4,53,23,33333,2222222222,33.00000000)

    // perticular type of array

    var intArray : Array<Int> = arrayOf(1,2,3,4,5,6)
    var stringArray : Array<String> = arrayOf("sdffds","dssdfsdf")

    for(x in myArray){
        println(x)
    }

}