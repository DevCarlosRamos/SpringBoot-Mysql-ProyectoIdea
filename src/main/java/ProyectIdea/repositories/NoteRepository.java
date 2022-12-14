package ProyectIdea.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ProyectIdea.models.NoteModel;

@Repository
public interface NoteRepository extends CrudRepository<NoteModel, Long> {

}
