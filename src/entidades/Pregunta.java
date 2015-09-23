package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Pregunta {

    String tematica;
    int complejidad;
    String enunciado;
    String correcta;
    String incorrecta1;
    String incorrecta2;
    String incorrecta3;

    public Pregunta() {
    }
    
    public Pregunta(int complejidad, String enunciado, String correcta, String incorrecta1, String incorrecta2, String incorrecta3) {
        this.complejidad = complejidad;
        this.enunciado = enunciado;
        this.correcta = correcta;
        this.incorrecta1 = incorrecta1;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public String getIncorrecta1() {
        return incorrecta1;
    }

    public void setIncorrecta1(String incorrecta1) {
        this.incorrecta1 = incorrecta1;
    }

    public String getIncorrecta2() {
        return incorrecta2;
    }

    public void setIncorrecta2(String incorrecta2) {
        this.incorrecta2 = incorrecta2;
    }

    public String getIncorrecta3() {
        return incorrecta3;
    }

    public void setIncorrecta3(String incorrecta3) {
        this.incorrecta3 = incorrecta3;
    }

}
