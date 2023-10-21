package com.mycompany.projetomat;

import java.text.DecimalFormat;

public class TroncoPiramide 
{
    private DecimalFormat deci = new DecimalFormat("0.00");
    private double h;
    private double baseMaior;
    private double baseMenor;
    private double areaLateral;
    public TroncoPiramide(double h, double baseMaior, double baseMenor)
    {
        try
        {
            this.h = h;
            this.baseMaior = baseMaior;
            this.baseMenor = baseMenor;   
        }
        catch (Exception ex)
        {
            //não faz nada
        }
    }
    
    public TroncoPiramide(double areaLateral, double baseMaior, double baseMenor, int decisao){
        if (decisao == 2){
            try{
                this.areaLateral = areaLateral;
                this.baseMaior = baseMaior;
                this.baseMenor = baseMenor;
            } 
            catch (Exception ex){
                // não faz nada
            }
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
       return this.baseMaior + this.baseMenor + this.areaLateral;
    }
    
    public String mostrarCalculoVolume(int estado){
        switch (estado) {
            case 0:
                return null;
            case 1:
                return String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor;
            case 2:
                return String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor + "\n" +
                        String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + " + deci.format(calculaSegundaParteVolume());
            case 3:
                return String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor + "\n" +
                        String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + " + deci.format(calculaSegundaParteVolume())
                        + "\n" + deci.format(calculaPrimeiraParteVolume()) + " * " + deci.format(calculaSegundaParteVolume());
                
            case 4:
                return String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + raiz(" +
                        this.baseMaior + " * " + this.baseMenor + ") + " + this.baseMenor + "\n" +
                        String.valueOf(h) + "/ 3 * " + String.valueOf(this.baseMaior) + " + " + deci.format(calculaSegundaParteVolume())
                        + "\n" + deci.format(calculaPrimeiraParteVolume()) + " * " + deci.format(calculaSegundaParteVolume()) + "\n"
                        + "= O volume é: --->  " + deci.format(volume());
            default:
                return "Limite final";
        }
        
    }
    
    public String mostrarCalculoArea(int estado){
        switch (estado) {
            case 0:
                return null;
            case 1:
                return "A = " + this.baseMaior + " + " + this.baseMenor + " + " + this.areaLateral;
            case 2:
                return "A = " + this.baseMaior + " + " + this.baseMenor + " + " + this.areaLateral + "\n"
                        + "A = --> " + deci.format(area());
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
