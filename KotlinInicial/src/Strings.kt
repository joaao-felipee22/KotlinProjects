fun main() {
    val str = "Que a forca \n esteja com voce"
   // println(str)

    val str1 = "Que a forca \b esteja com voce"

   // println(str1)

    val doidera = """Em uma galaxia
        |muito distante
        |ouve um garoto
    """.trimMargin()

    //println(doidera)

//    for (char in str){
//        println(char)
//    }


    val contentEquals = str.contentEquals("Que a forca esteja com voce") //compara a string com valor
    println(contentEquals)

    val contains = str.contains("forca")// Checa a String se existe esse valor nela
    println(contains)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

}