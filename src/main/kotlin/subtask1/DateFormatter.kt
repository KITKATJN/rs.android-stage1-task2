package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val inputYear=year.toInt()
        val inputMonth=month.toInt()
        val inputDay=day.toInt()
val leapYear=inputYear%4!=0&&(if(inputMonth==2) {
    inputDay>28
}else{
    false
})
        if(leapYear || inputMonth>12 ) return "Такого дня не существует"
        else {
         var codeOfMonth:Int=0
            when(inputMonth){
                1,10->codeOfMonth=1
                2,3,11->codeOfMonth=4
                4,7->codeOfMonth=0
                5->codeOfMonth=2
                6->codeOfMonth=5
                8->codeOfMonth=3
                9,12->codeOfMonth=6
            }

            val codeOfYear:Int = if(inputYear>=2000) {
                (6 + (inputYear - 2000) + (inputYear - 2000) / 4) % 7
            } else {
                ( (inputYear - 1900) + (inputYear - 1900) / 4) % 7
            }

            val dayOfWeek:Int=if(inputYear%4==0) {
                (inputDay+codeOfMonth+codeOfYear)%7+1
            } else {
                (inputDay+codeOfMonth+codeOfYear)%7+1
            }

            val textMonth=when(inputMonth){
                1->"января"
                2->"февраля"
                3->"марта"
                4->"апреля"
                5->"мая"
                6->"июня"
                7->"июля"
                8->"августа"
                9->"сентября"
                10->"октября"
                11->"ноября"
                12->"декабря"
                else -> ""
            }

            val textDayOfWeek=when(dayOfWeek){
                3->"понедельник"
                4->"вторник"
                5->"среда"
                6->"четверг"
                7->"пятница"
                1->"суббота"
                2->"воскресенье"
                else -> "$dayOfWeek/$codeOfMonth/$codeOfYear"
            }
            return "$inputDay $textMonth, $textDayOfWeek"
        }
          }

    }

