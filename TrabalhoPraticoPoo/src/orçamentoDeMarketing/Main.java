/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orçamentoDeMarketing;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        boolean sair = false;
        int indexListaVideos = 0;

        do {
            System.out.print("-----------------------"
                    + "\nOrçamento de marketing\n"
                    + "1 - Vídeo \n2 - Imagem/Foto \n3 - Site \n4 - Trafego Pago \n5 - Pacote Social Media \n6 - Carrinho"
                    + "\n----------------------- \nR: ");

            switch (in.nextInt()) {
                case 1:
                    listaVideos.add(new Video());

                    System.out.print("-----------------------\n"
                            + "Seu vídeo é animação ou filmagem? \n1 - Animação \n2 - Filmagem"
                            + "\nR: ");
                    if (in.nextInt() == 1) {
                        listaVideos.get(indexListaVideos).setFilmagem(false);
                    } else {
                        listaVideos.get(indexListaVideos).setFilmagem(true);
                    }
                    System.out.print("Tempo de duração do vídeo em segundos: ");
                    listaVideos.get(indexListaVideos).setDuracao(in.nextDouble());
                    System.out.println("Seu vídeo foi registrado.");
                    listaVideos.get(indexListaVideos).setPrecoFinal();
                    indexListaVideos++;
                    break;
                case 6:
                    imprimirListaVideos();
                    break;
                default:
                    sair = true;
            }
        } while (!sair);
    }
        
    static void imprimirListaVideos(){
        for (int i = 0; i < listaVideos.size(); i++) {
            System.out.println("Vídeo " + (i+1) + "\n" + listaVideos.get(i).toString());
        }
    }
}
