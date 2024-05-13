package com.app.demo.domain.dto;

import java.time.LocalDateTime;

public class CitaDTO {
    private LocalDateTime fechaHora;
    private String nombreCliente;
    private String correoCliente;
    private String tipoServicio;
    public CitaDTO() {
    }

    public CitaDTO(LocalDateTime fechaHora, String nombreCliente, String correoCliente, String tipoServicio) {
        this.fechaHora = fechaHora;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.tipoServicio = tipoServicio;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

}
