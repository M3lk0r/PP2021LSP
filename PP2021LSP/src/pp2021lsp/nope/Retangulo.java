/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021lsp.nope;

/**
 *
 * @author eduar
 */
public class Retangulo{

  public String nome;
  private double altura;
  private double largura;

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  public void setLargura(double largura){
    this.largura = largura;
  }

  public double Area(){
    return largura * altura;
  }
}