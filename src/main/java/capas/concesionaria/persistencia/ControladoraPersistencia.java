package capas.concesionaria.persistencia;

import capas.concesionaria.logica.Automovil;
import capas.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void cargarAutos(Automovil automovil) {
        
        autoJPA.create(automovil);
        
    }

    public List<Automovil> traerAutos() {
        return autoJPA.findAutomovilEntities();
    }

    public void eliminarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerUnAuto(int idAuto) {
         return autoJPA.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
