package com.snake.game

interface BoardPresenterContract {
    interface Presenter {
        fun onKeyPress(key: String)
        fun onViewPreDraw()
    }

    interface View {
        fun setup(presenter: Presenter)
        fun setViewFrameRate(frameRate: Int)
    }
}
