package br.com.moedas.config;

import br.com.moedas.application.usecase.ListarMoedasUseCaseImpl;
import br.com.moedas.port.in.ListarMoedasUseCase;
import br.com.moedas.port.out.MoedasRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ListarMoedasUseCase listarMoedasUseCase(MoedasRepository moedasRepository) {
        return new ListarMoedasUseCaseImpl(moedasRepository);
    }

}
