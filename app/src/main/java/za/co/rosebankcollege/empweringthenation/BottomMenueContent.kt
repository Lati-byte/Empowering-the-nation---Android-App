package za.co.rosebankcollege.empweringthenation

import androidx.annotation.DrawableRes

data class BottomMenueContent(
    val title: String,
    @DrawableRes val iconId: Int,
    val route: String
)
