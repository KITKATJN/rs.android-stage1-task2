package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val inputStringA=a.toUpperCase()
        val inputStringB=b.toMutableList()
        val aListChar=inputStringA.toMutableList()
        val intersect=aListChar.intersect(inputStringB).toMutableList()
        return if(intersect==inputStringB){
            "YES"
        }else "NO"

       // var bInA:Int=0
      //  for(i in inputStringB.indices) {
       //     for (j in inputStringA.indices) {
       //         bInA++
       //         if(inputStringB[i]==inputStringA[j]){
                  //  bInA++
       //         }
//
     //       }

    //    }
    //    if (bInA<b.length)return "NO $bInA"
     //   else return "YES $bInA"
    }
}
