/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.daos;

import java.util.List;
import ventas.entidades.Distrito;

/**
 * Interface para definir operaciones con la tabla
 * de acuerdo a los requermientos.
 * @author Edwin Maravi (emaravi@cjavaperu.com)
 */
public interface DistritoDao {
    public void create(Distrito distrito);
    
    public Distrito find(String id);
    public List<Distrito> findAll();
    
    public void update(Distrito distrito);
    
    public void delete(Distrito distrito);
    
}
