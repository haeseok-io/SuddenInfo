package gg.suddeninfo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = true, length = 30)
    private String clan;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp cDate;
    @Column(nullable = false, length = 10)
    private String manner;
    @Column(nullable = true, length = 50)
    private String title;
    @Column(nullable = false)
    private String cId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY)
    private List<Matches> matches = new ArrayList<>();

    @OneToOne(mappedBy = "character", fetch = FetchType.LAZY)
    private CharacterGrades characterGrade;

    @OneToOne(mappedBy = "character", fetch = FetchType.LAZY)
    private CharacterSessionGrades characterSessionGrade;

    @OneToOne(mappedBy = "character", fetch = FetchType.LAZY)
    private CharacterKDA characterKDA;

    @OneToOne(mappedBy = "character", fetch = FetchType.LAZY)
    private CharacterTiers characterTier;
}
