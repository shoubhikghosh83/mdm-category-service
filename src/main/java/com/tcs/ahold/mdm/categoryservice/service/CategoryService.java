package com.tcs.ahold.mdm.categoryservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ahold.mdm.categoryservice.model.Category;
import com.tcs.ahold.mdm.categoryservice.repository.CategoryRepository;
import com.tcs.ahold.mdm.categoryservice.repository.CategoryRepositoryIF;

@Service
public class CategoryService {

	//private final CategoryRepository catrepo;
	private final CategoryRepositoryIF catrepo;
	
	/*public CategoryService(final CategoryRepository catrepo)
	{
		this.catrepo = catrepo;
	}*/
	@Autowired
	public CategoryService(final CategoryRepositoryIF catrepo)
	{
		this.catrepo = catrepo;
	}
	
	
	
	public Optional<Category> getCategoryById(String id)
	{
		return catrepo.findById(id);
	}
	
	public Optional<Category> getByCategoryName(String name)
	{
		return catrepo.findByCatName(name);
	}
	
	public List<Category> getAllCategory()
	{
		return (List<Category>) catrepo.findAll();
	}
	
	public boolean addModifyCategory(String activity, Category cat)
	{
		if(activity.equalsIgnoreCase("A"))
		{
			catrepo.save(cat);
		}
		return true;
	}
}
