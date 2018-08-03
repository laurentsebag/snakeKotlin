package com.snake.game

import org.w3c.dom.CanvasRenderingContext2D

// TODO see if we can make a parametrised class shared for both JVM and js
class BoardView(private val context2D: CanvasRenderingContext2D) : BoardPresenterContract.View {
    override fun setup(presenter: BoardPresenterContract.Presenter) {
        TODO("not implemented")
    }

    override fun setViewFrameRate(frameRate: Int) {

    }
}