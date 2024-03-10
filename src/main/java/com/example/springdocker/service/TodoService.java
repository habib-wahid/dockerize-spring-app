package com.example.springdocker.service;

import com.example.springdocker.dto.TodoRequestDto;
import com.example.springdocker.model.Todo;
import com.example.springdocker.repository.TodoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

  private final TodoRepository todoRepository;

  public void saveTodo(TodoRequestDto todoRequestDto){
    Todo todo = Todo.builder()
      .name(todoRequestDto.name())
      .description(todoRequestDto.description())
      .build();
    todoRepository.save(todo);
  }

  public List<Todo> getAll(){
    return todoRepository.findAll();
  }

}
