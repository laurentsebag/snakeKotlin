package com.snake.game

interface BoardPresenterContract {
    interface Presenter {
        fun onSetup()
        fun onPreDraw()
        fun onKeyPress(key: String)
    }

    interface View {
        fun setup(presenter: Presenter)
        fun startWithFrameRate(frameRate: Int)
    }
}
