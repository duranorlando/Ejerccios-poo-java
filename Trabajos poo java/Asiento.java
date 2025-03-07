import java.util.List;

public class Asiento {
    private boolean disponible;

    
    public Asiento() {
        this.disponible = true; 
    }


    public boolean estaDisponible() {
        return disponible;
    }


    public void reservar() {
        this.disponible = false;
    }
}

class GestorAsientos {
    
    public boolean hayAsientosDisponibles(List<Asiento> asientos) {
        for (Asiento asiento : asientos) {
            if (asiento.estaDisponible()) {
                return true; 
            }
        }
        return false;
    }
}


