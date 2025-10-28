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
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun LoginUsuarioScreen() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // foto superior
        Image(
            painter = painterResource(id = R.drawable.logo_pata),
            contentDescription = "Logo PetMatch",
            modifier = Modifier.size(170.dp),
            alignment = Alignment.TopStart,
            contentScale = ContentScale.Fit
        )


        //textos
        Text(
            text = "PetMatch",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Text(
            text = "Encuentra tu compañero ideal",
            fontSize = 16.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(66.dp))
        //boton 1

        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(260.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5ECDD))

        ) {


            Text(
                text = "Correo electrónico",
                fontSize = 21.sp,
                color = Color.Black,
                fontWeight = FontWeight.Light
            )
        }

        Spacer(modifier = Modifier.padding(20.dp))
        //Boton2

        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(260.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color((0xFFF5ECDD)))

        ) {


            Text(
                text = "Contraseña",
                fontSize = 21.sp,
                color = Color.Black,
                fontWeight = FontWeight.Light
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        //Boton3

        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(260.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color((0xFFCBD8D1)))

        ) {

            Text(
                text = "Iniciar sesión",
                fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }

        //boton debajo
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(260.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {

            Text(
                text = "¿ Olvidaste tu contraseña ? ",
                fontSize = 16.sp,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        //botonultimo
        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(260.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {

            Text(
                text = "   REGISTRATE  ",
                fontSize = 22.sp,
                color = Color.Black

            )
        }

    }
}