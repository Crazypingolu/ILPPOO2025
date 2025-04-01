package controller;
import model.Caixa;
public class ClasseController {
    public ClasseController(){
        super();
    }
    public void testeCaixa(){
        Caixa caixa1 = new Caixa();
        System.out.printf("Venda concluída, saldo atual do caixa 1: %.2f %n%n", caixa1.venda());

    }
}
