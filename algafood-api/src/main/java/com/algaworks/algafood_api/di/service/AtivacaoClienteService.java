package com.algaworks.algafood_api.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood_api.di.modelo.Cliente;
import com.algaworks.algafood_api.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
    
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
