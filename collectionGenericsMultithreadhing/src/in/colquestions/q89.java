package in.colquestions;
public class q89 {
    public static void main(String[] args) {
        con("my","name","name","is","lokesh");
    }

    public static void con(String... element){
        String conc = "";
        for(int i = 0;i<element.length;i++){
            conc+= element[i]+" ";
        }
        System.out.println(conc);
    }
    
}

