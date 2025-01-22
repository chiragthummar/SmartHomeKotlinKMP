package me.fsfaysalcse.smarthome

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication

fun main() {
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Smart home"
        ){
            App()
        }
    }
}