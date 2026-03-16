package br.com.moedas.application.usecase;

import br.com.moedas.domain.model.Moedas;
import br.com.moedas.port.in.ListarMoedasUseCase;
import br.com.moedas.port.out.MoedasRepository;

import java.util.List;

public class ListarMoedasUseCaseImpl implements ListarMoedasUseCase {

    private final MoedasRepository moedasRepository;

    public ListarMoedasUseCaseImpl(MoedasRepository moedasRepository) {
        this.moedasRepository = moedasRepository;
    }

    @Override
    public List<Moedas> executar() {
        return moedasRepository.buscarMoedas();
    }
}
