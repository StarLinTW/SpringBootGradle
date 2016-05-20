package hello.repo;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hello.entity.GameRequest;

@Transactional
public interface GameRequestDao extends JpaRepository<GameRequest, Long> {
	//GameRequest findByCurrency(String currency);
	List<GameRequest> findByCurrency(String currency);
	List<GameRequest> findByCurrencyStartingWith(String currency);
	@Query()
	Object test();

}