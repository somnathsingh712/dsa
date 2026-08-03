public class SubsetArray {
    public static void main(String[] args) {

        int arr1[] = {2, 3, -1, 8, 4};
        int arr2[] = {2, 3, -1};

        boolean subset = true;

        for (int i = 0; i < arr2.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {

                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                subset = false;
                break;
            }
        }

        if (subset)
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println("arr2 is not a subset of arr1");
    }
}