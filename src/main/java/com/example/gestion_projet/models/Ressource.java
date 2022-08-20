package com.example.gestion_projet.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "profil_ressource",length = 1000)
public class Ressource implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ressource")
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private int num_tel;
    @Column
    private String email;
    @Column
    private String mdp;
    @Column
    private String profil;

    //Jointure
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "ressource_competence",
            joinColumns = @JoinColumn(name = "id_ressource"),
            inverseJoinColumns = @JoinColumn(name = "id_competence"))
    private Set<Competence> competencess;

    public Ressource() {
        super();
    }

    public Ressource(Long id, String nom, String prenom, int num_tel, String email, String mdp) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.num_tel = num_tel;
        this.email = email;
        this.mdp = mdp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    @Override
    public String toString() {
        return "Ressource{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", num_tel=" + num_tel +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                ", profil='" + profil + '\'' +
                '}';
    }
}
