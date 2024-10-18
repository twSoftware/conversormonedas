import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();
        Double monto;

        //System.out.println(monedaExchangeRate);

        //System.out.println(miMoneda);
        Scanner lectura = new Scanner(System.in);
        String opcionMenu;
        MonedaExchangeRate monedaExchangeRate;
        Moneda miMoneda;

        do{
            System.out.println("********************************************************\n" +
                    "Bienvenide al conversor de moneda, elija la opción deseada :D\n" +
                    "1.-Dolar -->> Peso mexicano.\n" +
                    "2.-Peso mexicano -->> Dolar\n" +
                    "3.-Dolar -->>Real brasileño\n" +
                    "4.-Real brasileño -->> Dolar\n" +
                    "5.-Dolar-->> Peso colombiano\n" +
                    "6.-Peso colombiano -->> Dolar\n" +
                    "7.-Salir.\n" +
                    "*********************************************************************\n");
            opcionMenu = lectura.nextLine();

            switch (opcionMenu){
                case "1":
                    System.out.println("Ingresa el monto que deseas convertir: ");
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                    monedaExchangeRate = consulta.buscaTipoDeCambio("USD","MXN", monto);
                    miMoneda = new Moneda(monedaExchangeRate);
                    System.out.println("El valor de "+ monto+ " USD"+" corresponde al valor de "+miMoneda+" MXN");

                    break;
                case "2":
                    System.out.println("Ingresa el monto que deseas convertir: ");
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                    monedaExchangeRate = consulta.buscaTipoDeCambio("MXN","USD", monto);
                    miMoneda = new Moneda(monedaExchangeRate);
                    System.out.println("El valor de "+ monto+ " MXN"+" corresponde al valor de "+miMoneda+" USD");
                    break;

                case "3":
                    System.out.println("Ingresa el monto que deseas convertir: ");
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                    monedaExchangeRate = consulta.buscaTipoDeCambio("USD","BRL", monto);
                    miMoneda = new Moneda(monedaExchangeRate);
                    System.out.println("El valor de "+ monto+ " USD"+" corresponde al valor de "+miMoneda+" BRL");
                    break;
                case "4":
                    System.out.println("Ingresa el monto que deseas convertir: ");
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                    monedaExchangeRate = consulta.buscaTipoDeCambio("BRL","USD", monto);
                    miMoneda = new Moneda(monedaExchangeRate);
                    System.out.println("El valor de "+ monto+ " BRL"+" corresponde al valor de "+miMoneda+" USD");
                    break;
                case "5":
                    System.out.println("Ingresa el monto que deseas convertir: ");
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                    monedaExchangeRate = consulta.buscaTipoDeCambio("USD","COP", monto);
                    miMoneda = new Moneda(monedaExchangeRate);
                    System.out.println("El valor de "+ monto+ " USD"+" corresponde al valor de "+miMoneda+" COP");
                    break;
                case "6":
                    System.out.println("Ingresa el monto que deseas convertir: ");
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                    monedaExchangeRate = consulta.buscaTipoDeCambio("COP","USD", monto);
                    miMoneda = new Moneda(monedaExchangeRate);
                    System.out.println("El valor de "+ monto+ " COP"+" corresponde al valor de "+miMoneda+" USD");
                    break;
                case "7":
                    System.out.println("Gracias por usar el conversor, hasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }
        while (!opcionMenu.equals("7"));
        lectura.close();
    }
}
