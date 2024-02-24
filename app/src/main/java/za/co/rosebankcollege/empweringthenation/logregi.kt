package za.co.rosebankcollege.empoweringthenation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import za.co.rosebankcollege.empweringthenation.R

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun WelcomePage(
    modifier: Modifier = Modifier,
    navController: NavController

) {
    val image = painterResource(R.drawable.logo)
    val image1 = painterResource(R.drawable.logreg)
    val fontFamily = FontFamily(
        Font(R.font.inriaserif_regular, FontWeight.Normal)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        // Logo and App Name
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            // Your logo image and app name Text composable go here
            Row(  modifier = Modifier.padding(top = 30.dp),) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                )
                Text(
                    text = "Empowering The Nation",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(top = 23.dp),
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Illustration Image
        Image(
            painter = image1,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Buttons
        Button(
            onClick = {
                      navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.Login.route )
                // Navigate to the login page
            },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .fillMaxWidth()
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

        Button(
            onClick = {
                navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.Signup.route)
                // Navigate to the registration page
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Register",
                style = TextStyle(fontSize = 25.sp),
                fontWeight = FontWeight.Bold,
                color = Color.Black // Set the text color to black
            )
        }

    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
@Preview(showBackground = true)
fun WelcomePagePreview() {
    WelcomePage(
        navController = rememberNavController()
    )
}
