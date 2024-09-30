public class Pediatra extends Medico {
    enum tipoPediatra {NEUROLOGO, PSICOLOGICO}
    private tipoPediatra tipo;

    public Pediatra(String nombre, Pediatra.tipoPediatra tipo) {
        super(nombre);
        this.tipo = tipo;

    }
    public tipoPediatra getTipo() {
        return tipo;
    }
    public void setTipo(tipoPediatra tipo) {
        this.tipo = tipo;
    }
    
}
