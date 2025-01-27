package org.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GimnasioController {

    private final Gimnasio gimnasio;

    @Autowired
    public GimnasioController(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    @GetMapping("/gimnasio")
    public String getGymDetails() {
        return "Bienvenido al gimnasio. " + gimnasio.displayGymDetails();
    }
}

