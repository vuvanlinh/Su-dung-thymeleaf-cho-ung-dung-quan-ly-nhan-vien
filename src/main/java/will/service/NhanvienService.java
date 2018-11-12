package will.service;

import will.model.Nhanvien;

import java.util.List;

public interface NhanvienService {
    List<Nhanvien> findAll();

    void save(Nhanvien nhanvien);

    Nhanvien findById(int id);

    void update(int id, Nhanvien nhanvien);

    void remove(int id);
}
