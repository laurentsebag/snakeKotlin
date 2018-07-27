package com.laurentsebag.snake

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

internal class SnakeTest {

    private lateinit var snake: Snake

    @Before
    fun setup() {
        snake = Snake()
    }

    @Test
    fun init_shouldAddBody() {
        assertThat(snake.body).isEqualTo(listOf(
                Point(0, 0),
                Point(1, 0)))
    }

    @Test
    fun moveUp_shouldMoveHeadUpAndMoveTail() {
        snake.moveUp()

        assertThat(snake.body).isEqualTo(listOf(
                Point(1, 0),
                Point(1, -1)))
    }

    @Test
    fun moveUp_shouldMoveHeadOnly_whenGrowing() {
        snake.grow()
        snake.moveUp()

        assertThat(snake.body).isEqualTo(listOf(
                Point(0, 0),
                Point(1, 0),
                Point(1, -1)))
    }

    @Test
    fun moveDown_shouldMoveHeadDownAndMoveTail() {
        snake.moveDown()

        assertThat(snake.body).isEqualTo(listOf(
                Point(1, 0),
                Point(1, 1)))
    }


    @Test
    fun moveDown_shouldMoveHeadDownAndMoveTail_whenGrowing() {
        snake.grow()
        snake.moveDown()

        assertThat(snake.body).isEqualTo(listOf(
                Point(0, 0),
                Point(1, 0),
                Point(1, 1)))
    }

    @Test
    fun moveDown_shouldMoveHeadRightAndMoveTail() {
        snake.moveRight()

        assertThat(snake.body).isEqualTo(listOf(
                Point(1, 0),
                Point(2, 0)))
    }


    @Test
    fun moveDown_shouldMoveHeadRightAndMoveTail_whenGrowing() {
        snake.grow()
        snake.moveRight()

        assertThat(snake.body).isEqualTo(listOf(
                Point(0, 0),
                Point(1, 0),
                Point(2, 0)))
    }

    @Test
    fun moveDown_shouldMoveHeadLeftAndMoveTail() {
        snake.moveDown()
        snake.moveLeft()

        assertThat(snake.body).isEqualTo(listOf(
                Point(1, 1),
                Point(0, 1)))
    }


    @Test
    fun moveDown_shouldMoveHeadLeftAndMoveTail_whenGrowing() {
        snake.moveDown()
        snake.grow()
        snake.moveLeft()

        assertThat(snake.body).isEqualTo(listOf(
                Point(1, 0),
                Point(1, 1),
                Point(0, 1)))
    }
}