/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.servicios;

import java.util.List;
import ventas.entidades.Distrito;

/**
 *
 * @author Emaravi
 */
public interface DistritoService {
    public void grabar(Distrito distrito);
    
    public Distrito buscar(int id);
    public List<Distrito> listar();
    
    public void actualizar(Distrito distrito);
    
    public void borrar(Distrito distrito);
}
