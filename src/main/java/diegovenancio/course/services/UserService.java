package diegovenancio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diegovenancio.course.entites.User;
import diegovenancio.course.repositories.UserRepository;
import diegovenancio.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById (Long id) {
		Optional<User> obj= repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public User updata(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updataData(entity, obj);
		return repository.save(entity);
	}
	private void updataData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	}

