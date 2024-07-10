package com.store.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

	Optional<Store> findByUuid(UUID uuid);

	Optional<Store> findByCnpj(String cnpj);

	Optional<Store> findBySocialName(String socialName);
}
