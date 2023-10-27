package orçamentoDeMarketing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel & Rodolfo
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

    public static void main(String[] args) {

        boolean sair = false;
        int indexListaVideos = 0;
        int indexListaImagens = 0;
        int indexListaSites = 0;
        int indexListaTrafego = 0;

        do {
            System.out.print("-----------------------"
                    + "\nOrçamento de marketing\n"
                    + "\nPara o que deseja contratar nossa agência?\n"
                    + "1 - Vídeo \n2 - Imagem/Foto \n3 - Site \n4 - Trafego Pago  \n5 - Pacote Social Media (6 imagens - 1 carrossel(três imagens) - 2 videos - tréfego pago - construção de site) \nJá selecionou algo? Tecle 6 para ver seu orçamento"
                    + "\n----------------------- \nR: ");

            switch (in.nextInt()) {
                case 1:
                    listaVideos.add(new Video());

                    System.out.print("-----------------------\n"
                            + "Seu vídeo é uma animação ou filmagem? \n1 - Filmagem \n2 - Animação"
                            + "\nR: ");
                    listaVideos.get(indexListaVideos).setFilmagem(in.nextInt() == 1 ? true : false);
                    System.out.print("Qual seria a média de duração do vídeo? (Digite em segundos) \nR:");
                    listaVideos.get(indexListaVideos).setDuracao(in.nextDouble());
                    listaVideos.get(indexListaVideos).setPrecoFinal();
                    listaVideos.get(indexListaVideos).setTempoEstimadoServico();
                    indexListaVideos++;
                    System.out.println("Seu vídeo foi registrado. \nAbra o carrinho para ver o preço.");
                    break;
                case 2:
                    listaImagens.add(new Imagem());

                    System.out.print("-----------------------\n"
                            + "*Usa-se imagens de tamanho 1:1 para o instagram e outras redes sociais, ela é em formato quadrado.\n"
                            + "*Usa-se imagens de tamanho 4:5 para flyers de evento ou cartões.\n"
                            + "*Usa-se imagens de tamanho 9:16 para stories, status e fotos retângulares no geral.\n"
                            + "\nQual a dimensão da imagem?(escreva a dimensão exata)\n - 1:1 \n - 4:5 \n - 9:16  \nR: ");
                    listaImagens.get(indexListaImagens).setDimensionamento(in.next());
                    System.out.print("Escreva o nível de pesquisa da arte: \n 1 - Já tenho todas as informações e imagens para o post \n 2 - Tenho algumas informações, a agência buscará o resto \n 3 - A agência fará toda a pesquisa para o post informartivo \nR: ");
                    listaImagens.get(indexListaImagens).setNivelDePesquisa(in.nextInt());
                    listaImagens.get(indexListaImagens).setPrecoFinal();
                    listaImagens.get(indexListaImagens).setTempoEstimadoServico();
                    indexListaImagens++;
                    System.out.println("Sua imagem foi registrada. \nAbra o carrinho para ver o final.");
                    break;
                case 3:
                    listaSites.add(new Site());
                    System.out.print("-----------------------\n"
                            + "*Um site institucional é um tipo de website que representa uma organização ou empresa, fornecendo informações sobre sua identidade, missão e serviços."
                            + "\n*Já o site tipo Loja, fornece as informações que o institucional oferece, mas com uma loja acoplada, onde o cliente consegue comprar pelo próprio site, sem intermédio de terceiros ou atendimento"
                            + "\nSeu site será: \n 1 - Loja \n 2 - Institucional \nR: ");
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
                    listaSites.get(indexListaSites).setPrecoFinal();
                    listaSites.get(indexListaSites).setTempoEstimadoDeServico();
                    indexListaSites++;
                    System.out.println("Seu site foi registrado. \nAbra o carrinho para ver o preço final.");
                    break;
                case 4:
                    listaTrafego.add(new TrafegoPago());
                    System.out.print("-----------------------\n"
                            + "Qual o nicho do seu negócio? (Resuma em uma palavra) \nR: ");
                    listaTrafego.get(indexListaTrafego).setNicho(in.next());
                    System.out.print("Quanto quer investir em posts patrocinados? (O valor que digitará será apenas o valor pago às plataformas, no preço final, será acrescido 35% do valor para nosso gerenciamento) \nR: R$");
                    listaTrafego.get(indexListaTrafego).setValorInvestido(in.nextDouble());
                    listaTrafego.get(indexListaTrafego).setPrecoFinal();
                    System.out.println("Seu Tráfego Pago foi registrado. Abra o carrinho para ver o preço final.");
                    indexListaTrafego++;
                    break;
                case 5:
                    psm = new PacoteSocialMedia();
                    psm.criarImagensPosts();
                    psm.criarCarrossel();
                    psm.criarVideos();
                    System.out.print("Qual o nicho do seu negócio? (Resuma em uma palavra) \nR: ");
                    String nicho = in.next();
                    System.out.print("Quanto quer investir em posts patrocinados? (O valor que digitará será apenas o valor pago às plataformas, no preço final, será acrescido 35% do valor para nosso gerenciamento) \nR: R$");
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
                        System.out.println("\n\nPREÇO TOTAL FINAL: R$" + String.format("%.2f", calcularPrecoFinalTotal()));
                        System.out.println("-----------------------\n"
                                + "OBRIGADO POR ESCOLHER NOSSA AGENCIA! <3 <3 <3");
                        sair = true;
                    } else {
                        break;
                    }
                default:
                    sair = true;
            }
        } while (!sair);
    }

    private static void imprimirLista(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Item " + itensCarrinho + "\n" + lista.get(i).toString());
            itensCarrinho++;
        }
    }

    private static double calcularPrecoFinalTotal() {
        int tamanhoTotalListas = (listaVideos.size() + listaImagens.size() + listaSites.size() + listaTrafego.size());
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
            if (listaTrafego.size() > i) {
                precoFinal += listaTrafego.get(i).getPrecoFinal();
            }
        }
        if (psm != null) {
            return precoFinal + psm.getPrecoFinalTotal();
        } else {
            return precoFinal;
        }
    }
}
