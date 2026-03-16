package br.com.moedas.adapters.out.persistence.mapper;

import br.com.moedas.adapters.out.persistence.entity.MoedasEntity;
import br.com.moedas.domain.model.Moedas;
import org.springframework.stereotype.Component;

@Component
public class MoedasMapper {

    public Moedas toDomain(MoedasEntity moedasEntity) {
        if(moedasEntity == null) return null;

        return new Moedas(
                moedasEntity.getId(),
                moedasEntity.getCodigoBacen(),
                moedasEntity.getSigla(),
                moedasEntity.getDescricao()
        );
    }

      // nao vou usar post para criar moedas.
//    public MoedasEntity toEntity(Moedas moedasDomain) {
//        if(moedasDomain == null) return null;
//
//        return new MoedasEntity(
//                moedasDomain.getId(),
//                moedasDomain.getCodigoBacen(),
//                moedasDomain.getSigla(),
//                moedasDomain.getDescricao()
//        );
//    }
}
