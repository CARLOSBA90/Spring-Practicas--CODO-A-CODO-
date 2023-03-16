package service;

import java.io.IOException;
import java.sql.SQLException;

public interface IService {
	
	public DTO invoke() throws ClassNotFoundException, IOException, SQLException;

}
