
import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> caja1 = new Caja<>();
        Caja<Integer> caja2 = new Caja<>();
        Caja<Double> caja3 = new Caja<>();
        Caja<Boolean> caja4 = new Caja<>();
        caja1.setT("Hola mundo");
        caja2.setT(100);
        caja3.setT(9.75);
        caja4.setT(false);
        Par<Integer, String> par1 = new Par<>();
        Par<String, Integer> par2 = new Par<>();
        Par<String, Double> par3 = new Par<>();
        par1.setK(1);
        par1.setV("Juan Perez");
        par2.setK("Edad");
        par2.setV(20);
        par3.setK("Promedio");
        par3.setV(8.75);
        System.out.println("-----Uso de caja<T>-----");
        System.out.println("Caja de Texto: " + caja1.getT());
        System.out.println("Caja de entero: " + caja2.getT());
        System.out.println("Caja de decimal: " + caja3.getT());
        System.out.println("Caja de decimal: " + caja4.getT());
        System.out.println("-----Uso de Par<k,V>-----");
        System.out.println("Clave: "+ par1.getK()+" | "+"Valor: "+par1.getV());
        System.out.println("Clave: "+ par2.getK()+" | "+"Valor: "+par2.getV());
        System.out.println("Clave: "+ par3.getK()+" | "+"Valor: "+par3.getV());

    }
}
