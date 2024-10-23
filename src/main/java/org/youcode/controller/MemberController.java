package org.youcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.youcode.domain.Member;
import org.youcode.service.MemberService;

import java.util.List;

//@Controller
//@RequestMapping("/members")
//public class MemberController {
//
//    @Autowired
//    private MemberService memberService;
//
//
//    @GetMapping
//    public String listMembers(Model model) {
//        List<Member> members = memberService.findAll();
//        model.addAttribute("members", members);
//        return "listMember";
//    }

@Controller
public class MemberController {

    @Autowired
    private MemberService membreService;

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
