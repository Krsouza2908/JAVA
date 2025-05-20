/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliver;

/**
 *
 * @author Aluno
 */
public class Pedido_04 {
    private String data;
    private String cliente;
    private String hora;
    private float valor;
    
    public void hora(){
    System.out.println("Na hora 21h00 da noite");
    }
    
    public void cliente(){
    System.out.println("Pelo cliente Pedro");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
