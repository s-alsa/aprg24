package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;

public class Unten {
    @Id
    private long id;

    public Unten(long id) {
        this.id = id;
    }

    long id() {
        return id;
    }
}
