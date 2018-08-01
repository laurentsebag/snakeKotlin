package com.snake.game

import org.w3c.dom.CanvasRenderingContext2D

class BoardView(private val context2D: CanvasRenderingContext2D,
                private val presenter: BoardPresenterContract.Presenter) : BoardPresenterContract.View {

    override fun setViewFrameRate(frameRate: Int) {

    }
}