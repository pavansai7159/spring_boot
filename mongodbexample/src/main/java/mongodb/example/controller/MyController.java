package mongodb.example.controller;

import mongodb.example.models.Student;
import mongodb.example.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/")
    public ResponseEntity<?>addStudent(@RequestBody Student student){
Student save=this.studentRepository.save(student);
return  ResponseEntity.ok(save);
    }
    @GetMapping("/")
    public ResponseEntity<?>getStudents(){
        return  ResponseEntity.ok(this.studentRepository.findAll());
    }
}
