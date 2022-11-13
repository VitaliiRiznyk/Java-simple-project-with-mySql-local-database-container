package ua.kiev.prog.case2;

import ua.kiev.prog.shared.Client;
import ua.kiev.prog.shared.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        try (Connection conn = ConnectionFactory.getConnection()) {

            try(PreparedStatement ps = conn.prepareStatement("DROP TABLE IF EXISTS CLIENTS")){
                ps.execute();
            }

            ClientDAOImpl2 dao = new ClientDAOImpl2(conn, "Clients");
            dao.createTable(Client.class);

            Client c = new Client("test", 1, 25.4);
            Client b = new Client("test1", 15, 45.8);
            Client a = new Client("test2", 15, 45.8);
            dao.add(c);
            dao.add(b);
            dao.add(a);

            int idC = c.getId();
            int idB= b.getId();
            System.out.println("id C = " + idC + "id B = " + idB);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}