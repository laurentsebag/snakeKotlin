package com.snake.game

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

internal class SnakeModelTest {

    private lateinit var snake: Snake

    @Before
    fun setup() {
        snake = SnakeModel()
    }

    @Test
    fun init_shouldAddBody() {
        assertThat(snake.body).isEqualTo(listOf(
                Cell(0, 0),
                Cell(1, 0)))
    }

    @Test
    fun moveUp_shouldMoveHeadUpAndMoveTail() {
        snake.moveUp()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(1, 0),
                Cell(1, -1)))
    }

    @Test
    fun moveUp_shouldMoveHeadOnly_whenGrowing() {
        snake.grow()
        snake.moveUp()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(0, 0),
                Cell(1, 0),
                Cell(1, -1)))
    }

    @Test
    fun moveDown_shouldMoveHeadDownAndMoveTail() {
        snake.moveDown()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(1, 0),
                Cell(1, 1)))
    }


    @Test
    fun moveDown_shouldMoveHeadDownAndMoveTail_whenGrowing() {
        snake.grow()
        snake.moveDown()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(0, 0),
                Cell(1, 0),
                Cell(1, 1)))
    }

    @Test
    fun moveDown_shouldMoveHeadRightAndMoveTail() {
        snake.moveRight()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(1, 0),
                Cell(2, 0)))
    }


    @Test
    fun moveDown_shouldMoveHeadRightAndMoveTail_whenGrowing() {
        snake.grow()
        snake.moveRight()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(0, 0),
                Cell(1, 0),
                Cell(2, 0)))
    }

    @Test
    fun moveDown_shouldMoveHeadLeftAndMoveTail() {
        snake.moveDown()
        snake.moveLeft()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(1, 1),
                Cell(0, 1)))
    }


    @Test
    fun moveDown_shouldMoveHeadLeftAndMoveTail_whenGrowing() {
        snake.moveDown()
        snake.grow()
        snake.moveLeft()

        assertThat(snake.body).isEqualTo(listOf(
                Cell(1, 0),
                Cell(1, 1),
                Cell(0, 1)))
    }

    @Test
    fun grow_shouldDoNothing_whenNotMoved() {
        val body = snake.body.toList()

        snake.grow()

        assertThat(snake.body).isEqualTo(body)
    }


    @Test
    fun grow_shouldGrowOnce_whenMoving() {
        val bodySize = snake.body.size

        snake.grow()
        snake.moveRight()

        assertThat(snake.body.size).isEqualTo(bodySize + 1)
    }


    @Test
    fun grow_shouldGrowMoreThanOnce_whenMoving() {
        val bodySize = snake.body.size

        snake.grow()
        snake.grow()
        snake.moveRight()
        snake.moveRight()
        snake.moveRight()

        assertThat(snake.body.size).isEqualTo(bodySize + 2)
    }
}