package com.example.shopping.entity.jwt;

import com.example.shopping.domain.jwt.TokenDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "token")
@Table
@NoArgsConstructor
@Getter
@ToString
public class TokenEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_id")
    private Long id;
    private String grantType;
    private String accessToken;
    private String refreshToken;
    private String memberEmail;
    private Date accessTokenTime;
    private Date refreshTokenTime;
    private Long memberId;


    @Builder
    public TokenEntity(Long id,
                       String grantType,
                       String accessToken,
                       String refreshToken,
                       String memberEmail,
                       Date accessTokenTime,
                       Date refreshTokenTime,
                       Long memberId) {
        this.id = id;
        this.grantType = grantType;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.memberEmail = memberEmail;
        this.accessTokenTime = accessTokenTime;
        this.refreshTokenTime = refreshTokenTime;
        this.memberId = memberId;
    }

    // 토큰 엔티티로 변환
    public static TokenEntity tokenEntity(TokenDTO token) {
        return TokenEntity.builder()
                .grantType(token.getGrantType())
                .accessToken(token.getAccessToken())
                .accessTokenTime(token.getAccessTokenTime())
                .refreshToken(token.getRefreshToken())
                .refreshTokenTime(token.getRefreshTokenTime())
                .memberEmail(token.getMemberEmail())
                .memberId(token.getMemberId())
                .build();
    }

    // 토큰 업데이트
    public static TokenEntity updateToken(Long id, TokenDTO tokenDTO) {
        return TokenEntity.builder()
                .id(id)
                .grantType(tokenDTO.getGrantType())
                .accessToken(tokenDTO.getAccessToken())
                .accessTokenTime(tokenDTO.getAccessTokenTime())
                .refreshToken(tokenDTO.getRefreshToken())
                .refreshTokenTime(tokenDTO.getRefreshTokenTime())
                .memberEmail(tokenDTO.getMemberEmail())
                .memberId(tokenDTO.getMemberId())
                .build();
    }
}
