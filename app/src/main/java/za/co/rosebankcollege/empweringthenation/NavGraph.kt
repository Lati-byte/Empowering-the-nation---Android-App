package za.co.rosebankcollege.empweringthenation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import za.co.rosebankcollege.empoweringthenation.WelcomePage
import za.co.rosebankcollege.empweringthenation.ui.theme.LoginPage

@OptIn(ExperimentalPagerApi::class)
@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController =navController ,
        startDestination = Screen.Welc.route
    ){
        composable(
            route = Screen.Welc.route
        ){
            WelcomePage( navController = navController)
        }
        composable(
            route = Screen.Login.route
        ){
            Login(navController = navController)
        }
        composable(
            route = Screen.Signup.route
        ){
            SignupPage(navController = navController)
        }
        composable(
            route = Screen.Onboarding.route
        ){
            PreviewFunction()
        }
        composable(
            route = Screen.home.route
        ){
            HomePage(navController = navController)
        }
        composable(
            route = Screen.course.route
        ){
            CoursePage(navController = navController)
        }
        composable(
            route = Screen.first.route
        ){
            firstPage(navController = navController)
        }
        composable(
            route = Screen.land.route
        ){
            landPage(navController = navController)
        }
        composable(
            route = Screen.life.route
        ){
            lifePage(navController = navController)
        }
        composable(
            route = Screen.sew.route
        ){
            sewPage(navController = navController)
        }
        composable(
            route = Screen.gard.route
        ){
            gardPage(navController = navController)
        }
        composable(
            route = Screen.cook.route
        ){
            cookPage(navController = navController)
        }
        composable(
            route = Screen.child.route
        ){
            childPage(navController = navController)
        }
        composable(
            route = Screen.contact.route
        ){
            contactPage(navController = navController)
        }
        composable(
            route = Screen.bot.route
        ){
            botPage(navController = navController)
        }
        composable(
            route = Screen.fee.route
        ){
            FeeCalc(navController = navController)
        }
        composable(
            route = Screen.Onboarding.route
        ){
            OnBoarding(navController = navController)
        }

    }
}