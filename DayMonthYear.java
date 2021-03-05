package Lab01;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class DayMonthYear {
    public static void main(String[] args) {
        List<String> monthnameList = Arrays.asList
        ("January","Jan","Jan.","1",
        "February","Feb","Feb.","2",
        "March","Mar","Mar.","3",
        "April","Apr","Apr.","4",
        "May","5",
        "June","Jun","6",
        "July","Jul","7",
        "August","Aug.","Aug","8",
        "September","Sept.","Sep","9",
        "October","Oct.","Oct","10",
        "November","Nov.","Nov","11",
        "December","Dec.","Dec","12");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Month:");
        String month = keyboard.nextLine();
        while(!monthnameList.contains(month)){
            System.out.println("Re enter the month:");
            month = keyboard.nextLine();
        }
        System.out.println("Year:");
        int year = keyboard.nextInt();
        while(year < 0){
            System.out.println("Re enter the year(full digits):");
            year = keyboard.nextInt();
        }
        if(year%4 != 0 || (year%4 == 0 && year%100 == 0 && year%400 != 0)){
            switch(month){
                case "January":
                case "Jan":
                case "Jan.":
                case "1":
                case "March":
                case "Mar":
                case "Mar.":
                case "3":
                case "May":
                case "5":
                case "July":
                case "Jul":
                case "7":
                case "August":
                case "Aug.":
                case "Aug":
                case "8":
                case "October":
                case "Oct":
                case "Oct.":
                case "10":
                case "December":
                case "Dec":
                case "Dec.":
                case "12":
                {
                    System.out.println("Numbers of day: 31");
                    break;
                }
                case "February":
                case "Feb":
                case "Feb.":
                case "2":{
                    System.out.println("Numbers of day 28");
                    break;
                }
                default:{
                    System.out.println("Numbers of day 30");
                    break;
                }
            }
        }else{
            switch(month){
                case "January":
                case "Jan":
                case "Jan.":
                case "1":
                case "March":
                case "Mar":
                case "Mar.":
                case "3":
                case "May":
                case "5":
                case "July":
                case "Jul":
                case "7":
                case "August":
                case "Aug.":
                case "Aug":
                case "8":
                case "October":
                case "Oct":
                case "Oct.":
                case "10":
                case "December":
                case "Dec":
                case "Dec.":
                case "12":
                {
                    System.out.println("Numbers of day: 31");
                    break;
                }
                case "February":
                case "Feb":
                case "Feb.":
                case "2":{
                    System.out.println("Numbers of day 29");
                    break;
                }
                default:{
                    System.out.println("Numbers of day 30");
                    break;
                }
            }
        }
        keyboard.close();

        System.exit(0);
    }
}
