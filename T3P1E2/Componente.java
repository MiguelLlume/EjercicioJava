package ProgramacionObjetos.T3P1E2;

public class Componente {

    private String nombre;
    private String tipo;
    private double consumo;

    private String comprobarTipo(String type) {
        type = type.toLowerCase();
        if (!type.equals("CPU") && !type.equals("RAM") && !type.equals("SSD") && !type.equals("GPU") && !type.equals("PSU")
                && !type.equals("otro")) {
            type = "otro";
        }
        return type;
    }

    public Componente(String name, String type, double gasto) {
        this.nombre = name;
        type = comprobarTipo(type);
        this.tipo = type;
        this.consumo = gasto;
    }

    public Componente() {
        this.nombre = "Desconocido";
        this.tipo = "OTRO";
        this.consumo = 100.00;
    }

    @Override
    public String toString() {
        String res = "";
        return res = "Componente: " + this.nombre + " Tipo: " + this.tipo + " Consumo: " + this.consumo + " Watios";
    }
}
