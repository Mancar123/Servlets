package com.man.Stampede.repository;

import com.man.Stampede.dto.StampedeDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeRepositoryImpl implements StampedeRepository {
    @Override
    public boolean persist(StampedeDto stampedeDto) {
        System.out.println("running persist in StampedeCaseRepositoryImpl");
        System.out.println("should save into DB...");
        if (stampedeDto != null) {
            String url = "jdbc:mysql://localhost:3306/stampede_case";
            String username = "root";
            String password = "Ka49h@2508";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql="insert into stampede_details values(0,"+stampedeDto.getNoOfDeaths()+",'"+stampedeDto.getEventName()+"',"+stampedeDto.getNoOfInjuries()+")";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
        return false;
    }


}

