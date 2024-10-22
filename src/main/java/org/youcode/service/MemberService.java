package org.youcode.service;

import org.youcode.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Member save(Member membre);
    Member update(Member membre);
    void delete(Long id);
    Optional<Member> findById(Long id);
    List<Member> findAll();
}
