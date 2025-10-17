package com.example.diablimdosilencio.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.diablimdosilencio.R
import kotlin.math.*

@Composable
fun MenuScreen(navController: NavHostController) {
    val diabloGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF8B0000),
            Color(0xFF2F1B14),
            Color(0xFF000000)
        )
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(diabloGradient)
                .padding(16.dp)
        ) {
            Text(
                text = "Diablo 2 é um produto da Blizzard Entertainment. Todos os direitos reservados.",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 16.dp),
                textAlign = TextAlign.Center
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(horizontal = 16.dp)
            ) {
                val infiniteTransition = rememberInfiniteTransition()
                val glowIntensity by infiniteTransition.animateFloat(
                    initialValue = 0.8f,
                    targetValue = 1.5f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(1000, easing = FastOutSlowInEasing),
                        repeatMode = RepeatMode.Reverse
                    )
                )

                Image(
                    painter = painterResource(id = R.drawable.fire_flames),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.colorMatrix(
                        ColorMatrix().apply {
                            setToScale(
                                redScale = glowIntensity * 1.8f,
                                greenScale = glowIntensity * 1.3f,
                                blueScale = glowIntensity * 0.7f,
                                alphaScale = 1f
                            )
                        }
                    )
                )

                Image(
                    painter = painterResource(id = R.drawable.diablim_do_paraguay),
                    contentDescription = "Diablim do Paraguay",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Fit
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "DIABLIM DO SILÊNCIO",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFD700),
                    modifier = Modifier.padding(bottom = 32.dp)
                )

                DiabloButton(
                    text = "PERSONAGENS",
                    onClick = { navController.navigate("personagens") }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DiabloButton(
                    text = "DICAS",
                    onClick = { navController.navigate("dicas") }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DiabloButton(
                    text = "MAPAS",
                    onClick = { navController.navigate("mapas") }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DiabloButton(
                    text = "BUILDS POR CLASSE",
                    onClick = { navController.navigate("builds") }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DiabloButton(
                    text = "ITENS",
                    onClick = { navController.navigate("itens") }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DiabloButton(
                    text = "SOBRE",
                    onClick = { navController.navigate("sobre") }
                )
            }

            Text(
                text = "Este é um projeto de fã para fãs brasileiros.",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun IntenseFlameEffect() {
    val infiniteTransition = rememberInfiniteTransition(label = "intense_flames")

    val flameIntensity by infiniteTransition.animateFloat(
        initialValue = 0.7f,
        targetValue = 1.3f,
        animationSpec = infiniteRepeatable(
            animation = tween(800, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "flame_intensity"
    )

    val flameOffset by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "flame_offset"
    )

    Canvas(modifier = Modifier.fillMaxSize()) {
        drawIntenseFlames(flameOffset, flameIntensity)
    }
}

private fun DrawScope.drawIntenseFlames(offset: Float, intensity: Float) {
    val width = size.width
    val height = size.height

    val flameColors = listOf(
        Color(0xFFFFFFFF).copy(alpha = 0.9f * intensity), // Branco intenso
        Color(0xFFFFFF00).copy(alpha = 0.8f * intensity), // Amarelo brilhante
        Color(0xFFFF8C00).copy(alpha = 0.9f * intensity), // Laranja intenso
        Color(0xFFFF4500).copy(alpha = 0.8f * intensity), // Vermelho-laranja
        Color(0xFFFF0000).copy(alpha = 0.7f * intensity), // Vermelho
    )

    drawRect(
        brush = Brush.radialGradient(
            colors = listOf(
                Color(0xFFFF8C00).copy(alpha = 0.3f * intensity),
                Color.Transparent
            ),
            radius = width * 0.8f
        )
    )

    val edgeFlameCount = 15
    for (i in 0..edgeFlameCount) {
        val progress = i.toFloat() / edgeFlameCount
        val yPos = height * progress

        drawIntenseFlame(
            x = -20f,
            y = yPos,
            width = 80f,
            height = 120f,
            offset = offset + progress * 2,
            intensity = intensity,
            colors = flameColors
        )

        drawIntenseFlame(
            x = width + 20f,
            y = yPos,
            width = 80f,
            height = 120f,
            offset = offset + progress * 2 + 1f,
            intensity = intensity,
            colors = flameColors
        )
    }

    val baseFlameCount = 12
    for (i in 0..baseFlameCount) {
        val xPos = (width / baseFlameCount) * i
        drawIntenseFlame(
            x = xPos,
            y = height * 0.7f,
            width = 100f,
            height = 150f,
            offset = offset + (i * 0.3f),
            intensity = intensity * 1.2f,
            colors = flameColors
        )
    }

    val topFlameCount = 8
    for (i in 0..topFlameCount) {
        val xPos = (width / topFlameCount) * i
        drawIntenseFlame(
            x = xPos,
            y = -30f,
            width = 90f,
            height = 120f,
            offset = offset + (i * 0.4f) + 0.5f,
            intensity = intensity,
            colors = flameColors
        )
    }
}

private fun DrawScope.drawIntenseFlame(
    x: Float,
    y: Float,
    width: Float,
    height: Float,
    offset: Float,
    intensity: Float,
    colors: List<Color>
) {
    val animatedHeight = height * (0.6f + sin(offset * 3 * PI).toFloat() * 0.4f) * intensity
    val animatedWidth = width * (0.8f + cos(offset * 2 * PI).toFloat() * 0.2f)

    val colorIndex = (offset * colors.size).toInt() % colors.size
    val primaryColor = colors[colorIndex]
    val secondaryColor = colors[(colorIndex + 1) % colors.size]

    val brush = Brush.radialGradient(
        colors = listOf(
            primaryColor.copy(alpha = primaryColor.alpha * intensity),
            secondaryColor.copy(alpha = secondaryColor.alpha * intensity * 0.7f),
            Color.Transparent
        ),
        center = Offset(x, y + animatedHeight * 0.3f),
        radius = animatedWidth * 0.8f
    )

    repeat(3) { layer ->
        val layerAlpha = (3 - layer) / 3f * intensity
        val layerSize = animatedWidth * (1f - layer * 0.15f)

        drawRoundRect(
            brush = brush,
            topLeft = Offset(x - layerSize/2, y),
            size = Size(layerSize, animatedHeight * (1f - layer * 0.1f)),
            cornerRadius = CornerRadius(layerSize/2, layerSize/3),
            alpha = layerAlpha
        )
    }
}

@Composable
private fun DiabloButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth(0.6f)
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF8B0000),
            contentColor = Color(0xFFFFD700)
        )
    ) {
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}