package model;
import javax.swing.JOptionPane;
public class Caixa {
    double saldo; // private
    
    public Caixa(){
        this.saldo = 0;
    }
    
    public double venda(){
        double saldoAtual = this.saldo, saldoNovo = saldoAtual, valorProduto;
        while(true){
            valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Adicionar valor de produto \n(digite 0 para cancelar)"));
            if (valorProduto == 0)
                break;
            saldoNovo = saldoNovo + valorProduto;
        }
        this.saldo = saldoNovo;
        return saldoNovo;
    }
}
