
package impuestovehicular;

public class Marca {
    
    public double IngresarMarca(){
        int menu;
        double monto=0;
                        
        Carro leerDato = new Carro();
        menu = leerDato.leerDatoTipoEntero("Marca del vehiculo"+"\n"+"Ingrese la opcion correspondiente:"+"\n"+"1. Mercedes-Benz"+"\n"+"2. Toyota"+"\n"+"3. Volkswagen"+"\n"+"4. BMW"+"\n"+"5. Chevrolet");
        
        switch(menu){
            case 1:
                monto = 1000000;
                break;
            case 2:
                monto = 2000000;
                break;
            case 3:
                monto = 3000000;
                break;
            case 4:
                monto = 4000000;
                break;
            case 5:
                monto = 5000000;
                break;
        }    
        return monto;
    }
}
