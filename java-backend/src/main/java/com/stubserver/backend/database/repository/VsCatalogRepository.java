package com.stubserver.backend.database.repository;

import org.common.db.entity.VsCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VsCatalogRepository extends JpaRepository<VsCatalog, Long> {

    Optional<VsCatalog> findByVsName(String vsName);
}
