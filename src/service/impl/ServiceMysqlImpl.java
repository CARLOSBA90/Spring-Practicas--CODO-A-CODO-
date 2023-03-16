package service.impl;
import service.DTO;
import service.IService;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.DbManager;



import data.*;

public class ServiceMysqlImpl  implements IService { //control+t

	IConnection<DatoDeMysql> connection;
	
	public ServiceMysqlImpl() {
		this.connection = new MysqlConnection();
	}
	
	@Override
	public DTO invoke() throws ClassNotFoundException, IOException, SQLException {
		/***
		MEJORAR DISTRIBUCION DE CODIGO
		                 ***/
		
		Connection conn = DbManager.execute();
		Statement miStatement = null;
		ResultSet miResulset = null;
		miStatement = conn.createStatement();
		
		List<DTO> DTOs = new ArrayList();
		
		/// EJECUTAR SQL
		miResulset = miStatement.executeQuery("select * from user");

          while (miResulset.next()){
        	             //// PUEDE FALLAR SI EL PRIMER ARGUMENTO NO ES DE TIPO LONG
			        	 DTOs.add(new DTO(Long.parseLong(miResulset.getString(1)),miResulset.getString(2),miResulset.getString(3)));
			        }
		
		/**             **/
          DatoDeMysql resp = connection.execute();
		return new DTO(resp.getId(),resp.getNombre(),resp.getNacionalidad());
	}

}
