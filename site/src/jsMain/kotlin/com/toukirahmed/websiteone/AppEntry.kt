package com.toukirahmed.websiteone

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.button
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.link
import org.jetbrains.compose.web.css.*

@InitSilk
fun overrideSilkTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Colors.White
    ctx.theme.palettes.light.color = Colors.Black
    ctx.theme.palettes.light.link.default = Colors.Black
    ctx.theme.palettes.light.link.visited = Colors.Blue
    ctx.theme.palettes.light.button.default = Colors.DarkGray
    ctx.theme.palettes.light.button.hover = Colors.LightGray
    ctx.theme.palettes.light.button.focus = Colors.LightGray
    ctx.theme.palettes.light.button.pressed = Colors.Gray

    ctx.theme.palettes.dark.background = Colors.Black
    ctx.theme.palettes.dark.color = Colors.White
    ctx.theme.palettes.dark.link.default = Colors.White
    ctx.theme.palettes.dark.link.visited = Colors.Blue
    ctx.theme.palettes.dark.button.default = Colors.Blue
    ctx.theme.palettes.dark.button.hover = Colors.MediumBlue
    ctx.theme.palettes.dark.button.focus = Colors.MediumBlue
    ctx.theme.palettes.dark.button.pressed = Colors.DarkBlue
}

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
