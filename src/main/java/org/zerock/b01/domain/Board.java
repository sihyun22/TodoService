package org.zerock.b01.domain;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity // 엔티티 객체를 위한 어너테이션
public class Board extends BaseEntity{
//public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    @Column(length = 500, nullable = false) //컬럼의 길이와 null허용여부
    private String title;

    @Column(length = 2000, nullable = false)
    private String content;

    @Column(length = 50, nullable = false)
    private String writer;

    public void change(String title, String content){
        this.title = title;
        this.content = content;
    }
}
