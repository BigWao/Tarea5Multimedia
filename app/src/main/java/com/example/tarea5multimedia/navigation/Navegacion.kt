package com.example.tarea5multimedia.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tarea5multimedia.ui.screens.PantallaBox
import com.example.tarea5multimedia.ui.screens.PantallaColumn
import com.example.tarea5multimedia.ui.screens.PantallaRow

@Composable
fun Navegacion(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Destino.COLUMN.ruta,
        modifier = modifier
    ) {
        composable(route = Destino.COLUMN.ruta) {
            PantallaColumn()
        }
        composable(route = Destino.ROW.ruta) {
            PantallaRow()
        }
        composable(route = Destino.BOX.ruta) {
            PantallaBox()
        }
    }
}