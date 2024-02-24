package za.co.rosebankcollege.empweringthenation


class OnBoardingItems(
    val image: Int,
    val title: Int,
    val desc: Int
) {
    companion object {
        fun getData(): List<OnBoardingItems> {
            return listOf(
                OnBoardingItems(R.drawable.intro1, R.string.welcome_title, R.string.welcome_description),
                OnBoardingItems(R.drawable.intro, R.string.ceo_message_title, R.string.ceo_message_description),
                OnBoardingItems(R.drawable.intro2, R.string.chatbot_title, R.string.chatbot_description),
                OnBoardingItems(R.drawable.intro3, R.string.discount_title, R.string.discount_description)
            )
        }
    }
}
// {
    //companion object{
        //fun getData(): List<OnBoardingItems>{
           // return listOf(
                //OnBoardingItems(R.drawable.intro1, "Welcome To Empowering The Nation!", "Join us in our mission to empower individuals through education and skills training."),
                //OnBoardingItems(R.drawable.intro, "A Personal Message from Our CEO", "Hello there! I'm Precious Radebe, and I want to personally welcome you to Empowering the Nation. It's a pleasure to have you on board. As you embark on this journey of learning and growth, remember that your potential knows no limits"),
                //OnBoardingItems(R.drawable.intro2, "Say hello to your new learning companion - our AI Chatbot Tutor!", "Key Features:\n" +
                       // "\"Available 24/7 to answer your questions.\"\n" +
                       // "\"Provides instant guidance and support.\"\n" +
                       // "\"Offers personalized course recommendations.\""),
                //OnBoardingItems(R.drawable.intro3, "Unlock Discounts", "The more courses you select, the more you save. Our commitment to making education affordable for all.")
           // )
      //  }
  //  }
//}
