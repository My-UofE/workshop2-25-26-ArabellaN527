// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = 2; 
        int currentDate = 7; 
        int myBirthdayDate = 23; 

        // value below is a constant
        final int DAYS_A_WEEK = 7; 
        
        // Tasks

        // 1. calc number of days from current date
        //    to birthday 
        int number_days = myBirthdayDate - currentDate;
        System.out.println(number_days);

        // 2. use this along with the current weekday 
        //    to find when the birthday falls
        int birthday_day = (number_days+currentDay)%DAYS_A_WEEK;
        System.out.println(birthday_day);


        // 3. Display the result
        if (birthday_day == 1){
        System.out.println("Your birthday is on a Monday");
        }
        else if (birthday_day == 2){
        System.out.println("Your birthday is on a Tuesday");
        }
        else if (birthday_day == 3){
        System.out.println("Your birthday is on a Wednesday");
        }
        else if (birthday_day == 4){
        System.out.println("Your birthday is on a Thursday");
        }
        else if (birthday_day == 5){
        System.out.println("Your birthday is on a Friday");
        }
        else if (birthday_day == 6){
        System.out.println("Your birthday is on a Saturday");
        }
        else if (birthday_day == 7){
        System.out.println("Your birthday is on a Sunday");
        }

    

    }
}
  