import java.io.IOException;
import java.sql.SQLException;
import service.DTO;
import service.IService;
import service.impl.ServiceFactory;


public class main {

	public static void main(String[] args) {
		
           String env = "mysql";
          // quiero obtener el DTO
          IService service = ServiceFactory.getService(env);
          
		      DTO dto = null;
			   try {
						dto = service.invoke();
					} catch (ClassNotFoundException | IOException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		      
		  //    System.out.println(dto.toString());
	}

}
