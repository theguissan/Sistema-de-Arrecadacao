/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author estagio5
 */
public interface Pagamento {
    public String valorTotal();
    public String simularAcordo(float porcentagem);
    public void fazerAcordo(float porcentagem);    
}
