package com.example.shopping.domain.Item;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@ToString
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ModifyItemDTO {
    @Schema(description = "상품 이름")
    @NotBlank(message = "상품명은 필수 입력입니다.")
    private String itemName;     // 상품 명

    @Schema(description = "상품 가격")
    @NotNull(message = "가격은 필수 입력입니다.")
    private int price;          // 가격

    @Schema(description = "상품 설명")
    @NotNull(message = "설명은 필수 입력입니다.")
    private String itemDetail;  // 상품 상세 설명

    @Schema(description = "상품 재고 수량")
    @NotNull(message = "재고 수량은 필수 입력입니다.")
    private int stockNumber;    // 재고수량

    @Schema(description = "판매지역")
    @NotNull(message = "판매지역을 입력해야 합니다.")
    private String sellPlace;

    @Builder
    public ModifyItemDTO(String itemName,
                         int price,
                         int stockNumber,
                         String itemDetail,
                         String sellPlace) {
        this.itemName = itemName;
        this.price = price;
        this.stockNumber = stockNumber;
        this.itemDetail = itemDetail;
        this.sellPlace = sellPlace;
    }
}
