package ml.icitapeng.pera.backend.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ml.icitapeng.pera.backend.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	Page<User> findByEmailLikeIgnoreCaseOrNameLikeIgnoreCaseOrRoleLikeIgnoreCase(String emailLike, String nameLike,
			String roleLike, Pageable pageable);

	long countByEmailLikeIgnoreCaseOrNameLikeIgnoreCase(String emailLike, String nameLike);
}
