package com.example.mahasiswa_crud.repository;

import com.example.mahasiswa_crud.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository  extends JpaRepository<Mahasiswa, Long> {


}
