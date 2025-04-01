package controller;
import model.Caixa;
public class ClasseController {
    public ClasseController(){
        super();
    }
    public void testeCaixa(){
        Caixa caixa1 = new Caixa();
        double produto1 = 45.5, produto2 = 25.3, produto3 = 12.8;
        System.out.printf("Venda concluída no valor de: %.2f %nSaldo atual do caixa 1: %.2f %n%n", produto1, caixa1.venda(produto1));
        System.out.printf("Venda concluída no valor de: %.2f %nSaldo atual do caixa 1: %.2f %n%n", produto2, caixa1.venda(produto2));
        System.out.printf("Venda concluída no valor de: %.2f %nSaldo atual do caixa 1: %.2f %n%n", produto3, caixa1.venda(produto3));
    }
}
