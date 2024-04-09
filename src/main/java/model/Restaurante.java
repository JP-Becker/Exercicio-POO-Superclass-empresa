
package model;

import javax.swing.JOptionPane;


public class Restaurante extends Empresa {
    private String tipoDeComida;
    private int precoMedio;
    
    public Restaurante () {
        this ("", 0);
    }
    
    public Restaurante ( String tipoDeComida, int precoMedio) {
        this.tipoDeComida = tipoDeComida;
        this.precoMedio = precoMedio;
    }
    
     // **Métodos Getters**

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public int getPrecoMedio() {
        return precoMedio;
    }

    // **Métodos Setters**

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public void setPrecoMedio(int precoMedio) {
        this.precoMedio = precoMedio;
    }
    
    public void setPrecoMedio(String precoMedio) {
        this.precoMedio = Integer.parseInt(precoMedio);
    }
    
    public void leitura() {
       super.leitura();
       setTipoDeComida(JOptionPane.showInputDialog("Digite o prato mais popular"));	
       setPrecoMedio(JOptionPane.showInputDialog("Digite o preco medio gastono restaurante"));
    }
    
    @Override
    public void imprimir() {
       super.imprimir();
       JOptionPane.showMessageDialog(null, "\nPrato favorito: " + getTipoDeComida() + "\nPreco medio: " + getPrecoMedio());
    }
}
