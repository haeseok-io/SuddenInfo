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
public class CharacterKDA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Float rate;
    @Column(nullable = false)
    private Float kdaRate;
    @Column(nullable = false)
    private Float assaultRate;
    @Column(nullable = false)
    private Float sniperRate;
    @Column(nullable = false)
    private Float specialRate;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    @JsonIgnore
    private Characters character;
}
