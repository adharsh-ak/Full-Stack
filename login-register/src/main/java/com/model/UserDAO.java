package com.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class UserDAO {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String fname ="";
    public UserDAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","gayu@2004");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public String checkUser(String username,String password){
        String query = "select fullname from userdata where username=? and password=?";
        try{
            pst = con.prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,password);
            rs = pst.executeQuery();
            if (rs.next()) {
                fname = rs.getString(1);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return fname;
    }
    public void saveUser(User user){
        String query = "insert into userdata (serialNumber,uname,DateOfBirth,gender,dstatus,qualification) values(?,?,?,?,?,?)";
        try{
            pst = con.prepareStatement(query);
            pst.setString(1,user.getSerialNumber());
            pst.setString(2,user.getUname());
            pst.setString(3,user.getDob());
            pst.setString(4,user.getGender());
            pst.setString(5,user.getdStatus());
            pst.setString(6,user.getQualificatioin());

            int result = pst.executeUpdate();

            if (result >0)  System.out.println("Data inserted successfully");
        }

    }

}
