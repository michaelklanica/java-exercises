import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 3)));

    }

//    EXERCISE 1:
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



}
