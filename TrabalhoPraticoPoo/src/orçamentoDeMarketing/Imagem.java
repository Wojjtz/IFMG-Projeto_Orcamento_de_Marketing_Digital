/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing;

/**
 *
 * @author rodol
 */
public class Imagem {

    private String textoNivelDePesquisa;
    private double precoFinal;
    private String dimensao;
    private int nivelDePesquisa;
    private double taxaPesquisa;
    private double tempoPesquisa;
    private double tempoEstimadoServico;

    public Imagem() {
        this.precoFinal = 0;
        this.dimensao = "";
        this.nivelDePesquisa = 0;
        this.tempoEstimadoServico = 0;
    }

    public Imagem(String dimensionamento, int nivelDePesquisa) {
        this.precoFinal = 0;
        this.dimensao = dimensionamento;
        this.nivelDePesquisa = nivelDePesquisa;
        this.tempoEstimadoServico = 0;
    }

    public Imagem(double precoFinal, String dimensionamento, int nivelDePesquisa, double tempoEstimadoServico) {
        this.precoFinal = precoFinal;
        this.dimensao = dimensionamento;
        this.nivelDePesquisa = nivelDePesquisa;
        this.tempoEstimadoServico = tempoEstimadoServico;
    }

    public double calcularTempoEstimadoDeServico(String dimensionamento, int nivelDePesquisa) {
        //calcula o tempo necessário para pesquisar sobre o assunto do post
        switch (nivelDePesquisa) {
            case 1 -> {
                this.textoNivelDePesquisa = "Baixo";
                tempoPesquisa = 30;
            }
            case 2 -> {
                this.textoNivelDePesquisa = "Médio";
                tempoPesquisa = 45;
            }
            case 3 -> {
                this.textoNivelDePesquisa = "Alto";
                tempoPesquisa = 60;
            }
        }
        //retorna valores em minutos
        return switch (dimensionamento) {
            case "1:1" ->
                tempoPesquisa + 45;
            case "4:5" ->
                tempoPesquisa + 60;
            case "9:16" ->
                tempoPesquisa + 75;
            default ->
                0;
        };
    }

    public double calcularPrecoFinal(String dimensionamento, int nivelDePesquisa) {
        //calcula a porcentagem do valor da imagem 
        //a se acrescentar em relação ao nídel de pesquisa
        switch (nivelDePesquisa) {
            case 1 ->
                taxaPesquisa = 130;
            case 2 ->
                taxaPesquisa = 115;
            case 3 ->
                taxaPesquisa = 100;
        }
        //retorna valores em reais
        return switch (dimensionamento) {
            case "1:1" ->
                25 + (25 * (25 / taxaPesquisa));
            case "4:5" ->
                30 + (35 * (35 / taxaPesquisa));
            case "9:16" ->
                40 + (45 * (45 / taxaPesquisa));
            default ->
                0;
        };
    }

    @Override
    public String toString() {
        return "IMAGEM:\n   Dimenções: " + this.dimensao + "\n   Nível de pesquisa: "
                + this.textoNivelDePesquisa + "\n   Preço: R$" + String.format("%.2f", this.precoFinal)
                + "\n   Tempo estimado de serviço: " + this.tempoEstimadoServico + " minutos";
    }

    public double getPrecoFinal() {
        return this.precoFinal;
    }

    public void setPrecoFinal() {
        this.precoFinal = this.calcularPrecoFinal(this.dimensao, this.nivelDePesquisa);
    }

    public String getDimensionamento() {
        return this.dimensao;
    }

    public void setDimensionamento(String dimensionamento) {
        this.dimensao = dimensionamento;
    }

    public int getNivelDePesquisa() {
        return this.nivelDePesquisa;
    }

    public void setNivelDePesquisa(int nivelDePesquisa) {
        this.nivelDePesquisa = nivelDePesquisa;
    }

    public double getTempoEstimadoServico() {
        return this.tempoEstimadoServico;
    }

    public void setTempoEstimadoServico() {
        this.tempoEstimadoServico = this.calcularTempoEstimadoDeServico(this.dimensao, this.nivelDePesquisa);
    }

}
