package model;

public class ClasseDino {
    /* 
     * valores para as características de %
     * 0 - mínimo
     * 100 - máximo
     * valores para o humor
     * 1 = triste
     * 2 = neutro
     * 3 = feliz 
     */
    private int energy;
    private int speed;
    private int heat;
    private int humor;

    // Construtor
    public ClasseDino(){
        this.energy = 50;
        this.heat = 50;
        this.humor = 2;
        this.speed = 50;
    }

    // Comportamentos
    public void pular(){
        if (energy >= 5){
            if (speed >= 4){
                System.out.println("\nBoing! Boing! o dinossauro saí pulando alegremente!");
                this.energy -= 4;
                this.speed -= 3;
                this.humor = 3;
            } else {
                System.out.println("\nO dinossauro não tem velocidade para pular!");
                this.humor = 2;
            }
        } else {
            System.out.println("\nO dinossauro não tem Energia para pular!");
            this.humor = 2;
        }
    }
    public void correr(){
        if (energy >= 7){
            if (speed >= 5){
                System.out.println("\nZOOOOOOM! o dinossauro saí correndo muito feliz!");
                this.energy -= 6;
                this.speed -= 4;
                this.humor = 3;
            } else {
                System.out.println("\nO dinossauro não tem velocidade para correr!");
                this.humor = 2;
            }
        } else {
            System.out.println("\nO dinossauro não tem Energia para correr!");
            this.humor = 2;
        }
    }
    public void comer(){
        if (energy <= 90){
            if (speed >= 11){
                System.out.println("\nNhom nhom nhom! o dinossauro come e está muito feliz!");
                this.energy += 10;
                this.speed -= 10;
                this.humor = 3;
            } else {
                System.out.println("\nO dinossauro está cheio!");
                this.humor = 3;
            }
        } else {
            System.out.println("\nO dinossauro está cheio!");
            this.humor = 3;
        }
    }
    public void cantar(){
        if (energy >= 8){
                System.out.println("\nLA LA LA! o dinossauro saí cantarolando e está muito feliz!");
                this.energy -= 7;
                this.humor = 3;
        } else {
            System.out.println("\nO dinossauro está cansado e sem energia!");
            this.humor = 3;
        }
    }
    public void tomarSol(){
        if (heat < 50){
            if (speed < 100){
                System.out.println("ZZZ! O dino descansa sob a luz do sol! que felicidade!");
                this.heat += 20;
                this.speed += 13;
                this.humor = 3;
            } else {
                System.out.println("\nVelocidade está no máximo (ou quase), o dino não se sentou para tomar sol");
            }
        } else {
            System.out.println("\nMuito calor para descansar no sol! ");
        }
    }
    public void ficarNaSombra(){
        if (heat > 20){
            if (speed < 100){
                System.out.println("\n... \nO dino reflete sob as suas ações do passado embaixo da arvore... ele sente um vazio imensurável");
                this.heat -= 15;
                this.speed += 20;
                this.humor = 1;
            } else {
                System.out.println("\nEnergia está (ou quase) no máximo, o dino não se sentou para descansar");
            }
        } else {
            System.out.println("\nMuito frio para descansar na sombra! ");
        }
    }

    // setters e getter
    public int getEnergy() {
        return energy;
    }
    public int getHeat() {
        return heat;
    }
    public String getHumor() {
        if(humor == 1){
            return "Triste";
        }
        else if(humor == 2){
            return "Neutro";
        } else {
            return "Feliz";
        }
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
