package ProyectIdea.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectIdea.models.NoteModel;
import ProyectIdea.repositories.NoteRepository;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public ArrayList<NoteModel> getNotes() {
        return (ArrayList<NoteModel>) noteRepository.findAll();
    }

    public NoteModel createNote(NoteModel note) {
        return noteRepository.save(note);
    }
}
