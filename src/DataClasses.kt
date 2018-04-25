data class Student2(var n:String,var r:Int){

    var name: String=n
    var rollNo :Int=r

}

interface classroom{

    fun show()
}
fun main(args: Array<String>){

   var s1 = Student2("Ali",99)
    var s2 = Student2("Ali",99)

    var s3= s1.copy()
    println(s1==s2)

    println(s3)

var croom=object : classroom {
        override fun show() {
            println("In Show")
        }
    }

    croom.show()

}