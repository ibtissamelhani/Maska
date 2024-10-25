package org.youcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.youcode.domain.Member;
import org.youcode.service.MemberService;

import java.util.List;

@Controller
public class MemberController {


    private MemberService membreService;

    public MemberController(MemberService membreService) {
        this.membreService = membreService;
    }

    @GetMapping("/")
    public String redirectToMembers() {
        return "redirect:/members";
    }
    @GetMapping("/members")
    public String listMembres(Model model) {
        List<Member> members = membreService.findAll();
        model.addAttribute("members", members);
        return "listMembers";
    }
}
