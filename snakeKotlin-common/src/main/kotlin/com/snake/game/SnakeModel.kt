package com.snake.game

class SnakeModel : Snake {
    private val _body = mutableListOf<Cell>()
    private var growth = 0

    override val body: List<Cell>
        get() = _body

    init {
        _body.add(Cell(0, 0))
        _body.add(Cell(1, 0))
    }

    override fun moveUp() {
        moveTail()
        moveHeadBy(0, -1)
    }

    override fun moveDown() {
        moveTail()
        moveHeadBy(0, 1)
    }

    override fun moveLeft() {
        moveTail()
        moveHeadBy(-1, 0)
    }

    override fun moveRight() {
        moveTail()
        moveHeadBy(1, 0)
    }

    fun moveTail() {
        if (this.growth > 0) {
            this.growth--
        } else {
            this._body.removeAt(0)
        }
    }

    fun moveHeadBy(x: Int, y: Int) {
        val lastHead = this._body.last()
        _body.add(Cell(lastHead.x + x, lastHead.y + y))
    }

    override fun grow() {
        growth++
    }
}