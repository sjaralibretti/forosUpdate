package cl.duoc.foros.viewmodel

import cl.duoc.foros.viewmodel.UsuarioErrores

data class UsuarioUIState(
    val nombre : String = "",
    val correo : String = "",
    val clave : String = "",
    val terminos : Boolean = false,
    val moderador : Boolean = false,
    val errores : UsuarioErrores = UsuarioErrores()
)
