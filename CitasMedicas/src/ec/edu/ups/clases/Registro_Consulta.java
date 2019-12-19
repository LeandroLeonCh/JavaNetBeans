/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author usuario
 */
public class Registro_Consulta {
 private   int idRegistroConsulta;
 private   int isRegistroCita;
 private   int id_Consulta;
 private   String horaInicio;
 private   String horaFin;

    public int getIdRegistroConsulta() {
        return idRegistroConsulta;
    }

    public void setIdRegistroConsulta(int idRegistroConsulta) {
        this.idRegistroConsulta = idRegistroConsulta;
    }

    public int getIsRegistroCita() {
        return isRegistroCita;
    }

    public void setIsRegistroCita(int isRegistroCita) {
        this.isRegistroCita = isRegistroCita;
    }

    public int getId_Consulta() {
        return id_Consulta;
    }

    public void setId_Consulta(int id_Consulta) {
        this.id_Consulta = id_Consulta;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
