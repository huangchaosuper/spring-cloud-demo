package com.gavin.dto.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "CreateOrderDto", description = "订单创建信息")
public class CreateOrderDto implements Serializable {

    @JsonProperty("address_id")
    @ApiModelProperty(value = "送货地址ID", position = 1)
    private String addressId;

    @JsonProperty("items")
    @NotNull
    @Valid
    @ApiModelProperty(value = "商品信息", position = 2, required = true)
    private List<ItemDto> items;

}
