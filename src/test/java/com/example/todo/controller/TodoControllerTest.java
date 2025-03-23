package com.example.todo.controller;

import com.example.todo.dto.TodoRequest;
import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class TodoControllerTest {

    @Test
    void getAll_shouldReturnTodos() throws Exception {
        // Мокаем репозиторий
        TodoRepository mockRepo = Mockito.mock(TodoRepository.class);
        when(mockRepo.findAll()).thenReturn(List.of(new Todo(1L, "Test task", false)));

        // Создаем контроллер вручную
        TodoController controller = new TodoController(mockRepo);

        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/todos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value("Test task"))
                .andExpect(jsonPath("$[0].completed").value(false));
    }
}
