package view;
// Importação de pacotes:
import model.ClasseFogao;
import model.ClasseGarrafa;
import model.ClassePassaro;
// Início:
public class ClassePrincipal {
    public static void main(String[] args) {
        // instancias das classes:
        ClasseFogao fogao1 = new ClasseFogao();
        ClasseFogao fogao2 = new ClasseFogao();
        ClasseGarrafa garrafa1 = new ClasseGarrafa();
        ClasseGarrafa garrafa2 = new ClasseGarrafa();
        ClassePassaro passaro1 = new ClassePassaro();
        ClassePassaro passaro2 = new ClassePassaro();
        
        // Características para cada instancia:
        fogao1.capacidadeForno = 10; // L
        fogao1.consumoEnergia = 45; // KwH
        fogao1.cor = "vermelho";
        fogao1.quantidadeDeBocas = 4;
        fogao1.tamanho = 98; // cm
        
        fogao2.capacidadeForno = 15; // L
        fogao2.consumoEnergia = 57; // KwH
        fogao2.cor = "Chumbo";
        fogao2.quantidadeDeBocas = 6;
        fogao2.tamanho = 130; // cm
        
        garrafa1.capacidadeDeLiquido = 20; // cm³
        garrafa1.cor = "branca"; 
        garrafa1.espessura = 5; // cm
        garrafa1.material = "Metal";
        garrafa1.tamanho = 30; // cm
        
        garrafa2.capacidadeDeLiquido = 16; // cm³
        garrafa2.cor = "amarela"; 
        garrafa2.espessura = 3; // cm
        garrafa2.material = "Plastico";
        garrafa2.tamanho = 27; // cm

        passaro1.cor = "Azul";
        passaro1.especie = "Pic-Pau";
        passaro1.tamanhoEnvergadura = 60; // cm
        passaro1.sexo = "macho";
        passaro1.tamanhoEstatura = 40; 

        passaro2.cor = "Verde";
        passaro2.especie = "Arara";
        passaro2.tamanhoEnvergadura = 90; // cm
        passaro2.sexo = "macho";
        passaro2.tamanhoEstatura = 70;
    }
}
