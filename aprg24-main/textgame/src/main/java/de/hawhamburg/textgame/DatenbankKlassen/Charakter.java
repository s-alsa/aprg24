package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.annotation.Id;

public class Charakter {

    @Id
    private long id;
    private long spieler_id;
    private long kopf_id;
    private long oben_id;
    private long unten_id;

Charakter(){
}

Charakter(long id,Spieler spieler){
    this.id = id;
    this.spieler_id = spieler.id();
}

Charakter(long id,Kopf kopf){
        this.id = id;
        this.kopf_id = kopf.id();
}

Charakter(long id,Oben oben){
        this.id = id;
        this.oben_id = oben.id();
}

Charakter(long id,Unten unten){
        this.id = id;
        this.unten_id = unten.id();
}

}
