/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing;

/**
 *
 * @author rodol
 */
public class Video {

    private double precoFinal;
    public double duracao;
    private String tempoEstimadoServico;
    public boolean filmagem; //se true é filmagem, c.c. animação

    public Video() {
        this.precoFinal = 0;
        this.duracao = 0;
        this.tempoEstimadoServico = "";
        this.filmagem = true;
    }

    public Video(double precoFinal, double duracao, String tempoEstimadoServico, boolean filmagem) {
        this.precoFinal = precoFinal;
        this.duracao = duracao;
        this.tempoEstimadoServico = tempoEstimadoServico;
        this.filmagem = filmagem;
    }

    public String calcularTempoEstimadoDeServico(double duracao, boolean filmagem) {
        //retorna valores em segundos
        if (filmagem) {
            if (duracao <= 17) {
                return "1 hora";
            } else if (duracao > 17 && duracao <= 30) {
                return "1 hora e 15 minutos";
            } else if (duracao > 30 && duracao <= 60) {
                return "1 hora e meia";
            }
        } else {
            if (duracao <= 17) {
                return "1 hora e 30 minitos";
            } else if (duracao > 17 && duracao <= 30) {
                return "1 hora 50 minutos";
            } else if (duracao > 30 && duracao <= 60) {
                return "2 horas e 15 minutos";
            }
        }
        return "";
    }

    public double calcularPrecoFinal(double duracao, boolean filmagem) {
        //retorna valores em reais
        if (filmagem) { //se for filmagem
            if (duracao <= 17) {
                return 35 + (35 * 0.25);
            } else if (duracao > 17 && duracao <= 30) {
                return 45 + (45 * 0.25);
            } else if (duracao > 30 && duracao <= 60) {
                return 55 + (55 * 0.25);
            }
        } else { //se for animação 
            if (duracao <= 17) {
                return 35 + (35 * 0.5);
            } else if (duracao > 17 && duracao <= 30) {
                return 45 + (45 * 0.5);
            } else if (duracao > 30 && duracao <= 60) {
                return 55 + (55 * 0.5);
            }
        }
        return 0;
    }

    public double getPrecoFinal() {
        return this.precoFinal;
    }

    public void setPrecoFinal() {
        this.precoFinal = this.calcularPrecoFinal(this.duracao, this.filmagem);
    }

    public double getDuracao() {
        return this.duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTempoEstimadoServico() {
        return this.tempoEstimadoServico;
    }

    public void setTempoEstimadoServico() {
        this.tempoEstimadoServico = this.calcularTempoEstimadoDeServico(this.getDuracao(), this.isFilmagem());
    }

    public boolean isFilmagem() {
        return this.filmagem;
    }

    public void setFilmagem(boolean filmagem) {
        this.filmagem = filmagem;
    }
    
    public String toString(){
        return "   Duração: " + this.getDuracao() + " segundos"
            + "\n   Tipo: " + (this.isFilmagem() ? "Filmagem" : "Animação")
            + "\n   Preço: R$" + this.getPrecoFinal();
    }
}
