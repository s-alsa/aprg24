package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;

public class Antwortenkatalog {

    @Id
    private long id;
    private String option_a_text;
    private int id_option_a;
    private String option_b_text;
    private int id_option_b;

    public Antwortenkatalog(long id) {
        this.id = id;
    }

    long id() {
        return id;
    }

    int getId_option_a() {
        return id_option_a;
    }

    int getId_option_b() {
        return id_option_b;
    }

}

