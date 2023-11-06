package com.prjLivros.prjLivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjLivros.prjLivros.entities.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long>{

}
