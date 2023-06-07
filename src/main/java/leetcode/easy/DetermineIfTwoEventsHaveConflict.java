package leetcode.easy;

public class DetermineIfTwoEventsHaveConflict {
    public static void main(String[] args) {
        String[] str1 = new String[]{"01:15","02:00"};
        String[] str2 = new String[]{"02:00","03:00"};
        System.out.println(haveConflict(str1,str2));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {

        return Integer.parseInt(event1[0].substring(0,2))*100 + Integer.parseInt(event1[0].substring(3,5)) <= Integer.parseInt(event2[1].substring(0,2))*100 + Integer.parseInt(event2[1].substring(3,5)) && Integer.parseInt(event2[0].substring(0,2))*100 + Integer.parseInt(event2[0].substring(3,5)) <= Integer.parseInt(event1[1].substring(0,2))*100 + Integer.parseInt(event1[1].substring(3,5));
    }
}
