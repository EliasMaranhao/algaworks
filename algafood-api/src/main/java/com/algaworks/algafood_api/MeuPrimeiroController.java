package com.algaworks.algafood_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood_api.di.modelo.Cliente;
import com.algaworks.algafood_api.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
    
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao = new Cliente();
        joao.setNome("João Pedro");
        joao.setEmail("joao@email.com");
        joao.setTelefone("21975280016");

        ativacaoClienteService.ativar(joao);
        return "Hello";
    }
}
