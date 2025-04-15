package backend.repository;

import backend.domain.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OcurrenceRepository extends JpaRepository<Occurrence, UUID> {}
