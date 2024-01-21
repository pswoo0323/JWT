package practice.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import practice.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username);//username이 존재하는지 확인

    UserEntity findByUsername(String username);//username을 받아 DB에서 회원을 조회하는 메소드


}
