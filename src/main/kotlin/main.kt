import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    val umumiyIshlar=Umumiy()
    while (true){
        println("<1>Talaba registratsiya, <2> Teacher registratsiya, <3>Baho qo'yish, <4>Baho ko'rish")
        when(scanner.nextInt()){
            1->{
                umumiyIshlar.studentRegistration()
            }
            2->{
                umumiyIshlar.teacherRegistration()

            }
            3->{
                umumiyIshlar.bahoQoyish()
            }
            4->{
                umumiyIshlar.bahoKorish()
            }

        }
    }
}