package ar.edu.undef.fie;
public class Main {
    public static void main(String[] args) {

        var nombre = args[0];
        var edad = args[1];
        var ciudad = args[2];

        // Armar una query para una BD de personas. Paso los argumentos por consola

        /* CONCATENANDO CON +
        var query = "SELECT * FROM personas";
        if (nombre != null) query += " WHERE nombre like '" + nombre + "%'";
        if (edad != null) query += " AND edad > " + edad;
        if (ciudad != null) query += " AND ciudad like '" + ciudad + "%'";
        query += ";";
         */

        // CON STRING BUILDER
        var query = new StringBuilder("SELECT * FROM personas");

        if (nombre != null) query
                .append(" WHERE nombre like '")
                .append(nombre)
                .append("%'");
        if (edad != null) query
                .append(" AND edad > ")
                .append(edad);
        if (edad != null) query
                .append(" AND ciudad like '")
                .append(ciudad)
                .append("%'");
        query.append(";");

        System.out.println(query);


    }
}
