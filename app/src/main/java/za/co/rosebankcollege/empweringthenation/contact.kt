package za.co.rosebankcollege.empweringthenation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

@Composable
fun contactPage(navController: NavController) {
    val img1 = painterResource(R.drawable.contact)
    val image = painterResource(R.drawable.logo)
    val fontFamily = FontFamily(Font(R.font.inriaserif_regular, FontWeight.Normal))
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Header content, including logo, company name, and menu button
        Column() {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Back Button
                IconButton(
                    onClick = { navController.navigateUp() }, // Handle back button click
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }

                // Logo (You can replace with your logo image)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(70.dp),
                )

                // Company Name
                Text(
                    text = "Empowering The Nation",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.weight(1f)
                )

                // Menu Button
                IconButton(
                    onClick = { /* Handle menu button click */ },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                }

            }
            Column( modifier = Modifier
                .fillMaxWidth()
                // Set the background color for the body
                .verticalScroll(rememberScrollState()) // Add vertical scrolling if needed
                ,
                verticalArrangement = Arrangement.spacedBy(16.dp)) {


                Text(
                    text = "Contact Us",
                    textAlign = TextAlign.Center,
                    style = TextStyle(color = Color.Black, fontSize = 30.sp,
                        fontWeight = FontWeight.Bold)
                )
                Image(
                    painter = img1,
                    contentDescription = null,
                    modifier = Modifier
                        .size(700.dp)
                        .clip(RoundedCornerShape(55.dp))
                )

                Column {

                    Text(
                        "Phone Numbers:\n" +
                                "-011 123 4567\n" +
                                "-021 789 1234\n" +
                                "-015 785 1243\n" +
                                "Email:\n" +
                                "info@empoweringthenation.co.za\n" +
                                "Addresses:\n" +
                                "Empowering the nation\n" +
                                "123 Main street\n" +
                                "Sandton, Johannesburg\n" +
                                "Gauteng, South Africa\n" +
                                "\n" +
                                "Empowering the nation\n" +
                                "645 Mountain view Road\n" +
                                "Constantia, Cape town\n" +
                                "Western Cape, South Africa\n" +
                                "\n" +
                                "Empowering the nation\n" +
                                "101 Baobab street\n" +
                                "Polokwane\n" +
                                "Limpopo\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n ",
                        style = TextStyle(fontSize = 30.sp)
                    )

                }
            }

        }
        BottomMenu(
            items = listOf(
                BottomMenueContent("Home", R.drawable.home,"Home_screen"),
                BottomMenueContent("Courses", R.drawable.courses,"Course_screen"),
                BottomMenueContent("Ai Tutor", R.drawable.chatbot,"bot_screen"),
                BottomMenueContent("Contact", R.drawable.cont,"contact_screen"),
            ),modifier = Modifier.align(Alignment.BottomCenter),navController = navController)
    }
}


@Composable
@Preview(showBackground = true)
fun contactPagePreview() {
    contactPage(navController = rememberNavController())
}