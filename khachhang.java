/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlikhachhang;

/**
 *
 * @author User
 */
public class khachhang {
    private String maKH;
    private String tenKH;
    private String gioitinh;
    private String diachi;
    private String sodienthoai;
    private String email;
    private String loaiKH;

    public khachhang() {
    }

    public khachhang(String maKH, String tenKH, String gioitinh, String diachi, String sodienthoai, String email, String loaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.email = email;
        this.loaiKH = loaiKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    @Override
    public String toString() {
        return "Khách Hàng:\t" + "Mã Khách Hàng: " + maKH + ",   Tên khách Hàng: " + tenKH + ",   Giới Tính: " + gioitinh + ",   Địa Chỉ: " + diachi + ",   Số Điện Thoại: " + sodienthoai + ",   Email: " + email + ",   Loại Khách Hàng: " + loaiKH;
    }
    
      
}
