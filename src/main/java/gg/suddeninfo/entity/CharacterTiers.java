package gg.suddeninfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CharacterTiers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer session;
    @Column(nullable = false)
    private String soloTier;
    @Column(nullable = false)
    private Integer soloScore;
    @Column(nullable = false)
    private String partyTier;
    @Column(nullable = false)
    private Integer partyScore;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    @JsonIgnore
    private Characters character;
}
