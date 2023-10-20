/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing;

/**
 *
 * @author rodol
 */
public class Site {

    private double precoFinal;
    private int paginas;
    private boolean loja;

    private int construcaoSite = 1000;
    private int acrescimoPaginas = 200;
    private double manutençãoHospedagem;
    private double dominio = 60;
    private int produtosCadastrados;
    private double valorProduto;
    private int tempoEstimadoDeServico;
    private int tempoPelaQuantidadeProduto;

    public Site() {
        this.precoFinal = 0;
        this.paginas = 0;
        this.produtosCadastrados = 0;
    }

    public Site(double precoFinal, int paginas, int produtosCadastrados) {
        this.precoFinal = precoFinal;
        this.paginas = paginas;
        this.produtosCadastrados = produtosCadastrados;
    }

    public void calcularPrecoFinal() {
        if (this.loja) {
            if (produtosCadastrados > 400) {
                valorProduto = 5;
            } else if (produtosCadastrados > 250) {
                valorProduto = 12.5;
            } else if (produtosCadastrados > 100) {
                valorProduto = 20;
            } else if (produtosCadastrados > 20) {
                valorProduto = 27.5;
            } else if (produtosCadastrados > 10) {
                valorProduto = 35;
            } else {
                valorProduto = 40;
            }
        } else {
            valorProduto = 0;
        }
        this.precoFinal = dominio + (produtosCadastrados * valorProduto) + ((paginas - 1) * acrescimoPaginas) + construcaoSite;
    }

    public void calcularTempoEstimadoServico() {
        if (this.loja) {
            if (produtosCadastrados > 400) {
                tempoPelaQuantidadeProduto = 42;
            } else if (produtosCadastrados > 250) {
                tempoPelaQuantidadeProduto = 30;
            } else if (produtosCadastrados > 100) {
                tempoPelaQuantidadeProduto = 20;
            } else if (produtosCadastrados > 20) {
                tempoPelaQuantidadeProduto = 13;
            } else if (produtosCadastrados > 10) {
                tempoPelaQuantidadeProduto = 7;
            } else {
                tempoPelaQuantidadeProduto = 4;
            }
        } else {
            tempoPelaQuantidadeProduto = 0;
        }
        this.tempoEstimadoDeServico = (paginas * 3) + tempoPelaQuantidadeProduto;

    }

    @Override
    public String toString() {
        return "SITE:\n   Preço: R$" + String.format("%.2f", this.precoFinal) + "\n   Páginas: " + this.paginas
                + "\n   Tipo: " + (this.loja == true ? "Loja" : "Institucional") + "\n   Produtos cadastrados: " + this.produtosCadastrados
                + "\n   Tempo estimado de serviço: " + this.tempoEstimadoDeServico + " dias";
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setManutençãoHospedagem(double manutençãoHospedagem) {
        this.manutençãoHospedagem = manutençãoHospedagem;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    public void setProdutosCadastrados(int produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
    }

    public void setTempoEstimadoDeServico(int tempoEstimadoDeServico) {
        this.tempoEstimadoDeServico = tempoEstimadoDeServico;
    }

    public double getPreçoFinal() {
        return this.precoFinal;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public double getManutençãoHospedagem() {
        return manutençãoHospedagem;
    }

    public double getDominio() {
        return dominio;
    }

    public int getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public int getTempoEstimadoDeServico() {
        return tempoEstimadoDeServico;
    }

    public boolean isLoja() {
        return this.loja;
    }

    public void setLoja(boolean loja) {
        this.loja = loja;
    }
}
