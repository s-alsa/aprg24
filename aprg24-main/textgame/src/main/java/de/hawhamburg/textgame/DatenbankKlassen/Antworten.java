package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;

public class Antworten {

    @Id
    private long id;
    private long spieler_id;
    private long antwortenkatalog_id;
    private int id_option_a;
    private int id_option_b;

    Antworten(){
    }

    Antworten(long id, Antwortenkatalog antwortenkatalog){
        this.id = id;
        this.antwortenkatalog_id = antwortenkatalog.id();
    }

    Antworten(long id, Spieler spieler){
        this.id = id;
        this.spieler_id = spieler.id();
    }

}
