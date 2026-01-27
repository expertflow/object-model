package com.ef.cim.objectmodel;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MediaUrl {
    @NotBlank
    private String url;
    @NotBlank
    private String type;
    private Map<String, Object> metadata;
}
