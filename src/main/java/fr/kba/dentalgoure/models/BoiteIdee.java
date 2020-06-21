package fr.kba.dentalgoure.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class BoiteIdee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_boite_idee", unique=true, nullable=false, columnDefinition = "serial")
    private Long id;

    private String title;

    private String description;

    private Date creationDate;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")

    private User user;

    @OneToMany(fetch = FetchType.LAZY, cascade=javax.persistence.CascadeType.ALL)
    @JoinColumn(name = "id_boite_idee")
    List<BoiteIdeeCommentaire> boiteIdeeCommentaire;

    public BoiteIdee(){
        super();
    }

    public BoiteIdee(String title, String description, Date creationDate, User user, List<BoiteIdeeCommentaire> boiteIdeeCommentaire) {
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.user = user;
        this.boiteIdeeCommentaire = boiteIdeeCommentaire;
    }

    public Long getId() { return id; }

    public String getTitle() { return title; }

    public String getDescription() { return description; }

    public Date getCreationDate() { return creationDate; }

    public User getUser() { return user; }

    public List<BoiteIdeeCommentaire> getBoiteIdeeCommentaire() { return boiteIdeeCommentaire; }


    public void setId(Long id) { this.id = id; }

    public void setTitle(String title) { this.title = title; }

    public void setDescription(String description) { this.description = description; }

    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }

    public void setUser(User user) { this.user = user; }

    public void setBoiteIdeeCommentaire(List<BoiteIdeeCommentaire> boiteIdeeCommentaire) { this.boiteIdeeCommentaire = boiteIdeeCommentaire; }

    @Override
    public String toString() {
        return "BoiteIdee[ idBoiteIdee" +
                "id=" + id +
                ", titre='" + title + '\'' +
                ", description='" + description + '\'' +
                ", Datecreation=" + creationDate +
                ", utilisateur=" + user +
                ", boiteIdeeCommentaire=" + boiteIdeeCommentaire +
                ']';
    }
}

