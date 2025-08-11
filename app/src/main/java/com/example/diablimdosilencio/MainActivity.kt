package com.example.diablimdosilencio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.diablimdosilencio.ui.screens.BuildsScreen
import com.example.diablimdosilencio.ui.screens.DicasScreen
import com.example.diablimdosilencio.ui.screens.MapasScreen
import com.example.diablimdosilencio.ui.screens.MenuScreen
import com.example.diablimdosilencio.ui.screens.PersonagensScreen
import com.example.diablimdosilencio.ui.screens.ItensScreen
import com.example.diablimdosilencio.ui.screens.SobreScreen
import com.example.diablimdosilencio.ui.theme.DiablimDoSilencioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiablimDoSilencioTheme {
                val navController = rememberNavController()
                Scaffold(
                    content = { innerPadding ->
                        NavigationHost(
                            navController = navController,
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                )
            }
        }
    }
}

@Composable
fun NavigationHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "menu"
    ) {
        composable("menu") { MenuScreen(navController) }
        composable("personagens") { PersonagensScreen(navController) }
        composable("dicas") { DicasScreen(navController) }
        composable("mapas") { MapasScreen(navController) }
        composable("builds") { BuildsScreen(navController) }
        composable("itens") { ItensScreen(navController) }
        composable("sobre") { SobreScreen(navController) }
    }
}