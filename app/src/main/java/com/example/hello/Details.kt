package com.example.hello

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Details(
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
            Image(
                painter = painterResource(R.drawable.img_2),
                contentDescription = "Image Description",
                modifier = Modifier
                    .size(125.dp)
                    .offset(y = -100.dp)
            )


            CTextField(hint  = "Name", value = "")
            CTextField(hint = "Phone Number", value = "")
            CTextField(hint  = "Gender", value = "")
            CTextField(hint  = "Birthday", value = "")

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

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun DetailsPreview() {
    Details(rememberNavController())
}