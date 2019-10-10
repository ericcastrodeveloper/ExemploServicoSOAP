package com.company;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CepTest {

    private static CepWebService cepWebService;

    public void getWebService() throws MalformedURLException {


        URL url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");

        QName qname = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");

        Service ws = Service.create(url, qname);

        QName qnamePort = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClientePort");

        cepWebService = ws.getPort(qnamePort, CepWebService.class);

        CepResponse response = cepWebService.consultaCep("01331000");

        System.out.println(response.toString());

    }
}

