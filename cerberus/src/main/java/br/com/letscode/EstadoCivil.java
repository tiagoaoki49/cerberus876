package br.com.letscode;

public enum EstadoCivil {
    
    SOLTEIRO("Solteiro"), 
    CASADO("Casado"), 
    DIVORCIADO("Divorciado"), 
    VIUVO("Viuvo");
    
    private String estado;

    private EstadoCivil(String estado){
        this.estado = estado;
    }
    
    public static void printAll() {
        for (EstadoCivil e : EstadoCivil.values()){
            System.out.println(e.ordinal() + " " + e.estado);
        }
    }

    public String getEstadoCivil(){
        return estado;
    }

}