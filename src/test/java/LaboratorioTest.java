package com.ejemplo.laboratorio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LaboratorioTest {

    @Test
    public void testAgregarReserva() {
        Laboratorio lab = new Laboratorio();

        Paciente p = new Paciente("P001", "Juan Pérez", 30);
        Examen e = new Examen("E100", "Examen de sangre");

        Reserva r = new Reserva(p, e, "2025-01-10");

        boolean agregado = lab.agregarReserva(r);

        assertTrue(agregado);
        assertEquals(1, lab.totalReservas());
    }

    @Test
    public void testAgregarReservaInvalida() {
        Laboratorio lab = new Laboratorio();

        Reserva r = new Reserva(null, null, "2025-01-10");

        boolean agregado = lab.agregarReserva(r);

        assertFalse(agregado);
        assertEquals(0, lab.totalReservas());
    }

    @Test
    public void testObtenerReservas() {
        Laboratorio lab = new Laboratorio();
        Paciente p = new Paciente("P002", "María López", 25);
        Examen e = new Examen("E200", "Radiografía");

        Reserva r = new Reserva(p, e, "2025-01-12");
        lab.agregarReserva(r);

        assertEquals(1, lab.obtenerReservas().size());
        assertEquals("María López", lab.obtenerReservas().get(0).getPaciente().getNombre());
    }
}
