package ProyectIdea.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectIdea.models.NoteModel;
import ProyectIdea.repositories.NoteRepository;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    // Trae todas las filas
    public ArrayList<NoteModel> getNotes() {
        return (ArrayList<NoteModel>) noteRepository.findAll();
    }

    // Crea o actuliza una nueva fila
    public NoteModel createNote(NoteModel note) {
        return noteRepository.save(note);
    }

    // Muestra una fila
    public Optional<NoteModel> getNote(Long id) {
        return noteRepository.findById(id);
    }

    // Elimina una fila
    public boolean removeNote(Long id) {

        noteRepository.deleteById(id);
        try {
            noteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
