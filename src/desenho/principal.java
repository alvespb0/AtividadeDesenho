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
public class principal {
    public static void main(String[] args) {
        quadrado q = new quadrado();
        figurageometrica fg = new figurageometrica (q);
        q.desenhar();
        triangulo t = new triangulo ();
        figurageometrica fg2 = new figurageometrica (t);
        t.desenhar();
        circulo c = new circulo ();
        figurageometrica fg3 = new figurageometrica (c);
        c.desenhar();
    }
}
