/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.daos.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ventas.daos.DistritoDao;
import ventas.entidades.Distrito;
import ventas.util.DbConection;

/**
 *
 * @author Alumno
 */
public class DistritoDaoImplCst implements DistritoDao{

   private Connection cn=null;
    private CallableStatement cstm;
    private ResultSet rs;
   
    @Override
    public List<Distrito> findAll() {
        List<Distrito> lista=new ArrayList<>();
        try{
            cn = DbConection.getInstance().getConnection();
            cstm = cn.prepareCall("{call sp_listar_distrito()}");
            rs = cstm.executeQuery();
            while(rs.next()){
                lista.add(new Distrito(rs.getString(1),rs.getString(2),rs.getString(3)));
            }
            cn.close();
        }catch(SQLException ex){
            System.out.println("codigo : "+ex.getErrorCode());
            System.out.println("mensaje : "+ex.getMessage());
            System.out.println("estado : "+ex.getSQLState());
            try {
                cn.close();
                System.out.println("conexion cerrada en el catch");
            } catch (SQLException ex1) {
                System.out.println("No se pudo cerrar la conexion");
            }
        }
        return lista;
    }

    @Override
    public void create(Distrito distrito) {
         try{
            cn = DbConection.getInstance().getConnection();
            cstm = cn.prepareCall("{call sp_insertar_distrito(?,?,?)}");
            cstm.setString(1,distrito.getId());
            cstm.setString(2,distrito.getNombre());
            cstm.setString(3,distrito.getVendedor());
            int registrosActualizados = cstm.executeUpdate();
            System.out.println(" Registros insertado: " + registrosActualizados);
            
            cn.close();
        }catch(SQLException ex){
            System.out.println("codigo : "+ex.getErrorCode());
            System.out.println("mensaje : "+ex.getMessage());
            System.out.println("estado : "+ex.getSQLState());
            try {
                cn.close();
                System.out.println("conexion cerrada en el catch");
            } catch (SQLException ex1) {
                System.out.println("No se pudo cerrar la conexion");
            }
        }
    }

    @Override
    public Distrito find(String id) {
          
        
        return null;
    }


    @Override
    public void update(Distrito distrito) {
          try{
            cn = DbConection.getInstance().getConnection();
            cstm = cn.prepareCall("{call sp_actualizar_distrito(?,?,?)}");    
            cstm.setString(2,distrito.getNombre());
            cstm.setString(3,distrito.getVendedor());
            cstm.setString(1,distrito.getId());
            int registrosActualizados = cstm.executeUpdate();
              System.out.println("Numero de registro actualizados: "+registrosActualizados);
            cn.close();
        }catch(SQLException ex){
            System.out.println("codigo : "+ex.getErrorCode());
            System.out.println("mensaje : "+ex.getMessage());
            System.out.println("estado : "+ex.getSQLState());
            try {
                cn.close();
                System.out.println("conexion cerrada en el catch");
            } catch (SQLException ex1) {
                System.out.println("No se pudo cerrar la conexion");
            }
        }
          
          
    }

    @Override
    public void delete(Distrito distrito) {
         try{
            cn = DbConection.getInstance().getConnection();
            cstm = cn.prepareCall("{call sp_eliminar_distrito(?)}");
            cstm.setString(1,distrito.getId());
            int registrosActualizados = cstm.executeUpdate();
             System.out.println("Registros eliminados: "+registrosActualizados);
            cn.close();
        }catch(SQLException ex){
            System.out.println("codigo : "+ex.getErrorCode());
            System.out.println("mensaje : "+ex.getMessage());
            System.out.println("estado : "+ex.getSQLState());
            try {
                cn.close();
                System.out.println("conexion cerrada en el catch");
            } catch (SQLException ex1) {
                System.out.println("No se pudo cerrar la conexion");
            }
        }
    }
    
}
