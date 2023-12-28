package capas.concesionaria.logica;

import capas.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
                
        
    public void GuardarAutos(String marca, String modelo, String motor, String color, String patente, int numPuertas) {
            
         Automovil automovil = new Automovil();
         
         automovil.setMarca(marca);
         automovil.setModelo(modelo);
         automovil.setMotor(motor);
         automovil.setColor(color);
         automovil.setPatente(patente);
         automovil.setCantPuertas(numPuertas);
         
         controlPersis.cargarAutos(automovil);
         
        
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
        
    }

    public void eliminarAuto(int idAuto) {
        controlPersis.eliminarAuto(idAuto);    
    }

    public Automovil traerUnAuto(int idAuto) {
        return controlPersis.traerUnAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String marca, String modelo, String motor, String color, String patente, int numPuertas) {
            
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(numPuertas);
        
        controlPersis.modificarAuto(auto);
        

    }

    

}
