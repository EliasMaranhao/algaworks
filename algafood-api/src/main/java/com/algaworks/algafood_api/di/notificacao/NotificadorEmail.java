package com.algaworks.algafood_api.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood_api.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do email %s: usando %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
