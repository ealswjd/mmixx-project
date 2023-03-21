package com.a403.mmixx.user.model.entity;

import com.a403.mmixx.auth.entity.Role;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
@DynamicInsert
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userSeq; // 회원 일련번호

    @Column(length = 100, nullable = false)
    private String email; // 이메일

    @Column(length = 500, nullable = false)
    private String profileImageUrl; // 프로필사진 경로

    @Column(length = 100, nullable = false)
    private String userName; // 이름

    @Enumerated(EnumType.STRING)
    @Column(length = 100, nullable = false)
    private Role role; // 권한

    @Column(length = 1000)
    private String token; // 토큰

    @Builder
    public User(String userName, String email, String profileImageUrl, Role role){
        this.userName = userName;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.role = role;
    }

    public User update(String userName, String profileImageUrl){
        this.userName = userName;
        this.profileImageUrl = profileImageUrl;

        return this;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }

}//User