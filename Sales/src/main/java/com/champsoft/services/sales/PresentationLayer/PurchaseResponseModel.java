package com.champsoft.services.sales.PresentationLayer;

import com.champsoft.services.sales.DataLayer.Purchase.FinancingAgreementDetails;
import com.champsoft.services.sales.DataLayer.Purchase.PurchaseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PurchaseResponseModel {

    private String purchaseOrderId;
    private String inventoryId;
    private String flowerIdentificationNumber; // formerly vehicleIdentificationNumber
    private String supplierId;                 // formerly customerId
    private String employeeId;

    private BigDecimal salePrice;
    private String currency;           // e.g., "CAD"

    private LocalDate saleOfferDate;
    private PurchaseStatus salePurchaseStatus;
    private FinancingAgreementDetails financingAgreementDetails;
}
