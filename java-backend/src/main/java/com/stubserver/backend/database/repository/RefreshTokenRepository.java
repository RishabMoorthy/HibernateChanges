package com.stubserver.backend.database.repository;

import org.common.db.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {

    void deleteAllByUsername(String username);

    Optional<RefreshToken> findByJti(String jti);
}
