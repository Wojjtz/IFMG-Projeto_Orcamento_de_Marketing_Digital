/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing.Classes;

/**
 *
 * @author rodol
 */
public class Video {

    private double precoFinal;
    private double duracao;
    private double tempoEstimadoServico;
    private boolean filmagem; //se true é filmagem, c.c. animação

    public Video() {
        this.precoFinal = 0;
        this.duracao = 0;
        this.tempoEstimadoServico = 0;
        this.filmagem = true;
    }

    public Video(double precoFinal, double duracao, double tempoEstimadoServico, boolean filmagem) {
        this.precoFinal = precoFinal;
        this.duracao = duracao;
        this.tempoEstimadoServico = tempoEstimadoServico;
        this.filmagem = filmagem;
    }

    public double calcularTempoEstimadoDeServico(double duracao, boolean filmagem) {
        //retorna valores em minutos
        if (filmagem) {
            if (duracao <= 17) {
                return 60;
            } else if (duracao > 17 && duracao <= 30) {
                return 75;
            } else if (duracao > 30 && duracao <= 60) {
                return 90;
            }
        } else {
            if (duracao <= 17) {
                return 90;
            } else if (duracao > 17 && duracao <= 30) {
                return 110;
            } else if (duracao > 30 && duracao <= 60) {
                return 135;
            }
        }
        return 0;
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

    @Override
    public String toString() {
        return "VIDEO:\n   Duração: " + this.getDuracao() + " segundos"
                + "\n   Tipo: " + (this.isFilmagem() ? "Filmagem" : "Animação")
                + "\n   Preço: R$" + String.format("%.2f", this.getPrecoFinal()) + "\n   Tempo estimado de serviço: "
                + this.getTempoEstimadoServico() + " minutos";
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

    public double getTempoEstimadoServico() {
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

}
