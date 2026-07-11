package in.knowledgegate;

import in.kgcoding.car;

public class defaulttest {
    public static void main(String[] args) {
          car test = new car("red", "audi", 100.0, 2000000);
          test.color = "blue";
        test.model = "bmw";
       //test.fuellevel = 50.0;
        System.out.println(test);
    }
    
}
