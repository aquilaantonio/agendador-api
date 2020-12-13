package com.agendador.negocio.impl;

import com.agendador.negocio.Agenda;
import com.agendador.negocio.Agendador;
import com.agendador.repositorio.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AgendadorImpl implements Agendador<Long, Agenda> {
@Autowired
private AgendaRepository repository;

    @Override
    public Agenda registerAgenda(Agenda agenda) throws Exception {

      return  repository.save(agenda);
    }

    @Override
    public Agenda getAgenda(Long agendaID) throws Exception {
       return repository.findById(agendaID).orElse(null);
    }

    @Override
    public Agenda updateAgenda(Agenda agenda) throws Exception {
        return repository.save(agenda);
    }

    @Override
    public void deleteAgenda(Long agendaId) throws Exception {
        repository.deleteById(agendaId);
    }
}
