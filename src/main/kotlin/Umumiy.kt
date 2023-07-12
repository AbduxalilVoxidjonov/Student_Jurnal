import java.util.Scanner

class Umumiy:Baholash {
    val scanner=Scanner(System.`in`)
    val arrayStudent= arrayListOf<Oquvchilar>()
    val arrayTeacher= arrayListOf<Oqituvchilar>()
    val arrayFanlar= arrayListOf<Fanlar>()
    val arrayBahoStudent= arrayListOf<BahoStudent>()



    override fun studentRegistration() {
        print("Talaba id: ")
        val id=scanner.nextInt()

        for (i in arrayStudent.indices){
            if (id==arrayStudent[i].id){
                println("Bunday Id mavjud: ")
                studentRegistration()
            }
        }
        for (i in arrayTeacher.indices){
            if (id==arrayTeacher[i].id){
                println("Bunday Id mavjud: ")
                studentRegistration()
            }
        }

        print("Talaba ismi: ")
        val name=scanner.next()

        arrayStudent.add(Oquvchilar(name,id))
        println("Ro'yxatdan o'tdingiz")
    }

    override fun teacherRegistration() {
        print("Teacher ismi: ")
        val name=scanner.next()
        print("Sizning o'tadigan faningiz: ")
        val fan =scanner.next()

        print("Teacher id: ")
        val id=scanner.nextInt()
        for (i in arrayStudent.indices){
            if (id==arrayStudent[i].id){
                println("Bunday Id mavjud: ")
                teacherRegistration()
            }
        }
        for (i in arrayTeacher.indices){
            if (id==arrayTeacher[i].id){
                println("Bunday Id mavjud: ")
                teacherRegistration()
            }
        }
        println("Ro'yxatdan o'tdingiz")
        arrayTeacher.add(Oqituvchilar(name,fan,id))
    }


    override fun bahoQoyish() {
        var bool=false
        var bool2=false
        var count=0
        print("Teacher id: ")
        val id=scanner.nextInt()

        print("Talaba id: ")
        val tid=scanner.nextInt()

        print("Bahoyingiz: ")
        val baho =scanner.nextInt()

        for (i in arrayTeacher.indices){
            if (id==arrayTeacher[i].id){
                count=i
                bool=true
                break
            }
        }
        for (i in arrayStudent.indices){
            if (tid==arrayStudent[i].id){
                arrayFanlar.add(Fanlar(arrayTeacher[count].fan,baho))
                arrayBahoStudent.add(BahoStudent(arrayFanlar[i],arrayStudent[i]))
                println("Baho qo'yildi")
                bool2=true
                break
            }
        }
        if (!bool && !bool2){
            println("Bunday Id mavjud emas: ")
            bahoQoyish()
        }
    }

    override fun bahoKorish() {
        var bool=false
        print("Id ni kiriting: ")
        val id=scanner.nextInt()

        for (i in arrayBahoStudent.indices){
            if (id==arrayBahoStudent[i].oquvchi.id){
                println(arrayBahoStudent[i])
                bool=true
                break
            }
        }
        if (!bool) {
            println("Bunday id mavjud emas")
            bahoKorish()
        }
    }
}