public class Moneda implements Comparable<Moneda>{

    private double resultadoDeLaConversion;
    private double monedaAConvertir;

    public void muestraResultadoDeLaConversion(){
        System.out.println("El resultado de la conversión es: " + resultadoDeLaConversion);
    }
    public Moneda(MonedaExchangeRate miMonedaExchangeRate) {
        this.monedaAConvertir = miMonedaExchangeRate.conversion_rate();
        this.resultadoDeLaConversion = miMonedaExchangeRate.conversion_result();
        /*this.fechaDLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if(miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionExcepction("No pude convertir la duración porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));*/
    }

    @Override
    public int compareTo(Moneda o) {
        return 0;
    }

    @Override
    public String toString(){
        //return "(Moneda a convertir=" + monedaAConvertir + ", resultado conversion=" + resultadoDeLaConversion+")";
        return ""+resultadoDeLaConversion+"";
    }
}
