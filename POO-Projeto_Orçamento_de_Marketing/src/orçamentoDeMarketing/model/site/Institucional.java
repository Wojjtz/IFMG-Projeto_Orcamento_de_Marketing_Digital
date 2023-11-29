/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orçamentoDeMarketing.model.site;

import orçamentoDeMarketing.model.abstracts.Site;

/**
 *
 * @author rodol
 */
public class Institucional extends Site{

    public Institucional(String tipo, int paginas) {
        super(tipo, paginas);
    }

    @Override
    public double calcularPrecoFinal() {
        return dominio + ((paginas - 1) * acrescimoPaginas) + construcaoSite;
    }

    @Override
    public int calcularTempoEstimadoServico() {
        return (paginas * 3);
    }
    
}
