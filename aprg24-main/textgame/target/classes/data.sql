

CREATE TABLE IF NOT EXISTS Spieler (
                                       id LONG PRIMARY KEY AUTO_INCREMENT,
                                       username VARCHAR(100) NOT NULL, --?? username variable
                                       passwort VARCHAR(100) NOT NULL, --?? passwort
                                       status VARCHAR(100) NOT NULL
);



CREATE TABLE IF NOT EXISTS Kopf (
                                    id LONG PRIMARY KEY AUTO_INCREMENT
);


CREATE TABLE IF NOT EXISTS Oben (
                                    id LONG PRIMARY KEY AUTO_INCREMENT
);


CREATE TABLE IF NOT EXISTS Unten (
                                     id LONG PRIMARY KEY AUTO_INCREMENT
);


CREATE TABLE IF NOT EXISTS Charakter (
                                         id LONG PRIMARY KEY AUTO_INCREMENT,
                                         spieler_id LONG NOT NULL,
                                         FOREIGN KEY (spieler_id) REFERENCES Spieler(id),
                                         kopf_id LONG NOT NULL,
                                         FOREIGN KEY (kopf_id) REFERENCES Kopf(id),
                                         oben_id LONG NOT NULL,
                                         FOREIGN KEY (oben_id) REFERENCES Oben(id),
                                         unten_id LONG NOT NULL,
                                         FOREIGN KEY (unten_id) REFERENCES Unten(id)
);



CREATE TABLE IF NOT EXISTS Antwortenkatalog (
                                     id LONG PRIMARY KEY AUTO_INCREMENT,
                                     option_a_text VARCHAR(100) NOT NULL,
                                     id_option_a INT NOT NULL, --oder auto increment???
                                     option_b_text VARCHAR(100) NOT NULL,
                                     id_option_b INT NOT NULL
);


--CREATE TABLE IF NOT EXISTS Antworten (
                                    --     spieler_id INT NOT NULL,
                                    --     FOREIGN KEY (spieler_id) REFERENCES Spieler(id),
                                    --     antwortenkatalog_id INT NOT NULL,
                                    --     FOREIGN KEY (antwortenkatalog_id) REFERENCES Antwortenkatalog(id),
                                   --     option_a_id INT NOT NULL,
                                   --     FOREIGN KEY (option_a_id) REFERENCES Antwortenkatalog(id_option_a),
                                    --    option_b_id INT NOT NULL,
--);


--CREATE TABLE IF NOT EXISTS Spiele_overview (
                                          --     antwortenkatalog_id INT NOT NULL,
                                          --      FOREIGN KEY (antwortenkatalog_id) REFERENCES Antwortenkatalog(id),
                                          --     option_a_id INT NOT NULL,
                                         --      FOREIGN KEY (option_a_id) REFERENCES Antwortenkatalog(id_option_a),
                                         --      option_b_id INT NOT NULL,
                                         --      FOREIGN KEY (option_b_id) REFERENCES Antwortenkatalog(id_option_b)

--);