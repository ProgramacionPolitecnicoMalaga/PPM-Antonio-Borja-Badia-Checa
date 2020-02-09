public class GestionConcesionario {

    public static void main(String[] args) {
//Añadimos clientes
        Clientes clientes = new Clientes();
        Cliente cliente1= new Cliente("Miguel", "Apellido1","25415454S",8.500);
     Cliente cliente2=   clientes.annadirCliente(new Cliente("Cliente2", "Apellido2","2484545A",12.800));
       Cliente cliente3= clientes.annadirCliente(new Cliente("Cliente3", "Apellido3","2541545B",4.500));
        Cliente cliente4= clientes.annadirCliente(new Cliente("Cliente4", "Apellido4","25415454C",6.850));
        Cliente cliente5=clientes.annadirCliente(new Cliente("Cleinte5", "Apellido5","25415454T",28.900));
    Cliente cliente6 = clientes.annadirCliente(new Cliente("Cliente6", "Apellido6","24867845B", 14.400));
        //Imprimimos los clientes añadidos
     //clientes.listarClientesNombres();
        clientes.listarClientesInformacionCompleta();
//Añadimos vehículos
        Vehiculos vehiculos= new Vehiculos();
        Vehiculo modelo1= new Vehiculo("Modelo1","Marca1","Azul","2010","Usado",8.500, "7894613");
       Vehiculo modelo2 =(new Vehiculo("Modelo2","Marca2","Verde Botella","2010","Usado",11.500, "145787"));
        Vehiculo modelo3= vehiculos.annadirVehiculo(new Vehiculo("Modelo3","Marca3","Amarillo","2010","Usado",12.000, "898653"));
     Vehiculo modelo4=   vehiculos.annadirVehiculo(new Vehiculo("Modelo4","Marca4","Rojo","2010","Usado",4.500, "6464232"));
        Vehiculo modelo5= vehiculos.annadirVehiculo(new Vehiculo("Modelo5","Marca5","Negro","2010","Usado",6.800, "223666645"));
        Vehiculo modelo6= vehiculos.annadirVehiculo(new Vehiculo("Modelo6","Marca6","Gris Plata","2019","Nuevo",25.000, "4116624"));

        //Listamos por patalla los vehículos
  //  vehiculos.listarVehiculoPorNumeroBastidor();
vehiculos.listarVehiculosInformacionCompleta();

//Realizar venta
      Contratos contratos = new Contratos();

        Contrato contrato1 = new Contrato(modelo1, cliente1, "Venta", 7.500);
        contratos.annadirContrato(contrato1);
Contrato contrato2 = new Contrato(modelo2,cliente2,"Compra",9000 );
        contratos.annadirContrato(contrato2);
        contratos.listarContratos();
//Restamos o sumamos el saldo a la cuenta corriente del cliente, dependiendo si es una venta o una compra

        contratos.ContratoCompraVenta(cliente1.);

    }
}
