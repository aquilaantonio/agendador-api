package com.agendador.negocio;

public interface Agendador<ID, AGENDA> {


    AGENDA registerAgenda(AGENDA agenda) throws Exception;

    AGENDA getAgenda(ID userId) throws Exception;

    AGENDA updateAgenda(AGENDA agenda) throws Exception;

    void deleteAgenda(ID agendaId) throws Exception;
}
