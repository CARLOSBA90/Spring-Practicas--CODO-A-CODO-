package service.impl;

import service.IService;

public class ServiceFactory {

	public static IService getService(String key) {
	       IService service = switch(key) {
	          case "mysql":{
	        	  yield new ServiceMysqlImpl();
	          }
	          case "rest":{
	        	  yield new ServiceSIImp();
	          }
	          
	          default: 
	        	  throw new IllegalArgumentException("Unexpect value "+ key);
	      };
	      
	      return service;
	}
}
