/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeiro;

/**
 *
 * @author Aluno
 */
public class Caixa {
    private float saldoInicial;
    private float saldoFinal;
    private float lucroDiario;
    private float saldoNegativo;
    public void saldo(){
    System.out.println("Meu saldo é 200");
}
    public void lucro(){
    System.out.println("Meu lucro diario é de R$700.00 por dia");
}
    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(float saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public float getLucroDiario() {
        return lucroDiario;
    }

    public void setLucroDiario(float lucroDiario) {
        this.lucroDiario = lucroDiario;
    }

    public float getSaldoNegativo() {
        return saldoNegativo;
    }

    public void setSaldoNegativo(float saldoNegativo) {
        this.saldoNegativo = saldoNegativo;
    }
}
