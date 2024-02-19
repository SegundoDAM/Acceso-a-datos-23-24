package com.adorno.test.repos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.adorno.model.compuestaSolucion.Articulo;
import com.adorno.model.compuestaSolucion.ArticuloId;
import com.adorno.model.compuestaSolucion.ArticuloRepository;
import com.adorno.model.compuestaSolucion.Marca;
import com.adorno.model.compuestaSolucion.MarcaRepository;

@SpringBootTest
class artiuculosnmsolucion {
	@Autowired
	MarcaRepository marcaRepository;
	@Autowired
	ArticuloRepository articuloRepository;
	@Autowired
	MongoTemplate mongoTemplate;
	@Test
	void test() {
//		mongoTemplate.getCollection("articulosb").drop();
//		mongoTemplate.getCollection("marcasb").drop();
//		Marca save = marcaRepository.save(new Marca("Tibetano"));
//		Articulo save2 = articuloRepository.save(new Articulo(new ArticuloId(save, 1L),"una cosa mu bonita"));
//		articuloRepository.save(new Articulo(new Marca("Tibetano"),1l));
//		articuloRepository.save(new Articulo(new ArticuloId(save, 1L),"tambien es mu bonita"));
	}

}
