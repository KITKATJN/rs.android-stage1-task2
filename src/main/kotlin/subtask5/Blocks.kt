package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
       return when(blockB){
           Int::class->blockA.filterIsInstance<Int>().sum()
           String::class->blockA.filterIsInstance<String>().joinToString("")
           LocalDate::class->{
               val nearDate: LocalDate = blockA.filterIsInstance<LocalDate>().max() as LocalDate
               nearDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
           }
           else->"Hello kotlin"
       }
    }
}
