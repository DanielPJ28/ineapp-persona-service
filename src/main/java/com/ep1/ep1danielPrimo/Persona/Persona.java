package com.ep1.ep1danielPrimo.Persona;

import lombok.*;

@Data
@Builder
public class Persona {
    int id;
    String nombre;
    String apellido;
    String dni;
    String curso;
}
