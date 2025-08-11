package com.example.diablimdosilencio.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.diablimdosilencio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItensScreen(navController: NavHostController) {
    val diabloGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF8B0000),
            Color(0xFF2F1B14),
            Color(0xFF000000)
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "ITENS RECOMENDADOS",
                        color = Color(0xFFFFD700)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            "Voltar",
                            tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black)
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Black
            ) {
                Column {
                    Button(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF8B0000),
                            contentColor = Color(0xFFFFD700)
                        )
                    ) {
                        Text("VOLTAR AO MENU")
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(diabloGradient),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "ITENS RECOMENDADOS",
                    color = Color(0xFFFFD700),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Annihilus - patuá pequeno",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    ZoomableItemCard(
                        imageRes = R.drawable.anni,
                        contentDescription = "Annihilus - patuá pequeno"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Item 2 - Malha Aracnídea
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Malha Aracnídea- faixa da teia de aranha",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    ZoomableItemCard(
                        imageRes = R.drawable.arachnid_mesh,
                        contentDescription = "Malha Aracnídea- faixa da teia de aranha"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Aliança de Casamento de Bul_Kathos - anel",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    ZoomableItemCard(
                        imageRes = R.drawable.bul_kathos,
                        contentDescription = "Aliança de Casamento de Bul_Kathos - anel"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Olho do Grifo - diadema",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    ZoomableItemCard(
                        imageRes = R.drawable.griffon_eye,
                        contentDescription = "Olho do Grifo - diadema"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Crista do Harlequin - shako(capacete)",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    ZoomableItemCard(
                        imageRes = R.drawable.harlequin_crest,
                        contentDescription = "Crista do Harlequin - shako(capacete)"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Tocha do Fogo do Inferno - patuá médio",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    ZoomableItemCard(
                        imageRes = R.drawable.hellfire_torch,
                        contentDescription = "Tocha do Fogo do Inferno - patuá médio"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Rachadura no Céu - patuá grandioso",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    ZoomableItemCard(
                        imageRes = R.drawable.crack_of_the_heaven,
                        contentDescription = "Rachadura no Céu - patuá grandioso"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Quebra Osso - patuá grandioso",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    ZoomableItemCard(
                        imageRes = R.drawable.bone_break,
                        contentDescription = "Quebra Osso - patuá grandioso"
                    )
                }
            }
        }
    }
}

@Composable
fun ZoomableItemCard(
    imageRes: Int,
    contentDescription: String
) {
    var zoomLevel by remember { mutableFloatStateOf(1f) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF2F1B14)
        )
    ) {
        Column {
            // Controles de Zoom
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Botão Diminuir Zoom
                IconButton(
                    onClick = {
                        zoomLevel = (zoomLevel - 0.2f).coerceAtLeast(1f)
                    },
                    enabled = zoomLevel > 1f
                ) {
                    Icon(
                        Icons.Default.Close,
                        contentDescription = "Diminuir zoom",
                        tint = if (zoomLevel > 1f) Color(0xFFFFD700) else Color.Gray
                    )
                }

                // Slider de Zoom
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Zoom: ${(zoomLevel * 100).toInt()}%",
                        color = Color(0xFFFFD700),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )

                    Slider(
                        value = zoomLevel,
                        onValueChange = { zoomLevel = it },
                        valueRange = 1f..3f,
                        modifier = Modifier.fillMaxWidth(),
                        colors = SliderDefaults.colors(
                            thumbColor = Color(0xFFFFD700),
                            activeTrackColor = Color(0xFFFFD700),
                            inactiveTrackColor = Color.Gray
                        )
                    )
                }

                // Botão Aumentar Zoom
                IconButton(
                    onClick = {
                        zoomLevel = (zoomLevel + 0.2f).coerceAtMost(3f)
                    },
                    enabled = zoomLevel < 3f
                ) {
                    Icon(
                        Icons.Default.Add,
                        contentDescription = "Aumentar zoom",
                        tint = if (zoomLevel < 3f) Color(0xFFFFD700) else Color.Gray
                    )
                }
            }

            // Imagem com Zoom
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(MaterialTheme.shapes.medium)
                    .background(Color.Black)
            ) {
                Image(
                    painter = painterResource(imageRes),
                    contentDescription = contentDescription,
                    modifier = Modifier
                        .fillMaxSize()
                        .graphicsLayer {
                            scaleX = zoomLevel
                            scaleY = zoomLevel
                        },
                    contentScale = ContentScale.Fit
                )
            }

            // Indicador de Reset
            if (zoomLevel > 1f) {
                TextButton(
                    onClick = { zoomLevel = 1f },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(4.dp)
                ) {
                    Text(
                        text = "↻ Resetar Zoom",
                        color = Color(0xFFFFD700),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}