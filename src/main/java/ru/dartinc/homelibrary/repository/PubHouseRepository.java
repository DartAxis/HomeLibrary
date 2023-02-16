package ru.dartinc.homelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dartinc.homelibrary.model.PubHouse;


@Repository
public interface PubHouseRepository extends JpaRepository<PubHouse, Long> {
    PubHouse getPubHouseByPubHouseName(String pubHouseName);
}
