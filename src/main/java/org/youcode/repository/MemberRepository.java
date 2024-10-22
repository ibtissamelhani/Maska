package org.youcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.youcode.domain.Member;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
