package Exercicios.provaFinal.questao05;

import java.util.Date;

public class Reserva {
    private Date data_reserva;
    private Date data_limite;
    private Status status;

    private Usuario usuario;

    private Exemplar exemplar;

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(Date data_reserva) {
        this.data_reserva = data_reserva;
    }

    public Date getData_limite() {
        return data_limite;
    }

    public void setData_limite(Date data_limite) {
        this.data_limite = data_limite;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
