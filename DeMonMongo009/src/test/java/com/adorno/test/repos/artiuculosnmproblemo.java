package com.adorno.test.repos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.adorno.model.compuestaProblemo.Articulo;
import com.adorno.model.compuestaProblemo.ArticuloRepository;
import com.adorno.model.compuestaProblemo.Marca;
import com.adorno.model.compuestaProblemo.MarcaRepository;

@SpringBootTest
class artiuculosnmproblemo {
	@Autowired
	MarcaRepository marcaRepository;
	@Autowired
	ArticuloRepository articuloRepository;
	@Autowired
	MongoTemplate mongoTemplate;
	@Test
	void test() {
		mongoTemplate.getCollection("articulos").drop();
		mongoTemplate.getCollection("marcas").drop();
		Marca save = marcaRepository.save(new Marca("Tibetano"));
		Articulo save2 = articuloRepository.save(new Articulo(save,1L));
//		articuloRepository.save(new Articulo(new Marca("Tibetano"),1l));
		articuloRepository.save(new Articulo(save,1l));
	}

}
