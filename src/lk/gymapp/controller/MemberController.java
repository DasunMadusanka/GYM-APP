/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gymapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static lk.gymapp.controller.MemberController.searchMember;
import static lk.gymapp.controller.MemberController.updateMember;
import lk.gymapp.db.DBConnection;
import lk.gymapp.model.Member;

/**
 *
 * @author sachii
 */
public class MemberController {

    
    public static boolean addMember(Member member) throws ClassNotFoundException, SQLException{
        Connection connection  = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO  members VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, member.getId());
        preparedStatement.setString(2, member.getName());
        preparedStatement.setString(3, member.getNic());
        preparedStatement.setInt(4,member.getContact());
        int result = preparedStatement.executeUpdate();
        return result>0;
        
    }

    public static boolean updateMember(Member updateMember) throws ClassNotFoundException, SQLException {
        Connection connection  = DBConnection.getInstance().getConnection();
        String sql = "UPDATE members SET Name =?,nic =?,contact=? WHERE gym_id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, updateMember.getName());
        preparedStatement.setString(2, updateMember.getNic());
        preparedStatement.setInt(3, updateMember.getContact());
        preparedStatement.setString(4, updateMember.getId());

        int result = preparedStatement.executeUpdate();
        return result>0;
    }



    public static Member searchMember(String id) throws ClassNotFoundException, SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    
    try {
        connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM members WHERE gym_id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        result = preparedStatement.executeQuery();
        
        if (result.next()) {
            return new Member(
                result.getString("gym_id"),
                result.getString("name"),
                result.getString("nic"),
                result.getInt("contact")
            );
        }
        return null;
    } finally {
        if (result != null) result.close();
        if (preparedStatement != null) preparedStatement.close();
    }
}

    public static boolean deleteMember(String id) throws SQLException, ClassNotFoundException {
        Connection connection  = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM members WHERE gym_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        
        int result = preparedStatement.executeUpdate();
        return result>0;
    
    }
   
}
