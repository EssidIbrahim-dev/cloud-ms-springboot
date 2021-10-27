package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/facture")
public class FactureRestAPI {

	  @Autowired
	    private FactureService service;

	    @GetMapping ("/factures")
	    private List<FactureEntity> getAllfactures()
	    {
	        return service.getAllfactures();
	    }
	    @PutMapping("/facture")
	    private FactureEntity update(@RequestBody FactureEntity facture)
	    {
	        service.saveOrUpdate(facture);
	        return facture;
	    }
	    @DeleteMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity<String> deleteCandidate(@PathVariable(value= "id") int id){
	        return new ResponseEntity<>(service.deletefacture(id),HttpStatus.OK);
	    }

}