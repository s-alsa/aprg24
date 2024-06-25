package de.hawhamburg.textgame.DatenbankKlassen;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CharakterRepository extends ListCrudRepository<Charakter, Long> {
}
