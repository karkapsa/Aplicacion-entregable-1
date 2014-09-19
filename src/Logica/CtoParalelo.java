/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author 15
 */
public class CtoParalelo 
{
    private double r1,r2,r3,resul;

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public double getR3() {
        return r3;
    }

    public void setR3(double r3) {
        this.r3 = r3;
    }
    
    public double calcircu(double r1,double r2,double r3){
        
       resul=r1+r2+r3;
        return 10/resul;
    }
    
    
    
}
