package com.stubserver.backend.database.repository;

import org.common.db.entity.VSDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VsDetailsRepository extends JpaRepository<VSDetails, Long> {

    Optional<VSDetails> findByVsName(String vsName);
}
