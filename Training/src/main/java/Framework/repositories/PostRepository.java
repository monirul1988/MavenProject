package Framework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Framework.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
