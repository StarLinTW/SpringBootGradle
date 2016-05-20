package hello.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.entity.GameResponse;

@Transactional
public interface GameResponseDao extends JpaRepository<GameResponse, Long> {

}