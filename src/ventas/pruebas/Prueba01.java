/**
 * Clase main para la prueba de los daoImpl
 */
package ventas.pruebas;

import ventas.daos.DistritoDao;
import ventas.daos.impl.DistritoDaoImplCst;
import ventas.daos.impl.DistritoDaoImplPst;
import ventas.daos.impl.DistritoDaoImplStm;
import ventas.entidades.Distrito;

/**
 *
 * @author Alumnos-Isil
 * @version 1.0
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia el objeto DaoImpl a utilizar que puede ser
        // DistritoDaoImplStm(), DistritoDaoImplPst(), DistritoDaoImplCstm()
        
        DistritoDao dao = new DistritoDaoImplCst();
        
        //Insertar Registro 
        // dao.create(new Distrito("D47", "nuevo", "V06"));
        //Actualizar Registro
        // dao.update(new Distrito("D47", "nuevo2", "V07"));
        //Eliminar registro
        //dao.delete(new Distrito("D47"));
      
    
    //Prueba procedimientos
     dao.update(new Distrito("D47","NOSE 2","V03"));
      
        for(Distrito distrito:dao.findAll()){
            System.out.print(distrito.getId()+"\t");
            System.out.print(distrito.getNombre()+"\t");
            System.out.println(distrito.getVendedor());
        }
       
        
    }
    
}
