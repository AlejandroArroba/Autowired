package org.example.autowired;

import org.springframework.stereotype.Component;

@Component
public class Equipamiento {
    public String getEquipmentDetails() {
        return "Cinta de correr, Pesas, Bicicleta estática.";
    }
}
