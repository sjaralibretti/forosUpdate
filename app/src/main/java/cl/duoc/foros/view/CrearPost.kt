package cl.duoc.foros.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import cl.duoc.foros.viewmodel.PostViewModel

@Composable
fun CrearPost(
    navController: NavController,
    viewModel: PostViewModel
) {
    val estado by viewModel.estado.collectAsState()



}