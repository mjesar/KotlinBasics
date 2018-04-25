data class Student3(var s: String,var r :Int){

    var name=s
    var rollNo=r

}

object classroom1{

    var student= arrayListOf<Student3>()

   fun showAll(){
       for (i in student){
           println(i)
       }

   }
}


fun main (args:Array<String>){

    classroom1.student.add(Student3("Ali",99));
    classroom1.student.add(Student3("Sunny",211));

    classroom1.showAll()
}