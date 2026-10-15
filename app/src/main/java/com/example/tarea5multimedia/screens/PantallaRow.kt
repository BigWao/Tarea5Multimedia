package com.example.tarea5multimedia.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tarea5multimedia.componentes.ElementoVertical

@Composable
fun PantallaRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxSize()) {
        (1..3).forEach { numero ->
            ElementoVertical(texto = "Elemento $numero", modifier = Modifier.weight(1f))
        }
    }
}