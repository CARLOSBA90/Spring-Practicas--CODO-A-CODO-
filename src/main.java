import service.DTO;
import service.IService;
import service.impl.ServiceFactory;
import service.impl.ServiceMysqlImpl;
import service.impl.ServiceSIImp;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String env = "mysql";
          
          // quiero obtener el DTO
          
          IService service = ServiceFactory.getService(env);
          
		      DTO dto = service.invoke();
		      
		      System.out.println(dto.toString());
	}

}
