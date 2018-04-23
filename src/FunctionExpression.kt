


fun main (args: Array<String>){

        var a: Int = 12
        var b: Int = 76

        println("Function Declaration: "+add(a,b))
        println("Function Expression:  "+addExpression(a,b))

}



        // Function Declaration
            fun add(a:Int,b:Int):Int{
            return a+b
        }

        // Function Expression
            fun addExpression(a:Int,b:Int):Int=a+b