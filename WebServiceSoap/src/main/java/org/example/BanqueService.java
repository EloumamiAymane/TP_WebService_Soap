package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "IBanqueService")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name = "montant") int mt){
        return mt*12;
    }
    @WebMethod
    public Compte getCompte( @WebParam(name = "code") int code){
        return new Compte(code,5000,new Date());
    }
    @WebMethod
    public List<Compte>listComptes(){
        return  List.of(
                new Compte(1,8000,new Date()),
                new Compte(2,5000,new Date()),
                new Compte(3,4000,new Date())
                );
    }
}
