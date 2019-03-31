package ternal.hoge.spring.boot.apidoc.example.hoge;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<HogeUser, Long>  {
}
