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
@WebService(serviceName = "CubeService")
public class CubeService {

    @WebMethod(operationName = "Cube")
    public int Cube(@WebParam(name = "a") int a) {
        //TODO write your implementation code here:
        return a*a*a;
    }
}
