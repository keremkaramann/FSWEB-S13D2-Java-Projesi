public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int num) {
        int posNum = Math.abs(num);
        String strNum = String.valueOf(posNum);
        String reversedStr = new StringBuilder(strNum).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        return posNum == reversedNum;
    }

    public static boolean isPerfectNumber(int num) {


    }
}