package com.sau.project1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sau.project1.Entity.Person;
import com.sau.project1.Service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping(path = "/person")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @GetMapping("")
    public String ListPeople(Model model ) {

        List<Person> people = personService.getAll();
        model.addAttribute("people",people);
        return "Person/index.html";
    }

    @PostMapping("add")
    public String AddPerson(@ModelAttribute Person person) {

        Person people = personService.save(person);
        return "redirect:/person";
    }

    @PostMapping("update")
    public String UpdatePerson(@ModelAttribute Person person) {

        Person people = personService.update(person);
        return "redirect:/person";
    }

    @PostMapping("delete")
    public String DeletePerson(@RequestParam("id") Long id) {

        personService.delete(id);
        return "redirect:/person";
    }
    
}
