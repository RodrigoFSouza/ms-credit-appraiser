package br.com.cronos.mscredit.appraiser.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientSituation {
    private ClientData client;
    private List<ClientCardsResponse> cards;
}
