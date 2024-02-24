package za.co.rosebankcollege.empweringthenation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.navigation.compose.rememberNavController
import za.co.rosebankcollege.empoweringthenation.WelcomePage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(navController: NavController) {
    val headerBackgroundColor = Color(0xFF00C8E3)
    val bodyBackgroundColor = Color.White // Set the background color for the body
    val fontFamily = FontFamily(Font(R.font.inriaserif_regular, FontWeight.Normal))
    val image = painterResource(R.drawable.etn_final_logo_2_0)
    val userProfileImage = painterResource(R.drawable.user)
    val img1 = painterResource(R.drawable.first)
    val img2 = painterResource(R.drawable.gard)


    // Background color for the header
    Box() {


        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            // Header content, including logo, company name, and menu button
            Column(modifier = Modifier
                .verticalScroll(rememberScrollState())) {


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

                // Divider (horizontal line under the header)


                // Welcome message, user profile icon, search bar, and text
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        // Set the background color for the body
                        // Add vertical scrolling if needed
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Welcome message and user profile icon
                    Divider(color = Color.Black, thickness = 1.dp)
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {
                        // User Profile Icon
                        Text(
                            text = "Hey Lati\nLet's start learning",
                            textAlign = TextAlign.Start,
                            style = TextStyle(color = Color.Black, fontSize = 18.sp)
                        )


                        Spacer(modifier = Modifier.width(16.dp))

                        // Welcome message
                        Image(
                            painter = userProfileImage,
                            contentDescription = null,
                            modifier = Modifier
                                .size(48.dp)
                                .clip(CircleShape)
                        )
                    }

                    // Search bar with search icon
                    OutlinedTextField(
                        value = "",
                        onValueChange = { /* Handle search input */ },
                        placeholder = { Text("Search") },
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Search, contentDescription = null)
                        },
                        modifier = Modifier.fillMaxWidth()
                    )

                    // Text below the search bar
                    Text(
                        text = "Pathways to Empowerment: Your Journey to Skills and Success",
                        textAlign = TextAlign.Center,
                        style = TextStyle(color = Color.Black, fontSize = 26.sp)
                    )
                    Row(

                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(8.dp)
                        ) {
                            // First aid
                            Image(
                                painter = img1,
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .size(250.dp)
                                    .clip(RoundedCornerShape(55.dp))
                            )
                            Spacer(modifier = Modifier.height(0.dp))
                            // First Text
                            Text(
                                text = "First Aid\nTaught by Thabo Molefe\nFees: R1500",
                                fontSize = 18.sp
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(8.dp)

                            ) {
                            // Gardening
                            Image(
                                painter = img2,
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .size(250.dp)
                                    .clip(RoundedCornerShape(55.dp)) // Adjust the corner radius as needed
                            )

                            // Second Text
                            Text(
                                text = "Garden maintanence\nTaught by Nomvula Ndlovu\nFees: R750",
                                fontSize = 18.sp
                            )
                        }
                    }

                    Button(
                        onClick = {
                            navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.course.route)
                            // Handle click action
                        },
                        colors = ButtonDefaults.buttonColors(Color.Cyan),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ) {
                        Text(
                            text = "See All Courses",
                            color = Color.Black,
                            style = TextStyle(fontSize = 25.sp),
                        )
                    }

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)

                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "Take advantage of our discount plan",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 30.sp,
                                    color = Color.Black
                                )
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            Text(
                                text = "- Two courses – 5% discount",
                                style = TextStyle(
                                    fontSize = 20.sp
                                )
                            )

                            Text(
                                text = "- Three courses – 10% discount",
                                style = TextStyle(
                                    fontSize = 20.sp
                                )
                            )

                            Text(
                                text = "- More than three courses – 15% discount",
                                style = TextStyle(
                                    fontSize = 20.sp
                                )
                            )
                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.fee.route)
                                    // Handle click action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                modifier = Modifier
                                    .padding(20.dp)
                            ) {
                                Text(
                                    text = "Fee Calculator",
                                    color = Color.Black,
                                    style = TextStyle(fontSize = 25.sp),
                                )
                            }
                            Spacer(modifier = Modifier.width(100.dp))
                        }

                    }
                    Button(
                        onClick = {
                            navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.child.route)
                            // Description action
                        },
                        colors = ButtonDefaults.buttonColors(Color.Green),
                        modifier = Modifier
                            .height(70.dp)
                            .padding(8.dp),

                        ) {

                        // Description label
                        Text(
                            text = "Description",
                            style = TextStyle(color = Color.Black)
                        )
                    }


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
//modifier = Modifier.align(Alignment.BottomCenter),

@Composable
fun BottomMenu(
    items: List<BottomMenueContent>,
    modifier: Modifier = Modifier,
    activeHighlightColor:Color = Color.Cyan,
    activeTextColor:Color = Color.Black,
    inactiveTextColor:Color= Color.Black,
    initialSelectedItemIndex: Int = 0,
    navController: NavController // Add navController as a parameter
){
    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(15.dp)
    ) {
        items.forEachIndexed { index, item ->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = activeHighlightColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                navController.navigate(item.route)
            }
        }
    }
}

@Composable
fun BottomMenuItem(
    item: BottomMenueContent,
    isSelected: Boolean = true,
    activeHighlightColor:Color = Color.White,
    activeTextColor:Color = Color.Black,
    inactiveTextColor:Color= Color.Black,
    onItemClick: () -> Unit,
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(Color.White)

        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(40.dp)
            )
        }
        Text(
            text = item.title,
            color = if(isSelected) activeTextColor else inactiveTextColor
        )
    }  
}


    @Composable
@Preview(showBackground = true)
fun WelcomePagePreview() {
        HomePage(navController = rememberNavController())
}
