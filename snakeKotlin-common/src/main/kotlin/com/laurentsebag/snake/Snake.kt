package com.laurentsebag.snake

class Snake(body: ArrayList<Point>) {

    private val body: ArrayList<Point> = body
    private var growth = 0

    init {
        body.add(Point(0, 0))
        body.add(Point(1, 0))
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
            this.body.removeAt(0)
        }
    }

    private fun moveHeadBy(x: Int, y: Int) {
        val lastHead = this.body.last()
        body.add(Point(lastHead.x + x, lastHead.y + y))
    }

    fun grow() {
        growth++;
    }
}