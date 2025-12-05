package com.ejemplo.laboratorio;

import java.util.ArrayList;
import java.util.List;

// Clase principal que gestiona reservas
public class Laboratorio {

    private List<Reserva> reservas;

    public Laboratorio() {
        this.reservas = new ArrayList<>();
    }

    public boolean agregarReserva(Reserva reserva) {
        if (reserva == null || reserva.getPaciente() == null) {
            return false;
        }
        return reservas.add(reserva);
    }

    public int totalReservas() {
        return reservas.size();
    }

    public List<Reserva> obtenerReservas() {
        return reservas;
    }
}

// Clase Paciente (similar a la estructura de Libro adaptado)
class Paciente {
    private String id;
    private String nombre;
    private int edad;

    public Paciente(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

// Clase Examen
class Examen {
    private String codigo;
    private String descripcion;

    public Examen(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

// Clase Reserva
class Reserva {
    private Paciente paciente;
    private Examen examen;
    private String fecha;

    public Reserva(Paciente paciente, Examen examen, String fecha) {
        this.paciente = paciente;
        this.examen = examen;
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Examen getExamen() {
        return examen;
    }

    public String getFecha() {
        return fecha;
    }
}
