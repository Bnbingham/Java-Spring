package com.webby.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webby.model.ConfusedClowns;

@Repository
public class ClownDao {

	private List<ConfusedClowns> list = new ArrayList<>();
	
	{
		list.add(new ConfusedClowns(1, "krusty", true, 2));
		list.add(new ConfusedClowns(2, "william shatner", true, 0));
		list.add(new ConfusedClowns(3, "pennywise", false, 10));
		list.add(new ConfusedClowns(4, "Jason", true, 1));
	}
	
	
	public List<ConfusedClowns> getAll(){
		return list;
	}
	
	public ConfusedClowns findById(int id) {
		return list.stream().filter(c->c.getId()==id).findFirst().get();
	}
	
	public List<ConfusedClowns> findAllByDimensia(boolean b){
		List<ConfusedClowns> list2 = new ArrayList<>();
		list.stream().filter(c->c.isDimensia()==b).forEach(c->list2.add(c));
		return list2;
	}
	
	
}
