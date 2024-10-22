package org.youcode.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "membership_number", nullable = false)
    private String membershipNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "piece_identification", nullable = false)
    private String pieceIdentification;

    @Column(nullable = false)
    private String nationality;

    @Column(name = "membership_date",nullable = false)
    private LocalDate membershipDate;

    @Column(name = "license_expiration_date",nullable = false)
    private LocalDate licenseExpirationDate;
}
