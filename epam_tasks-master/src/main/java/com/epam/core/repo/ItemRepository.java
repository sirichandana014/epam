package com.epam.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.core.model.ItemModel;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Integer> {

	
}
