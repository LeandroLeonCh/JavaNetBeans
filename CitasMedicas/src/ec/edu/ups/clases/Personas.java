/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import ec.edu.ups.conexion.ConecxionBD;

/**
 *
 * @author wilso
 */
public class Personas extends ConecxionBD{
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String diereccion;
    private String telefono;
    private String password;
    private int roll;
    Connection con;
    PreparedStatement ps=null;
	int contadorPersonasAgregadas=0;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDiereccion() {
        return diereccion;
    }

    public void setDiereccion(String diereccion) {
        this.diereccion = diereccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    
    public int buscarPersona() {
    
    	con=getConnection();
    	try {
    		ps=con.prepareStatement("SELECT * FROM paciente WHERE pac_id ="+getIdPersona());
    		ResultSet rs=ps.executeQuery();
    		
    	}catch(SQLException e) {
    		return 0;
    	}finally {
    		try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return contadorPersonasAgregadas;
    }
    public int agregarPersona() {
    	con=getConnection();
    	try {
    		ps=con.prepareStatement("INSERT INTO paciente (pac_id, pac_nombre, pac_apellido, pac_fechaNacimiento"
    				+ "pac_direccion, pac_telefono) VALUES("+getIdPersona()+","+getNombre()+","+getApellido()+","+getFechaNacimiento()
    				+","+getDiereccion()+","+getTelefono()+")");
    		ps.executeUpdate();
    		contadorPersonasAgregadas++;
    	}catch(SQLException e) {
    		return 0;
    	}finally {
    		try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return contadorPersonasAgregadas;
    }
    
}
