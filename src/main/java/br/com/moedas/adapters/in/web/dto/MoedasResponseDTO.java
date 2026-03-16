package br.com.moedas.adapters.in.web.dto;

import br.com.moedas.domain.model.Moedas;

public record MoedasResponseDTO(
        String codigoBacen,
        String sigla,
        String descricao
) {
}
