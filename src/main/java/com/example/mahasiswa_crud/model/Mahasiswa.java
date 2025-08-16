package com.example.mahasiswa_crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nim;
    private  String nama;
    private  String fakultas;
    private  String prodi;


    public Mahasiswa()
    {}
    public  Mahasiswa(long id, String nim, String nama, String fakultas, String prodi){
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }
}
