package br.com.moedas.adapters.in.web.mapper;

import br.com.moedas.adapters.in.web.dto.MoedasResponseDTO;
import br.com.moedas.domain.model.Moedas;
import org.springframework.stereotype.Component;

@Component
public class MoedasMapperDomainToDTO {

    public MoedasResponseDTO toDto(Moedas moedasDomain) {
        if (moedasDomain == null) return null;

        return new MoedasResponseDTO(
                moedasDomain.getCodigoBacen(),
                moedasDomain.getSigla(),
                moedasDomain.getDescricao()
        );
    }
}
