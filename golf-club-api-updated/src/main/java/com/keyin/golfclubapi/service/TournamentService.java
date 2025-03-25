package com.keyin.golfclubapi.service;

import com.keyin.golfclubapi.model.Member;
import com.keyin.golfclubapi.model.Tournament;
import com.keyin.golfclubapi.repository.MemberRepository;
import com.keyin.golfclubapi.repository.TournamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for handling business logic related to tournaments.
 */
@Service
public class TournamentService {

    private final TournamentRepository tournamentRepository;
    private final MemberRepository memberRepository;

    public TournamentService(TournamentRepository tournamentRepository, MemberRepository memberRepository) {
        this.tournamentRepository = tournamentRepository;
        this.memberRepository = memberRepository;
    }

    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Optional<Tournament> getTournamentById(Long id) {
        return tournamentRepository.findById(id);
    }

    public void deleteTournamentById(Long id) {
        if (tournamentRepository.existsById(id)) {
            tournamentRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Cannot delete: Tournament with ID " + id + " does not exist.");
        }
    }

    public Tournament addMemberToTournament(Long tournamentId, Long memberId) {
        Tournament tournament = tournamentRepository.findById(tournamentId)
                .orElseThrow(() -> new IllegalArgumentException("Tournament with ID " + tournamentId + " does not exist."));
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("Member with ID " + memberId + " does not exist."));

        tournament.getParticipatingMembers().add(member);
        return tournamentRepository.save(tournament);
    }

    public List<Member> getAllMembersInTournament(Long tournamentId) {
        Tournament tournament = tournamentRepository.findById(tournamentId)
                .orElseThrow(() -> new IllegalArgumentException("Tournament with ID " + tournamentId + " does not exist."));
        return tournament.getParticipatingMembers();
    }

    public List<Tournament> findByLocation(String location) {
        return tournamentRepository.findByLocationContainingIgnoreCase(location);
    }

    public List<Tournament> findByStartDate(String startDate) {
        return tournamentRepository.findByStartDate(startDate);
    }
}
