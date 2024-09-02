package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.BotType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BotConnectorDTO {
    @Null
    private String botId;
    @NotNull()
    private BotType botType;
    @NotNull()
    private String botName;
    @NotBlank()
    private String botUri;
}
