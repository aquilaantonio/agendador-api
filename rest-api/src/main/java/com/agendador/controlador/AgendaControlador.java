package com.agendador.controlador;

import com.agendador.negocio.Agenda;
import com.agendador.negocio.impl.AgendadorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/agendador/v1/agendas")
public class AgendaControlador {
    @Autowired
    private AgendadorImpl agendador;

    public ResponseEntity registrarAgenda(@RequestBody @Validated Agenda agenda) throws Exception {
        Agenda retorno = agendador.registerAgenda(agenda);
        return ResponseEntity.ok(retorno);
    }

}
