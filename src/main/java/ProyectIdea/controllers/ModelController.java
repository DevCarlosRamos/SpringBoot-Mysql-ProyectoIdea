package ProyectIdea.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectIdea.models.NoteModel;
import ProyectIdea.services.NoteService;

@RestController
@RequestMapping("/notes")
public class ModelController {

    @Autowired
    NoteService noteService;

    @GetMapping()
    public ArrayList<NoteModel> getNotes() {
        return noteService.getNotes();
    }

    @PostMapping()
    public NoteModel createNote(@RequestBody NoteModel note) {
        return noteService.createNote(note);
    }

}
