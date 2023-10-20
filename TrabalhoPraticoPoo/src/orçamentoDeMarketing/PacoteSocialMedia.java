/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing;

/**
 *
 * @author rodol
 */
public class PacoteSocialMedia {

    private int quantidadeImagensCarrossel = 3;
    private int quantidadeImagens = 6;

    private Imagem[] imagensCarrossel;
    private Imagem[] imagens;
    private Site site = new Site();
    private Video[] videos;
    private TrafegoPago trafegoPago = new TrafegoPago();
    private double precoFinalTotal;
    private String tempoEstimadoTotal;
   

    public void criarSite(int paginas, boolean tipoSite, int produtosCadastrados) {
        this.site.setPaginas(paginas);
        this.site.setLoja(tipoSite);
        this.site.setProdutosCadastrados(produtosCadastrados);
        this.site.calcularPrecoFinal();
        this.site.calcularTempoEstimadoServico();
    }

    public void criarTrafegoPago(String nicho, double valorInvestimento) {
        this.trafegoPago.setNicho(nicho);
        this.trafegoPago.setValorInvestido(valorInvestimento);
        this.trafegoPago.setPrecoFinal();
    }

    public void criarVideos() {
        this.videos = new Video[2];
        this.videos[0] = new Video();
        this.videos[0].setDuracao(25);
        this.videos[0].setFilmagem(false);
        this.videos[0].setPrecoFinal();
        this.videos[0].setTempoEstimadoServico();

        this.videos[1] = new Video();
        this.videos[1].setDuracao(30);
        this.videos[1].setFilmagem(true);
        this.videos[1].setPrecoFinal();
        this.videos[1].setTempoEstimadoServico();
    }

    public void criarImagensPosts() {
        this.imagens = new Imagem[quantidadeImagens];

        for (int i = 0; i < this.imagens.length; i++) {
            this.imagens[i] = new Imagem();
            if (i >= 4) {
                this.imagens[i].setDimensionamento("9:16");
                this.imagens[i].setNivelDePesquisa(2);
                this.imagens[i].setPrecoFinal();
                this.imagens[i].setTempoEstimadoServico();
                continue;
            } else if (i >= 2) {
                this.imagens[i].setDimensionamento("4:5");
                this.imagens[i].setNivelDePesquisa(2);
                this.imagens[i].setPrecoFinal();
                this.imagens[i].setTempoEstimadoServico();
                continue;

            } else if (i >= 0) {
                this.imagens[i].setDimensionamento("1:1");
                this.imagens[i].setNivelDePesquisa(2);
                this.imagens[i].setPrecoFinal();
                this.imagens[i].setTempoEstimadoServico();
                continue;

            }
        }
    }

    public void criarCarrossel() {
        this.imagensCarrossel = new Imagem[quantidadeImagensCarrossel];
        for (int i = 0; i < this.imagensCarrossel.length; i++) {
            this.imagensCarrossel[i] = new Imagem();
            this.imagensCarrossel[i].setDimensionamento("1:1");
            this.imagensCarrossel[i].setNivelDePesquisa(2);
            this.imagensCarrossel[i].setPrecoFinal();
            this.imagensCarrossel[i].setTempoEstimadoServico();
        }
    }

    public String toString() {
        return "PACOTE SOCIAL MEDIA\n\n" + imprimirImagens() + "\n" + imprimirImagensCarrossel() + "\n"
                + imprimirVideos() + "\n\n" + this.trafegoPago.toString() + "\n\n" + this.site.toString() 
                + "\n\nPreço total (-10%): R$" + String.format("%.2f", this.calcularPrecoTotalPacoteSocialMedia())
                + "\nTempo estimado de serviço: " + this.calcularTempoEstimadoTotal() + " dias";
    }

    private String imprimirImagens() {
        String textoImagens = "";
        for (int i = 0; i < this.imagens.length; i++) {
            textoImagens += this.imagens[i].toString() + "\n";
        }
        return textoImagens;
    }

    private String imprimirImagensCarrossel() {
        double precoTotal = 0;
        for (int i = 0; i < this.imagensCarrossel.length; i++) {
            precoTotal += this.imagensCarrossel[i].getPrecoFinal();
        }
        return "Carrossel:\n   Quantidade de imagens: " + this.imagensCarrossel.length
                + "\n   Dimensionamento: 1:1" + "\n   Preço: R$" + String.format("%.2f", precoTotal) + "\n";
    }

    private String imprimirVideos() {
        return this.videos[0].toString() + "\n" + this.videos[1].toString();

    }

    public double calcularPrecoTotalPacoteSocialMedia() {
        double precoTotal = 0;

        for (int i = 0; i < (imagens.length + imagensCarrossel.length + videos.length); i++) {
            if (imagens.length > i) {
                precoTotal += imagens[i].getPrecoFinal();
            }
            if (imagensCarrossel.length > i) {
                precoTotal += imagensCarrossel[i].getPrecoFinal();
            }
            if (videos.length > i) {
                precoTotal += videos[i].getPrecoFinal();
            }
        }

        precoTotal += (site.getPreçoFinal() + trafegoPago.getPrecoFinal()) - (precoTotal*0.1);
        this.precoFinalTotal = precoTotal;
        return precoTotal;
    }
    
    public String calcularTempoEstimadoTotal(){
        this.tempoEstimadoTotal = String.valueOf(this.site.getTempoEstimadoDeServico() + 3);
        return this.tempoEstimadoTotal;
    }

    public Imagem[] getImagens() {
        return imagens;
    }

    public void setImagens(Imagem[] imagens) {
        this.imagens = imagens;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Video[] getVideos() {
        return videos;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }

    public TrafegoPago getTrafegoPago() {
        return trafegoPago;
    }

    public void setTrafegoPago(TrafegoPago trafegoPago) {
        this.trafegoPago = trafegoPago;
    }

    public double getPrecoFinalTotal() {
        return precoFinalTotal;
    }

    public void setPrecoFinalTotal(double precoFinalTotal) {
        this.precoFinalTotal = precoFinalTotal;
    }

    public String getTempoEstimadoTotal() {
        return tempoEstimadoTotal;
    }

    public void setTempoEstimadoTotal(String tempoEstimadoTotal) {
        this.tempoEstimadoTotal = tempoEstimadoTotal;
    }
    
}
