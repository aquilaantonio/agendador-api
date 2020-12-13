package com.agendador.repositorio;

import com.agendador.negocio.Agenda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendaRepository extends MongoRepository<Agenda,Long>{
}
