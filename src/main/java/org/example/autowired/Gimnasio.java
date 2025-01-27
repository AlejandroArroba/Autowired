package org.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gimnasio {

    private final Entrenador entrenador;

    @Autowired
    public Gimnasio(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String displayGymDetails() {
        return "Entrenador especializado en fuerza y resistencia. Equipamiento disponible: " + entrenador.getTrainerDetails();
    }
}

