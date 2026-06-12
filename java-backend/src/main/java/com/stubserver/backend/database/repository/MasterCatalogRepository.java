package com.stubserver.backend.database.repository;

import org.common.db.entity.MasterCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterCatalogRepository extends JpaRepository<MasterCatalog, Long> {

    boolean existsByVsName(String vsName);

    boolean existsByPort(Integer port);
}
