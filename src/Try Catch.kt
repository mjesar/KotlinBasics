



            fun main(args: Array<String>){




                

                //TRY AND CATCH AS EXPRESSION
            var a = "21"
                var b :Int =  try {
                    a.toInt()
                }catch (e : NumberFormatException ){
                    0
                }
                println(b)
            }