package com.rocketcode.Prueba8.controller;

import com.rocketcode.Prueba8.mapper.TaskMapper;
import com.rocketcode.Prueba8.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskMapper taskMapper;

    // Página de inicio
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Formulario de alta de tareas
    @GetMapping("/add")
    public String showAddTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "add_task";
    }

    // Procesar el formulario de alta de tareas
    @PostMapping("/add")
    public String addTask(@Validated @ModelAttribute Task task, BindingResult bindingResult, Model model) {
        taskMapper.insertTask(task); // Inserta la tarea en la base de datos
        return "redirect:/tasks"; // Redirige al listado de tareas
    }

    

    // Listar todas las tareas
    @GetMapping("/tasks")
    public String listTasks(Model model) {
        List<Task> tasks = taskMapper.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task_list";
    }
}
