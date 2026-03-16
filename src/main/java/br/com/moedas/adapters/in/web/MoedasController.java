package br.com.moedas.adapters.in.web;

import br.com.moedas.adapters.in.web.dto.MoedasResponseDTO;
import br.com.moedas.adapters.in.web.mapper.MoedasMapperDomainToDTO;
import br.com.moedas.port.in.ListarMoedasUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/moedas")
public class MoedasController {

    private final ListarMoedasUseCase listarMoedasUseCase;
    private final MoedasMapperDomainToDTO moedasMapperDomainToDTO;

    public MoedasController(ListarMoedasUseCase listarMoedasUseCase, MoedasMapperDomainToDTO moedasMapperDomainToDTO) {
        this.listarMoedasUseCase = listarMoedasUseCase;
        this.moedasMapperDomainToDTO = moedasMapperDomainToDTO;
    }

    @GetMapping
    public ResponseEntity<List<MoedasResponseDTO>> listarMoedas() {
        var moedasDomain = listarMoedasUseCase.executar();

        if(moedasDomain.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<MoedasResponseDTO> response = moedasDomain.stream()
                .map(moedasMapperDomainToDTO::toDto)
                .toList();

        return ResponseEntity.ok(response);
    }
}
