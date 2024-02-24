package za.co.rosebankcollege.empweringthenation.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import za.co.rosebankcollege.empweringthenation.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import za.co.rosebankcollege.empweringthenation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(navController: NavController) {
    val image = painterResource(R.drawable.login)
    val image1 = painterResource(R.drawable.goog)
    val image2 = painterResource(R.drawable.face)
    var text by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // "Welcome Back" Text
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
        ) {
            // Back Button
            IconButton(
                onClick = {
                    navController.navigate(route = Screen.Welc.route)
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.back), // Replace with your back icon
                    contentDescription = "Back"
                )
            }
            Text(
                text = "Welcome Back",
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold),
                color = Color(0xFF009688),
            )
        }

            Spacer(modifier = Modifier.height(16.dp))

            // Illustration Image
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            // Email and Password TextInputs
            OutlinedTextField(
                value = text,
                onValueChange = { value ->
                    text = value
                },
                label = { Text(text = "Email",) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp) // Reduce padding to make it smaller
            )



            OutlinedTextField(
                value = pass,
                onValueChange = { value ->
                    pass = value
                },
                label = { Text(text = "Password",) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp) // Reduce padding to make it smaller
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Login Button
            Button(
                onClick = {
                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.home.route)
                    // Handle login logic
                },
                colors = ButtonDefaults.buttonColors(Color.Cyan),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Login",
                    style = TextStyle(fontSize = 25.sp), // Adjust the font size as needed
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Or Line
            Text(text = "OR", modifier = Modifier.padding(4.dp))

            Spacer(modifier = Modifier.height(16.dp))



            Spacer(modifier = Modifier.height(8.dp))


        }
    }





