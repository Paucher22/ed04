/**
 * @author Pau
 * @version 1.0
 * */
package org.example;
/**
 * Clase que representa los contactos de la agenda
 * @author Pau
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

class Persona {

    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Persona
     * @param name Nombre del Persona
     * @param phone Telefono del Persona
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Metodo que devuelve el nombre del Persona
     *
     * @return String Devuelve le nombre
     */

    public String getName() {
        return this.name;
    }

    /**
     * Metodo que devuelve el telefono
     *
     * @return List<String> devuelve los telefonos
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}