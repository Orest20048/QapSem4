package com.keyin.golfclubapi.controller;

import com.keyin.golfclubapi.model.Member;
import com.keyin.golfclubapi.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public Member createOrUpdateMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public Optional<Member> getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMemberById(@PathVariable Long id) {
        memberService.deleteMemberById(id);
    }

    @GetMapping("/search/by-name")
    public List<Member> searchMembersByName(@RequestParam String name) {
        return memberService.searchMembersByName(name);
    }
}
