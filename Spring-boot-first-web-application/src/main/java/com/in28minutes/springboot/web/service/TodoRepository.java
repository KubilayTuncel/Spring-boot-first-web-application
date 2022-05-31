package com.in28minutes.springboot.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.web.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
	List<Todo> findByUser(String user);
	
	//service.retrieveTodos(name)
	
	//service.deleteTodo(id)
	//service.retrieveTodo(id)
	//service.updateTodo(id)
	/*
	 *     deleteTodo - Use repository.deleteById(id); instead of repository.delete(id);

    showUpdateTodoPage - Use Todo todo = repository.findById(id).get(); instead of Todo todo = repository.findOne(id);
	 */
	

}
