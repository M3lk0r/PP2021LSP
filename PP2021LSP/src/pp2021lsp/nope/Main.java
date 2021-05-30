/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021lsp.nope;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Main {
  public static void main(String[] args) {
    ArrayList<Retangulo> objetos = new ArrayList<Retangulo>(5);

    Retangulo obj = new Retangulo();
    obj.setNome("Retangulo");
    obj.setAltura(4);
    obj.setLargura(5);

    objetos.add(obj);
    
    Retangulo quadrado = new Quadrado();
    quadrado.setNome("Quadrado");
    quadrado.setAltura(4);
    quadrado.setLargura(5);

    objetos.add(quadrado);

    for (Retangulo figura : objetos){
      System.out.println("A área do "+ figura.nome +" é: " + figura.Area());
    }
  }
}