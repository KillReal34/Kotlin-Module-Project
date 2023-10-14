
class Note(val title: String, val content: String) {
    override fun toString(): String {
        return "\n$FORMAT \nНазвание заметки: $title \nСодержание: \n$content \n$FORMAT\n"
    }

    companion object{
        const val FORMAT = "*****************"
    }
}