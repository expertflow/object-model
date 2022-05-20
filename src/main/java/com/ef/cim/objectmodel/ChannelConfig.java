package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * A {@code ChannelConfig} object represents the configurations for a specific channel (e.g. mode,
 * sLAs, routing policy e.t.c.)
 */
@Valid
public class ChannelConfig implements Serializable {
    private UUID id;
    @NotNull(message = "Channel Mode is mandatory")
    private ChannelMode channelMode;
    //    @NotNull(message = "SelfServiceBot is mandatory")
    private String conversationBot;
    @NotNull(message = "Response SLA is mandatory")
    private int responseSla;
    @NotNull(message = "Customer Inactivity Timeout is mandatory")
    private int customerActivityTimeout;
    @NotNull(message = "Customer Identification Criteria is mandatory")
    private UndefinedObject customerIdentificationCriteria;
    @NotNull(message = "Routing Policy is mandatory")
    private RoutingPolicy routingPolicy;
    @NotNull(message = "Bot id is mandatory")
    private String botId;

    /**
     * Default Constructor, Initializes all the objects except Strings and primitive types
     */
    public ChannelConfig() {
        this.id = UUID.randomUUID();
        this.customerIdentificationCriteria = new UndefinedObject();
        this.routingPolicy = new RoutingPolicy();
    }

    /**
     * Returns the Id of ChannelConfiguration
     *
     * @return {@code String}
     */
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Returns the mode of the channel (e.g. Bot, Hybrid, Agent)
     *
     * @return {@code enum: ChannelMode}
     */
    public ChannelMode getChannelMode() {
        return this.channelMode;
    }

    /**
     * Sets the mode of the channel (Valid modes: BOT, AGENT, HYBRID)
     *
     * @param channelMode, of type enum: {@code ChannelMode}
     */
    public void setChannelMode(ChannelMode channelMode) {
        this.channelMode = channelMode;
    }

    /**
     * Returns the self service bot string value
     *
     * @return {@code object: String}
     */
    public String getConversationBot() {
        return this.conversationBot;
    }

    /**
     * Sets the self service bot String of the channel
     *
     * @param conversationBot, object of type {@code String}
     */
    public void setConversationBot(String conversationBot) {
        this.conversationBot = conversationBot;
    }

    /**
     * Returns the response sla value of the channel Response sla is the amount of time in which a
     * response is expected on this channel
     *
     * @return {@code int}
     */
    public int getResponseSla() {
        return this.responseSla;
    }

    /**
     * Sets the response sla value of the channel Response sla is the amount of time in which a
     * response is expected on this channel
     *
     * @param responseSla, of type {@code int}
     */
    public void setResponseSla(int responseSla) {
        this.responseSla = responseSla;
    }

    /**
     * Returns the Customer activity timeout value of the channel If the customer has not responded
     * for this amount of time, then he/she will be considered as inactive and some action will be
     * performed within the system.
     *
     * @return {@code int}
     */
    public int getCustomerActivityTimeout() {
        return this.customerActivityTimeout;
    }

    /**
     * Sets the customer activity timeout for the channel If the customer has not responded for this
     * amount of time, then he/she will be considered as inactive and some action will be performed
     * within the system.
     *
     * @param customerActivityTimeout, of type {@code int}
     */
    public void setCustomerActivityTimeout(int customerActivityTimeout) {
        this.customerActivityTimeout = customerActivityTimeout;
    }

    /**
     * Returns the customer's identification criteria for this channel
     *
     * @return {@code Object}, Not properly defined yet
     */
    public UndefinedObject getCustomerIdentificationCriteria() {
        return this.customerIdentificationCriteria;
    }

    /**
     * Sets the Customer identification criteria of the channel
     *
     * @param customerIdentificationCriteria, object of type {@code Object}. (not defined yet)
     */
    public void setCustomerIdentificationCriteria(UndefinedObject customerIdentificationCriteria) {
        this.customerIdentificationCriteria = customerIdentificationCriteria;
    }

    /**
     * Returns the routing policy of the channel (e.g. last agent routing, intent based routing)
     *
     * @return {@code Object: RoutingPolicy}
     */
    public RoutingPolicy getRoutingPolicy() {
        return this.routingPolicy;
    }

    /**
     * Sets the routing policy of the channel Valid policy types: LAST_AGENT_ROUTING,
     * INTENT_BASED_ROUTING
     *
     * @param routingPolicy, object of type {@code RoutingPolicy}
     */
    public void setRoutingPolicy(RoutingPolicy routingPolicy) {
        this.routingPolicy = routingPolicy;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /***
     * String Representation of ChannelConfig
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelConfig{" +
                "id=" + id +
                ", channelMode=" + channelMode +
                ", conversationBot='" + conversationBot + '\'' +
                ", responseSla=" + responseSla +
                ", customerActivityTimeout=" + customerActivityTimeout +
                ", customerIdentificationCriteria=" + customerIdentificationCriteria +
                ", routingPolicy=" + routingPolicy +
                ", botId='" + botId + '\'' +
                '}';
    }
}
