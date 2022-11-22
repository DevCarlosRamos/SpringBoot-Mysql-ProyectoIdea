package ProyectIdea.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectIdea.models.NoteModel;
import ProyectIdea.services.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    NoteService noteService;

    // Nos muestra todas las publicaciones
    @GetMapping()
    public ArrayList<NoteModel> getNotes() {
        return noteService.getNotes();
    }

    // Crea una publicacion
    @PostMapping()
    public NoteModel createNote(@RequestBody NoteModel note) {
        return noteService.createNote(note);
    }

    // Nos muetra una publicacion
    @GetMapping(path = "/{id}")
    public Optional<NoteModel> getNote(@PathVariable("id") Long id) {
        return noteService.getNote(id);
    }

    // Elimina una publicacion
    @DeleteMapping(path = "/{id}")
    public String removeNote(@PathVariable("id") Long id) {
        boolean ok = noteService.removeNote(id);

        if (ok) {
            return "La publicación " + id + "a sido eliminada ";
        } else {
            return "La publicación " + id + "no a sido eliminada ";
        }
    }

}
