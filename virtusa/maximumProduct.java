public class maximumProduct {
    public static void main(String[] args) {

        int arr[] = {1, 2, -3, 0, -4, -5};
        int n = arr.length;

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int product = 1;

            for (int j = i; j < n; j++) {

                product *= arr[j];

                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        System.out.println("Maximum Product = " + maxProduct);
    }
}