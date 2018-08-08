package com.snake.game

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.eq
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class BoardPresenterTest {

    private lateinit var presenter: BoardPresenter

    @Mock
    private lateinit var mockView: BoardPresenterContract.View
    @Mock
    private lateinit var mockSnake: Snake

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = BoardPresenter(mockView, mockSnake)
    }

    @Test
    fun onSetup_shouldStartView() {
        presenter.onSetup()
        verify(mockView).startWithFrameRate(eq(30))
    }

    @Test
    fun onKeyPress_shouldMoveSnakeUp_whenUpPressed() {
        println("about to call presenter")
        presenter.onKeyPress("up")
        verify(mockSnake).moveUp()
    }
}