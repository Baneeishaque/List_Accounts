/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_accounts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Srf
 */
public class List_Accounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        print_accounts(0,"");
    }

    static void print_accounts(int parent_account_id,String parent_account_name) {
        try {

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/findandg_accounts", "root", "");

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT * FROM `accounts` WHERE `parent_account_id`=" + parent_account_id);

            List<Account> main_accounts = new ArrayList<>();

            while (r.next()) {
//                System.out.println(r.getString("account_id")+" "+r.getString("name")+" "+r.getString("parent_account_id")+" "+r.getString("account_type")+" "+r.getString("notes")+" "+r.getString("commodity_type")+" "+r.getString("commodity_value"));
                main_accounts.add(new Account(r.getInt("account_id"), r.getInt("parent_account_id"), r.getString("name"), r.getString("account_type"), r.getString("notes"), r.getString("commodity_type"), r.getString("commodity_value")));

            }

            if (!main_accounts.isEmpty()) {
                main_accounts.forEach((main_account) -> {
                    String account_name=parent_account_name.isEmpty()?main_account.getName():parent_account_name+main_account.getName();
                    System.out.println(account_name);
                    print_accounts(main_account.getAccount_id(),account_name+":");
                });
            }

        } catch (SQLException ex) {
            Logger.getLogger(List_Accounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
