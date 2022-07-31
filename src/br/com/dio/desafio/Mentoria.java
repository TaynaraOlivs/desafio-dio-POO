package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricap;
    private LocalDate data;

    public Mentoria() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricap() {
        return descricap;
    }

    public void setDescricap(String descricap) {
        this.descricap = descricap;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricap='" + descricap + '\'' +
                ", data=" + data +
                '}';
    }
}
