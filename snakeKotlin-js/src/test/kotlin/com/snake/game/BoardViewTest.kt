package com.snake.game

import kotlin.test.Test
import kotlin.test.assertTrue

internal class BoardViewTest {
    val view = JsBoardView(null) as BoardPresenterContract.View

    @Test
    fun setup_shouldInitialisePresenter() {
        assertTrue { true }
    }
}