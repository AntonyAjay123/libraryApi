package com.example.Library.service;

import com.example.Library.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class LibraryService {

    static List<Library> libraries = new ArrayList<>();

    static{
        libraries.add(new Library("Xyz","address1","facility1",9140283));
        libraries.add(new Library("abc","address2","facility2",994028));
        libraries.add(new Library("Library3","address3","facility3",34283));
        libraries.add(new Library("Library4","address4","facility4",9901283));
    }

    public List<Library> getAll(){
        return libraries;
    }
    public Library getName(String name){
        for(Library l:libraries){
            if(l.getName().equalsIgnoreCase(name))
                return l;
        }
        return null;
    }
    public void deleteName(String name){
        Predicate<?super Library> predicate = library -> library.getName().equalsIgnoreCase(name);
        libraries.removeIf(predicate);
    }

    public void postLibrary(Library newLibrary){
        libraries.add(newLibrary);
    }
}
