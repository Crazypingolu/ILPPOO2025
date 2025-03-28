package controller;
import model.ClasseDino;
import java.util.Scanner;
public class ClasseController {
    public void run() { 
        ClasseDino skeep = new ClasseDino(); // instancia do dino
        Scanner scan = new Scanner(System.in); // instancia de scanner
        char acaoLetra;
        String humor, acaoFrase;
        int speed, heat, energy;
        System.out.println("Skeep é o nosso dinossauro hipotético");
        while (true){
            // Analisa os dados sempre atualizando conforme o loop
            humor = skeep.getHumor(); 
            speed = skeep.getSpeed();
            heat = skeep.getHeat();
            energy = skeep.getEnergy();
            // Mensagens no console 
            System.out.println("\nEscolha uma ação para Skeep: ");
            System.out.println("(P)ular   (C)orrer   Co(M)er\r\n" + 
                                "\nC(A)ntar   Tomar (S)ol   Ficar na S(O)mbra\r\n" +
                                "\n(E)nd para finalizar o programa.");
            System.out.printf(
                "%nStatus atuais: %nHumor: %s %nEnergia: %d %nVelocidade: %d %nTemperatura: %d %n", 
                humor, energy, speed, heat);
            System.out.println("Escolha: ");
            // Entrada de dados
            acaoFrase = scan.nextLine().toUpperCase();
            acaoLetra = acaoFrase.charAt(0);
            // processamento dos dados + saída
            if (acaoLetra == 'E')
                // fim do loop
                break;
            if (acaoLetra == 'P'){
                skeep.pular();
            } else if (acaoLetra == 'C'){
                skeep.correr();
            } else if (acaoLetra == 'M'){
                skeep.comer();
            } else if (acaoLetra == 'A'){
                skeep.cantar();
            } else if (acaoLetra == 'S'){
                skeep.tomarSol();
            } else if (acaoLetra == 'O'){
                skeep.ficarNaSombra();
            }
        }
        scan.close();
    }
}
