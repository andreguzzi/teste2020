package br.com.springteste.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Transactional
	public void saveCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}
	
	

}
