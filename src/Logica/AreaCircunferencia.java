/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Vista.FrmAreaCircunferencia;

/**
 *
 * @author 15
 */
public class AreaCircunferencia {
               double Area,Area2; 
                    
 public double Areacircun (double Radio){
     Area= (Math.pow(Radio,2));
     Area2=Math.PI*Area;
     return Area2;
           }
}