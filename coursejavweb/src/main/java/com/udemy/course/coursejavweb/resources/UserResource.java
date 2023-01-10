package com.udemy.course.coursejavweb.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.udemy.course.coursejavweb.entities.User;
import com.udemy.course.coursejavweb.services.UserService;

@RestController
@RequestMapping(value = "/users") // Como a página vai ser chamada (Ex. Nomedapagina/users)
public class UserResource {
	
	//colocando uma dependencia para o service
	@Autowired  
	private UserService service;
	
	
	//BUSCAR / LOCALIZAR (NOTE O GET)
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
//		User u = new User(1l, "Gerson Araújo", "gerson22@gmail.com", "21-98000-5454", "12345678");
//		return ResponseEntity.ok().body(u);
	}
	
	@GetMapping(value = "/{id}") //Esses endpoints servem para recuperar os dados do banco. Quando esse é o objetivo, usamos o método GET do http.
	
	public ResponseEntity<User> findByid(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//INSERIR/ CADASTRAR (NOTE O POST)
	@PostMapping // Para inserir dados utilizamos o metodo POST do http
	
	//O Método a baixo é para obter 'a resposta 201 do http' e não apenas a 200. A 201 tem informaçoes no cabeçalho. (Estudar)
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);

		
	}
	
	//DELETAR / EXCLUIR (NOTE O DELETE)
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	//UPDATE / ATUALIZAR (NOTE O PUT)
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
}
