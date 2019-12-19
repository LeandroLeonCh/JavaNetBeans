/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Registro_Cita {
   private  int id_Registro;
   private  Date fecha_emision;
   private  int id_usuario;
   private  int id_d4medico;

    public int getId_Registro() {
        return id_Registro;
    }

    public void setId_Registro(int id_Registro) {
        this.id_Registro = id_Registro;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_d4medico() {
        return id_d4medico;
    }

    public void setId_d4medico(int id_d4medico) {
        this.id_d4medico = id_d4medico;
    }
   
}
