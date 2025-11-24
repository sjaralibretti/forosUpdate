package cl.duoc.foros.viewmodel

import androidx.lifecycle.ViewModel
import cl.duoc.foros.model.Publicacion
import cl.duoc.foros.model.Usuario
import cl.duoc.foros.view.Post
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PostViewModel : ViewModel() {

    private val _estado = MutableStateFlow(Publicacion())

    val estado : StateFlow<Usuario> = _estado

    onCrearPost()
}