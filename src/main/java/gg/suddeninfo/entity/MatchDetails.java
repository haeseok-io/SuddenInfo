package gg.suddeninfo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MatchDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String matchMap;
    @Column(nullable = false)
    private Integer matchTeam;
    @Column(nullable = false)
    private Integer result;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(length = 30)
    private String clan;
    @Column(nullable = false)
    private Integer killCount;
    @Column(nullable = false)
    private Integer deathCount;
    @Column(nullable = false)
    private Integer Damage;
    @Column(nullable = false)
    private Integer assistant;
    @Column(nullable = false, length = 20)
    private String grade;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "matches_id", nullable = false)
    private Matches match;

    //private Long matchesId;
}
