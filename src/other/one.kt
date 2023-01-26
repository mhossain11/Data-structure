package other

interface one {

    fun adds()
    fun update()
    fun remove()

}

class Number():one{
    override fun adds() {
        println("Name")
    }

    override fun update() {
       println("Change Your name")
    }

    override fun remove() {
        println("You are remove")
    }
    fun replace(){
        println("replace your name")
    }

    fun clear(){
        println("All is clear")
    }

}