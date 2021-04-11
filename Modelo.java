
package impuestovehicular;

public class Modelo {
    // en este metodo el usuario debe digitar el modelo del vehiculo y se procede hacer el moto 
    public double IngresarModelo(){
        int menu;
        double monto2=0;
                        
        Carro leerDato2 = new Carro();
        menu = leerDato2.leerDatoTipoEntero("Modelo del vehiculo"+"\n"+"Ingrese la opcion correspondiente:"+"\n"+"1. 1900 - 1950"+"\n"+"2. 1951 - 2000"+"\n"+"3. 2001 - 2050");
        
        switch(menu){
            case 1:
                //si el vehiculo es de 1900 - 1950 el monto es:
                monto2 = 300000;
                break;
            case 2:
                 //si el vehiculo es de 1951 - 2000 el monto es:
                monto2 = 600000;
                break;
            case 3:
                //si el vehiculo es de 2001 - 2050 el monto es:
                monto2 = 900000;
                break;            
        }
        
        return monto2;
    }
    
}
