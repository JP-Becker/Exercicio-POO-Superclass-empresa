package model;

import javax.swing.JOptionPane;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private int cep;
    private int fone;
    
    public Empresa () {
        this("", "", "", "", 0, 0);
    }
    
    public Empresa(String nome, String endereco, String cidade, String estado, int cep, int fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;  
    }
 
    // Metodos get
     public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getCep() {
        return cep;
    }

    public int getFone() {
        return fone;
    }

    // **Métodos Setters**

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public void setCep(String cep) {
        this.cep = Integer.parseInt(cep);
    }

    public void setFone(int fone) {
        this.fone = fone;
    }
    
     public void setFone(String fone) {
        this.fone = Integer.parseInt(fone);
    }
    
    public void leitura() {
       setNome(JOptionPane.showInputDialog("digite o nome"));
       setEndereco(JOptionPane.showInputDialog("digite o endereço"));
       setCidade(JOptionPane.showInputDialog("digite a cidade"));
       setEstado(JOptionPane.showInputDialog("digite o estado"));
       setCep(JOptionPane.showInputDialog("digite o CEP"));
       setFone(JOptionPane.showInputDialog("digite o Fone"));
    }
    
    public void imprimir() {		
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() + "\nEndereço: " + getEndereco() + 
                "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\nCEP: " + getCep() + "\nFone: " + getFone());	
    }	
}
