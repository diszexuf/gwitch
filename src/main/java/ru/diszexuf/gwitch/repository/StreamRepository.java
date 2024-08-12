package ru.diszexuf.gwitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diszexuf.gwitch.model.Stream;

public interface StreamRepository extends JpaRepository<Stream, Long> {

}
