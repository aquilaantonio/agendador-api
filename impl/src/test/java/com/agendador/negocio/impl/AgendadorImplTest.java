package com.agendador.negocio.impl;

import com.agendador.negocio.Agenda;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.time.LocalDateTime;
import java.util.Locale;

public class AgendadorImplTest {

    public static final String STRING_DUMMY = "campo_string";

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    private AgendadorImpl agendador;

    @Test
    public void deveAgendarQuandoChamado() throws Exception {
        Agenda agenda = new Agenda();
        agenda.setId(new Long(1));
        agenda.setDataHoraInicio(LocalDateTime.now());
        agendador.registerAgenda(agenda);


    }

}