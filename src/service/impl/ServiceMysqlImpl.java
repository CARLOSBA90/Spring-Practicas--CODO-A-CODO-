package service.impl;
import service.DTO;
import service.IService;
import data.*;

public class ServiceMysqlImpl implements IService{ //control+t

	IConnection<DatoDeMysql> connection;
	
	public ServiceMysqlImpl() {
		this.connection = new MysqlConnection();
	}
	
	@Override
	public DTO invoke() {
		// TODO Auto-generated method stub
		
		DatoDeMysql resp = connection.execute();
		
		
		return new DTO(resp.getId(),resp.getNombre(),resp.getNacionalidad());
	}

}
