package com.example.professionalbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.professionalbusinesscard.ui.theme.ProfessionalBusinessCardTheme
import com.example.professionalbusinesscard.view.AmericanProfile
import com.example.professionalbusinesscard.view.BrazilProfile
import com.example.professionalbusinesscard.view.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfessionalBusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "Home" ){
                        composable(
                            "Home"
                        ){
                            Home(navController = navController)
                        }

                        composable(
                            "BrazilProfile"
                        ){
                            BrazilProfile()
                        }

                        composable(
                            "AmericanProfile"
                        ){
                            AmericanProfile()
                        }
                    }
                }
            }
        }
    }
}



