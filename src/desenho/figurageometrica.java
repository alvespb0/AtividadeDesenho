/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenho;

/**
 *
 * @author IFSC
 */
public class figurageometrica {
    public desenho desenho;
    public figurageometrica (desenho des){
        desenho = des;
    }
    public void desenhar (){
        desenho.desenhar();
    }
}
