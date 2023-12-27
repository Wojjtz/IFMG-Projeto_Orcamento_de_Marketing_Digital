/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing.classes.model.trafegoPago;

/**
 *
 * @author rodol
 */
public class TrafegoPago {

    private double precoFinal;
    private String nicho;
    private double valorInvestido;

    public TrafegoPago(double valorInvestido, String nicho) {
        this.valorInvestido = valorInvestido;
        this.nicho = nicho;
    }

    private double calcularPrecoFinal() {
        this.precoFinal = this.valorInvestido * 1.30;
        return this.precoFinal;
    }

    public double getPrecoFinal() {
        return this.calcularPrecoFinal();
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
