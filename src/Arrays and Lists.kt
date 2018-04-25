



        fun main(args: Array<String>){


            var name = arrayOf(1,2,3,4,4,5,3)
            for (i in name){
                print(i)

            }



            /* HIGHER ORDER FUNCTIONS */

            var rolls = intArrayOf(1,2,3,4,5,6,7)

            // get even  numbers from array
            var even= rolls.filter { it%2==0 }

            //twice multiply numbers of array
            var twice = rolls.map { it*2 }

            rolls.forEach { print(it) }

            println("\nEven Numbers")

            even.forEach { print(it) }

            println("\nTwice Numbers")

            twice.forEach { print(it) }



        }