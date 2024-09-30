import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Medico> listaMedicos = new ArrayList<>();

        Pediatra p1 = new Pediatra("Antonio", Pediatra.tipoPediatra.NEUROLOGO);
        listaMedicos.add(p1);
        
        Pediatra p2 = new Pediatra("Pepe", Pediatra.tipoPediatra.PSICOLOGICO);
        listaMedicos.add(p2);

        Ortopedista o1 = new Ortopedista("Pedro", Ortopedista.tipoOrtopedista.MAXILOFACIAL);
        listaMedicos.add(o1);

        Ortopedista o2 = new Ortopedista("Sara", Ortopedista.tipoOrtopedista.PEDIATRICA);
        listaMedicos.add(o2);

        Medico m1 = new Medico("Roberto");
        listaMedicos.add(m1);



        for (int i = 0; i<listaMedicos.size(); i++ ){
            Medico m = (Medico) listaMedicos.get(i);
            if (m instanceof Ortopedista) {
                System.out.println("El objeto en el indice " + i + " es de la clase Ortopedista");
                continue;
            }
            if (m instanceof Pediatra) {
                System.out.println("El objeto en el indice " + i + " es de la clase Pediatra");
                continue;
            }
            if (m instanceof Medico) {
                System.out.println("El objeto en el indice " + i + " es de la clase Médico");
                continue;
            }
        }
    }
}
