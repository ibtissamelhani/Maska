package org.youcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.youcode.domain.Member;
import org.youcode.service.MemberService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Load the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the MembreServiceImpl bean
        MemberService memberService = context.getBean(MemberService.class);

        // Create a new Membre instance
        Member member = Member.builder()
                .firstName("testname")
                .lastName("LastName")
                .licenseExpirationDate(LocalDate.now())
                .membershipDate(LocalDate.now().plusDays(1))
                .nationality("updatedNationality")
                .pieceIdentification("updatedPieceIdentification")
                .membershipNumber("cfgvbh")
                .build();

        // Save the Member instance
//        memberService.save(member);
//        System.out.println("Member saved: " + member);

        //get member by id
//        Member member1 = memberService.findById(1L).orElse(null);
//        System.out.println("member : "+ member1);

        //delete a member
//        memberService.delete(1L);

        //update member
//        Member updatedMember = memberService.update(member);
//        System.out.println("updatedMember = " + updatedMember);

        //get all members
        List<Member> members=  memberService.findAll();
        members.forEach(System.out::println);



    }
}