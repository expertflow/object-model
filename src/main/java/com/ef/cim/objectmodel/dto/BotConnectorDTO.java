package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.BotType;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
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
    private UUID botId;
    @NotNull()
    private BotType botType;
    @NotNull()
    private String botName;
    @NotBlank()
    private String botUri;
}
