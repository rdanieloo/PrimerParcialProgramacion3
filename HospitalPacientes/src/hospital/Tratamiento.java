//carlos ramos
//0905 23 14141


package hospital;

public class Tratamiento {
	
	private String medicina;
    private int dosis;
    private int dias;

    public Tratamiento(String medicina, int dosis, int dias) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.dias = dias;
    }

    public String getMedicina() {
        return medicina;
    }

    public int getDosis() {
        return dosis;
    }

    public int getDias() {
        return dias;
    }

}
