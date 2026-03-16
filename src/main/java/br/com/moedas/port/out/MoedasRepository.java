package br.com.moedas.port.out;

import br.com.moedas.domain.model.Moedas;

import java.util.List;

public interface MoedasRepository {
    List<Moedas> buscarMoedas();
}
