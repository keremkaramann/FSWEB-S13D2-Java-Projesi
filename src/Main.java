public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
        System.out.println("-------");
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num) {
        int posNum = Math.abs(num);
        String strNum = String.valueOf(posNum);
        String reversedStr = new StringBuilder(strNum).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        return posNum == reversedNum;
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static String numberToWords(int num) {
        String result = "";
        if (num <= 0) {
            System.out.println("Invalid Value");
        } else {
            String strNum = String.valueOf(num);
            for (int i = 0; i < strNum.length(); i++) {
                char digitChar = strNum.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                switch (digit) {
                    case 0 -> result += "Zero ";
                    case 1 -> result += "One ";
                    case 2 -> result += "Two ";
                    case 3 -> result += "Three ";
                    case 4 -> result += "Four ";
                    case 5 -> result += "Five ";
                    case 6 -> result += "Six ";
                    case 7 -> result += "Seven ";
                    case 8 -> result += "Eight ";
                    case 9 -> result += "Nine ";
                    default -> {
                    }
                }
            }
        }
        return result;
    }
}