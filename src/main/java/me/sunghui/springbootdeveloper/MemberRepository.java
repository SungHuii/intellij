package me.sunghui.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name);
}
// Repository 는 Entity 에 있는 데이터들을 조회하거나 저장, 변경, 삭제를 할 때
// 사용하는 인터페이스로, 스프링 데이터 JPA 에서 제공하는 인터페이스인
// JpaRepository 클래스를 상속받아 간단하게 구현 가능하다.
