import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {

//        EXERCISE 1:
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 3)));

//        EXERCISE 2:
        System.out.println(reverseInt(1234567890));

//        EXERCISE 3:
        System.out.println(isPalindrome(181));
        System.out.println(isPalindrome(123));

//        EXERCISE 4:
        System.out.println(romanToInt("MCMLXXV"));

    }

//    EXERCISE 1 (APAS 1):
//    GIVEN AN ARRAY OF INTEGERS, RETURN INDICES OF THE TWO NUMBERS SUCH THAT THEY ADD UP TO A SPECIFIC TARGET.
//    YOU MAY ASSUME THAT EACH INPUT WILL HAVE EXACTLY ONE SOLUTION, AND YOU MAY NOT USE THE SAME ELEMENT TWICE.

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

//    EXERCISE 2 (APAS 7):
//    GIVEN A 32-BIT SIGNED INTEGER, RETURN THE REVERSE DIGITS OF THE INTEGER.
//    123 => 321 ; -123 => -321 ; 120 => 21
//    ASSUME YOU ARE DEALING WITH AN ENVIRONMENT WHICH CAN ONLY STORE INTEGERS WITHIN THE 32-BIT SIGNED INTEGER RANGE
//    (-231 - 230). ASSUME THE FUNCTION RETURNS 0 WHEN THE REVERSED INTEGER OVERFLOWS.

    public static int reverseInt(int inNum) {
        long outNum = 0;
        while (inNum != 0) {
            outNum = outNum * 10 + inNum % 10;
            inNum = inNum / 10;
        }
        if (outNum > Integer.MAX_VALUE || outNum < Integer.MIN_VALUE) return 0;
        return (int) outNum;
    }

//    EXERCISE 3 (APAS 9)
//    DETERMINE WHETHER AN INTEGER IS A PALINDROME.

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x/= 10;
        }
        return x ==revertedNumber || x == revertedNumber/10;

    }

//    EXERCISE 4 (APAS 13)
//    CONVERT ROMAN NUMERAL TO INTEGER

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    result += 100 * (result >= 500 ? -1 : 1);
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    result += 10 * (result >= 50 ? -1 : 1);
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += (result >= 5 ? -1 : 1);
                    break;
                default:
                    break;
            }
        }
        return result;
    }


}
