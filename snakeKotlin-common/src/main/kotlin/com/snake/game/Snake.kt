package com.snake.game

interface Snake {
    val body: List<Cell>

    fun moveUp()
    fun moveDown()
    fun moveLeft()
    fun moveRight()
    fun grow()
}