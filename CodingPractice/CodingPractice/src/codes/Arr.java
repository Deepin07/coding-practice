package codes;

public class Arr {
    public static void main(String[] args) {
        
        int[] arr = {1,4,6,2,7,5};

        for(int i = 1; i < arr.length - 1; i++){
            int left = 0;
            int right = arr.length;

            while (left < right) {
                int temp = 0;
                temp = left;
                left = right;
                right = temp;

                for (int j : arr) {
                    System.out.println(j);
                }
            }
        }


    }
}
