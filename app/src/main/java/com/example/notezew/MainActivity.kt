package com.example.notezew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.notezew.ui.theme.AppTheme
import com.example.notezew.ui.navigation.NoteNavHost

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                NoteApp()
            }
        }
    }
}

@Composable
fun NoteApp() {
    val navController = rememberNavController()
    NoteNavHost(navController = navController)
}
