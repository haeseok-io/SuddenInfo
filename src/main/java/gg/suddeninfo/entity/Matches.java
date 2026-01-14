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
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 255)
    private String matchId;
    @Column(nullable = false, length = 20)
    private String matchType;
    @Column(nullable = false, length = 20)
    private String matchMode;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp matchDate;
    @Column(nullable = false)
    private Integer matchResult;
    @Column(nullable = false)
    private Integer matchKill;
    @Column(nullable = false)
    private Integer matchDeath;
    @Column(nullable = false)
    private Integer matchAssistant;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Characters character;

    @OneToMany(mappedBy = "match")
    private List<MatchDetails> matchDetails = new ArrayList<>();
}
