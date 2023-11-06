package com.prjLivros.prjLivros.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.prjLivros.prjLivros.entities.Livros;
import com.prjLivros.prjLivros.repositories.LivrosRepository;

@Service
public class LivrosService {

private final LivrosRepository livrosRepository;
	
	public LivrosService(LivrosRepository livrosRepository) {
		this.livrosRepository = livrosRepository;
	}
	
	//inserir produto
    public Livros savelivros(Livros livros) {
	    return livrosRepository.save(livros);
		}

	// listar produto por id
	public Livros getLivrosById(Long id) {
		return livrosRepository.findById(id).orElse(null);
	}

	// listar todos os produtos
	public List<Livros> getAllLivros() {
		return livrosRepository.findAll();
	}

	// apagar produto
	public void deleteLivros(Long id) {
		livrosRepository.deleteById(id);
	}

	// fazendo o update do jogo com o optional
		public Livros updateLivros(Long id, Livros novolivros) {
	        Optional<Livros> livrosOptional = livrosRepository.findById(id);
	        if (livrosOptional.isPresent()) {
	        	Livros livrosExistente = livrosOptional.get();
	           	livrosExistente.setDescricao(novolivros.getDescricao());
	        	livrosExistente.setIsbn(novolivros.getIsbn());          
	            return livrosRepository.save(livrosExistente); 
	        } else {
	            return null; 
	        }
	    }
		
	    }
