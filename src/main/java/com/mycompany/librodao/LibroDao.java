/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librodao;

import com.mycompany.librodao.modelo.Libro;

/**
 *
 * @author PC01
 */
public interface LibroDao {
   void crearLibro(Libro Libro);
   Libro obtenerLibro(int id);
}
