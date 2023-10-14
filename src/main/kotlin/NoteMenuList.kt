import java.util.*

class NoteMenuList {
    fun startMenu(){
        val noteList = mutableListOf<Note>()
        val scanner = Scanner(System.`in`)

        while (true){
            MainMenu().renderMenuNote(noteList)
            val num = scanner.nextLine()
            if (num.toIntOrNull() == null) {
                println("Вы ввели некорректный символ. Введите число для входа в соответствующее меню.\n")
                continue
            }
            else {
                when(num.toInt()){
                    0 -> {
                        while (true) {
                            println("Напишите название заметки")
                            val scannerTitle = Scanner(System.`in`).nextLine()
                            if (scannerTitle.isEmpty()) {
                                println("Заметка должна иметь название. Напишите название заметки.\n")
                                continue
                            }
                            while (true) {
                                println("Введите текст заметки")
                                val scannerContent = Scanner(System.`in`).nextLine()
                                if (scannerContent.isEmpty()) {
                                    println("Заметка не должна быть пустой. Заполните текст заметки.\n")
                                    continue
                                }
                                else {
                                    noteList.add(Note(scannerTitle, scannerContent))
                                    break
                                }
                            }
                            break
                        }
                    }
                    in 1..noteList.size -> println("${noteList.get(num.toInt() - 1)}")
                    noteList.size + 1 -> break
                }
            }
        }
    }
}