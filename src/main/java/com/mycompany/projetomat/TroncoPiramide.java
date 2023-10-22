package com.mycompany.projetomat;

import java.text.DecimalFormat;

public class TroncoPiramide 
{
    private DecimalFormat deci = new DecimalFormat("0.00");
    private double h;
    private double baseMaior;
    private double baseMenor;
    
    public TroncoPiramide(double h, double baseMaior, double baseMenor){

            try{
                this.h = h;
                this.baseMaior = baseMaior;
                this.baseMenor = baseMenor;
            } 
            catch (Exception ex){
                // não faz nada
            }
    }
 

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
    
    public double area(){
       return this.baseMaior + this.baseMenor + this.h;
    }
    
    public String mostrarCalculoVolume(int estado){
        switch (estado) {
            case 0:
                return null;
            case 1:
                return "V = h/3 . (AB + Ab + raiz(Ab * AB))";
            case 2:
                return "V = h/3 . (AB + Ab + raiz(Ab * AB))\n" + String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor;
            case 3:
                return "V = h/3 . (AB + Ab + raiz(Ab * AB))\n" + String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor + "\n" +
                        String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + " + deci.format(calculaSegundaParteVolume());
            case 4:
                return "V = h/3 . (AB + Ab + raiz(Ab * AB))\n" + String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor + "\n" +
                        String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + " + deci.format(calculaSegundaParteVolume())
                        + "\n" + deci.format(calculaPrimeiraParteVolume()) + " * " + deci.format(calculaSegundaParteVolume());
                
            case 5:
                return "V = h/3 . (AB + Ab + raiz(Ab * AB))\n" + String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor + "\n" +
                        String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + " + deci.format(calculaSegundaParteVolume())
                        + "\n" + deci.format(calculaPrimeiraParteVolume()) + " * " + deci.format(calculaSegundaParteVolume()) + "\n"
                        + "= O volume é: " + deci.format(volume());
            default:
                return "Limite final";
        }
        
    }
    
    public String mostrarCalculoArea(int estado){
        switch (estado) {
            case 0:
                return null;
            case 1:
                return "AT = AB + Ab + Al";
            case 2:
                return "AB = " + this.baseMaior + "\nAb = " + this.baseMenor + "\nAl = " + this.h;
            case 3:
                return "AT = " + this.baseMaior + " + " + this.baseMenor + " + " + this.h;
            case 4:
                return "AT = " + this.baseMaior + " + " + this.baseMenor + " + " + this.h + "\n"
                        + "AT = " + deci.format(area());
            default:
                return "Limite final";
        }

    }
    
    private double calculaPrimeiraParteVolume(){
        return h / 3;
    }
    
    private double calculaSegundaParteVolume(){
        return this.baseMaior + Math.sqrt(this.baseMaior * this.baseMenor) + this.baseMenor;
    }
    
    public double volume(){
        return calculaPrimeiraParteVolume() * calculaSegundaParteVolume(); 
    }
    
    
}
