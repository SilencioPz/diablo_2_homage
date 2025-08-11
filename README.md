# 🔥 **DIABLIM DO SILÊNCIO**  

### *O APP DEFINITIVO DO SEU DIABLO 2 OFFLINE*  

**Gamertag: silenciopz**  

*(Porque até o Diablo teme um inventário organizado! 💀⚔️)*  
--------------------------------------------------------------------------------------------------------------------------------------
🎮 FUNCIONALIDADES PRINCIPAIS

👥 Gerenciamento de Personagens

   As 7 classes presentes no jogo.

🧰 Sistema de Itens

    Itens únicos importantes e mapas recomendados para encontrá-los.

📊 Builds Customizadas

    Builds de cada classe recomendadas, foquei em apenas uma para não tomar demasiado espaço.

--------------------------------------------------------------------------------------------------------------------------------------
🛠️ TECNOLOGIAS

Componente	  Tecnologia Usada

Linguagem	    Kotlin 1.9 + Jetpack Compose

Arquitetura	  MVVM (Clean Architecture)

Navegação	    Navigation Compose

Imagens	      Drawable

UI	          100% Compose
--------------------------------------------------------------------------------------------------------------------------------------
📂 ESTRUTURA DO PROJETO

DiablimDoSilencio/  

├── app/  

│   ├── src/main/java/com/example/diablimdosilencio/  

│   │   ├── screens/               # MenuScreen, PersonagensScreen, etc  

│   │   ├── MainActivity.kt        # Ponto de entrada  

│   │   └── theme/                 # Cores e estilos  

├── build.gradle.kts               # Dependências principais  

--------------------------------------------------------------------------------------------------------------------------------------
📜 DEPENDÊNCIAS CRÍTICAS (já no seu build.gradle.kts)

kotlin

// Jetpack Compose  
implementation(libs.androidx.activity.compose)  
implementation(platform(libs.androidx.compose.bom))  
implementation(libs.androidx.material3)  

// Navegação  
implementation(libs.androidx.navigation.compose)  

// GIFs/Imagens(não foi usada no projeto final)
implementation("com.airbnb.android:lottie-compose:6.1.0")  
implementation("io.coil-kt:coil-compose:2.4.0")  

--------------------------------------------------------------------------------------------------------------------------------------
🎨 UI/UX PREVIEW

https://imgur.com/a/MoO2DKD
--------------------------------------------------------------------------------------------------------------------------------------
⚙️ COMO RODAR

    Clone o repositório

    Abra no Android Studio (ou use ./gradlew assembleDebug)

    Build → Run no emulador/dispositivo
--------------------------------------------------------------------------------------------------------------------------------------
🔮 ROADMAP

Feature	                  Status

Calculadora de Runes	  💡 Planejado
Modo Offline Completo	  ✅ Pronto
--------------------------------------------------------------------------------------------------------------------------------------
📌 LICENÇA

Projeto open-source sob licença MIT.
--------------------------------------------------------------------------------------------------------------------------------------
Feito com ódio de Duriel e amor por Mephisto Runs em Rondonópolis/MT! 😎☕
