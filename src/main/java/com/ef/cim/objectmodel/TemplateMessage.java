package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class TemplateMessage extends StructuredMessage {
    @NotBlank(message = "namespace of the template is mandatory")
    private String namespace;
    @NotBlank(message = "name of the template is mandatory")
    private String name;
    @Valid
    private Language language;
    private List<Component> components;

    public TemplateMessage() {
        super(MessageType.TEMPLATE);
        this.components = new ArrayList<>();
    }

    public TemplateMessage(@JsonProperty("namespace") String namespace, @JsonProperty("name") String name,
                           @JsonProperty("language") Language language,
                           @JsonProperty("components") List<Component> components) {
        super(MessageType.TEMPLATE);
        this.namespace = namespace;
        this.name = name;
        this.language = language;
        this.components = components;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "TemplateMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                ", namespace='" + namespace + '\'' +
                ", name='" + name + '\'' +
                ", language=" + language +
                ", components=" + components +
                '}';
    }
}
