DELETE FROM payments;

INSERT INTO payments (payment_identifier, amount, method, status, timestamp, transaction_ref)
VALUES
    ('PAY-ABC123', 150.00, 'CREDIT_CARD', 'COMPLETED', '2025-04-21T10:00:00Z', 'TXN123ABC'),
    ('PAY-DEF456', 75.25, 'PAYPAL', 'PENDING', '2025-04-20T14:30:00Z', 'TXN456DEF'),
    ('PAY-GHI789', 199.99, 'DEBIT_CARD', 'FAILED', '2025-04-19T08:15:00Z', 'TXN789GHI');
