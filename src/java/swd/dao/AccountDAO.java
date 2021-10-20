/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dao;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.xml.bind.DatatypeConverter;
import swd.db.DBConnection;
import swd.dto.AccountDTO;

/**
 *
 * @author mevrthisbang
 */
public class AccountDAO implements Serializable{
    private Connection conn;
    private PreparedStatement preStm;
    private ResultSet rs;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    
    public static String toHexString(String input) throws Exception 
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash=md.digest(input.getBytes(StandardCharsets.UTF_8)); 
        return DatatypeConverter.printHexBinary(hash).toLowerCase();
    } 
    
    
    public AccountDTO checkLogin(String email, String password) throws Exception{
        AccountDTO result=null;
        try {
            conn= DBConnection.getMyConnection();
            String sql="Select id, fullname, phone, address, role\n"
                    + "From ACCOUNT\n"
                    + "Where email=? AND password=?";
            preStm=conn.prepareStatement(sql);
            preStm.setString(1, email);
            preStm.setString(2, toHexString(password));
            rs=preStm.executeQuery();
            if(rs.next()){
                String id=rs.getString("id");
                String fullname=rs.getString("fullname");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String role=rs.getString("role");
                result=new AccountDTO(id, email, fullname, phone, address, role);
            }
        } finally{
            closeConnection();
        }
        return result;
    }
    public AccountDTO checkLoginByEmail(String email) throws Exception{
        AccountDTO result=null;
        try {
            conn=DBConnection.getMyConnection();
            String sql="Select id, fullname, phone, address, role\n"
                    + "From ACCOUNT\n"
                    + "Where email=?";
            preStm=conn.prepareStatement(sql);
            preStm.setString(1, email);
            rs=preStm.executeQuery();
            if(rs.next()){
                String id=rs.getString("id");
                String fullname=rs.getString("fullname");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String role=rs.getString("role");
                result=new AccountDTO(id, email, fullname, phone, address, role);
            }
        } finally{
            closeConnection();
        }
        return result;
    }
    
    public boolean updateAccount(AccountDTO user) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Update ACCOUNT\n"
                    + "Set password = ?, fullname = ?, phone = ?, address = ?\n"
                    + "Where email = ?";
            preStm=conn.prepareStatement(sql);
            preStm.setString(1, toHexString(user.getPassword()));
            preStm.setString(2, user.getFullname());
            preStm.setString(3, user.getPhone());
            preStm.setString(4, user.getAddress());
            preStm.setString(3, user.getEmail());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean insertNewAccount(AccountDTO account) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Insert Into ACCOUNT(id, email, password, fullname, phone, address, role)\n"
                    + "Values(?,?,?,?,?,?,?)";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, account.getId());
            preStm.setString(2, account.getEmail());
            preStm.setString(3, toHexString(account.getPassword()));
            preStm.setString(4, account.getFullname());
            preStm.setString(5, account.getPhone());
            preStm.setString(6, account.getAddress());
            preStm.setString(7, account.getRole());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public String getLastAccountID() throws Exception {
        String result = null;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select id From ACCOUNT\n"
                    + "Where createDate=(Select MAX(createDate)\n"
                    + "From ACCOUNT)\n";
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            if (rs.next()) {
                result = rs.getString("id");
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    public boolean existedEmail(String email) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select email From ACCOUNT\n"
                    + "Where email=?";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, email);
            rs = preStm.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean existedPhone(String phone) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select phone From ACCOUNT\n"
                    + "Where phone=?";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, phone);
            rs = preStm.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } finally {
            closeConnection();
        }
        return check;
    }
}
