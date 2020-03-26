package fr.kba.dentalgoure.repository;

import fr.kba.dentalgoure.models.ERole;
import fr.kba.dentalgoure.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
