package com.agendador.negocio.impl;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class AgendadorImplTest {

    public static final String STRING_DUMMY = "campo_string";

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    private AgendadorImpl agendador;

    @Test
    public void deveAgendarQuandoChamado() {

        agendador.agendar(STRING_DUMMY);


    }

}