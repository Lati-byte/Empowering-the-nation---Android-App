package za.co.rosebankcollege.empweringthenation
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun  FeeCalc(navController: NavController) {
    val image = painterResource(R.drawable.logo)
    val fontFamily = FontFamily(Font(R.font.inriaserif_regular, FontWeight.Normal))
    // A list of courses and their fees
    val courses = listOf(
        "First Aid" to 1500,
        "Sewing" to 1500,
        "Landscaping" to 1500,
        "Life Skills" to 1500,
        "Child minding" to 750,
        "Cooking" to 750,
        "Garden maintenance" to 750
    )

    // A state to store the customer's name
    var name by remember { mutableStateOf(TextFieldValue()) }

    // A state to store the customer's phone number
    var phone by remember { mutableStateOf(TextFieldValue()) }

    // A state to store the customer's email address
    var email by remember { mutableStateOf(TextFieldValue()) }

    // A state to store the customer's course selection
    var selection by remember { mutableStateOf(courses.map { false }) }

    // A state to store the total fee
    var total by remember { mutableStateOf(0.0) }
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
                androidx.compose.material3.IconButton(
                    onClick = { navController.navigateUp() }, // Handle back button click
                    modifier = Modifier.size(48.dp)
                ) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }

                // Logo (You can replace with your logo image)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(70.dp),
                )

                // Company Name
                androidx.compose.material3.Text(
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
                androidx.compose.material3.IconButton(
                    onClick = { /* Handle menu button click */ },
                    modifier = Modifier.size(48.dp)
                ) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }

            }
            // A function to calculate the total fee based on the selection and the discounts
            fun calculateTotal() {
                // The number of courses selected
                val count = selection.count { it }

                // The subtotal of the fees without discount
                val subtotal = selection.zip(courses) { selected, course ->
                    if (selected) course.second else 0
                }.sum()

                // The discount rate based on the number of courses
                val discountRate = when (count) {
                    0 -> 0.0
                    1 -> 0.0
                    2 -> 0.05
                    3 -> 0.1
                    else -> 0.15
                }

                // The discount amount
                val discount = subtotal * discountRate

                // The VAT rate
                val vatRate = 0.15

                // The VAT amount
                val vat = (subtotal - discount) * vatRate

                // The total fee
                total = subtotal - discount + vat
            }

            // A scrollable column to display the form and the calculator
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                androidx.compose.material3.Text(
                    text = "Fee Calculator",
                    textAlign = TextAlign.Start,
                    style = TextStyle(color = Color.Black, fontSize = 30.sp)
                )
                // A text field for the customer's name
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                // A text field for the customer's phone number
                OutlinedTextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text("Phone Number") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                // A text field for the customer's email address
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email Address") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                // A text for the course list
                Text("Courses Available", style = MaterialTheme.typography.h6)

                Spacer(modifier = Modifier.height(8.dp))

                // A column to display the courses and their fees as checkboxes
                Column {
                    courses.forEachIndexed { index, course ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = selection[index],
                                    onClick = {
                                        selection = selection.toMutableList().apply {
                                            set(index, !this[index])
                                        }
                                    }
                                )
                                .padding(horizontal = 16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = selection[index],
                                onCheckedChange = null // null recommended for accessibility with screenreaders
                            )
                            Spacer(Modifier.width(16.dp))
                            Text("${course.first} - R${course.second}",
                                fontSize = 25.sp)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                androidx.compose.material3.Button(
                    onClick = {
                        calculateTotal()
                        // Handle click action
                    },
                    colors = ButtonDefaults.buttonColors(Color.Cyan),
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Calculate",
                        color = Color.Black,
                        style = TextStyle(fontSize = 25.sp),
                    )
                }
                // A button to calculate the total fee

                Spacer(modifier = Modifier.height(16.dp))

                // A text to display the total fee
                Text("Total Fee: R${"%.2f".format(total)}", style = MaterialTheme.typography.h5)
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun feePagePreview() {
    FeeCalc(navController = rememberNavController())
}