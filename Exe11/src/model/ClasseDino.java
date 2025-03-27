package model;

public class ClasseDino {
    /* 
     * valores para as características
     * 0 - mínimo
     * 100 - máximo
     */
    private int energy;
    private int speed;
    private int heat;
    private int humor;

    // Construtor
    public ClasseDino(){
        this.energy = 50;
        this.heat = 50;
        this.humor = 50;
        this.speed = 50;
    }

    // Comportamentos
    public void pular(){
        int atualEnergy = getEnergy();
        int atualSpeed = getSpeed();
        int atualHumor = getHumor();
        energy -= 3;
        speed -= 4;
    }
    public void correr(){
        
    }
    public void comer(){
        
    }
    public void cantar(){
        
    }
    public void tomarSol(){
        
    }
    public void ficarNaSombra(){
        
    }

    // setters e getter
    public int getEnergy() {
        return energy;
    }
   
    public int getHeat() {
        return heat;
    }
    
    public int getHumor() {
        return humor;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public void setHeat(int heat) {
        this.heat = heat;
    }
    
    public void setHumor(int humor) {
        this.humor = humor;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
