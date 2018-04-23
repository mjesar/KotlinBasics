
    fun main(args: Array<String>){

        // range 12345
        var range =1..5


        for (x in range){

            println(x)
            print("\n")
        }

        // Assending Dissending
        var dessending =5 downTo 1

        for (x in dessending){
            println(x)
            print("\n")
        }

        // Skiping steps of numbers
        var steps = 1..10 step 2

        for (x in steps){

            print(x)
            print("\n")
        }

        // String functions
        var name: String ="MohammadAli"

        // lenght of string
        println("\nName Length ${name.length} \n")

        // print substring range of string
        println("SubString range: "+name.substring(0..7)+"\n")

        if (name.equals("mohammadali",true)){
            println("true")
        }else{
            println("false")
        }


        // String convert to int

        var sNum :String =("4")

        var num :Int =sNum.toInt()
        print("\n")

        println("Converted to int $num")



    }


