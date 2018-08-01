package com.snake.game

class Snake {
    private val _body = mutableListOf<Cell>()
    private var growth = 0

    val body: List<Cell>
        get() = _body


    init {
        _body.add(Cell(0, 0))
        _body.add(Cell(1, 0))
    }

    fun moveUp() {
        moveTail()
        moveHeadBy(0, -1)
    }

    fun moveDown() {
        moveTail()
        moveHeadBy(0, 1)
    }

    fun moveLeft() {
        moveTail()
        moveHeadBy(-1, 0)
    }

    fun moveRight() {
        moveTail()
        moveHeadBy(1, 0)
    }

    private fun moveTail() {
        if (this.growth > 0) {
            this.growth--
        } else {
            this._body.removeAt(0)
        }
    }

    private fun moveHeadBy(x: Int, y: Int) {
        val lastHead = this._body.last()
        _body.add(Cell(lastHead.x + x, lastHead.y + y))
    }

    fun grow() {
        growth++
    }
}