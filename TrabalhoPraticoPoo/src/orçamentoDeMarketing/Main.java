/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orçamentoDeMarketing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner in = new Scanner(System.in);
    static ArrayList<Video> listaVideos = new ArrayList<>();
    static ArrayList<Imagem> listaImagens = new ArrayList<>();
    static ArrayList<Site> listaSites = new ArrayList<>();
    static ArrayList<TrafegoPago> listaTrafego = new ArrayList<>();
    static int itensCarrinho = 1;
    static PacoteSocialMedia psm;
    static int tamanhoTotalListas = (listaVideos.size() + listaImagens.size() + listaSites.size());
    
    public static void main(String[] args) {
        boolean sair = false;
        int indexListaVideos = 0;
        int indexListaImagens = 0;
        int indexListaSites = 0;
        int indexListaTrafego = 0;

        do {
            System.out.print("-----------------------"
                    + "\nOrçamento de marketing\n"
                    + "1 - Vídeo \n2 - Imagem/Foto \n3 - Site \n4 - Trafego Pago \n5 - Pacote Social Media \n6 - Carrinho"
                    + "\n----------------------- \nR: ");

            switch (in.nextInt()) {
                case 1:
                    listaVideos.add(new Video());

                    System.out.print("-----------------------\n"
                            + "Seu vídeo é animação ou filmagem? \n1 - Filmagem \n2 - Animação"
                            + "\nR: ");
                    listaVideos.get(indexListaVideos).setFilmagem(in.nextInt() == 1 ? true : false);
                    System.out.print("Tempo de duração do vídeo em segundos: ");
                    listaVideos.get(indexListaVideos).setDuracao(in.nextDouble());
                    listaVideos.get(indexListaVideos).setPrecoFinal();
                    listaVideos.get(indexListaVideos).setTempoEstimadoServico();
                    indexListaVideos++;
                    System.out.println("Seu vídeo foi registrado. \nAbra o carrinho para ver o preço.");
                    break;
                case 2:
                    listaImagens.add(new Imagem());

                    System.out.print("-----------------------\n"
                            + "Qual a dimensão da imagem?\n - 1:1 \n - 4:5 \n - 9:16 \nR: ");
                    listaImagens.get(indexListaImagens).setDimensionamento(in.next());
                    System.out.print("Nível de pesquisa: \n 1 - Baixo \n 2 - Médio \n 3 - Alto \nR: ");
                    listaImagens.get(indexListaImagens).setNivelDePesquisa(in.nextInt());
                    listaImagens.get(indexListaImagens).setPrecoFinal();
                    listaImagens.get(indexListaImagens).setTempoEstimadoServico();
                    indexListaImagens++;
                    System.out.println("Sua imagem foi registrada. \nAbra o carrinho para ver o final.");
                    break;
                case 3:
                    listaSites.add(new Site());
                    System.out.print("-----------------------\n"
                            + "Seu site será: \n 1 - Loja \n 2 - Institucional \nR: ");
                    if (in.nextInt() == 1) {
                        listaSites.get(indexListaSites).setLoja(true);
                        System.out.print("Quantas páginas terá seu site? (Recomenda-se no mínimo 3) \nR: ");
                        listaSites.get(indexListaSites).setPaginas(in.nextInt());
                        System.out.print("Quantos produtos ou serviços gostaria de anunciar em sua loja? \nR: ");
                        listaSites.get(indexListaSites).setProdutosCadastrados(in.nextInt());
                    } else {
                        listaSites.get(indexListaSites).setLoja(true);
                        System.out.print("Quantas páginas terá seu site? (Recomenda-se no mínimo 3) \nR: ");
                        listaSites.get(indexListaSites).setPaginas(in.nextInt());
                    }
                    listaSites.get(indexListaSites).calcularPrecoFinal();
                    listaSites.get(indexListaSites).calcularTempoEstimadoServico();
                    indexListaSites++;
                    System.out.println("Seu site foi registrado. \nAbra o carrinho para ver o preço final.");
                    break;
                case 4:
                    listaTrafego.add(new TrafegoPago());
                    System.out.print("-----------------------\n"
                        + "Qual o nicho do Tráfego Pago? \nR: ");
                    listaTrafego.get(indexListaTrafego).setNicho(in.next());
                    System.out.print("Quanto quer investir? \nR: R$");
                    listaTrafego.get(indexListaTrafego).setValorInvestido(in.nextDouble());
                    listaTrafego.get(indexListaTrafego).calcularPrecoFinal();
                    System.out.println("Seu Tráfego Pago foi registrado. Abra o carrinho para ver o preço final.");
                    indexListaTrafego++;
                    break;
                case 5:
                    psm = new PacoteSocialMedia();
                    psm.criarImagensPosts();
                    psm.criarCarrossel();
                    psm.criarVideos();
                    System.out.print("Qual o nicho do Tráfego Pago? \nR: ");
                    String nicho = in.next();
                    System.out.print("Quanto quer investir: R: R$");
                    double valorInvestido = in.nextDouble();
                    psm.criarTrafegoPago(nicho, valorInvestido);
                    System.out.print("Quantas páginas terá seu Site? \nR: ");
                    int paginas = in.nextInt();
                    System.out.print("O site será: \n 1 - Loja \n 2 - Institucional \nR: ");
                    if (in.nextInt() == 1) {
                        System.out.print("Quantos produtos ou serviços gostaria de anunciar? \nR: ");
                        psm.criarSite(paginas, true, in.nextInt());
                    } else {
                        psm.criarSite(paginas, false, 0);
                    }
                    System.out.println(psm.toString());
                    break;
                case 6:
                    System.out.println("-----------------------");
                    imprimirLista(listaVideos);
                    imprimirLista(listaImagens);
                    imprimirLista(listaSites);
                    imprimirLista(listaTrafego);
                    if (psm != null) {
                        System.out.println("Item " + itensCarrinho + "\n" + psm.toString());
                    }
                    itensCarrinho = 1;
                    System.out.print("-----------------------\n"
                            + "Gostaria de finalizar a compra? sim/nao \nR: ");
                    if (in.next().equalsIgnoreCase("sim")) {
                        System.out.println("\n\nPREÇO TOTAL FINAL: R$" + String.format("%.2f", caclularPrecoFinalTotal()));
                        sair = true;
                    } else {
                        break;
                    }
                default:
                    sair = true;
            }
        } while (!sair);
    }

    static void imprimirLista(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Item " + itensCarrinho + "\n" + lista.get(i).toString());
            itensCarrinho++;
        }
    }

    private static double caclularPrecoFinalTotal() {
        double precoFinal = 0;
        

        for (int i = 0; i < tamanhoTotalListas; i++) {
            if (listaVideos.size() > i) {
                precoFinal += listaVideos.get(i).getPrecoFinal();
            }
            if (listaImagens.size() > i) {
                precoFinal += listaImagens.get(i).getPrecoFinal();
            }
            if (listaSites.size() > i) {
                precoFinal += listaSites.get(i).getPreçoFinal();
            }
        }

        return precoFinal + psm.getPrecoFinalTotal();
    }

}
