package will.model;

public class Nhanvien {
    private int id;
    private String nhomNhanVien;
    private String hoTen;
    private String gioiTinh;
    private String soDienThoai;

    public Nhanvien(){

    }

    public Nhanvien(int id, String nhomNhanVien, String hoTen, String gioiTinh, String soDienThoai){
        this.id = id;
        this.nhomNhanVien = nhomNhanVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNhomNhanVien() {
        return nhomNhanVien;
    }

    public void setNhomNhanVien(String nhomNhanVien) {
        this.nhomNhanVien = nhomNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
