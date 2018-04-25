 open class Student1(b:String){

     var type :String=""
     init {

         type=b

     }
      fun show1(){

        println("In Type : $type")

    }

}
class myClass2(a:String,c:String): Student1(c) {
  var name :String =""

    init {
        name=a
    }

     fun show() {
        println("In Engineer: Name "+name)

    }


}
 fun main(args: Array<String>){

    var class2= myClass2("Ali","Engineer")
    class2.show()
     class2.show1()
 }




