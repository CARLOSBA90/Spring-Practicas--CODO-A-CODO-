package data;

public class MysqlConnection implements IConnection<DatoDeMysql> {

	@Override
	public DatoDeMysql execute() {

		///dato interno, no el que sale del metodo
		DatoDeMysql registro = new DatoDeMysql(123L,"Jose",null,false, null,"Argentino");
		
		return registro;
	}

}
