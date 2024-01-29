package uhang.uhang.login.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="members")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int memberId;

    @Column(updatable = false, length = 8)
    private String studNum;

    @Column( updatable = false, length = 50)
    private String memberEmail;

    @Column(updatable = false, length = 20)
    private String memberPw;

    @Column(nullable = false)
    @ColumnDefault("1")
    private int writeAuth;
}