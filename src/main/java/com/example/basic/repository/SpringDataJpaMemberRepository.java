package com.example.basic.repository;

import com.example.basic.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //JPQL로 번역됨. select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);

}
