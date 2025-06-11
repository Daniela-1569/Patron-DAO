/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librodao.servicio;

import com.mycompany.librodao.LibroDao;
import com.mycompany.librodao.LibroDaoImpt;
import com.mycompany.librodao.modelo.Libro;

/**
 *
 * @author PC01
 */
public class LibroService {
   public static void main(String[] args) {
        LibroDao libroDao = new LibroDaoImpt();

        Libro libro = new Libro(1, "El poder actual", "Jesus de Setern-Exupéry");
        libroDao.crearLibro(libro);

        Libro libroRecuperado = libroDao.obtenerLibro(1);
        System.out.println("Libro: " + libroRecuperado.getTitulo() + " - " + libroRecuperado.getAutor());
    }
}
