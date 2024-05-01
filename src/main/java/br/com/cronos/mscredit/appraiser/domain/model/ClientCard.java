package br.com.cronos.mscredit.appraiser.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ClientCard {
    private String name;
    private String flag;
    private BigDecimal limitApproved;
}
