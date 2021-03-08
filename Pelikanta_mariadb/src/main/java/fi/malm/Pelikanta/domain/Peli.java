package fi.malm.Pelikanta.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Peli {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    private Long id;
    @Size(min=2, max=50)
    private String nimi, alusta, formaatti, info;
    @Size(min=4, max=4)
    private String vuosi;

    public Peli(){
    	super();
    }
 
    
    public Peli(String nimi, String alusta, String formaatti, String vuosi, String info) {
        this.nimi = nimi;
        this.alusta = alusta;
        this.formaatti = formaatti;
        this.vuosi = vuosi;
        this.info = info;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getAlusta() {
        return alusta;
    }

    public void setAlusta(String alusta) {
        this.alusta = alusta;
    }

    public String getFormaatti() {
        return formaatti;
    }

    public void setFormaatti(String formaatti) {
        this.formaatti = formaatti;
    }

    public String getVuosi() {
        return vuosi;
    }

    public void setVuosi(String vuosi) {
        this.vuosi = vuosi;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String  info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Peli{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", alusta='" + alusta + '\'' +
                ", formaatti='" + formaatti + '\'' +
                ", vuosi=" + vuosi +
                ", info=" + info +
                '}';
    }
}
