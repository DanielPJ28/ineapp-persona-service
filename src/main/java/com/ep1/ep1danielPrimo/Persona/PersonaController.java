package com.ep1.ep1danielPrimo.Persona;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Persona> getPersona(){
       Persona persona1 = Persona.builder()
               .id(1)
               .nombre("Daniel")
               .apellido("Primo")
               .dni("72125374")
               .curso("Integracion de aplicaciones").build();

       Persona persona2 = Persona.builder()
               .id(2)
               .nombre("Jose")
               .apellido("Fernandez")
               .dni("45637182")
               .curso("Desarrollo Web").build();

        Persona persona3 = Persona.builder()
                .id(3)
                .nombre("Stefany")
                .apellido("Ramirez")
                .dni("78546141")
                .curso("Aplicaciones Empresariales").build();

       return List.of(persona1, persona2, persona3);
    }
}
