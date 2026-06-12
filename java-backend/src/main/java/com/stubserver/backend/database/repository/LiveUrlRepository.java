package com.stubserver.backend.database.repository;

import org.common.db.entity.VsLiveUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LiveUrlRepository extends JpaRepository<VsLiveUrl, Long> {

    List<VsLiveUrl> findByVsid(Long vsid);

    boolean existsByVsidAndHost(Long vsid, String host);

    Optional<VsLiveUrl> findTopByOrderByVsUrlIdDesc();
}
