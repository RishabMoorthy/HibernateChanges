package com.stubserver.backend.database.repository;

import org.common.db.entity.AssignedService;
import org.common.db.entity.AssignedServiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AssignedServiceRepository extends JpaRepository<AssignedService, AssignedServiceId> {

    List<AssignedService> findByIdUsername(String username);

    @Transactional
    void deleteByIdUsername(String username);
}
