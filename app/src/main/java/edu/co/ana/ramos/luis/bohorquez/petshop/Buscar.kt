package edu.co.ana.ramos.luis.bohorquez.petshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TextButton


@Preview
@Composable
fun BuscarScreen() {
    var buscar by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Adopta",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
                    .padding(bottom = 15.dp)
            )
            OutlinedTextField(
                value = buscar,
                onValueChange = { buscar = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
                    .height(48.dp),
                label = { Text("Buscar") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Icono de Búsqueda",
                        tint = Color.Gray
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFF5ECDD),
                    unfocusedContainerColor = Color(0xFFF5ECDD),
                    disabledContainerColor = Color(0xFFF5ECDD),
                    cursorColor = Color.Black,
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    focusedLabelColor = Color.Black.copy(alpha = 0.7f),
                    unfocusedLabelColor = Color.Black.copy(alpha = 0.7f)
                )
            )
            Spacer(modifier = Modifier.padding(15.dp))

            Image(
                painter = painterResource(id = R.drawable.max_foto),
                contentDescription = "Logo PetMatch",
                modifier = Modifier.size(210.dp, 100.dp),
                contentScale = ContentScale.Fit
            )

            // Botón Max
            Button(
                onClick = { /* Acción para el botón grande */ },
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .height(80.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = "Max", fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Bold)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "2 años | labrador", fontSize = 16.sp, color = Color.Gray, fontWeight = FontWeight.Normal)
                            TextButton(onClick = { /* TODO */ }) {
                                Text(text = "Bruno's Home", fontSize = 16.sp, color = Color.Gray, fontWeight = FontWeight.Normal)
                            }
                        }
                    }
                }
            }

            Image(
                painter = painterResource(id = R.drawable.rocky_foto),
                contentDescription = "Logo PetMatch",
                modifier = Modifier.size(250.dp, 110.dp),
                contentScale = ContentScale.Fit
            )

            // Botón Rocky
            Button(
                onClick = { /* Acción para el botón grande */ },
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .height(80.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = "Rocky", fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Bold)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "1 año | criollo", fontSize = 16.sp, color = Color.Gray, fontWeight = FontWeight.Normal)
                            TextButton(onClick = { /* TODO */ }) {
                                Text(text = "Bruno's Home", fontSize = 16.sp, color = Color.Gray, fontWeight = FontWeight.Normal)
                            }
                        }
                    }
                }
            }

            Image(
                painter = painterResource(id = R.drawable.samuel_foto),
                contentDescription = "Logo PetMatch",
                modifier = Modifier.size(210.dp, 110.dp),
                contentScale = ContentScale.Fit
            )

            // Botón Samuel
            Button(
                onClick = { /* Acción para el botón grande */ },
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .height(80.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = "Samuel", fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Bold)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "4 años | pug", fontSize = 16.sp, color = Color.Gray, fontWeight = FontWeight.Normal)
                            TextButton(onClick = { /* TODO */ }) {
                                Text(text = "Patitas", fontSize = 16.sp, color = Color.Gray, fontWeight = FontWeight.Normal)
                            }
                        }
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Botón Inicio
            TextButton(
                onClick = { /* TODO: Navegar a la pantalla de Inicio */ }
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Inicio",
                        tint = Color.Gray
                    )
                    Text(
                        text = "Inicio",
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                }
            }

            // Botón Fundaciones
            TextButton(
                onClick = { /* TODO: Navegar a la pantalla de Fundaciones */ }
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Fundaciones",
                        tint = Color.Red
                    )
                    Text(
                        text = "Fundaciones",
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                }
            }

            // Botón Perfil
            TextButton(
                onClick = { /* TODO: Navegar a la pantalla de Perfil */ }
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Perfil",
                        tint = Color.Gray
                    )
                    Text(
                        text = "Perfil",
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}


