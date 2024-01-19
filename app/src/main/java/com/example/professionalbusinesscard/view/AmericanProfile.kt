package com.example.professionalbusinesscard.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professionalbusinesscard.R
import com.example.professionalbusinesscard.ui.theme.ColorHome
import com.example.professionalbusinesscard.ui.theme.ColorHomeLight

@Composable
fun AmericanProfile(){
    Column(
        Modifier.background(color = ColorHomeLight)
    ) {
        Card(
            shape = RoundedCornerShape(
                topStart = 0.dp, topEnd = 0.dp, bottomStart = 16.dp, bottomEnd = 16.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = ColorHome,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(225.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Rodolpho Baltazar",
                    modifier = Modifier.padding(4.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    color = Color.White
                )
                Image(
                    painter = painterResource(id = R.drawable.baltazar),
                    contentDescription = "Imagem de Perfil",
                    modifier = Modifier
                        .size(125.dp)
                        .clip(CircleShape)
                )
            }
        }
        Column {
            Text(
                text = "Frontend & Mobile Developer, specialized in technologies such as Javascript, TypeScript, ReactJS, NextJS, Kotlin, and ReactNative. Creating high-level WEB/MOBILE applications, standing out for agility, consistency, and commitment. Focus on continuous learning to ensure innovative and quality solutions.",
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Center,
                fontSize = 19.sp,
                style = MaterialTheme.typography.titleLarge.merge(
                    color = Color(255, 255, 255)
                )
            )
        }
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "JavaScrip", color = Color.White , fontSize = 19.sp)
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(50)),
                progress = 0.5f,
                color = ColorHome,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "NextJS", color = Color.White , fontSize = 19.sp)
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(50)),
                progress = 0.8f,
                color = ColorHome
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "ReactJs", color = Color.White , fontSize = 19.sp)
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(50)),
                progress = 0.6f,
                color = ColorHome
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "React Native", color = Color.White , fontSize = 19.sp)
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(50)),
                progress = 0.8f,
                color = ColorHome
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Kotlin", color = Color.White, fontSize = 19.sp)
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(50)),
                progress = 0.7f,
                color = ColorHome
            )

            Spacer(modifier = Modifier.height(10.dp))

        }

    }
}


//PREVIEW SCREEN
@Preview
@Composable
fun PreviewAmericanProfile(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        AmericanProfile()
    }
}