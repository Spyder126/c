/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Abhijeet
 */
@WebService(serviceName = "additionService")
public class additionService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public int addition(@WebParam(name = "a") int a, @WebParam(name = "b") int b, @WebParam(name = "c") int c) {
        //TODO write your implementation code here:
        return a+b+c ;
    }

   
}
