package com.keyin.golfclubapi.service;

import com.keyin.golfclubapi.model.Member;
import com.keyin.golfclubapi.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for handling business logic related to Member entities.
 */
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * Constructor-based dependency injection.
     *
     * @param memberRepository the repository for Member data access
     */
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * Save a new member or update an existing one.
     *
     * @param member the member to save
     * @return the saved member
     */
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    /**
     * Retrieve all members from the database.
     *
     * @return list of all members
     */
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    /**
     * Retrieve a member by their ID.
     *
     * @param id the member ID
     * @return an Optional containing the member if found
     */
    public Optional<Member> getMemberById(Long id) {
        return memberRepository.findById(id);
    }

    /**
     * Delete a member by their ID.
     *
     * @param id the member ID
     * @throws IllegalArgumentException if the member does not exist
     */
    public void deleteMemberById(Long id) {
        if (memberRepository.existsById(id)) {
            memberRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Cannot delete: Member with ID " + id + " does not exist.");
        }
    }

    /**
     * Search for members by name (case-insensitive, partial match).
     *
     * @param name the name to search
     * @return list of matching members
     */
    public List<Member> searchMembersByName(String name) {
        return memberRepository.findByNameContainingIgnoreCase(name);
    }
}
