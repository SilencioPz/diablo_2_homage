package com.example.diablimdosilencio.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
fun DicasScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "DICAS PARA JOGADORES",
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
        ) {
            item {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "DICAS PARA JOGADORES",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFD700), // Dourado
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.players_8),
                            contentDescription = "Players 8",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "1. OFFLINE: Farm no Players 8/5 SEMPRE!!!\n" +
                                "ONLINE: Se tiver um ou dois amigos, o drop é melhor. Mas lembre-se que o " +
                                "drop vale para todos. Conversem sobre o que caiu para não ter discussões.",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.runes), // Substitua pelo seu drawable
                            contentDescription = "Runas",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "2. Jogando offline, foque nas runas — são essenciais e te ajudam a " +
                                "conseguir itens melhores. Guarde itens raros e com soquetes para trocas " +
                                "jogando online.",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.item_base), // Substitua pelo seu drawable
                            contentDescription = "Itens com soquetes",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "3. Itens com bases boas e quantidade boa de soquetes (3 ou mais) são " +
                                "excelentes. Itens end-game funcionam melhor com base de soquete excepcional — " +
                                "exemplo: Mage Plate para Enigma.",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.gamble),
                            contentDescription = "Itens com soquetes",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "4. Ouro é bom apenas para Apostar/Gamble. Foque sempre em runas, itens " +
                                "únicos (como Harlequin Crest - Shako) e nos pontos certos para a sua build.",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.find_item),
                            contentDescription = "Itens com soquetes",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "5. Recomendação de personagem para farm/loot: Barbarian.\n" +
                                "Por quê? Ele tem uma build poderosa (Berserk — dano mágico, poucos monstros " +
                                "são imunes) e a habilidade secundária 'Achar Item', que aumenta a chance de " +
                                "dropar itens de inimigos raros, azuis e super-únicos (não funciona em chefes).",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.nova),
                            contentDescription = "Itens com soquetes",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "6. Recomendação de personagem para runas: Sorceress.\n" +
                                "Por quê? Ela tem dano em área, uma das melhores builds de farming " +
                                "dela é Nova. É um ataque de raios circular, combinado com o equipamento " +
                                "certo é letal contra grande volume de inimigos. Mas cuidado, se não " +
                                "tiver a defesa correta (como o escudo de mana ou algo do tipo) um tapa " +
                                "e a coitada vai pro brejo ok?! XD",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF2F1B14)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.smite),
                            contentDescription = "Itens com soquetes",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(
                        text = "7. Recomendação de personagem para Chaves/Evento Pandemônio: Paladin.\n" +
                                "Por quê? Ele tem a build Smite, um ataque com o escudo que deixa os inimigos " +
                                "tontos e fica fácil de matar super-chefes - que é o caso dos Ubers em Uber Tristam. " +
                                "Mas cuidado! Smite é um ataque físico, você precisa de um ataque mágico ou o patuá que quebra " +
                                "imunidade física (Bone Break) para lidar com esse tipo de inimigo. Fora que demora muito juntar " +
                                "as 3 chaves de cada tipo matando A Condessa (Ato 1), O Invocador(Ato 2) e Nihlathak, O Traidor " +
                                "(Ato 5) - especialmente esse último, um corno manso com um drop ridículo. Você tentará muitas vezes até " +
                                "finalmente cair UMA Chave da Destruição...acredite, eu passei por isso! u_u'",
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
            }
        }
    }
}