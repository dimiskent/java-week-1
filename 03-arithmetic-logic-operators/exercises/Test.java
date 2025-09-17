public class Test {
    public static void main(String[] args) {
        int day = 88;
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        if(day > days.length-1) {
            day = days.length;
        } else if (day < 1) {
            day = 1;
        }
        String currentDay = days[day-1];
        System.out.println("Current Day is " + currentDay);
    }
}
