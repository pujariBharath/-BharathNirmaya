package com.example.hello

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun homescreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )

        // Content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.niramaya_logo_black),
                contentDescription = null,

                modifier = Modifier
                    .size(180.dp)
                    .width(300.10.dp)
                    .height(47.7.dp)
                    .offset(x = 0.dp, y = -40.dp)
            )
            Text(
                "Hello Welcome",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color.Black
                ),
                modifier = modifier
                    .offset(y = -50.dp)
            )
            Box(
                contentAlignment = Alignment.TopEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.loginapp),
                    contentDescription = "Image Description",
                    modifier = Modifier
                        .size(250.dp)
                        .offset(y = -50.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                "______________________",
                modifier = modifier
                    .offset(x = 120.dp, y = -55.dp)
            )
            Text(
                "______________________",
                modifier = modifier
                    .offset(x = -120.dp, y = -73.dp)
            )

            Text(
                "Login or Signup",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = modifier
                    .offset(y = -85.dp)
            )

            // Phone Number Text Field
            PhoneNumberTextField()

            Spacer(modifier = Modifier.weight(1f)
                .offset(x=0.dp,y=-400.dp) )
            Button(onClick = {/*TODO*/ },
                shape = MaterialTheme.shapes.large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF7C7D7D)
                ),
                modifier = Modifier.fillMaxWidth().height(40.dp).offset(0.dp,-15.dp)
            ){
                Text(text = "Continue",

                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color.Black,

                        )
                )



            }


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneNumberTextField() {
    var phoneNumber by remember { mutableStateOf("") }

    OutlinedTextField(
        value = phoneNumber,
        onValueChange = { phoneNumber = it },
        label = { Text("Enter Phone Number") },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(56.dp)
            .offset(x=0.dp,y=-50.dp),
    )
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun HomeScreenPreview() {
    homescreen(rememberNavController())
}
