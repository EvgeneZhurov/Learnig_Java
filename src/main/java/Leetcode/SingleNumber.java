package Leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] array = {4,1,2,1,2};
        System.out.println(singleNumber(array));
    }
//Не понимаю как работает оператор, хотел бы обсудить на уроке
    public static int singleNumber(int[] nums) {
        int res=0;
        for(int i : nums){
            res =res ^ i;
        }
        return res;
    }
}
