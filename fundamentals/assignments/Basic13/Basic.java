import java.util.ArrayList;
import java.util.Arrays;

public class Basic{
    public void print255(){
        for(int i = 0; i < 256; i++){
            System.out.println(i);
        }
    }
    public void printOdd(){
        for(int i = 1; i < 256; i ++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printSum(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public void iterateArray(int[] arr){
        for(int value : arr){
            System.out.println(value);
        }
    }
    public void findMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int value : arr){
            if(value > max){
                max = value;
            }
        }
        System.out.println(max);
    }
    public void findAverage(ArrayList<Integer> arr){
        int total = 0;
        for(int value : arr){
            total += value;
        }
        double average = total / arr.size();
        System.out.println(average);

    }
    public void arrayOdd(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 256; i++){
            if( i % 2 != 0 ){
                System.out.println(i);
                arr.add(i);
            }
        }
        System.out.println(arr.size());
    }
    public void greaterY(ArrayList<Integer> arr, int y){
        int count = 0;
        for(int value : arr){
            if(value > y){
                count ++;
            }
        }
        System.out.println(count);
    }
    public void squareValues(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            int square = arr.get(i) * arr.get(i);
            arr.set(i, square);
            System.out.println(arr.get(i));
        }
    }
    public void elimNegatives(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < 0){
                arr.set(i, 0);
                System.out.println(arr.get(i));
            }
        }
    }
    public void maxMinAvg(int[] arr){
        int[] output = {arr[0], arr[0], 0};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > output[0]){
                output[0] = arr[i];
            }
            if(arr[i] < output[1]){
                output[1] = arr[i];
            }
            output[2] += arr[i];
        }
        output[2] = output[2] / arr.length;
        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);

    }
    public void shiftingValues(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}