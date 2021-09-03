package dao;

import configuracion.Conexion;
import interfaces.Operaciones;
import java.util.List;
import modelos.Producto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAOProducto extends Conexion implements Operaciones<Producto> {

    private String sql;
    private PreparedStatement consulta;

    public DAOProducto() {
    }

    @Override
    public boolean agregar(Producto objeto) {
        try {
            sql = "INSERT INTO productos (referencia, nombre, preciocosto, precioventa) VALUES (?,?,?,?)";
            consulta = objConexion.prepareStatement(sql);
            consulta.setString(1, objeto.getReferencia());
            consulta.setString(2, objeto.getNombre());
            consulta.setDouble(3, objeto.getPrecioCosto());
            consulta.setDouble(4, objeto.getPrecioVenta());
            
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    
    
    @Override
    public List<Producto> consultar() {
        try {
            ResultSet rs;
            List<Producto> arregloProductos = new ArrayList<>();
            
            sql = "SELECT idproducto, referencia, nombre, preciocosto, precioventa FROM productos ORDER BY idproducto ASC";
            consulta = objConexion.prepareStatement(sql);
            rs = consulta.executeQuery();
            
            while(rs.next()){
                Producto objTmp = new Producto();
                objTmp.setIdProducto(Integer.parseInt(rs.getObject(1).toString()));
                objTmp.setReferencia(rs.getObject(2).toString());
                
                
                objTmp.setNombre(rs.getObject(3).toString());
                objTmp.setPrecioCosto(Double.parseDouble(rs.getObject(4).toString()));
                objTmp.setPrecioVenta(Double.parseDouble(rs.getObject(5).toString()));
                
                arregloProductos.add(objTmp);
            }
            objConexion.close();
            return arregloProductos;
        } catch (NumberFormatException | SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    

    @Override
    public boolean borrar(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizar(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Producto buscar(Integer llavePK) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
