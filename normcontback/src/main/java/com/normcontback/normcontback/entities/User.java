package com.normcontback.normcontback.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(name = "cod_usuario")
    private String codUsuario;
    @Column(name = "estado_usuario")
    private String estadoUsuario;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Column(name = "apellido_usuario")
    private String apellidoUsuario;
    @Column(name = "email")
    private String email;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Column(name = "password")
    private String password	;
    

    
    /**
     * 
     */
    public User() {
    }


    public User(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


    public User(Integer idUsuario, String codUsuario, String estadoUsuario, String nombreUsuario,
            String apellidoUsuario, String email, String identificacion, String tipoIdentificacion, String password) {
        this.idUsuario = idUsuario;
        this.codUsuario = codUsuario;
        this.estadoUsuario = estadoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.email = email;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.password = password;
    }
    

    public User(String codUsuario, String password) {
        this.codUsuario = codUsuario;
        this.password = password;
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getPassword() {
        return password;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
