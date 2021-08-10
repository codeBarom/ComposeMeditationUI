package com.codebaron.meditationui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import java.lang.Math.abs

fun Path.standardQuadFromTo(from: Offset, to: Offset){
    quadraticBezierTo(
        from.x,
        from.y,
        kotlin.math.abs(from.x + to.x) /2f,
        kotlin.math.abs(from.y + to.y) /2f,
    )
}