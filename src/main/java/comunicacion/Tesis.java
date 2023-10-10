package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentacion;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    public Tesis(String origen, String titulo, String autor, int paginas, String idea,
                 String[] argumentacion,String conclusion,String referencias, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.idea=idea;
        this.argumentacion=argumentacion;
        this.conclusion=conclusion;
        this.referencias=referencias;
        this.interpretacion=interpretacion;
    }

    public void setIdea(String idea) {this.idea = idea;}

    public String getIdea() {return idea;}

    public void setArgumentacion(String[] argumentacion) {this.argumentacion = argumentacion;}

    public String[] getArgumentos() {return argumentacion;}

    public void setConclusion(String conclusion) {this.conclusion = conclusion;}

    public String getConclusion() {return conclusion;}

    public void setReferencias(String referencias) {this.referencias = referencias;}

    public String getReferencias() {return referencias;}

    public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}

    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        return (this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+
                this.getPaginas()+"\n"+this.getIdea()+"\n"+this.getArgumentos().length+"\n"+
                this.getConclusion()+"\n"+this.getReferencias());
    }
    public int palabrasTotales(int pp){
        return 5*this.getPaginas()*pp;
    }
}

