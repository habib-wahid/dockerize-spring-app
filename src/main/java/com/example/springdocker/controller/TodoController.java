package com.example.springdocker.controller;

import com.example.springdocker.dto.TodoRequestDto;
import com.example.springdocker.model.Todo;
import com.example.springdocker.service.TodoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TodoController {
  private final TodoService todoService;

  @PostMapping("/save")
  public void saveTodo(@RequestBody TodoRequestDto todoRequestDto){
    todoService.saveTodo(todoRequestDto);
  }

  @GetMapping("/todos")
  public List<Todo> getAllTodos(){
    return todoService.getAll();
  }

}
