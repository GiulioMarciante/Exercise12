package develhope.co.Exercise12.repositories;

import develhope.co.Exercise12.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Programming language"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
