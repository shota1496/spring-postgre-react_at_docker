package com.company.project.controllers;

import com.company.project.entity.Contact;
import com.company.project.entity.Greeting;
import com.company.project.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = "*")
public class ContactController {
    @Autowired
    private ContactRepository repo;

   @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return repo.save(contact);
    }
}
