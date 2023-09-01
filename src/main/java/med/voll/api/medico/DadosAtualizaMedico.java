package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
