package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService
public class NumberService {

  
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Findlarger")
    public int Findlarger(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return (a>b)?a:b;
    }

    /**
     * Web service operation
     */
   
    
}
