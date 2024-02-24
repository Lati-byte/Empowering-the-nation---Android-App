package za.co.rosebankcollege.empweringthenation

sealed class Screen(val route:String){
    object Welc: Screen(route="Welc_screen")
    object Login: Screen(route="Login_screen")
    object Signup: Screen(route="Signup_screen")
    object home: Screen(route="Home_screen")
    object course: Screen(route = "Course_screen")
    object first: Screen(route = "first_screen")
    object land: Screen(route = "land_screen")
    object life: Screen(route = "life_screen")
    object sew: Screen(route = "sew_screen")
    object gard: Screen(route = "gard_screen")
    object cook: Screen(route = "cook_screen")
    object child: Screen(route = "child_screen")
    object contact: Screen(route = "contact_screen")
    object bot: Screen(route = "bot_screen")
    object fee: Screen(route = "fee_screen")
    object Onboarding: Screen(route="OnBoarding_screen")
}
