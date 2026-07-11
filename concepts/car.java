public class car {
    int NoofWheels;
    String color;
    float maxSpeed;
    float currentfuelinliters;
    int noofseats;
    public void drive(){
        if (currentfuelinliters == 0){
            System.out.println("fuel dalwale dalle");
        } else if (currentfuelinliters<5){
            System.out.println("petrol kam hai dalle");
        } else {
            System.out.println("Your car is moving");
        }
        
        currentfuelinliters --;
    }
    public void addfuel(float fuel){
        currentfuelinliters += fuel;
    }
    
    public float currentfuel(){
        return currentfuelinliters;
    }
}
