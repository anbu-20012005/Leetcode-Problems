import java.util.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        return (days[dayofweek-1]);
    }
}