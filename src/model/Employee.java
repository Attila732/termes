/*
* File: MainConsole.java
* Author: Kovács Attila
* Copyright: 2023, Kovács Attila
* Group: Szoft II/2/N
* Date: 2023-10-19
* Github: https://github.com/Attila732/
* Licenc: GNU GPL
*/
package model;

public class Employee {
    private String id;
    private String nev;
    private String dulo;
    private String termes;
    private int betakaritas;

    public String getid() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return nev;
    }

    public void setName(String nev) {
        this.nev = nev;
    }

    public String getDulo() {
        return dulo;
    }

    public void setDulo(String dulo) {
        this.dulo = dulo;
    }

    public String getTermes() {
        return termes;
    }

    public void setTermes(String termes) {
        this.termes = termes;
    }

    public int getBetakaritas() {
        return betakaritas;
    }

    public void setBetakaritas(int betakaritas) {
        this.betakaritas = betakaritas;
    }

}
