import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class question88 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String Filename = input.nextLine();
        try(FileReader reader = new FileReader(Filename)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while(read!=-1);

        }catch (IOException e){
            System.out.printf("exception occured: %s",e.getMessage());
        }
    }
}
