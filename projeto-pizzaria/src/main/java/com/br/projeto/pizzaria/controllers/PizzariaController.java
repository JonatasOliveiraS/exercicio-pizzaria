package com.br.projeto.pizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.projeto.pizzaria.models.PizzariaModel;
import com.br.projeto.pizzaria.services.PizzariaService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class PizzariaController {
	@Autowired
	private PizzariaService pizzariaService;
	
	@GetMapping("/")
	public ModelAndView MostrarPizzas() {
		ModelAndView modelAndView = new ModelAndView("Pizzaria.html");
		modelAndView.addObject("ListaPizzaria", pizzariaService.MostrarPizzas());
		return modelAndView;		
	}
	@PostMapping("/salvarPizzas")
	public String salvarPizzas(PizzariaModel pizzariaModel) {
		PizzariaService.salvarPizzas(pizzariaModel);
		return "/salvarpizzas";
	}

}






