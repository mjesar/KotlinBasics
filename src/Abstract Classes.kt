open abstract class A{

   abstract fun add()
}
 class B : A(){

    override fun add() {

        println("In B class")

    }

}
class C : A(){

    override fun add() {
        println("In C Class")
    }

}



fun main(args: Array<String>){

    var b = B()
    var c =C()

    b.add()
    c.add()

}