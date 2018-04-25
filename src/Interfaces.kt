interface AI{
// we can define a function inside interface but now we are not doing that
    fun add()

    fun show(){
        println("In Show of A")

    }

}
interface BI{

    fun subtract()

    fun show(){
        println("In Show of B")
    }
}

class CI:AI,BI{

    override fun add() {
        println("In Add ")

    }

    override fun subtract() {
        println("Subtract")
    }

    override fun show() {
        super<AI>.show()
        super<BI>.show()
    }


}

fun main(args: Array<String>){

    var c = CI()

    c.add()
    c.subtract()
    c.show()

}