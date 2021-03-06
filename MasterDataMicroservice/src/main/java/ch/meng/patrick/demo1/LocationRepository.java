package ch.meng.patrick.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Long>, JpaSpecificationExecutor<LocationEntity> {
    Optional<LocationEntity> findByZip(String zip);
    Optional<LocationEntity> findByName(String zip);

    List<LocationEntity> findByZipLike(String zip);

}
