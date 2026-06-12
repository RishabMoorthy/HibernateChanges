package com.stubserver.backend.database.repository;

import org.common.db.entity.VsExecutionMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExecutionModeRepository extends JpaRepository<VsExecutionMode, Long> {

    Optional<VsExecutionMode> findByMasterIdAndVirtServer(Long masterId, String virtServer);
}
