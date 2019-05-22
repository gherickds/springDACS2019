package br.univille.dacs2019.service;

import org.springframework.stereotype.Service;

import java.util.List;

import br.univille.dacs2019.model.Cliente;

@Service
public interface ClienteService {

	List<Cliente> getAll();

	void save(Cliente cliente);
}
