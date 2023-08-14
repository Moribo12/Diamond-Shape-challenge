import java.util.*;

public class NumberGen {

    private static void selectionSort(int[] numbers) {
    int length =numbers.length;

    for(int i =0; i< length -1; i++){
        int min = numbers[i];
        int indexOfMin =i;
        for(int j =i+1; j <length; j++){
            if(numbers[j] < min){
             min =numbers[j];
             indexOfMin =j;
            }
        }
        swap(numbers, i, indexOfMin);
    }
    }

    private static void swap(int[] numbers, int i, int indexOfMin){
    int temp = numbers[i];
    numbers[i]= numbers[indexOfMin];
    numbers[indexOfMin] = temp;
}

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
       
    }
}
