package com.keyin.golfclubapi.repository;

import com.keyin.golfclubapi.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for managing Member entities.
 * Provides CRUD operations and custom query methods.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

    /**
     * Finds members whose names contain the specified keyword (case-insensitive).
     *
     * @param name the partial or full name to search for
     * @return a list of matching members
     */
    List<Member> findByNameContainingIgnoreCase(String name);
}
