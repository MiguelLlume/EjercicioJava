package ProgramacionObjetos.T3P1E2;
public class Ordenador {
    private String marca;
    private String modelo;
    private Componente [] listacomp;

    public Ordenador(String brand, String model) {
        this.marca=brand;
        this.modelo=model;
        //Aqui entiendo que tengo que usar una lista pero bueno
        this.listacomp=new Componente [10];
    }
    public Ordenador(String brand, String model, int tam) {
        this.marca=brand;
        this.modelo=model;
        //Aqui igual
        this.listacomp=new Componente [tam];
        /*aqui tengo un par de problemas: no se como hacer para que el nombre de la variable del objeto sea distito para cada uno y necesito
         un switch que no me acuero como se usaba para darle un tipo de componente randomizado*/
        /* 
        /*for(int i=0;i<this.listacomp.length;i++){
            String comptipo;
            int rng=(int)(Math.random()*6+1);
            
            Componente comp1= new Componente ()
        }
        */
    }
    public void aniadirComponente(String nombre, String tipo, double consumo){
        Componente nuevocomp=new  Componente (nombre,tipo,consumo);
    }
}
