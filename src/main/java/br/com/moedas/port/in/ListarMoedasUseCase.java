package br.com.moedas.port.in;

import br.com.moedas.domain.model.Moedas;

import java.util.List;

public interface ListarMoedasUseCase {
    List<Moedas> executar();
}
