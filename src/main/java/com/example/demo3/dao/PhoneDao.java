package com.example.demo3.dao;

import com.example.demo3.model.Phone;
import com.example.demo3.until.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDao {
    Connection connection = ConnectionUtil.getConnection();


    public List<Phone> getAllPhone() {
        List<Phone> list = new ArrayList<>();
        String sql = "SELECT * FROM phone";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Phone phone = new Phone();
                phone.setId(rs.getInt("id"));
                phone.setName(rs.getString("name"));
                phone.setBrand(rs.getString("brand"));
                phone.setPrice(rs.getString("price"));
                phone.setDescription(rs.getString("description"));
                list.add(phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public String updatePhone(Phone phone) {
        String sql = "UPDATE phone SET name = ?,brand = ?,price = ?,décription=?  WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,phone.getName());
            ps.setString(2,phone.getBrand());
            ps.setString(3,phone.getPrice());
            ps.setString(4,phone.getDescription());
            ps.setInt(5,phone.getId());
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0){
                return "Success";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "fail";
    }
    public String deletePhone(int[] listId ) {
        try {
            int isSuccess=0;
            for (int id:listId) {
                String sql = "DELETE FROM phone WHERE id = ?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1,id);
                isSuccess = ps.executeUpdate();
            }
            if (isSuccess > 0){
                return "Success";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "fail";
    }
    public String deleteAllPhone() {

        try {
            String sql = "DELETE FROM phone";
            PreparedStatement ps = connection.prepareStatement(sql);
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0){
                return "Success";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "fail";
    }
    public String insertPhone(Phone phone) {
        String sql = "INSERT INTO phone (name,brand,price,description) VALUE (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,phone.getName());
            ps.setString(2,phone.getBrand());
            ps.setString(3,phone.getPrice());
            ps.setString(4,phone.getDescription());
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0){
                return "Success";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "fail";
    }
}
