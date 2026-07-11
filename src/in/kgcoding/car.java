package in.kgcoding;

public class car {
    public String color;
    public String model;
    double fuellevel;
    private long costofpurchase;
    public car(){
        
    }
     public car(String color, String model, double fuellevel, long costofpurchase) {
        this.color = color;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costofpurchase = costofpurchase;
    } 
    @Override
    public String toString() {
        return "car [color=" + color + ", model=" + model + ", fuellevel=" + fuellevel + ", costofpurchase="
                + costofpurchase + "]";
    }     
}
