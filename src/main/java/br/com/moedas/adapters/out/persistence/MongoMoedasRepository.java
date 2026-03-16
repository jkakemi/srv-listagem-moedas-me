package br.com.moedas.adapters.out.persistence;

import br.com.moedas.adapters.out.persistence.entity.MoedasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoMoedasRepository extends MongoRepository<MoedasEntity, String> {

    List<MoedasEntity> findAllByOrderByCodigoBacenAsc();

}
