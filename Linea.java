
package impuestovehicular;

public class Linea {
    //este metodo es para saber la linea del carro la definimos entre lite y pro.
    //se procede hacer el monto dependiendo siel carro es lite o pro
    public double IngresarLinea(){
        int menu;
        double monto1=0;
                        
        Carro leerDato1 = new Carro();
        menu = leerDato1.leerDatoTipoEntero("Linea del vehiculo"+"\n"+"Ingrese la opcion correspondiente:"+"\n"+"1. Lite"+"\n"+"2. Pro");
        
        switch(menu){
            case 1:
                // si el vehiculo es lite se aplica un monto de:
                monto1 = 500000;
                break;
            case 2:
                // si el vehiculo es pro se aplica un monto de:
                monto1 = 1500000;
                break;            
        }  
        return monto1;
    }
    
}
