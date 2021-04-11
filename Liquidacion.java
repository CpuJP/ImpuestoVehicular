
package impuestovehicular;

import javax.swing.JOptionPane;

public class Liquidacion {
    //atributos globales 
    double valorComercial;
    double montoMarca;
    double montoLinea;
    double montoModelo;
    double impuestoNN;
    double impuestoFinal;
    double descuento1;
    double descuento2;
    double impuestofinal2;
    
    /*        
    Marca ob1 = new Marca();
    Linea ob2 = new Linea();
    Modelo ob3 = new Modelo();
    
    double montoMarca = ob1.IngresarMarca();
    double montoLinea = ob2.IngresarLinea();
    double montoModelo = ob3.IngresarModelo();
    
    valorComercial = montoMarca + montoLinea + montoModelo;
    */
    
    //solicitamos loa datos se calcula el valor comercial y luego se procede a aplicar el impuesto 
    public void solicitarDatos(){
        
        Marca ob1 = new Marca();
        Linea ob2 = new Linea();
        Modelo ob3 = new Modelo();
    
        montoMarca = ob1.IngresarMarca();
        montoLinea = ob2.IngresarLinea();
        montoModelo = ob3.IngresarModelo();
        
      
        
        valorComercial = montoMarca + montoLinea + montoModelo;
        
        impuestoNN = valorComercial * 0.10;
        
    }
    /*
    public double calcularLiquidacion(){    
        double holisim;
        holisim = impuestoNN;
        JOptionPane.showMessageDialog(null, holisim);
        
        return holisim;
    }
    
    public void calImp(){
        double ayudaplox = 1;
        ayudaplox = valorComercial * 0.10;
        JOptionPane.showMessageDialog(null, ayudaplox);
        
    }
    */
    // en este metodo el usuario debe digitar si calcelo el vehiculo a tiempo, servicio publico
    //o traslado de cuenta y se proceden hacer los descuentos 
    public void mostrarLiquidacion(){                          
        
        //Descuento descuento = new Descuento();
                                                
        JOptionPane.showMessageDialog(null, "El valor comercial del automovil ingresado es: "+valorComercial);
        JOptionPane.showMessageDialog(null, "El impuesto incial es: "+impuestoNN);
        Carro imp = new Carro();
        impuestoFinal =impuestoNN;
       
        
        
        String opcion1 = imp.leerDatoTipoCadena("Usted cancelo el vehiculo a tiempo?");
        
        // si calcelo el vehiculo a tiempo hacemos un descuento de 0.01
        if ("si".equalsIgnoreCase(opcion1)) {
            descuento1 = valorComercial * 0.01;
            impuestoFinal = impuestoFinal - descuento1;
        }
        
        String opcion2 = imp.leerDatoTipoCadena("Usted es de servicio publico?");
        
        // si calcelo el vehiculo a tiempo hacemos un descuento de 15000
        if ("si".equalsIgnoreCase(opcion2)) {            
            impuestoFinal = impuestoFinal - 15000;
        }
        
        String opcion3 = imp.leerDatoTipoCadena("Usted ha trasladado su cuenta?");
        
        // si calcelo el vehiculo a tiempo hacemos un descuento de 0.02
        if ("si".equalsIgnoreCase(opcion3)) {            
            descuento2 = valorComercial * 0.02;
            impuestoFinal = impuestoFinal - descuento2;
        }
            
        
        // se muestra el impuesto a pagar teniendo en cuenta los descuentos 
        JOptionPane.showMessageDialog(null, "El impuesto a pagar con los descuentos aplicados es de: "+impuestoFinal);
        //descuento.definirDescuento();
                
    }
        
}
