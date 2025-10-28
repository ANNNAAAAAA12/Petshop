package edu.co.ana.ramos.luis.bohorquez.petshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
@Preview
@Composable
fun RegistroUsarioScreen() {
    var nombre by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var contraseña by remember { mutableStateOf("") }

    var confirmarcontraseña by remember { mutableStateOf("") }


    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // foto superior
        Image(
            painter = painterResource(id = R.drawable.personita_logo),
            contentDescription = "Logo PetMatch",
            modifier = Modifier.size(170.dp),
            alignment = Alignment.TopStart,
            contentScale = ContentScale.Fit
        )


        // ... (después de la imagen)

        OutlinedTextField(
            value = "REGISTRO",
            onValueChange = {},
            shape = RoundedCornerShape(50.dp),
            enabled = false,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),

            textStyle = androidx.compose.ui.text.TextStyle(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
                fontSize = 18.sp
            ),

            colors = OutlinedTextFieldDefaults.colors(
                disabledTextColor = Color.Black,
                disabledContainerColor = Color(0xFFEDAE82),
                disabledBorderColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.padding(20.dp))

        //primertextfield

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            label = { Text("Nombre") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountBox,
                    contentDescription = "Icono de Nombre",
                    tint = Color.Gray
                )
            },
            singleLine = true,
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

        Spacer(modifier = Modifier.padding(20.dp))
//segudno

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            label = { Text("Email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Icono de Nombre",
                    tint = Color.Gray
                )
            },
            singleLine = true,
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

        Spacer(modifier = Modifier.padding(20.dp))
        OutlinedTextField(
            value = contraseña,
            onValueChange = { contraseña = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            label = { Text("Contraseña") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Icono de Nombre",
                    tint = Color.Gray
                )
            },
            singleLine = true,
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

        Spacer(modifier = Modifier.padding(20.dp))
        OutlinedTextField(
            value = confirmarcontraseña,
            onValueChange = { confirmarcontraseña = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            label = { Text("Confirmar contraseña") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Icono de Nombre",
                    tint = Color.Gray
                )
            },
            singleLine = true,
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

        Spacer(modifier = Modifier.padding(20.dp))

        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(280.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color((0xFFCBD8D1)))

        ) {

            Text(
                text = "Registrarse",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Light
            )
        }

    }
}