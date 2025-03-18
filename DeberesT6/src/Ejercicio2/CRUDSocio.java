package Ejercicio2;

import java.util.ArrayList;

public class CRUDSocio {
    private ArrayList<Socio> socios;

    public CRUDSocio() {
        socios = new ArrayList<>();
    }

    // Crear nuevo socio
    public void crearSocio(Socio socio) {
        socios.add(socio);
        System.out.println("Socio añadido: " + socio);
    }

    // Buscar socio por DNI
    public Socio buscarSocio(String dni) {
        for (Socio socio : socios) {
            if (socio.getDni().equals(dni)) {
                return socio;
            }
        }
        return null;
    }

    // Mostrar todos los socios
    public void mostrarSocios() {
        if (socios.isEmpty()) {
            System.out.println("No hay socios registrados.");
        } else {
            for (Socio socio : socios) {
                System.out.println(socio);
            }
        }
    }

    // Modificar los datos de un socio
    public void modificarSocio(String dni, String nombre, String direccion, String telefono) {
        Socio socio = buscarSocio(dni);
        if (socio != null) {
            socio.setNombre(nombre);
            socio.setDireccion(direccion);
            socio.setTelefono(telefono);
            System.out.println("Socio modificado: " + socio);
        } else {
            System.out.println("Socio no encontrado.");
        }
    }

    // Eliminar un socio
    public void eliminarSocio(String dni) {
        Socio socio = buscarSocio(dni);
        if (socio != null) {
            socios.remove(socio);
            System.out.println("Socio eliminado: " + socio);
        } else {
            System.out.println("Socio no encontrado.");
        }
    }
}

