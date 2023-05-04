public class OddEven {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};

        int oddNumCount = 0;
        int evenNumCount = 0;

//        long startTime = System.nanoTime();

        for (int num : nums) {
            if (isEven(num)) {
                evenNumCount++;
            } else {
                oddNumCount++;
            }
        }

//        long endTime = System.nanoTime();

        System.out.println("Odd: " + oddNumCount);
        System.out.println("Even: " + evenNumCount);

//        System.out.println("Operating Time: " + (endTime - startTime));

    }
    public static boolean isEven(int num) {

        return num % 2 == 0;
    }

}
