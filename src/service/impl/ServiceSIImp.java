package service.impl;

import data.DataFile;
import data.IConnection;
import service.DTO;
import service.IService;

public class ServiceSIImp implements IService {

	IConnection<DataFile> connection;
	
	@Override
	public DTO invoke() {
		// TODO Auto-generated method stub
		
		DataFile resp = connection.execute();
		
		
		return new DTO(resp.getId(),resp.getNombre(),resp.getNacionalidad());
	}

}
