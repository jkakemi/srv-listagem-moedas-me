package br.com.moedas.adapters.out.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "moedas")
public class MoedasEntity {

    @Id
    private String id;

    private String codigoBacen;
    private String sigla;
    private String descricao;

    public MoedasEntity() {}

    public MoedasEntity(String id, String codigoBacen, String sigla, String descricao) {
        this.id = id;
        this.codigoBacen = codigoBacen;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigoBacen() {
        return codigoBacen;
    }

    public void setCodigoBacen(String codigoBacen) {
        this.codigoBacen = codigoBacen;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
