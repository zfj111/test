package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class House {
    private Integer id;
    private String title;
    private String description;
    private Integer price;
    private Date pubdate;
    private Integer floorage;
    private String contact;
    private Types types;
    private Street streets;
    private Users users;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 150)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 6000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PRICE", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "PUBDATE", nullable = true)
    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "FLOORAGE", nullable = true)
    public Integer getFloorage() {
        return floorage;
    }

    public void setFloorage(Integer floorage) {
        this.floorage = floorage;
    }

    @Basic
    @Column(name = "CONTACT", nullable = true, length = 300)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description, price, pubdate, floorage, contact);
    }

    @ManyToOne
    @JoinColumn(name = "TYPEID", referencedColumnName = "ID")
    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    @ManyToOne
    @JoinColumn(name = "STREETID", referencedColumnName = "ID")
    public Street getStreets() {
        return streets;
    }

    public void setStreets(Street streets) {
        this.streets = streets;
    }

    @ManyToOne
    @JoinColumn(name = "USERID", referencedColumnName = "ID")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
