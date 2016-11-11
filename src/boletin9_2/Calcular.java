/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Calcular {
double cont;

public void calcularSumaProductos(){
    double acuSuma=0;
    double acuProducto=1;
    for(cont=10;cont<=90;cont++){
    acuSuma=acuSuma+cont;
    acuProducto=acuProducto*cont;
      
    }   
    System.out.println("Suma de los números del 10 al 90 = " + acuSuma + " Productos del 10 al 90 = " + acuProducto);
}

      
  }


    

