package model;

public class ClassEngine {
    String type;
    double weight;
    String serialNum;

    public ClassEngine(){
        this.type = " ";
        this.weight = 0;
        this.serialNum = "0000";
    }
    public ClassEngine(String type, double weight, String serialNum){
        this.type = type;
        this.weight = weight;
        this.serialNum = serialNum;
    }
}
