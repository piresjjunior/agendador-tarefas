package com.nascimentojamir.agendadortarefas.business.mapper;

import com.nascimentojamir.agendadortarefas.business.dto.TarefasDTO;
import com.nascimentojamir.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
