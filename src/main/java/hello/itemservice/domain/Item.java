package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //JPA가 사용하는 객체라는 뜻
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Id는 테이블의 PK와 해당 필드를 매핑한다.
    private Long id;

    @Column(name="item_name", length= 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
