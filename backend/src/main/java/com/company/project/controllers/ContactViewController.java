package com.company.project.controllers;

import com.company.project.entity.Contact;
import com.company.project.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viewcontacts")
public class ContactViewController {
    @Autowired
    private ContactRepository repo;

    // 全件を返すエンドポイント
    @GetMapping
    public List<Contact> getAllContacts() {
        return repo.findAll();
    }
}
