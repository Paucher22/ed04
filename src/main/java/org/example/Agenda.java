/*
 * @author Pau
 * @version 1.0
 * */
/**
 *@author Pau
 *@version 1.0
 * */
package org.example;

import java.util.*;

public class Agenda implements IAgenda {
    /**
     * Clase que representa la agenda de contactos
     */
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor de la clase agenda
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo para añadir contactos
     * @param name Nombre del Persona
     * @param phone Telefono del Persona
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo que elimina un Persona
     *
     * @param name Nombre del Persona
     */

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo que modifica el telefono de un contacto
     *
     * @param name Nombre del Persona
     * @param oldPhone Telefono antes de modificar
     * @param newPhone Telefono despues de la modificación
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Metodo que devuelve los contactos
     *
     * @return List<Persona>
     */

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}