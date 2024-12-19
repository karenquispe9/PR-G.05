package cat.iticbcn.clientiot;

import java.sql.*;

import com.amazonaws.services.iot.client.AWSIotMessage;

public class AccesMethodsToDB {

    public void selectPersona (Connection con) {
        String sql = "SELECT * FROM persona"; // Consulta SQL
        
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
        
        while (rs.next()) {
            String tarjeta = rs.getString("idTarjeta");
            String nombre = rs.getString("Nombre");
            System.out.println("Tarjeta: " + tarjeta + ", Nom: " + nombre);
        }
        
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }


    }

    public void insertRegistry(Connection con, AWSIotMessage message) {

        //agafar el message.getStringPayload()
        //fer l'insert a la taula de registres

    }
    
}
