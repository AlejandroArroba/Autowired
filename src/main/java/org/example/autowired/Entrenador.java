package org.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Entrenador {

    private final Equipamiento equipamiento;

    @Autowired
    public Entrenador(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTrainerDetails() {
        return "Entrenador especializado en fuerza y resistencia. Equipamiento disponible: " + equipamiento.getEquipmentDetails();
    }
}