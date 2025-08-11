package com.example.diablimdosilencio.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun PersonagensScreen(navController: NavHostController) {
    val personagens = listOf(
        Personagem("BÁRBARO", R.drawable.barbarian, "O destruidor " +
                "selvagem. Mestre em armas brancas, táticas ferozes e gritos de guerra brutais."),
        Personagem("FEITICEIRA", R.drawable.sorceress, "Mestra do " +
                "Fogo, Gelo e Eletricidade. Possui teleporte e escudos de gelo e mana."),
        Personagem("PALADINO", R.drawable.paladin, "Cavaleiro " +
                "sagrado, luta em nome de Deus. Habilidades baseadas em Auras poderosas."),
        Personagem("AMAZONA", R.drawable.amazon, "Especialista em " +
                "arcos, javelinas e lanças. Guerreira astuta, mata com destreza."),
        Personagem("NECROMANTE", R.drawable.necromancer, "Senhor dos " +
                "mortos-vivos. Suas habilidades corrompidas variam entre lanças de ossos, invocar " +
                "os mortos e explodir corpos."),
        Personagem("DRUIDA", R.drawable.druid, "Transforma-se em " +
                "animais e invoca os poderes da Natureza para ajudá-lo a matar demônios."),
        Personagem("ASSASSINA", R.drawable.assassin, "Mestra das " +
                "artes marciais e das armadilhas. Esta guerreira é veloz e ardilosa, muito perigosa " +
                "contra os demônios do inferno.")
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "PERSONAGENS",
                        color = Color(0xFFFFD700) // Dourado
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
                    containerColor = Color.Black // Fundo preto
                )
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Black // Fundo preto
            ) {
                Button(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF8B0000), // Vermelho Diablo
                        contentColor = Color(0xFFFFD700)   // Dourado
                    )
                ) {
                    Text("VOLTAR AO MENU")
                }
            }
        },
        containerColor = Color.Black // Fundo preto
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.Black), // Garante fundo preto
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(personagens) { personagem ->
                CharacterCard(
                    title = personagem.nome,
                    imageRes = personagem.imagemRes,
                    description = personagem.descricao
                )
            }
        }
    }
}

@Composable
fun CharacterCard(
    title: String,
    imageRes: Int,
    description: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF2F1B14) // Marrom escuro (tema Diablo)
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(Color(0xFF2F1B14)),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = title,
                fontSize = 22.sp,
                fontWeight = FontWeight.Black,
                color = Color(0xFFFFD700) // Dourado
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = description,
                fontSize = 16.sp,
                lineHeight = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}

data class Personagem(
    val nome: String,
    val imagemRes: Int,
    val descricao: String
)