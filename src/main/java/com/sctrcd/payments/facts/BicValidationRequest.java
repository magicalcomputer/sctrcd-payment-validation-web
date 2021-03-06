package com.sctrcd.payments.facts;

public class BicValidationRequest extends ValidationRequest {

    private String bic;

    public BicValidationRequest() {
        super();
    }
    
    public BicValidationRequest(String bic) {
        super();
        this.setBic(bic);
    }

    public String getBic() {
        return bic;
    }

    /**
     * Strips whitespace out of the IBAN before setting the field.
     * Whitespace is not relevant to validation.
     */
    public void setBic(String bic) {
        this.bic = bic.replace(" ", "");
    }
    
    @Override
    public void reject(String ruleName, String message) {
        super.reject(ruleName, message, PaymentAttribute.iban);
    }
    
}
