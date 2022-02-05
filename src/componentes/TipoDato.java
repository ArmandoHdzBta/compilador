package componentes;

public class TipoDato {
    private String[] tipoDato;
    
    public void darTipoDato(){
        this.tipoDato = new String[]{"ente","print"};
    }
    
    public String[] obtenerTipoDato(){
        return this.tipoDato;
    }
}
