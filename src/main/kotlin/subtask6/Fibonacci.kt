package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var fibonacci= arrayListOf(0,1)
        while (fibonacci[0]*fibonacci[1]<n){
            fibonacci[1]=(fibonacci[1]+fibonacci[0]).also { fibonacci[0]=fibonacci[1] }
        }

      if (fibonacci[0]*fibonacci[1]==n) {
            fibonacci.add(1)
            return fibonacci.toIntArray()
        }else {
          fibonacci.add(0)
          return fibonacci.toIntArray()
      }
    }
}

