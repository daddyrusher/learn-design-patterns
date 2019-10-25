package com.daddyrusher.creational.singleton;

import java.sql.*;

/**
 * Eager singleton instantiation
 */
public class JDBCSingleton {
    private static final JDBCSingleton INSTANCE = new JDBCSingleton();

    private JDBCSingleton() {
    }

    public static JDBCSingleton getInstance() {
        return INSTANCE;
    }

    public int insert(String name, String password) {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("insert into userData(uname, upassword) values (?,?)")) {
            ps.setString(1, name);
            ps.setString(2, password);

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void view(String name) {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("select from userData where uname = ?");
             ResultSet resultSet = ps.executeQuery()) {

            ps.setString(1, name);
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(2) + "\t" + "Password:" + resultSet.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int update(String name, String password) {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("update userData set upassword = ? where uname ='" + name + "'")) {

            ps.setString(1, password);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(int userId) {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("delete from userData where uid ='" + userId + "'")) {
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
        Class.forName("com.mysql.jdbc.Driver");
        return connection;
    }

}
