package com.laurentsebag.snake

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SnakeTest {

    private lateinit var snake: Snake

    @BeforeTest
    fun setup() {
        println("setup")
        snake = Snake()
    }

    @Test
    fun init_shouldAddBody() {
        assertEquals(listOf(
                Point(0, 0),
                Point(1, 0)), snake.body);
    }

    @Test
    fun moveUp_shouldMoveHeadUpAndMoveTail() {
        snake.moveUp()

        assertEquals(listOf(
                Point(1, 0),
                Point(1, -1)), snake.body)
    }

    @Test
    fun moveUp_shouldMoveHeadOnly_whenGrowing() {
        snake.grow()
        snake.moveUp()

        assertEquals(listOf(
                Point(0, 0),
                Point(1, 0),
                Point(1, -1)), snake.body)
    }

    @Test
    fun moveDown_shouldMoveHeadDownAndMoveTail() {
        snake.moveDown()

        assertEquals(listOf(
                Point(1, 0),
                Point(1, 1)), snake.body)
    }


    @Test
    fun moveDown_shouldMoveHeadDownAndMoveTail_whenGrowing() {
        snake.grow()
        snake.moveDown()

        assertEquals(listOf(
                Point(0, 0),
                Point(1, 0),
                Point(1, 1)), snake.body)
    }

    @Test
    fun moveDown_shouldMoveHeadRightAndMoveTail() {
        snake.moveRight()

        assertEquals(listOf(
                Point(1, 0),
                Point(2, 0)), snake.body)
    }


    @Test
    fun moveDown_shouldMoveHeadRightAndMoveTail_whenGrowing() {
        snake.grow()
        snake.moveRight()

        assertEquals(listOf(
                Point(0, 0),
                Point(1, 0),
                Point(2, 0)), snake.body)
    }

    @Test
    fun moveDown_shouldMoveHeadLeftAndMoveTail() {
        snake.moveDown()
        snake.moveLeft()

        assertEquals(listOf(
                Point(1, 1),
                Point(0, 1)), snake.body)
    }


    @Test
    fun moveDown_shouldMoveHeadLeftAndMoveTail_whenGrowing() {
        snake.moveDown()
        snake.grow()
        snake.moveLeft()

        assertEquals(listOf(
                Point(1, 0),
                Point(1, 1),
                Point(0, 1)), snake.body)
    }
}