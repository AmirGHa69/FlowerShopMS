INSERT INTO sales (
    purchase_id, payment_id, sale_status, number_of_monthly_payments,
    monthly_payment_amount, down_payment_amount, sale_offer_date,
    amount, currency, supplier_id, employee_id, inventory_id, flower_id
) VALUES
('sale-4001', 'PAY-ABC123', 'COMPLETED', 0, 0.00, 0.00, '2025-03-15', 59.90, 'CAD', 'sup-1234', 'emp-1001', 'inv-2001', 'flw-3001'),
('sale-4002', 'PAY-DEF456', 'PENDING', 3, 20.00, 10.00, '2025-03-16', 70.00, 'CAD', 'sup-5678', 'emp-1002', 'inv-2001', 'flw-3002'),
('sale-DELETE-ME', 'PAY-ABC123', 'CANCELLED', 1, 5.00, 2.00, '2025-04-01', 10.00, 'CAD', NULL, NULL, NULL, NULL);
