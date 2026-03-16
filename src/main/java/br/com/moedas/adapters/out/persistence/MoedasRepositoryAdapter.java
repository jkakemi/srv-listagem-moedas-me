package br.com.moedas.adapters.out.persistence;

import br.com.moedas.adapters.out.persistence.entity.MoedasEntity;
import br.com.moedas.adapters.out.persistence.mapper.MoedasMapper;
import br.com.moedas.domain.model.Moedas;
import br.com.moedas.domain.port.out.MoedasRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MoedasRepositoryAdapter implements MoedasRepository {

    private final MongoMoedasRepository mongoMoedasRepository;
    private final MoedasMapper moedasMapper;

    public MoedasRepositoryAdapter(MongoMoedasRepository mongoMoedasRepository, MoedasMapper moedasMapper) {
        this.mongoMoedasRepository = mongoMoedasRepository;
        this.moedasMapper = moedasMapper;
    }

    @Override
    public List<Moedas> buscarMoedas() {
        List<MoedasEntity> moedasEntities = mongoMoedasRepository.findAllByOrderByCodigoBacenAsc();

        return moedasEntities.stream()
                .map(moedasMapper::toDomain)
                .collect(Collectors.toList());


    }
}
