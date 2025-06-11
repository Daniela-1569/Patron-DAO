/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librodao;

import com.mycompany.librodao.modelo.Libro;
import java.util.HashMap;
/**
 *
 * @author PC01
 */
public class LibroDaoImpt implements LibroDao {

    public LibroDaoImpt() {
    }
    private final HashMap<Integer, Libro> libro = new HashMap<>();

    @Override
    public void crearLibro(Libro libro) {
        libro.put(libro.getId(), libro);
    }

    @Override
    public Libro obtenerLibro(int id) {
        return libro.get(id);
    }
}
