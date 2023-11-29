/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing.model.abstracts;

/**
 *
 * @author rodol
 */
public abstract class Video {

    private double precoFinal;
    protected double duracao;
    private double tempoEstimadoServico;
    private String tipo;

    public Video() {
        this.precoFinal = 0;
        this.duracao = 0;
        this.tempoEstimadoServico = 0;
    }

    public Video(double duracao) {
        this.precoFinal = 0;
        this.duracao = duracao;
        this.tempoEstimadoServico = 0;
    }

    public abstract double calcularTempoEstimadoDeServico();

    public abstract double calcularPrecoFinal();
    
    @Override
    public String toString(){
        return "Duração: " + this.duracao
                + "\nTempo estimado de serviço: " + (String.format("%.2f", this.calcularTempoEstimadoDeServico()/60)) + " horas"
                + "\nPreço: R$" + (String.format("%.2f", this.calcularPrecoFinal()))
                + "\nTipo: " + this.tipo;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getTempoEstimadoServico() {
        return tempoEstimadoServico;
    }

    public void setTempoEstimadoServico(double tempoEstimadoServico) {
        this.tempoEstimadoServico = tempoEstimadoServico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
