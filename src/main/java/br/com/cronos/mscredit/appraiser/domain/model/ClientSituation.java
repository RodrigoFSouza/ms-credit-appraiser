package br.com.cronos.mscredit.appraiser.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class ClientSituation {
    private ClientData client;
    private List<ClientData> cards;
}
