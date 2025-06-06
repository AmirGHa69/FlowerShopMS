package org.example.Inventory.PresentationLayer.Flower;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.Suppliers.PresentationLayer.SupplierResponseModel;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowerResponseModel extends RepresentationModel<FlowerResponseModel> {
    private String flowerId;
    private String inventoryId;
    private String flowerName;
    private String flowerColor;
    private String flowerCategory;
    private String flowerStatus;
    private int stockQuantity;
    private String supplierIdentifier;
    private BigDecimal price;
    private String currency;
    private List<OptionDto> options;
    private SupplierResponseModel supplier;
}
