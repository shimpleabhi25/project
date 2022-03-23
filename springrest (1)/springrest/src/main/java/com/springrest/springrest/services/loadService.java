package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.loads;

public interface loadService {

	public List<loads> getloads();
	
	public loads getload(long loadId);
	
	public loads addload(loads loads);
	
	public loads updateload(loads loads);
	
	public void deleteload(long parseLong);

}
