// IMPORTING CALENDAR PACKAGE FOR AUTOMATIC CHOOSING PARTICULAR DAY
import java.util.Calendar;
// CREATING CLASS ROBOT
class Robot {
    /* INITIALIZING VARIABLES CA THAT WILL HOLD THE CALENDAR PROPERTIES AND VARIABLE DAY
         WILL HOLD PARTICULAR DAY */
    var ca = Calendar.getInstance();
    var day = ca.get(Calendar.DAY_OF_WEEK);
    // CREATING FUNCTION DAY THAT WILL AUTOMATICALLY CHOOSES THE NUMBER ACCORDING TO DAY .
    fun day() {

        when (day) {
            1 -> println("DAY MONDAY")
            2 -> println("DAY TUESDAY ")
            3 -> println("DAY WEDNESDAY")
            4 -> println("DAY THURSDAY ")
            5 -> println("DAY FRIDAY")
            6 -> println("DAY SATURDAY")
            7 -> println("DAY SUNDAY ")
        }
    }
    // CREATING  FUNCTION ALARM THAT WILL TELL US ON WHICH DAY ALARM WILL RING AT A PARTICULAR TIME
    fun alarm() {


        when (day) {
            1 -> println("RING ALARM AT : 6.00 Am")
            2 -> println("RING ALARM AT: 6.30 Am")
            3 -> println("RING ALARM AT: 6.40 Am")
            4 -> println("RING ALARM AT: 6.00 Am")
            5 -> println("RING ALARM AT: 6.50 Am")
            6 -> println("RING ALARM AT : 6.30 Am")
            7 -> println("RING ALARM AT : 8.00 Am")


        }

    }
    // CREATING FUNCTION MAKECOFFEE THAT WILL TELL THE WHAT TYPE OF COFFEE WE WILL DRINK ON A PARTICULAR DAY


    fun makeCoffee()
    {

        when(day)
        {
            1->println("BLACK COFFEE WITH 1 SPOON SUGAR")
            2->println("MILK COFFEE WITH 2 SPOON SUGAR")
            3->println("MILK COFFEE WITH 2 SPOON SUGAR")
            4->println("BLACK COFFEE WITH 0.5 SPOON SUGAR")
            5->println("BLACK COFFEE WITH NO SUGAR")
            6->println("MILK COFFEE WITH 2 SPOON SUGAR")
            7->println("BLACK COFFEE WITH 1 SPOON SUGAR")


        }

    }
    //CREATING FUNCTION HEATTHEWATER THIS WILL TELL US THE TEMPRATURE OF WATER AT A PARTICULAR DAY
    fun heatTheWater()
    {


        when(day)
        {
            1->println("TODAY YOU WILL BATH AT 35 DEGREE")
            2->println("TODAY YOU WILL BATH AT 10 DEGREE")
            3->println("TODAY YOU WILL BATH AT 25 DEGREE")
            4->println("TODAY YOU WILL BATH AT BATH AT 25 DEGREE")
            5->println("TODAY YOU WILL BATH AT 28 DEGREE")
            6->println("TODAY YOU WILL BATH AT 19 DEGREE")
            7->println("TODAY YOU  WILL BATH AT 22 DEGREE")


        }
    }
    // CREATING FUNCTION BOOKS WILL TELL US ABOUT THE SCHEDULE OF BOOKS ON THAT PARTICULAR DAY
    fun books()
    {
        when(day)
        {
            1->println("BOOKS:MATHS,SST,JAVA,C")
            2->println("BOOKS:SCIENCE,SST,C++,JAVA")
            3->println("BOOKS:MATHS,GK,SCIENCE,C++")
            4->println("BOOKS:SOCIAL,SST,MATHS,C")
            5->println("BOOKS:MATHS,SST,C,C++")
            6->println("BOOKS:GK,SST,MATHS,C")
            7->println("BOOKS:MATHS,JAVA,C,C++")
        }
    }
    // CREATING FUNCTION FOOD  THIS WILL CHOOSE THE RANDOM FOOD FROM BREAKFAST,LUNCH,AND DINNER AND PROVIDE US THE LIST ON THAT PARTICULAR DAY
    fun food()
    {
        var breakfast=listOf("PANNER","FRUITS","SPROUTS","CHOCOS","DAL","JUICE","MANGO")

        println("Breakfast: ${breakfast.random()}")
        var lunch=listOf("RAJMA","PANNER","MAKAHANI DAL","DAL-RICE","BOTTLE","CABBAGE","CHOLE")
        println("Lunch: ${lunch.random()}")
        var dinner=listOf("SALAD","FRUITS","ICECREAM","PAN","PAV BHAJI","MONITA","DOSA")
        println("dinner: ${dinner.random()}")




    }
    // CREATING FUNCTION CLOTHES THIS WILL TELL US THE CLOTHES WE WILL WEAR ON THAT PARTICULAR DAY
    fun clothes()
    {
        when(day)
        {
            1->println("BLUE JEANS,WHITE SHIRT")
            2->println("BLACK TROUSER,BLUE SHIRT")
            3->println("BLUE JEANS,BLUE TSHIRT")
            4->println("BLUE SHIRT,JEANS BLUE")
            5->println("BLACK SHIRT,JEANS BLACK")
            6->println("BLUE SHIRT,BLACK TROUSER")
            7->println("BLACK JEANS,RED TROUSER")
        }
    }

}
// MAIN FUNCTION
fun main()
{
    println("GOOD MORNING BOSS")
    println("THIS IS YOUR ROBOT MICHAEL AND THIS IS YOUR OVERALL DAY SCHEDULE")
// CREATING OBJECT OF CLASS ROBOT
    val a=Robot()
// NOW OBJECT WILL INVOKES ALL THE FUNCTIONS
    println();
    a.day()
    println();
    a.alarm()
    println();
    a.makeCoffee()
    println();
    a.heatTheWater()
    println();
    a.books()
    println();
    a.food()
    println();
    a.clothes()
    println();
    println("THANK YOU BOSS HAVE A NICE DAY!")
}