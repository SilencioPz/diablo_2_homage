package com.example.diablimdosilencio.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
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
fun BuildsScreen(navController: NavHostController) {
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
                        text = "BUILDS POR CLASSE",
                        color = Color(0xFFFFD700)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            "Voltar",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black
                )
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Black
            ) {
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
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(diabloGradient),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            item {
                Text(
                    text = "BUILDS POR CLASSE",
                    color = Color(0xFFFFD700),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Bárbaro - Berserk
                ZoomableImageCard(
                    imageRes = R.drawable.berserk,
                    contentDescription = "Build Bárbaro"
                )

                Text(
                    text = "Berserk, para o Bárbaro. Dano mágico alto, mas deixa o usuário com " +
                            "defesa zero. Excelente para matar e farmar rapidamente, " +
                            "se tiver os itens certos.",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Feiticeira - Nova
                ZoomableImageCard(
                    imageRes = R.drawable.nova_build,
                    contentDescription = "Build Feiticeira"
                )

                Text(
                    text = "Nova, para a Feiticeira. Dano elétrico poderoso, porém a usuária não " +
                            "foca em defesa nesta build. Excelente para farmar e matar rapidamente, " +
                            "tendo o cuidado dela não ser atingida...Além disso, inclua o patuá que " +
                            "quebra a imunidade elétrica dos inimigos (muitos possuem essa imunidade).",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Paladino - Smite
                ZoomableImageCard(
                    imageRes = R.drawable.smite_build,
                    contentDescription = "Build Paladino"
                )

                Text(
                    text = "Smite, para o Paladino. Dano físico poderoso, deixando os inimigos " +
                            "tontos. A build também foca em Fanatism (para bônus em ataque) e " +
                            "Defesa em Eletricidade, pensando no Uber Mephisto e seus ataques " +
                            "elétricos e venenosos. Bom incluir o patuá Bone Break para quebrar a " +
                            "imunidade física dos monstros.",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Amazona - Lightning Javelins
                ZoomableImageCard(
                    imageRes = R.drawable.javazon,
                    contentDescription = "Build Amazona"
                )

                Text(
                    text = "Lightning Javelins, da Amazona. Dano elétrico poderoso, mata tudo o que " +
                            "está na tela. Exige equipamentos caros, um deles é o raríssimo Olho do " +
                            "Grifo, encontrado em áreas 85. Contudo, tendo tudo no esquema fica " +
                            "fácil de limpar a Fase Secreta da Vaca no Inferno, tendo bons itens e " +
                            "até runas se tiver sorte! Ah sim, separe um patuá que quebra imunidade " +
                            "elétrica beleza?! XD",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Necromante - Summoner
                ZoomableImageCard(
                    imageRes = R.drawable.summoner,
                    contentDescription = "Build Necromante"
                )

                Text(
                    text = "Summoner, do Necromante. É invocar um exército de mortos vivos e explodir " +
                            "corpos de inimigo pelo caminho de uma distância segura. Excelente para online, " +
                            "facilita muito partidas de 8 jogadores - se tiver um Berserk, aí compra " +
                            "briga! XP",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Druida - Lobisomem
                ZoomableImageCard(
                    imageRes = R.drawable.druid_build,
                    contentDescription = "Build Druida"
                )

                Text(
                    text = "Druida Lobisomem, muito rápido e forte. Essa build EXIGE o patuá Bone " +
                            "Break, visto que o personagem só utiliza ataques físicos. Os ajudantes " +
                            "dele, lobos espírito e urso, quebram um galho mas é o personagem que " +
                            "vai e mata. Também exige equipamento caro e runas raras de achar...",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Assassina - Trapsin
                ZoomableImageCard(
                    imageRes = R.drawable.trapsin,
                    contentDescription = "Build Assassina"
                )

                Text(
                    text = "A famosa Trapsin, ou Assassina de Armadilhas. Ela usa raios como arma, " +
                            "mas no começo você usará bombas que causam fogo no inimigo até chegar " +
                            "num bom dano das armadilhas elétricas. Excepcionalmente poderosa e " +
                            "fácil de usar, porém o custo é alto - já que a build exige o Olho de " +
                            "Grifo e o famoso e raro Teia Aracnídea...E claro, exige o patuá que " +
                            "quebra a imunidade elétrica dos monstros.",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

@Composable
fun ZoomableImageCard(
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