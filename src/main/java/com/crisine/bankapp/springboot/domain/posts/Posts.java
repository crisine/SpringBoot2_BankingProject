package com.crisine.bankapp.springboot.domain.posts;

import com.crisine.bankapp.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity                 // 테이블과 링크될 클래스를 나타냄
public class Posts extends BaseTimeEntity {

    /*
        @Id : 해당 테이블의 PK 필드를 나타냄
        @GeneratedValue : PK의 생성 규칙을 나타냄. GenerationType이
        IDENTITY여야만 auto_increment가 된다.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
        @Column : 안 붙여도 해당 클래스의 모든 필드는 컬럼이 된다.
        굳이 붙이는 이유는 기본값 (VARCHAR(255))를 바꾸고 싶을 때 사용한다.
    */
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /*
        @Builder : 디자인 패턴 중 하나, 표현 클래스와 객체 생성 클래스를 분리한다.
        빌더 패턴을 사용하지 않으면, 생성자의 경우 지금 채워야 할 필드를 명확히 지정할 수 없다.
        빌더 패턴을 사용한다면, 어느 필드에 어떤 값을 채워야 할지 명확히 알 수 있다.
    */
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
