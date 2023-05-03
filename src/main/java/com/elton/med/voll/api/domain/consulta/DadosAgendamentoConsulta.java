package com.elton.med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long IdMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future // data apenas pode ser agenda no futuro
        LocalDateTime data) {

}
