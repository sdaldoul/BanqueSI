package org.glsid.metier;

import java.util.List;

import org.glsid.dao.ClientRepsitory;
import org.glsid.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientMetierImpl implements ClientMetier {
	
	@Autowired
	private ClientRepsitory clientRepsitory;

	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepsitory.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepsitory.findAll();
	}

}
