package br.com.programa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuscaController {

	@PostMapping("/busca")
	public String busca(Long id) {
		return "redirect:/"+id;
	}
}
