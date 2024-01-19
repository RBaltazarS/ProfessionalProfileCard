package com.example.professionalbusinesscard.view
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.professionalbusinesscard.R
import com.example.professionalbusinesscard.ui.theme.ColorHome


@Composable
fun Home(navController: NavController) {

    Column(
        Modifier.padding(16.dp)
    ) {
        Text(
            modifier = Modifier
                .padding(top = 64.dp)
                .fillMaxWidth(),
            text = "Bem Vindo",
            style = MaterialTheme.typography.titleLarge.
            merge(
                fontSize = 32.sp,
                color = Color(34, 112, 147)
            ),
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            text = "Welcome",
            style = MaterialTheme.typography.titleLarge
                .merge(
                    fontSize = 32.sp,
                    color = Color(34, 112, 147)
                ),
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ExtendedFloatingActionButton(
                containerColor = ColorHome,
                onClick = {navController.navigate("BrazilProfile")},
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(text = "Brazil", color = Color.White, fontSize = 16.sp)
            }

            ExtendedFloatingActionButton(
                containerColor = ColorHome,
                onClick = {navController.navigate("AmericanProfile")},
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(text = "American", color = Color.White, fontSize = 16.sp)
            }
        }
    }
    Image(
        painter = painterResource(id = R.drawable.appdevelopment),
        contentDescription = "Img Home App",
        modifier = Modifier
            .padding(top = 128.dp)
    )
}


//PREVIEW SCREEN
@Preview
@Composable
fun PreviewHome() {
    val navController = rememberNavController()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Home(navController)
    }
}

