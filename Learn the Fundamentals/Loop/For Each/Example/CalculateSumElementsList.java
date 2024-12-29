public class CalculateSumElementsList {

    public static int calculateSum(int[] arr) {
        int total = 0;

        // Iterate over each element in the array
        for (int number : arr) {
            // Add the current element to the total
            total += number;
        }

        return total;
    }

    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};

        int total = calculateSum(numbers);
        
        System.out.println(total);
    }
}
