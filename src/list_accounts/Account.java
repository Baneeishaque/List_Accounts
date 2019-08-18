/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_accounts;

/**
 *
 * @author Srf
 */
public class Account {

    int account_id, parent_account_id;
    String name, account_type, notes, commodity_type, commodity_value;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getParent_account_id() {
        return parent_account_id;
    }

    public void setParent_account_id(int parent_account_id) {
        this.parent_account_id = parent_account_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type;
    }

    public String getCommodity_value() {
        return commodity_value;
    }

    public void setCommodity_value(String commodity_value) {
        this.commodity_value = commodity_value;
    }

    public Account(int account_id, int parent_account_id, String name, String account_type, String notes, String commodity_type, String commodity_value) {
        this.account_id = account_id;
        this.parent_account_id = parent_account_id;
        this.name = name;
        this.account_type = account_type;
        this.notes = notes;
        this.commodity_type = commodity_type;
        this.commodity_value = commodity_value;
    }
    
}
