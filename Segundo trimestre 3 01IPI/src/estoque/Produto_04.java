/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

/**
 *
 * @author Aluno
 */
public class Produto_04 {
    private String data;
    private String tipo;
    private String empresa;
    private String usabilidae;
    
    public void data(){
    System.out.println("No dia 10/10/2025");
    }
    
    public void empresa(){
    System.out.println("Pela empresa Resilva");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUsabilidae() {
        return usabilidae;
    }

    public void setUsabilidae(String usabilidae) {
        this.usabilidae = usabilidae;
    }
}
