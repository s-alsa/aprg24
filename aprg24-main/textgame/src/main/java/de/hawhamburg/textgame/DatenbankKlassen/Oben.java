package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;

public class Oben {
    @Id
    private long id;

    public Oben(long id) {
        this.id = id;
    }

    long id() {
        return id;
    }
}
