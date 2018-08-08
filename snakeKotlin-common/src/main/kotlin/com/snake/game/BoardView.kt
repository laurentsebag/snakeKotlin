package com.snake.game

abstract class BoardView<C>(protected val config: C) : BoardPresenterContract.View {

    lateinit var presenter: BoardPresenterContract.Presenter

    override fun setup(presenter: BoardPresenterContract.Presenter) {
        this.presenter = presenter
        presenter.onSetup()
    }

    open fun draw() {
        presenter.onPreDraw()
    }
}