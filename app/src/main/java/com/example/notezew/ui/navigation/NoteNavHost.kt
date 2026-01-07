package com.example.notezew.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notezew.ui.screens.NoteEditScreen
import com.example.notezew.ui.screens.NoteListScreen
import com.example.notezew.viewmodel.NoteViewModel

@Composable
fun NoteNavHost(navController: NavHostController = rememberNavController()) {
    val noteViewModel: NoteViewModel = viewModel()
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            NoteListScreen(navController = navController, viewModel = noteViewModel)
        }
        composable("edit") {
            NoteEditScreen(navController = navController, viewModel = noteViewModel)
        }
    }
}
