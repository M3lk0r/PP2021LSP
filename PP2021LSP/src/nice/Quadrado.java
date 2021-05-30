/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice;

/**
 *
 * @author eduar
 */
public class Quadrado extends Figura {

  public String nome;
  private double tamanho;
  public void setTamanho(double tamanho){
    this.tamanho = tamanho;
  }

  @Override
  public String setNome(){
    return this.nome = "'Quadrado'";
  }

  @Override
  public double Area(){
    return Math.pow(tamanho, 2);
  }
}