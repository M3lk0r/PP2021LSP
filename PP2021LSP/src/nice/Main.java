/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Main {
  public static void main(String[] args) {
    ArrayList<Figura> objetos = new ArrayList<Figura>(5);

    Retangulo obj = new Retangulo();
    obj.setAltura(4);
    obj.setLargura(5);
    objetos.add(obj);

    Quadrado quadrado = new Quadrado();
    quadrado.setTamanho(5);
    objetos.add(quadrado);

    for (Figura figura : objetos){
      System.out.println("A área do "+ figura.setNome() +" é: " + figura.Area());
    }
  }
}