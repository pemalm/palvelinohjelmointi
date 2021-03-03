package fi.malm.Pelikanta.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PeliRepository extends CrudRepository<Peli, Long> {
    List<Peli> findByNimi(String nimi);
}
