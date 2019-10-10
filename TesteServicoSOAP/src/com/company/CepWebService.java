package com.company;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", portName = "AtendeClientePort", serviceName = "")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface CepWebService {

    @WebMethod(operationName = "consultaCEP")
    CepResponse consultaCep(@WebParam(name="cep") String cep);
}
