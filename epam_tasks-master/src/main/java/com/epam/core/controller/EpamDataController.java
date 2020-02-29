package com.epam.core.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.core.model.CategoryModel;
import com.epam.core.model.GiftModel;
import com.epam.core.model.ItemModel;
import com.epam.core.repo.CategoryRepository;
import com.epam.core.repo.ChildRepository;
import com.epam.core.repo.GiftRepository;
import com.epam.core.repo.ItemRepository;

@RestController
@RequestMapping("/epam/data")
public class EpamDataController {

	@Autowired
	CategoryRepository categoryRepo;
	
	@Autowired
	GiftRepository giftRepo;
	
	@Autowired
	ItemRepository itemRepo;
	
	@Autowired
	ChildRepository childRepo;
	
	@GetMapping("/category/{categoryId}")
	public List<ItemModel> fetchItemsByCategory(@PathVariable final Integer categoryId){
		
		Optional<CategoryModel> categoryModel = categoryRepo.findById(categoryId);
		if(categoryModel.isPresent()){
			List<ItemModel> allItems = itemRepo.findAll();
			return allItems.stream().filter(item -> item.getCategoryId().getId() == categoryId).collect(Collectors.toList());
		}
		return new ArrayList();
	}
	
	@GetMapping("/gifts")
	public List<GiftModel> fetchGifts(){
		
		List<GiftModel> allGifts = giftRepo.findAll();
		
		return allGifts;
	}
	
	@GetMapping("/gift/{giftId}")
	public List<ItemModel> fetchItemsByGift(@PathVariable final Integer giftId){
		
		Optional<GiftModel> giftModel = giftRepo.findById(giftId);
		
		if(giftModel.isPresent()){
			return giftModel.get().getItems();
		}
		return new ArrayList();
	}
	
	
}
