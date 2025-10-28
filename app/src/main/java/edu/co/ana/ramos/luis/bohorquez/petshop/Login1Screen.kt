package edu.co.ana.ramos.luis.bohorquez.petshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.materialIcon
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun Login1Screen() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // foto superior
        Image(
            painter = painterResource(id = R.drawable.logo_personas),
            contentDescription = "Logo PetMatch",
            modifier = Modifier.size(200.dp),
            alignment = Alignment.TopStart,
            contentScale = ContentScale.Fit
        )


        //texto2
        Text(modifier = Modifier.padding(24.dp, 1.dp),
            text = "¿ Cómo quieres ingresar a la app ?",
            fontSize = 26.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
Spacer(modifier = Modifier.size(66.dp))
        //boton 1

        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(190.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDFF6E0))

        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Login",
                tint = Color.Black
            )
//texto

            Text(
                text = "Usuario",
                fontSize = 16.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.padding(20.dp))
        //Boton2

        Button(onClick = { /* TODO: Acción de click aquí */ },

            modifier = Modifier
                .height(50.dp)
                .width(190.dp),
            shape = RoundedCornerShape(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color((0xFFEBDCFB)))

        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Login",
                tint = Color.Black
            )
//texto

            Text(
                text = "Usuario",
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}