package model;
import javax.swing.JOptionPane;
public class Caixa {
    double saldo; // private
    
    public Caixa(){
        this.saldo = 0;
    }
    
    public double venda(double valorProduto){ 
        double saldoAtual = this.saldo;
        double saldoNovo = saldoAtual + valorProduto;
        this.saldo = saldoNovo;
        return saldoNovo;
    }
}
