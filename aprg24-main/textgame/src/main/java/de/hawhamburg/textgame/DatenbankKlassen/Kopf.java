package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;

public class Kopf {
    @Id
    private long id;

    public Kopf(long id) {
        this.id = id;
    }

    long id() {
        return id;
    }
}
