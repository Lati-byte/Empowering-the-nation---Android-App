package za.co.rosebankcollege.empweringthenation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import za.co.rosebankcollege.empweringthenation.ui.theme.EmpweringTheNationTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    @OptIn(ExperimentalPagerApi::class)
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmpweringTheNationTheme {
                navController= rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}
