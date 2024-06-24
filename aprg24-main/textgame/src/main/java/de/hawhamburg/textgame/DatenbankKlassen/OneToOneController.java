package de.hawhamburg.textgame.DatenbankKlassen;


import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class OneToOneController {

    private final SpielerRepository spielerRepository;
    private final CharakterRepository charakterRepository;

    OneToOneController(SpielerRepository spielerRepository, CharakterRepository charakterRepository) {
        this.spielerRepository = spielerRepository;
        this.charakterRepository = charakterRepository;
        insertInitialDataToDatabase();
    }

    private void insertInitialDataToDatabase() {
    }
}


