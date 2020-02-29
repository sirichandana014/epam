package com.epam.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.core.model.ChildModel;

@Repository
public interface ChildRepository extends JpaRepository<ChildModel, Integer> {

}
