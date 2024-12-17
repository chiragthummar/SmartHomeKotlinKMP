package me.fsfaysalcse.smarthome.theme

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import smarthome.composeapp.generated.resources.Res
import smarthome.composeapp.generated.resources.product_sans_black
import smarthome.composeapp.generated.resources.product_sans_bold
import smarthome.composeapp.generated.resources.product_sans_light
import smarthome.composeapp.generated.resources.product_sans_medium
import smarthome.composeapp.generated.resources.product_sans_regular
import smarthome.composeapp.generated.resources.product_sans_thin


@Composable
fun getProductSansFont() = FontFamily(
    Font(Res.font.product_sans_regular, FontWeight.Normal),
    Font(Res.font.product_sans_bold, FontWeight.Bold),
    Font(Res.font.product_sans_light, FontWeight.Light),
    Font(Res.font.product_sans_medium, FontWeight.Medium),
    Font(Res.font.product_sans_thin, FontWeight.Thin),
    Font(Res.font.product_sans_black, FontWeight.Black)
)
