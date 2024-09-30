public class Ortopedista extends Medico {
    enum tipoOrtopedista {MAXILOFACIAL, PEDIATRICA}
    private tipoOrtopedista tipo;

    public Ortopedista(String nombre, Ortopedista.tipoOrtopedista tipo) {
        super(nombre);
        this.tipo = tipo;
    }
    public tipoOrtopedista getTipo() {
        return tipo;
    }
    public void setTipo(tipoOrtopedista tipo) {
        this.tipo = tipo;
    }

    
}
