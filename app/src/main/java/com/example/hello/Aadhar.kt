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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Aadhar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    var aadNo by remember { mutableStateOf("") }
    val context = LocalContext.current
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
                    .offset(y = -40.dp)
            )
            Box(
                contentAlignment = Alignment.TopEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.aadahr),
                    contentDescription = "Image Description",
                    modifier = Modifier
                        .size(300.dp)
                        .offset(y = -50.dp)
                )
            }
            Text(
                "Enter Your Aadhar Number ",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Black,
                ),
                modifier = modifier

            )


            Spacer(
                modifier = Modifier.weight(1f)
                    .offset(y = -400.dp)
            )

            // Modified structure of Button and OutlinedTextField
            Column {
                OutlinedTextField(
                    value = aadNo,
                    onValueChange = { aadNo = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Enter Aadhar Number",  color = Color(0xFFBEC2C2))
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /* TODO */ },
                    shape = MaterialTheme.shapes.large,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF7C7D7D)
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Send OTP",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight(500),
                            color = Color.Black
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun AadharPreview() {
    Aadhar(navController = rememberNavController())
}
