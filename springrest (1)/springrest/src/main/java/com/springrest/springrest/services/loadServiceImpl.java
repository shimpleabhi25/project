package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.dao.loaddao;
import com.springrest.springrest.entities.loads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class loadServiceImpl implements loadService {

	@Autowired
	private loaddao loaddao;
	
	
	
	
	@Override
	public loads getload(long loadId) {
		
		return loaddao.getOne(loadId);
	}

	@Override
	public List<loads> getloads() {
		// TODO Auto-generated method stub
		return loaddao.findAll();
	}

	@Override
	public loads addload(loads loads) {
		// TODO Auto-generated method stub
		
		loaddao.save(loads);
		return loads;
	}

	@Override
	public loads updateload(loads loads) {
		
		loaddao.save(loads);
		return loads;
	}

	@Override
	public void deleteload(long parseLong) {
	
		loads entity=loaddao.getOne(parseLong);
		loaddao.delete(entity);
	}

}
