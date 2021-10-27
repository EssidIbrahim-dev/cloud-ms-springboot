package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;


@Service
@RefreshScope
public class FactureService {
    @Autowired
    private FactureRepository repository;
    
  

	public List<FactureEntity> getAllfactures() {
		 List<FactureEntity> factures = new ArrayList<>();
	        repository.findAll().forEach(facture -> factures.add(facture));
	        return factures;
		
	}
	  public void saveOrUpdate(FactureEntity facture)
	    {
	        repository.save(facture);
	    }
	  public String deletefacture(int id) {
	        if(repository.findById(id).isPresent()) {
	            repository.deleteById(id);
	            return "deleted successfully";
	        }
	        else {
	            return "Error";
	        }
	    }
}
