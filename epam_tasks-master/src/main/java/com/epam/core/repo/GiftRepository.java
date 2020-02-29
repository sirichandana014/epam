package com.epam.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.core.model.GiftModel;

@Repository
public interface GiftRepository extends JpaRepository<GiftModel, Integer> {

}
