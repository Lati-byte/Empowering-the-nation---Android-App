package za.co.rosebankcollege.empweringthenation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupPage(navController: NavController) {
    val image = painterResource(R.drawable.regi)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
        ) {
            // Back Button
            IconButton(
                onClick = {
                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.Welc.route)
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.back), // Replace with your back icon
                    contentDescription = "Back"
                )
            }


            Text(
                text = "Create Account",
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold),
                color = Color(0xFF009688),
                modifier = Modifier
                     // Adjust the weight to determine the width of the Text
                    .padding(start = 30.dp) // Add padding to move the text more to the right
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

        Spacer(modifier = Modifier.height(16.dp))

        // Name Text Field
        OutlinedTextField(
            value = "", // You can provide initial values if needed
            onValueChange = { /* Handle name input */ },
            label = { Text("Name") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Email Text Field
        OutlinedTextField(
            value = "",
            onValueChange = { /* Handle email input */ },
            label = { Text("Email") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Password Text Field
        OutlinedTextField(
            value = "",
            onValueChange = { /* Handle password input */ },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Sign Up Button
        Button(
            onClick = {
                // Handle sign-up logic
                navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.Onboarding.route)
            },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .padding(horizontal = 30.dp)
        ) {
            Text(text = "Sign Up" ,
                style = TextStyle(fontSize = 25.sp),
                fontWeight = FontWeight.Bold,
                color = Color.Black )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun sigPagePreview() {
    SignupPage(navController = rememberNavController())
}
