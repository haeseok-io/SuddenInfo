package gg.suddeninfo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, length = 100)
    private String nickname;
    @Column(nullable = false, length = 100)
    private String discordId;
    private String profilePhoto;

    @OneToMany(mappedBy = "user")
    private List<Characters> characters = new ArrayList<>();
}
