package com.example.tarea5multimedia.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tarea5multimedia.componentes.ElementoHorizontal

@Composable
fun PantallaColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        ElementoHorizontal(texto = "Elemento 1 de la columna")
        ElementoHorizontal(texto = "Elemento 2 de la columna")
        ElementoHorizontal(texto = "Elemento 3 de la columna")
        (4..6).forEach { numero ->
            ElementoHorizontal(texto = "Elemento $numero de la columna")
        }
    }
}