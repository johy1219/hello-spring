package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// SpringDataJpaMemberRepository 스프링 빈에 자동 등록
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{


    // select m from Member m where m.name = ? sql로 변형되어 실행행
   @Override
    Optional<Member> findByName(String name);

}
