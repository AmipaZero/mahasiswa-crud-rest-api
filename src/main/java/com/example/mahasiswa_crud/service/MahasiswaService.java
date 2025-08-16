package com.example.mahasiswa_crud.service;


import com.example.mahasiswa_crud.model.Mahasiswa;
import com.example.mahasiswa_crud.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MahasiswaService {

        @Autowired
        private MahasiswaRepository mahasiswaRepository;

        public List<Mahasiswa> getAll(){
            return mahasiswaRepository.findAll();
        }
        public Mahasiswa getById(Long id){
            return  mahasiswaRepository.findById(id).orElse(null);
        }

        public Mahasiswa save(Mahasiswa mahasiswa) {

            return mahasiswaRepository.save(mahasiswa);
        }
        public Mahasiswa update(Long id, Mahasiswa mahasiswa) {
            Mahasiswa existing = mahasiswaRepository.findById(id).orElse(null);
            if (existing == null) {
                throw new RuntimeException("Mahasiswa dengan ID " + id + " tidak ditemukan");
            }
            // update field yang mau diubah
            existing.setNim(mahasiswa.getNim());
            existing.setNama(mahasiswa.getNama());
            existing.setFakultas(mahasiswa.getFakultas());
            existing.setProdi(mahasiswa.getProdi());
            return mahasiswaRepository.save(existing);
        }

        public void  delete(Long id){
            mahasiswaRepository.deleteById(id);
        }

}
