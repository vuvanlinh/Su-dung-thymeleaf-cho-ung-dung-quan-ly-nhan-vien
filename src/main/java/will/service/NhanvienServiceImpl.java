package will.service;

import will.model.Nhanvien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NhanvienServiceImpl implements NhanvienService {
    private static Map<Integer, Nhanvien> tatcaNhanvien;

    static {
        tatcaNhanvien = new HashMap<>();
        tatcaNhanvien.put(1,new Nhanvien(1,"hoc sinh","vu van linh","nam","0976000208"));
        tatcaNhanvien.put(2,new Nhanvien(1,"hoc sinh","vu van ninh","nam","0976000209"));
        tatcaNhanvien.put(3,new Nhanvien(1,"hoc sinh","vu xuan linh","nam","0976000201"));
    }

    @Override
    public List<Nhanvien> findAll(){
        return new ArrayList<>(tatcaNhanvien.values());
    }

    @Override
    public void save(Nhanvien nhanvien){
        tatcaNhanvien.put(nhanvien.getId(),nhanvien);
    }

    @Override
    public Nhanvien findById(int id){
        return tatcaNhanvien.get(id);
    }

    @Override
    public  void update(int id, Nhanvien nhanvien){
        tatcaNhanvien.put(id, nhanvien);

    }

    @Override
    public void remove(int id){
        tatcaNhanvien.remove(id);
    }
}
