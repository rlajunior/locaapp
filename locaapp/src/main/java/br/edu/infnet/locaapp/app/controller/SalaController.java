package br.edu.infnet.locaapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.locaapp.app.model.Sala;

@Controller
public class SalaController {

	@Autowired
	private SalaService service;
	
	@RequestMapping(value = "/salas/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Sala> salas = service.getSalas();
		model.addAttribute("listaSalas", salas);
		return "salas/list";
	}
	
	@RequestMapping(value = "/salas/form" , method = RequestMethod.GET)
	public String viewForm(Model model) {
		return "salas/form";
	}
	
	
	@RequestMapping(value = "/salas/add", method = RequestMethod.POST)
	public String save(Model model, Sala sala) {
		service.persite(sala);
		return "redirect:/salas/list";
	}
	
	@RequestMapping(value = "/salas/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") String id, Model model) {
		Sala sala = service.getSala(id);
		model.addAttribute("sala", sala);
		return "salas/edit";
	}
	
	@RequestMapping(value = "/salas/update", method = RequestMethod.POST)
	public String update(Model model, Sala sala) {
		service.update(sala);
		return "redirect:/salas/list";
	}
	
	@RequestMapping(value = "/salas/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Integer id, Model model) {
		service.delete(id);
		model.addAttribute("sala", id);
		return "redirect:/salas/list";
	}
	
	public SalaService getService() {
		return service;
	}

	public void setService(SalaService service) {
		this.service = service;
	}
	
}
