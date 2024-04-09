package principal;
import model.Empresa;
import model.Restaurante;

public class Principal {
    public static void main(String[] args) {
//        Empresa empresa = new Empresa();
        Restaurante res = new Restaurante();
        
        res.leitura();
        res.imprimir();
    }
}
