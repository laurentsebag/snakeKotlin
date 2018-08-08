package com.snake.game

class BoardPresenter(private val boardView: BoardPresenterContract.View, private val snake: Snake) : BoardPresenterContract.Presenter {
    override fun onSetup() {
        boardView.startWithFrameRate(30)
    }

    override fun onPreDraw() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onKeyPress(key: String) {
        println("hello $snake")
        snake.moveUp()
    }
}