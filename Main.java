
package impuestovehicular;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //creamos un objeto de esta clase y con ella llamamos el metodo mostrar que es el que se encarga 
        //de pedir los datos y hacer el respectivo calculo para mostrar el imuesto 
        Main main = new Main(); 
        
        main.mostrar();       
    }
    
    public void mostrar(){
        Liquidacion mostrar = new Liquidacion(); 
        //Carro mostrar1 = new Carro();
         
        // solicitamos los datos y se procede a calcular el valor comercial 
        mostrar.solicitarDatos();
        // el usuario debe digitar si pago a tiempo, es de servicio publico, traslado de cuenta 
       //y con esos datos se procede hacer el descuento
        mostrar.mostrarLiquidacion();
    }
    
    
    
}
