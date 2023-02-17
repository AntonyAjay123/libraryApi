package com.example.Library.controller;

import com.example.Library.model.Library;
import com.example.Library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;
    @GetMapping("/")
    public List<Library> getAll(){
        return libraryService.getAll();
    }

    @GetMapping("/name/{name}")
    public Library getName(@PathVariable String name){
        return libraryService.getName(name);
    }

    @DeleteMapping("/name/{name}")
    public void deleteName(@PathVariable String name){
        libraryService.deleteName(name);
    }

    @PostMapping("/")
    public void postLibrary(@RequestBody Library library){
        libraryService.postLibrary(library);
    }
}
