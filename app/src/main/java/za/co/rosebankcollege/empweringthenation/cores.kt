package za.co.rosebankcollege.empweringthenation

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoursePage(navController: NavController) {
    val image = painterResource(R.drawable.logo)
    val fontFamily = FontFamily(Font(R.font.inriaserif_regular, FontWeight.Normal))
    val icon1 = painterResource(R.drawable.cart)
    val icon2 = painterResource(R.drawable.desc)
    val img1 = painterResource(R.drawable.first)
    val img2 = painterResource(R.drawable.land)
    val img3 = painterResource(R.drawable.life)
    val img4 = painterResource(R.drawable.sew)
    val img5 = painterResource(R.drawable.gard)
    val img67 = painterResource(R.drawable.cook2)
    val img7 = painterResource(R.drawable.child)


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
                    modifier = Modifier.size(60.dp)
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
                        text = "Courses",
                        textAlign = TextAlign.Start,
                        style = TextStyle(color = Color.Black, fontSize = 30.sp)
                    )


                    Spacer(modifier = Modifier.width(16.dp))

                    // Welcome message

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
                    text = "Six-month courses",
                    textAlign = TextAlign.Center,
                    style = TextStyle(color = Color.Black, fontSize = 30.sp)
                )
                Row(

                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)

                    ) {
                        // First Image
                        Image(
                            painter = img1,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .height(200.dp)
                                .clip(RoundedCornerShape(55.dp))
                        )
                        // First Text
                        Text(
                            text = "First Aid\nTaught by Thabo Molefe\nFees: R1500",
                            fontSize = 18.sp
                        )
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

                            }

                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.first.route)
                                    // Description action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),

                                ) {
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)

                    ) {
                        // Second Image
                        Image(
                            painter = img2,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .height(200.dp)
                                .clip(RoundedCornerShape(55.dp)) // Adjust the corner radius as needed
                        )

                        // Second Text
                        Text(
                            text = "Landscaping\nTaught by Sipho Dlamini\nFees: R1500",
                            fontSize = 18.sp
                        )
                        //Buttons
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

                            }

                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.land.route)
                                    // Description action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),

                                ) {
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }
                        }
                    }
                }
                Row(

                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    ) {
                        // First Image
                        Image(
                            painter = img3,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(55.dp))
                        )
                        // First Text
                        Text(
                            text = "Life skills\nTaught by Bongani Khumalo\nFees: R1500",
                            fontSize = 18.sp
                        )
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

                            }

                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.life.route)
                                    // Description action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),

                                ) {
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)

                    ) {
                        // Sewing
                        Image(
                            painter = img4,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(55.dp)) // Adjust the corner radius as needed
                        )

                        // Second Text
                        Text(
                            text = "Sewing\nTaught by Tsegofatso Mpe\nFees: R1500",
                            fontSize = 18.sp
                        )
                        //Buttons
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

                            }

                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.sew.route)
                                    // Description action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),

                                ) {
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }

                        }

                    }
                }
                Divider(color = Color.Black, thickness = 1.dp)
                Text(
                    text = "Six-week short courses",
                    textAlign = TextAlign.Center,
                    style = TextStyle(color = Color.Black, fontSize = 30.sp)
                )
                Row(

                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    ) {
                        // First Image
                        Image(
                            painter = img5,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(55.dp))
                        )
                        // First Text
                        Text(
                            text = "Garden maintenance\nTaught by Nomvula Ndlovu\nFees: R750",
                            fontSize = 18.sp
                        )
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

                            }

                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.gard.route)
                                    // Description action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),

                                ) {
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)

                    ) {
                        // Cooking
                        Image(
                            painter = img67,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(55.dp)) // Adjust the corner radius as needed
                        )

                        // Second Text
                        Text(
                            text = "Cooking\nTaught by Nomsa Ngubeni\nFees: R750",
                            fontSize = 18.sp
                        )
                        //Buttons
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.bot.route)
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

                            }

                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.cook.route)
                                    // Description action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),

                                ) {
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }

                        }

                    }
                }
                Row(

                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    ) {
                        // child rearing
                        Image(
                            painter = img7,
                            contentDescription = null,
                            modifier = Modifier
                                .size(250.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(55.dp))
                        )
                        // First Text
                        Text(
                            text = "Child Minding\nTaught by Lerato Mabaso\nFees: R750",
                            fontSize = 18.sp
                        )
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(
                                onClick = {
                                    navController.navigate(route = za.co.rosebankcollege.empweringthenation.Screen.contact.route)
                                    // Add to cart action
                                },
                                colors = ButtonDefaults.buttonColors(Color.Green),
                                modifier = Modifier
                                    .height(70.dp)
                                    .padding(8.dp),
                            ) {
                                Image(
                                    painter = icon1,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Add to cart label
                                Text(
                                    text = "Add to Cart",
                                    style = TextStyle(color = Color.Black)
                                )

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
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(
                                    text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
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
                                Image(
                                    painter = icon2,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                )
                                // Description label
                                Text(
                                    text = "Description",
                                    style = TextStyle(color = Color.Black)
                                )
                            }
                        }
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



@Composable
@Preview(showBackground = true)
fun CoursePagePreview() {
    CoursePage(navController = rememberNavController())
}