package org.youcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.youcode.domain.Member;
import org.youcode.service.MemberService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Load the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the MembreServiceImpl bean
        MemberService memberService = context.getBean(MemberService.class);

        // Create a new Membre instance
        Member membre = Member.builder()
                .id(3L)
                .firstName("ibti")
                .lastName("Elh")
                .licenseExpirationDate(LocalDate.now())
                .membershipDate(LocalDate.now().plusDays(1))
                .nationality("test")
                .pieceIdentification("test")
                .membershipNumber("zfv3456")
                .build();

        // Save the Membre instance
        memberService.save(membre);
        System.out.println("Membre saved: " + membre);

    }
}