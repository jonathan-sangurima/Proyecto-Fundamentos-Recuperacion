/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaReservacionHoteles;;
import java.time.LocalDate;

/**
 *
 * @author diegoleivaespin
 */
import java.time.LocalDate;

//
public class Reserva {

    private Habitacion habitacion;
    private String cliente;
    private String cedula;
    private LocalDate fecha;

    
    public Reserva(String nombre, String cedula, Habitacion habitacion, LocalDate fecha) {

        //this = Invocar un constructor
        this.cliente = nombre;
        this.cedula = cedula;
        this.habitacion = habitacion;
        this.fecha = fecha;

    }

    //Constructor: Crea una Reserva con la fecha actual
    public Reserva(String nombre, String cedula, Habitacion habitacion) {

        this(nombre, cedula, habitacion, LocalDate.now());

    }

    /**
     * Construccion de Getters y Setters 
     * Definen una propiedad, se accede como
     * propiedades situadas fuera de la clase, definidas de la clase como
     * metodos
     */
    
    //getter: obtener datos
    public String getCliente() {
//Return: Sale de la secuencia, devuelve el valor de asignado a la variable "cliente"
        return cliente;

    }

    public String getCedula() {
//Return: Sale de la secuencia, devuelve el valor de asignado a la variable "cedula"
        return cedula;

    }

    public LocalDate getFecha() {
//Return: Sale de la secuencia, devuelve el valor de asignado a la variable "fecha"
        return fecha;

    }

    public Habitacion getHabitacion() {
//Return: Sale de la secuencia, devuelve el valor de asignado a la variable "habitacion"
        return habitacion;

    }

}

