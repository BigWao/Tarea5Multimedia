package com.example.tarea5multimedia.navigation

import com.example.tarea5multimedia.R

enum class Destino(
    val ruta: String,
    val titulo: String,
    val icono: Int
) {
    COLUMN(ruta = "column", titulo = "Column", icono = R.drawable.ic_column),
    ROW(ruta = "row", titulo = "Row", icono = R.drawable.ic_row),
    BOX(ruta = "box", titulo = "Box", icono = R.drawable.ic_box)
}