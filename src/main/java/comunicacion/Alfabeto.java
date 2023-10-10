package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public int cantidadLetras(){
        return letras.length;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        StringBuilder strAux= new StringBuilder(letras[0]);
        for (String i: letras){
            strAux.append(", ");
            strAux.append(i);
        }
        return strAux.toString();
    }
}
