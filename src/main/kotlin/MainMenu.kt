
class MainMenu {
    private val menuFormatter = "%d. %s"
    fun renderMenuArchive(list: List<Archive>){
        val menuItems = mutableListOf<MenuItem>()
        menuItems.add(MenuItem("Создать архив"))
        menuItems.addAll(list.map { MenuItem(it.title)})
        menuItems.add(MenuItem("Выход"))

        menuItems.forEachIndexed { index, archiveMenuItem ->
            println(String.format(menuFormatter, index, archiveMenuItem.title))
        }
    }

    fun renderMenuNote(list: List<Note>) {
        val menuItems = mutableListOf<MenuItem>()
        menuItems.add(MenuItem("Создать Заметку"))
        menuItems.addAll(list.map { MenuItem(it.title) })
        menuItems.add(MenuItem("Выход"))

        menuItems.forEachIndexed { index, noteMenuItem ->
            println(String.format(menuFormatter, index, noteMenuItem.title))
        }
    }
}