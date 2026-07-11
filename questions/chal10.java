import java.util.Scanner;

public class chal10 {
    public static void main(String[] args) {
        

        String[] array = arrayutil2.inputarray();
        int count = occurance(array);
        System.out.println("the given word comes "+count+" times in the array");
        
    }
    public static int occurance(String[] array){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the element: ");
        String element = input.nextLine();
        int count = 0;
        int i = 0;

        while (i<array.length){
            if (element.equals(array[i])) {
                count += 1;

            }
        i++;    
        }
        return count;

    }
}
