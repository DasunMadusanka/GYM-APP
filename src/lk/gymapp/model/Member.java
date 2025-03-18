    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gymapp.model;

/**
 *
 * @author sachii
 */
public class Member {
    private String id;
    private String name;
    private String nic;
    private int contact;
    
    public Member(){}

    public Member(String id, String name, String nic, int contact) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.contact = contact;
    }

    public Member(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNic() {
        return nic;
    }

    public int getContact() {
        return contact;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "member{" + "id=" + id + ", name=" + name + ", nic=" + nic + ", contact=" + contact + '}';
    }
    
}
 

