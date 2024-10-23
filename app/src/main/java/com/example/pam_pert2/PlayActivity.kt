package com.example.pam_pert2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        HeaderSection()
        Text("Kepada Yth,",
            modifier = Modifier.padding(16.dp))
        Text("Rizki Ramadan",
            modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.size(40.dp))
        DetailSurat(
            judul = "Nama",
            Isi = "Rizki Ramadan"
        )
        DetailSurat(
            judul = "Email",
            Isi = "rizkiramadan@gmail.com"
        )
        DetailSurat(
            judul = "Alamat",
            Isi = "jogja"
        )
        DetailSurat(
            judul = "Ket",
            Isi = "Manajer cabang"
        )
    }
}


@Composable
fun HeaderSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)
        .padding(15.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text("DAERAH ISTIMEWA YOGYAKARTA",
                    color = Color.White
                )
                Text("FAX : 021-12121212, telp : 0812-0000-0000",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(R.drawable.logo_kesultanan),
                    contentDescription = "",
                    modifier = Modifier
                        .size(70.dp)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = "")
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String,
    Isi : String,
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp)
        ){
            Text(judul,
                modifier = Modifier.weight(0.8f))
            Text(":",
                modifier = Modifier.weight(0.1f))
            Text(Isi,
                modifier = Modifier.weight(2f))
        }
    }
}

