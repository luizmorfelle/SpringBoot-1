package br.com.programa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.programa.entities.Cliente;
import br.com.programa.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@RequestMapping("/{id}")
	public String findId(@PathVariable Long id, Model model){
	
		Cliente cliente = clienteRepository.getOne(id);
		
		model.addAttribute("cliente", cliente);
		return "cliente";
	}
	
}
