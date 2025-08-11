package com.example.diablimdosilencio.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.diablimdosilencio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapasScreen(navController: NavHostController) {
    val diabloGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF8B0000),
            Color(0xFF2F1B14),
            Color(0xFF000000)
        )
    )

    val mapas = listOf(
        MapaInfo("O Fosso - Mapa Nível 85", R.drawable.the_pit),
        MapaInfo("Túneis Antigos - Mapa Nível 85", R.drawable.ancient_tunnels),
        MapaInfo("Travincal - Mapa Nível 82", R.drawable.travincal),
        MapaInfo("Duração do Ódio - Mapa Nível 83", R.drawable.durance_of_hate),
        MapaInfo("Santuário do Caos - Mapa Nível 85", R.drawable.chaos_sanctuary),
        MapaInfo("Terras Altas Gélidas - Mapa Nível 81", R.drawable.frigid_highlands),
        MapaInfo("Templo de Nihlathak - Mapa Nível 83", R.drawable.nihlathak_temple),
        MapaInfo("Fortaleza da Pedra do Mundo - Mapa Nível 85", R.drawable.worldstone_keep),
        MapaInfo("Nível Secreto da Vaca - Mapa Nível 81", R.drawable.secret_cow_level)
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "MAPAS DE DIABLO 2",
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
            items(mapas) { mapa ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = mapa.imagemRes),
                        contentDescription = mapa.nome,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = mapa.nome,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

            item {
                Text(
                    text = "Os mapas acima são excelentes para farming de runas e itens. " +
                            "Prefira Players 5 (comando para aumentar o número de jogadores[offline]" +
                            " ou você e mais quatro jogadores[online]) para uma melhor experiência" +
                            " de drop, pois Players 1 (você sozinho no online) o drop é ridículo e " +
                            "demorado. ",
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }
    }
}

data class MapaInfo(
    val nome: String,
    val imagemRes: Int
)