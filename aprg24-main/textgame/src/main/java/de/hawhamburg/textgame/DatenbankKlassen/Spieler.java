package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

public class Spieler {

    @Id
    private long id;
    private String username;
    private String passwort;
    private String status;

    public Spieler(String username, String passwort, String status) {
        this.username = username;
        this.passwort = passwort;
        this.status = status;
    }

    public Spieler(long id) {
        this.id = id;
    }

    long id() {
        return id;
    }


}
