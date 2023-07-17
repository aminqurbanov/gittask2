package Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
var DBConnection = Singleton.DBConnection.getDbConnection();
DBConnection.addQuery("First query");
        DBConnection.addQuery("Second query");
        DBConnection.showQueries();
        var a = Singleton.DBConnection.getDbConnection();
        System.out.println(a);
        System.out.println(DBConnection);
        var b = DBConnection.getDbConnection();
        System.out.println(b);


    }
}
