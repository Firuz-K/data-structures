import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

      //  int[] arr = {2, 3, 4, 10, 5, 1,};
      //  System.out.println(Arrays.toString(threeSum2(arr, 6)));


    }

    public static int[] threeSum(int[] arr, int target) {

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int k = i +1 ;

        while (i < j) {
            int sum = arr[i] + arr[k] + arr[j];
            if (sum == target) return new int[]{i, k, j};
            else if (sum < target) k++;
            else j--;
        }
        return new int[]{};
    }


    public static int[] threeSum2(int[] arr, int target) {

        Arrays.sort(arr);

       for(int i =0; i < arr.length; i++){
           int k =i +1;
           for(int j = arr.length-1; j >=0; j--){
               while(i < j ){
                   int sum = arr[i] + arr[k] + arr[j];
                   if(sum == target) return new int[]{i, k, j};
                   k++;
                   if(k > j) break;


               }
           }
       }
        return new int[]{};


    }
}
