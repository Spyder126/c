/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Abhijeet
 */
@WebService(serviceName = "MultiplyService")
public class MultiplyService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiply")
    public int Multiply(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a*b;
    }

}