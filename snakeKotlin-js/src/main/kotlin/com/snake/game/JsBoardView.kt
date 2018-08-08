package com.snake.game

import kotlin.browser.window

class JsBoardView(config: JsBoardViewConfig) : BoardView<JsBoardViewConfig>(config) {

    override fun startWithFrameRate(frameRate: Int) {
        window.setInterval({ draw() }, 1000 / frameRate)
    }
}