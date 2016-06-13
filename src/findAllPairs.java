/**
 * Created by danielxi on 6/12/16.
 */
public class findAllPairs {

    //create a "hello world" program that prints out "hello world"
    //now given a sorted array of integers, create a method to find all unique pairs taht add up to a certain number
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int sum = 10;
        findAllPairs obj = new findAllPairs();
        obj.findPairs(arr, sum);
    }

    public void findPairs(int[] arr, int sum){
        for(int i = 0;i < arr.length; i++){
            int x = arr[i];
            for(int j = i + 1; j <arr.length; j++){
                int y = arr[j];

                if((x + y)== sum){
                    String toPrint = arr[i]+" | "+arr[j];
                    System.out.println(toPrint);
                }

            }
        }
    }


}

