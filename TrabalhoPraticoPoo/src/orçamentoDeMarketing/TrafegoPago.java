/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing;

/**
 *
 * @author rodol
 */
public class TrafegoPago {

    private double precoFinal;
    private String nicho;
    private double valorInvestido;

    public TrafegoPago(double precoFinal, String nicho, int valorInvestido) {
        this.precoFinal = precoFinal;
        this.nicho = nicho;
        this.valorInvestido = valorInvestido;
    }

    public TrafegoPago() {
        this.precoFinal = 0;
        this.nicho = "";
        this.valorInvestido = 0;
    }

    public double calcularPrecoFinal() {
        
        return this.valorInvestido * 1.35;
    }
    
    public String toString(){
        return "Tráfego pago: \n   Preço: " + this.precoFinal + "\n   Nicho: " + this.nicho;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal() {
        this.precoFinal = this.calcularPrecoFinal();
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

}
