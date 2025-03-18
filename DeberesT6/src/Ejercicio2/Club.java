package Ejercicio2;

import java.util.Scanner;

public class Club {
    private CRUDSocio crudSocio;

    public Club() {
        crudSocio = new CRUDSocio();
    }

    public void ejecutarOperaciones() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGestión de Socios del Club");
            System.out.println("1. Añadir Socio");
            System.out.println("2. Buscar Socio");
            System.out.println("3. Mostrar Todos los Socios");
            System.out.println("4. Modificar Socio");
            System.out.println("5. Eliminar Socio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    Socio nuevoSocio = new Socio(nombre, dni, direccion, telefono);
                    crudSocio.crearSocio(nuevoSocio);
                    break;

                case 2:
                    System.out.print("Introduce el DNI del socio: ");
                    String dniBuscar = sc.nextLine();
                    Socio socioBuscado = crudSocio.buscarSocio(dniBuscar);
                    if (socioBuscado != null) {
                        System.out.println("Socio encontrado: " + socioBuscado);
                    } else {
                        System.out.println("Socio no encontrado.");
                    }
                    break;

                case 3:
                    crudSocio.mostrarSocios();
                    break;

                case 4:
                    System.out.print("Introduce el DNI del socio a modificar: ");
                    String dniModificar = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva dirección: ");
                    String nuevaDireccion = sc.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String nuevoTelefono = sc.nextLine();
                    crudSocio.modificarSocio(dniModificar, nuevoNombre, nuevaDireccion, nuevoTelefono);
                    break;

                case 5:
                    System.out.print("Introduce el DNI del socio a eliminar: ");
                    String dniEliminar = sc.nextLine();
                    crudSocio.eliminarSocio(dniEliminar);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
}

