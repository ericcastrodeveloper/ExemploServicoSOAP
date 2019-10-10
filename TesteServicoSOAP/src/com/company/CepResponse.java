package com.company;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "return")
public class CepResponse {

    String bairro;
    String cep;
    String cidade;
    String end;
    String complemento2;
    String uf;


    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getComplemento2() {
        return complemento2;
    }

    public void setComplemento2(String complemento2) {
        this.complemento2 = complemento2;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "CepResponse{" +
                "bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", end='" + end + '\'' +
                ", complemento2='" + complemento2 + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}

