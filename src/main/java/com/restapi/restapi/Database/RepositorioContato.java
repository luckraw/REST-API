package com.restapi.restapi.Database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.restapi.Entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}
