package com.example.hello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hello.ui.theme.HelloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloTheme {
                // A surface container using the 'background' color from the theme
                NavigationView()
            }
        }
    }
}

@Composable
fun NavigationView() {
    val navController = rememberNavController()

    // Set up the NavHost with routes
    NavHost(navController = navController, startDestination = "welcome") {
        // Specify the content for each destination
        composable("getstarted") {
            GetStartedScreen()
        }
        composable("welcome") {
            getstarted(navController)
        }
    }
}

@Composable
fun GetStartedScreen() {
    // Content for the "getstarted" destination
}

@Composable
fun getstaeted(navController: NavHostController) {
    // Content for the "welcome" destination
}

class NavHostController {

}
