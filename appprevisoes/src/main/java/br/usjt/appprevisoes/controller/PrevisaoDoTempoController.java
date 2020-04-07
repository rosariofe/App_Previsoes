package br.usjt.appprevisoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import br.usjt.appprevisoes.model.PrevisaoDoTempo;
import br.usjt.appprevisoes.service.PrevisaoDoTempoService;

public class PrevisaoDoTempoController {
	@Autowired
	
	private PrevisaoDoTempoService previsaoDoTempoService;
	@GetMapping("/previsaodotempo")
	
	public ModelAndView listarTemperatura() {
		
		ModelAndView mv = new ModelAndView("lista_previsao");
		
		mv.addObject(new PrevisaoDoTempo());
		
		List<PrevisaoDoTempo> previsao = previsaoDoTempoService.listarTodos();
		
		mv.addObject("previsao", previsao);
		return mv;
	}
	
	public String salvar(PrevisaoDoTempo previsaodotempo) {
		previsaoDoTempoService.salvar(previsaodotempo);
		return "redirect:/previsaodotempo";
	}
}
