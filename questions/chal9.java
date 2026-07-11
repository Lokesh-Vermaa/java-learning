// ye chal 8 ko dusre util wale method se karne ka tareka h
public class chal9 {
    public static void main(String[] args) {
        
        int[] array = arrayutil.inputarray();
        long sum = sum(array);
        int avg = average(array);
        System.out.println("the sum of all the elements of the array is: "+sum);
        System.out.println("the average of all the elements of the array is: "+avg);


    }
    public static long sum(int[] array){
        int i = 0;
        int sum = 0;
        while (i<array.length){           
            sum += array[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] array){
        long sum = sum(array);
        return (int) (sum/array.length);

    }
}   
