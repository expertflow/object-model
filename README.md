# object-model

CIM object-model repository

Object-Model version updated to 1.4.9

Previous Structured Messages have been taken out and new Structured Message model is introduced in
this version.
Please refer to the Object-Model Diagram to see the objects in details.
Below is the list of new added objects.

- MultimediaMessage
- VideoMessage
- ImageMessage
- FileMessage
- AudioMessage
- StickerMessage
- UrlMessage
- ListMessage
- ReceiptTemplateMessage
- TemplateMessage
- ContactMessage
- LocationMessage
- ButtonMessage
- CarouselMessage
- CustomMessage

Version 1.4.8:

-- mediaRoutingDomain in ChannelType changed to String from UUID

-- routingObjectId in RoutingPolicy changed to String from Object

-- id in RoutingAttribute changed to String from UUID

===============================================================

Version 1.5.0:

-- Added PullModeList class

-- Added PullModeListEvent enum

-- ChannelSession object added in customer topic

-- `CREATED`  and `INACTIVE` states added inTopicState enum

===================================================================

Version 1.5.1:

-- renamed 'channelConnectorData' to 'connectorConfig' in ChannelConnector Class

-- added new attribute 'additionalConfig' in Channel Class

-- updated 'channelConfigSchema' Type to ObjectId and removed @DBRef annotation

-- corrected FormData attribute name from 'form' to 'formId'

===================================================================

Version 1.5.2

-- Updated FormData 'id' type to ObjectId

-- Updated FormData Constructor

====================================================================

Version 1.5.3

-- removed 'channelConfigSchema' from ChannelType

-- added @Indexed for 'typeName' in ChannelType

-- added 'channelType' as Referenced Object in Channel

==================================================================

Version 1.5.4

-- added 'CustomerWidgetConfig' Class

-- added 'WidgetTheme' Enum

-- added 'Language' Class
 
==================================================================

Version 1.5.5

-- Data type of `value` changed from `String` to `Object` in `Attribute`

-- Data type of `intent` changed from `NLUIntent` to `String` in `MessageHeader`

-- `MessageType` enum item `NOTIFICATIONS` changed to `NOTIFICATION`

-- `MessageIntent` enum added

======================================================================

Version 1.5.8

-- Added 'ChannelProviderInterface' Class

-- Renamed 'typeName' to 'name' in ChannelType

-- Updated Data type of 'id' form UUID to ObjectId in ChannelType

-- Removed 'channelConnectorInterface' and 'interfaceAddress' attributes from channel connector

-- Removed 'channelType' from ChannelConnector

-- Removed 'connectorConfigs' from ChannelConnector

-- Added 'ChannelProviderInterface' with Referenced relation in ChannelConnector

-- Added 'channelProviderConfigs' in ChannelConnector

-- Renamed 'channelConnectorName' to 'name' in ChannelConnector

-- Updated Data type of 'id' form UUID to ObjectId in ChannelConnector

-- Removed 'additionalConfig' from Channel

-- Renamed 'channelName' to 'name' in Channel

-- Updated Data type of 'id' form UUID to ObjectId in Channel

-- Updated 'AlphanumSpecial200' in ValueType Enum
 
======================================================================

Version 1.5.9

-- `additionalAttributesa` variable type changed from `List<KeyValuePair>` to `List<Attribute>`
in `ChannelData` Class

===============================================================================

Version 1.6.0

-- Added 'channelTypeCode' attribute in ChannelData Class

=======================================================================================

Version 1.6.1

-- Added @Id annotation on 'id' attribute in Channel Class

==========================================================================================

Version 1.6.2

-- Updated Setter of 'value' in Attribute Class

========================================================================
Version 1.6.5

--Added "mimeType" attribute in Attachment Class

--Added Validations in Action,Body,Button,ButtonMessage,Contact,Interactive,ListMessage,
Location,LocationMessage,Name,Row and Section CLass

===========================================================================================
Version 1.6.6

-- 'intent' attribute type updated to NLUIntent in MessageHeader Class

===========================================================================================
Version 1.6.7

-- 'intent' attribute type Changed to String in MessageHeader Class

====================================================================================
Version 1.6.8

-- Added @JsonProperty in all constructor of the child classes of MessageBody

=====================================================================================
Version 1.6.9

-- Removed 'LIST' type from MessageBody

-- Added Validation in Button Class

-- Removed LIST from MessageType Enum

=======================================================================================
Version 1.7.0

-- added default constructor in Location and Name CLass

=======================================================================================
Version 1.7.1

-- added 'replyToMessageId' and 'providerMessageId' in MessageHeader Class

========================================================================================
Version 1.7.2
-- added @Indexed annotation on serviceIdentifier attribute in Channel Class

========================================================================================
Version 1.7.7

-- added attribute NotificationType in NotificationMessage Class

=========================================================================================
Version 1.8.0
-- added CHANNEL_SESSION_STARTED in NotificationType enum
 
=========================================================================================

Version 1.8.1

-- added VoiceMessage Entity

-- Add VOICE in MessageType enum

-- Add START_VOICE & END_VOICE in MessageIntent enum

=========================================================================================

Version 1.8.2

-- added VOICE in ChannelTypeEnum

=========================================================================================

Version 1.8.3

-- ToString methods added for few models and code formatted

=========================================================================================

Version 1.8.5

-- AssociatedMrd object added.
-- CCUser model updated.

=========================================================================================

Version 1.8.6

-- conversationData added in Conversation.
-- endTime added in Conversation.
-- CONVERSATION_DATA_CHANGED added in CimEventName.
-- EXTERNAL added in RoutingMode.

===========================================================================================

Version 1.8.7

-- type of 'theme' changed from WidgetTheme to String in CustomerWidgetConfig.
-- WidgetTheme removed.

===========================================================================================

Version 1.8.8

-- Getter Setters added in ConversationMonitor

-- Setter added for id in ConversationParticipant

===========================================================================================
Version 1.8.9

Following objects moved from RE to object Model.

AgentState
ReasonCode
AgentMrdState
AgentPresence
Enums
MediaRoutingDomain
TaskDto
TaskStat

=============================================================================================
Version 1.9.1

added new messageType 'WrapUpMessage'

=============================================================================================

Version 1.9.8
added CommentMessage, CommentType, ItemType and MessageType. All for Facebook connector

=============================================================================================

Version 1.9.9
added CommentMessage, CommentType, ItemType and MessageType. All for Facebook connector

=============================================================================================

Version 1.10.0
added 'defaultOutbound' attribute in Channel Class

=============================================================================================

Version 1.10.1
added 'AGENT_OUTBOUND' in MessageIntent
removed 'channelTypeCode' from ChannelData

=============================================================================================

Version 1.10.2
updated VoiceMessage Type
added 'CALL_LEG_STARTED' and 'CALL_LEG_ENDED' in MessageIntent and CimEventName
removed 'START_VOICE' and 'END_VOICE'
added 'STARTED' in Enums

=============================================================================================

Version 1.10.4
updated ChannelSessionState in ChannelSession
added ReasonCodeEnum
added ChannelSessionStateEnum

=============================================================================================

Version 1.10.5
added 'STARTED' in Enums
=============================================================================================

Version 1.10.9
removed commentType from CommentMessage. Also deleted CommentType.java class

=============================================================================================

Version 1.11.1

- updated attribute `channelSesson` to `channelSessonId` in `AgentOutboundDto`
- removed `agentId` from `AgentOutboundDto`

==============================================================================================

Version 1.11.2

- updated `AgentOutboundDto`
- added `agentId` in `AgentOutboundDto`

==============================================================================================

Version 1.11.7

- added `NETWORK_DISCONNECT` in MessageIntent Enum

==============================================================================================

Version 1.11.9

- added `CONSULT_TRANSFERRED` and `CONSULT_CONFERENCED` in NotificationType

==============================================================================================

Version 1.12.0

- refer to the story http://project.expertflow.com:8080/browse/CIM-7418 and it's subtasks

==============================================================================================

Version 1.12.1

- added `DIRECT_TRANSFER` and `NO_AGENT_AVAILABLE` in NotificationType
- updated `CONSULT_TRANSFERRED` to `CONSULT_TRANSFER` and `CONSULT_CONFERENCED`
  to `CONSULT_CONFERENCE`

==============================================================================================

Version 1.12.2

- added `managedByRe` field in MediaRoutingDomain Object

==============================================================================================

Version 1.12.3

- set `managedByRe` field true by default in MediaRoutingDomain Object

==============================================================================================

Version 1.12.4

- `CallLegStartedDto` added
- `CallLegEndedDto` added

==============================================================================================

Version 1.12.5

- `Direction` added in `ChannelSession` and `Conversation`

==============================================================================================

Version 1.12.6

Changes in Message Header

- removed `channelSession`
- updated `sender` dataType to `Sender`
- added `channelSessionId` `conversationId` and `customer`

Changes in CIM Event

- added `eventEmitter` and `channelSession`

==============================================================================================

Version 1.12.2

- added `managedByRe` field in MediaRoutingDomain Object

==============================================================================================

Version 1.12.3

- set `managedByRe` field true by default in MediaRoutingDomain Object

==============================================================================================

Version 1.12.4

- `CallLegStartedDto` added
- `CallLegEndedDto` added

==============================================================================================

Version 1.12.5

- `Direction` added in `ChannelSession` and `Conversation`

==============================================================================================

Version 1.12.7

- `reasonCode` added in `CallLegStartedDto`
- `FORCE_CLOSED` added in `TaskStateReasonCode`

==============================================================================================

Version 1.12.8

- `constructor` updated in `DeliveryNotification`
- `PENDING` removed from `DeliveryStatus`

==============================================================================================

Version 1.13.0

- `constructor` updated in `CimMessage`
- `Setter` added for `messageId` in `DeliveryNotification`

==============================================================================================

Version 1.13.2

- `constructor` updated in `DeliveryNotification`

==============================================================================================

Version 1.13.3

- `@JsonIgnore` added in `displayName` method in KeycloakUser

==============================================================================================

Version 1.13.4

- `constructor` updated in `CutomMessage`
- `TYPING_STARTED` and `TYPING_STOPPED` added in `NotificationType`
- `TYPING_INDICATOR` added in `CimEventName`
- `TWITTER` added in `ChannelTypeEnum`

==============================================================================================

Version 1.13.8

- `SenderType` added in `Enums`

==============================================================================================

Version 1.13.9

- `type` added in `Sender`

==============================================================================================

Version 1.14.0

- `SYSTEM` added in `SenderType`

==============================================================================================

Version 1.14.1

- updated validation on `SenderType`
- `TELEGRAM` added in `ChannelTypeEnum`

==============================================================================================

Version 1.14.2

- `TASK_ENQUEUED` and `PARTICIPANT_ROLE_CHANGED` added in `NotificationType` 
- `CONSULT_TRANSFER` `CONSULT_CONFERENCE` and `DIRECT_TRANSFER` removed from `NotificationType`
- `@Document` removed from `ChannelType` `ChannelProviderInterface` `ChannelConnector` and `Channel`

==============================================================================================

Version 1.14.5

- removed validation from `firstname` and `isAnonymous` in `Customer`
- removed validation from `senderName` in `Sender`

==============================================================================================

Version 1.14.6

- added `WebRtcConfigurations` class
- added `webRTC` in `CustomerWidgetConfig`
- updated `KeycloakUser` 