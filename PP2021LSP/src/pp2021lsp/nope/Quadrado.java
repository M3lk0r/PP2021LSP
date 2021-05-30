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
public class Quadrado extends Retangulo {

  @Override
  public void setAltura(double altura){
    super.setAltura(altura);
    super.setLargura(altura);
  }

  @Override
  public void setLargura(double largura){
    super.setLargura(largura);
    super.setAltura(largura);
  }
}