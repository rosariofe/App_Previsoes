package br.usjt.appprevisoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.appprevisoes.model.PrevisaoDoTempo;
import br.usjt.appprevisoes.repository.PrevisaoDoTempoRepository;

@Service
public class PrevisaoDoTempoService {
	@Autowired
	private PrevisaoDoTempoRepository previsaoDoTempoRepo;
	
	public void salvar(PrevisaoDoTempo previsaoDoTempo){
		previsaoDoTempoRepo.save(previsaoDoTempo);
	}
	
	public List<PrevisaoDoTempo> listarTodos(){
		List<PrevisaoDoTempo> previsao = previsaoDoTempoRepo.findAll();
		for (PrevisaoDoTempo previsaotemp : previsao)
				
			previsaotemp.getTempmaxima();
		
		return previsao;
	}
	
	
}
