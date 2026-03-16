package br.com.moedas.domain.model;

import br.com.moedas.domain.exception.DomainException;

public class Moedas {

    private String id;
    private String codigoBacen;
    private String sigla;
    private String descricao;

    public Moedas(String id, String codigoBacen, String sigla, String descricao) {
        // necessario para quando faz requisicao post de uma nova moeda.
        if(codigoBacen == null || codigoBacen.isBlank()){
            throw new DomainException("O código BACEN não pode estar vazio");
        }
        if(sigla == null || sigla.isBlank() || sigla.length() != 3){
            throw new DomainException("A sigla está vazia ou inválida");
        }
        if(descricao == null || descricao.isBlank()){
            throw new DomainException("A descrição não pode estar vazia");
        }

        this.id = id;
        this.codigoBacen = codigoBacen;
        this.sigla = transformarMaiuscula(sigla);;
        this.descricao = descricao;
    }

    String transformarMaiuscula(String sigla){
        if(sigla.matches(".*[a-z].*")){
            sigla = sigla.toUpperCase();
        }

        return sigla;
    }

    public String getId() {
        return id;
    }

    public String getCodigoBacen() {
        return codigoBacen;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
}
