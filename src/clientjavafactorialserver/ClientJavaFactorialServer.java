/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavafactorialserver;

/**
 *
 * @author sergio
 */
public class ClientJavaFactorialServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El factorial de 3 es: " + factorial(3));
    }

    private static int factorial(int factorial) {
        services.FactorialWebService_Service service = new services.FactorialWebService_Service();
        services.FactorialWebService port = service.getFactorialWebServicePort();
        return port.factorial(factorial);
    }
    
}
