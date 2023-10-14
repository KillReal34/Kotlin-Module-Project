import java.util.*

class ArchiveMenuList {

    fun startMenu() {
        val archiveList = mutableListOf<Archive>()
        val scanner = Scanner(System.`in`)

        while (true) {
            MainMenu().renderMenuArchive(archiveList)
            val num = scanner.nextLine()
            if (num.toIntOrNull() == null) {
                println("Вы ввели некорректный символ. Введите число для входа в соответствующее меню.\n")
                continue
            }
            else {
                when (num.toInt()) {
                    0 -> {
                        while (true) {
                            println("Напишите название архива: ")
                            val name = Scanner(System.`in`).nextLine()
                            if (name.isEmpty()) {
                                println("Архив должен иметь название. Напишите название архива.\n")
                                continue
                            }
                            else {
                                archiveList.add(Archive(name, mutableListOf()))
                                break
                            }
                        }
                    }
                    in 1..archiveList.size -> NoteMenuList().startMenu()
                    archiveList.size + 1 -> break
                }
            }
        }
    }
}