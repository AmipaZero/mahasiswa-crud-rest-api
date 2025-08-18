package com.example.mahasiswa_crud.controller;

import com.example.mahasiswa_crud.model.Mahasiswa;
import com.example.mahasiswa_crud.service.MahasiswaService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class MahasiswaController {
    @Autowired
    private MahasiswaService service;

    @GetMapping(
            path = "/api/mahasiswas",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Mahasiswa> getAll(){
        return  service.getAll();
    }

    @GetMapping(
            path = "/api/mahasiswas/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Mahasiswa getById(@PathVariable long id) {
        Mahasiswa mahasiswa = service.getById(id);
        if (mahasiswa == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mahasiswa dengan NIM " + id + " tidak ditemukan");
        }
        return mahasiswa;
    }


        @PostMapping(
            path = "/api/mahasiswas",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Mahasiswa create(@RequestBody Mahasiswa mahasiswa){
        return service.save(mahasiswa);
    }

    @PutMapping(
            path = "/api/mahasiswas/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Mahasiswa update(@PathVariable Long id, @RequestBody Mahasiswa mahasiswa) {
        return service.update(id, mahasiswa);
    }
    @DeleteMapping(
            path = "/api/mahasiswas/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void delete(@PathVariable long id){
        service.delete(id);
    }
}
