package br.com.springteste.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springteste.cliente.Cliente;
import br.com.springteste.cliente.ClienteService;


@RequestMapping(path="/cliente")
public class Controller {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/new")
	public String newCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "index";
	}
	
	@PostMapping("/save")
	public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.saveCliente(cliente);
		return "index";

    }
}
