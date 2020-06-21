package fr.kba.dentalgoure.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="Boite_Idee_Commentaire")
public class BoiteIdeeCommentaire {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String commentaire;

    private Date dateCommentaire;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")
    private User user;

    public BoiteIdeeCommentaire() {
        super();
    }

    public BoiteIdeeCommentaire(Long id, String commentaire, Date dataCommantaire, User user ) {
        super();
        this.id = id;
        this.commentaire = commentaire;
        this.dateCommentaire = dataCommantaire;
        this.user = user;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getCommentaire() { return commentaire; }

    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }

    public Date getDateCommentaire() { return dateCommentaire; }

    public void setDateCommentaire(Date dateCommentaire) { this.dateCommentaire = dateCommentaire; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }


    @Override
    public String toString() {
        return "BoiteIdeeCommentaire{" +
                "id=" + id +
                ", commentaire='" + commentaire + '\'' +
                ", dateCommentaire=" + dateCommentaire +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoiteIdeeCommentaire that = (BoiteIdeeCommentaire) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateCommentaire, that.dateCommentaire) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, dateCommentaire, user);
    }
}
