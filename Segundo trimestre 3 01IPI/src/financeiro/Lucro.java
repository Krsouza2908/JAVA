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
public class Lucro {
    private float negativo;
    private float positivo;
    private String data;
    private float media;

    public float getNegativo() {
        return negativo;
    }

    public void setNegativo(float negativo) {
        this.negativo = negativo;
    }

    public float getPositivo() {
        return positivo;
    }

    public void setPositivo(float positivo) {
        this.positivo = positivo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
