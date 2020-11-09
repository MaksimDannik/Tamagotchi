package world.ucode.Controller;

import world.ucode.Player.Pet;

import java.sql.*;

public class DataBase {
    public static Connection conn = null;
    public static Statement statmt = null;
    public static ResultSet resSet = null;

    public static void connect() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        try {
            String url = "jdbc:sqlite:src/player.db";
            conn = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getErrorCode());
//            }
//        }

//        String url = "jdbc:sqlite:src/player.db";
//        try {
//            Class.forName("org.sqlite.JDBC");
//            conn = DriverManager.getConnection(url);
//        } catch (SQLException | ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Connection do not work.");
//            e.printStackTrace();
//        }
        }
    }
//}


    public static void create() throws SQLException {
        statmt = conn.createStatement();
            statmt.execute("CREATE TABLE if not exists pet (id INTEGER PRIMARY KEY, cname TEXT, player TEXT, health DOUBLE ,happy DOUBLE, hunger DOUBLE, thirst DOUBLE , cleanliness DOUBLE);");

    }

    public static void writeS(String name,String player,  double health, double happy, double hunger, double thirst, double cleanliness) throws SQLException {
        System.out.println(11111);
        statmt.execute("DELETE FROM 'pet' WHERE cname ='" + name + "';"); // problem line
        System.out.println(22222);
        statmt.execute("INSERT INTO 'pet' ('cname', 'player', 'health', 'happy', 'hunger', 'thirst', 'cleanliness')" + "VALUES ('"+name+"', '"+player+"', " +health+", " +happy+", "+hunger+", "+thirst+", "+cleanliness+ ");");
        System.out.println(33333);
    }


    public static String set_player(String g) throws SQLException {

        String ss = ("SELECT player FROM pet WHERE cname='"+g+"'");

        PreparedStatement ps = conn.prepareStatement(ss);
        ResultSet rs = ps.executeQuery();
        Pet.player = rs.getString("player");
        return Pet.player;


    }

    public static double[] read(String name) throws SQLException {
        double[] value = new double[5];
//        ResultSet rs;

//        System.out.println("READ NAME" + name1);

//        String ss = ("SELECT player FROM pet");
//        PreparedStatement ps = conn.prepareStatement(ss);
//        ResultSet rs = ps.executeQuery();
//        Pet.player = rs.getString("player");

//
//        String s = ("SELECT name1 FROM pet");
//        PreparedStatement p = conn.prepareStatement(s);
//        ResultSet r = p.executeQuery();
//        Pet.name = r.getString(name1);
////
//        System.out.println("Pet NAME" + Pet.name);

//        rs = statmt.executeQuery(ss);
//        Pet.player = resSet.getString(String.valueOf(rs));
////       String ss = rs.getString(Pet.player);
//        System.out.println("HEEEERE");
//        System.out.println(rs);

        resSet = statmt.executeQuery("SELECT  * FROM 'pet' WHERE  cname = '" + name +"';");
            while (resSet.next()) {
                value[0] = resSet.getDouble("health");
                value[1] = resSet.getDouble("happy");
                value[2] = resSet.getDouble("hunger");
                value[3] = resSet.getDouble("thirst");
                value[4] = resSet.getDouble("cleanliness");
                return value;
            }
            return null;
    }


}
