package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "component")
public class Component  {

    @Id
    private Long id;

    @Column(name = "component_name")
    private String component_name;

    @Column(name = "date")
    private Date date;

    @Column (name = "responsible")
    private String responsible;

    public Component(Long id, String component_name, Date date, String responsible) {
        this.id = id;
        this.component_name = component_name;
        this.date = date;
        this.responsible = responsible;
    }

    public Component() { }

    public Long getId() {
        return id;
    }

    public String getComponent_name() {
        return component_name;
    }

    public void setComponent_name(String component_name) {
        this.component_name = component_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
}
