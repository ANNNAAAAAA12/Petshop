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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign


@Preview
@Composable
fun PerfilMascotaScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Encabezado con logo y título
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_pata),
                contentDescription = "Logo PetMatch",
                modifier = Modifier.size(70.dp),
                alignment = Alignment.TopStart,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "PetMatch",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5C5470),
                modifier = Modifier.padding(start = 8.dp)
            )
            Spacer(modifier = Modifier.width(150.dp))
                Icon(imageVector = Icons.Default.MoreVert,
                    contentDescription = "Icono de más opciones",
                    tint = Color.Black)

        }

        Spacer(modifier = Modifier.height(10.dp))

        // Imagen del perro
        Image(
            painter = painterResource(id = R.drawable.max_foto),
            contentDescription = "Max",
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(180.dp)
                .clip(RoundedCornerShape(15.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Max",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2E2C2F)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Max es un adorable Labrador de 2 años, lleno de energía y amor para dar.\n" +
                    "Es un perrito muy juguetón, alegre y cariñoso, perfecto para familias o personas que disfruten pasar tiempo al aire libre. " +
                    "Le encanta correr, jugar con pelotas y recibir cariño.\n\n" +
                    "Es amigable con otros perros y personas, se adapta fácilmente y disfruta la compañía humana.",
            fontSize = 15.sp,
            color = Color(0xFF3E3E3E),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 25.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /* TODO */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCBD8D1)),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(55.dp)
        ) {
            Text(
                text = "Adoptar",
                fontSize = 20.sp,
                color = Color(0xFF2E2C2F),
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /* TODO */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5ECDD)),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp)
        ) {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "Icono de calendario",
                tint = Color(0xFF2E2C2F)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Solicitar visita",
                color = Color(0xFF2E2C2F),
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(75.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Home, contentDescription = "Inicio", tint = Color.Black)
                Text("Inicio", fontSize = 12.sp, color = Color.Black, fontWeight = FontWeight.Bold)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Favorite, contentDescription = "Fundaciones", tint = Color.Red)
                Text("Fundaciones", fontSize = 12.sp, color = Color.Black, fontWeight = FontWeight.Bold)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.AccountCircle, contentDescription = "Perfil", tint = Color.Black)
                Text("Perfil", fontSize = 12.sp, color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}

