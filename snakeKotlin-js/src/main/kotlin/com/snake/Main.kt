import com.snake.game.Snake
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.KeyboardEvent
import kotlin.browser.document
import kotlin.browser.window


fun main(args: Array<String>) {
    val speed = 200
    val cellSize = 38.0
    var direction = "ArrowRight"

    val canvas = document.getElementById("gameBoard") as HTMLCanvasElement
    val context = canvas.getContext("2d") as CanvasRenderingContext2D

    val snake = Snake()

    fun draw() {
        context.clearRect(0.0, 0.0, canvas.width.toDouble(), canvas.height.toDouble())

        context.fillStyle = "green"

        val body = snake.body

        body.forEach {
            context.fillRect(
                    (it.x * cellSize + it.x),
                    (it.y * cellSize + it.y), cellSize, cellSize
            )
        }

        when (direction) {
            "ArrowRight" -> snake.moveRight()
            "ArrowLeft" -> snake.moveLeft()
            "ArrowUp" -> snake.moveUp()
            "ArrowDown" -> snake.moveDown()
        }
    }

    window.onkeyup = {
        val key = (it as KeyboardEvent).key
        if (key == " ") {
            snake.grow()
        } else if (key.startsWith("Arrow")) {
            direction = key
        }
    }

    window.setInterval({ draw() }, speed)
}