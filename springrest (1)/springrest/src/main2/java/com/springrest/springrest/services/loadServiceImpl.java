package com.springrest.springrest.services;

import java.util.List;
import java.util.ArrayList;
import com.springrest.springrest.entities.loads;

public class loadServiceImpl implements loadService {

	
	List<loads> list;
	
	public loadServiceImpl()
	{
		list=new ArrayList <>();
		list.add(new loads(123,"delhi","jaipur","chemicals","canter","10-03-2022",1,100,"comment"));
		list.add(new loads(4569,"alwar","jaipur","chemicals","canter","09-03-2022",1,100,"comment"));
	}
	@Override
	public List<loads> getload() {
		// TODO Auto-generated method stub
		return null;
	}

}
