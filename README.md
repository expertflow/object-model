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

==============================================================================================

Version 1.14.8

- added `agentRequestStatus` field in `Conversation.metadata`
- added `supervisedTeams` field in `KeycloakUser`
- added `REMOVE_CHANNEL_SESSION` cim event

==============================================================================================

Version 1.14.8.1

- updated `ChannelSessionState` object to implement `serializable`
- updated `ChannelProviderInterface` object to implement `serializable`

==============================================================================================

Version 1.14.8.3

- added `TASK_STATE_CHANGED` in `NotificationType`

==============================================================================================

Version 1.15.3

- added `SILENT_MONITOR` in `ParticipantRole`

==============================================================================================

Version 1.15.4

- marked `providerWebhook` optional in `ChannelProviderInterface`
- added `CX_VOICE` and `CISCO_CC` in `ChannelTypeEnum`
- removed `VOICE` from `ChannelTypeEnum`

==============================================================================================

Version 1.15.5

- Removed `CallLegDto`, `CallLegEndedDto`, and `CallLegStartedDto`.
- Updated the `VoiceMessage`, `CallLeg`, and `Sender` objects.
- Added the interface `SenderType` to make the 'Sender.type' in `Sender` an open ENUM.

==============================================================================================

Version 1.15.6

- Added `IVR_AGGREGATED_ACTIVITY` in CimEventName

==============================================================================================

Version 1.15.7

- Added `IVR_AGGREGATED_ACTIVITY` in `MessageIntent`

==============================================================================================

Version 1.15.8

- Added `schedulingMetaData` field in `MessageHeader`

==============================================================================================

Version 1.15.9

- Added `INSTAGRAM` in `ChannelTypeEnum`

==============================================================================================

Version 1.15.10

- Added `PRIVATE_REPLY` in `ItemTypeEnum`

==============================================================================================

Version 1.16.0

- Added `@JsonProperty("schedulingMetaData")` annotation in `schedulingMetaData` field in `MessageHeader`

==============================================================================================

Version 1.16.1

- Added `SocialMediaPost.class` and  `SocialMediaComment.class` files

==============================================================================================

Version 1.16.2

- Added `QueueDto` and  `QueueHistoricalStatsDto` files

==============================================================================================

Version 1.16.3

- Updated `SocialMediaPost.class` to support multiple attachments

==============================================================================================

Version 1.16.4

- Added `setter` for `schedulingMetaData` field in `MessageHeader.class`
- Added `CHANNEL_SESSION_DATA_UPDATED` enum in `CimEventName.class` and `NotificationType.class`.

==============================================================================================

Version 1.16.5

- Added `CUSTOMER_LEFT` in CimEventName
- Added `WRAP_UP` in TopicState
- Added `WRAP_UP` in ParticipantRole

==============================================================================================

Version 1.16.6
- Added `CUSTOMER_LEFT` in TopicState

==============================================================================================

Version 1.16.7
- Added `CONNECTED` in `DeliveryStatus`
- Changed dataType of `reasonCode` in `DeliveryNotification` from _int_ to _String_

==============================================================================================

Version 1.16.8
- Added `START_CONVERSATION` in MessageIntent

==============================================================================================

Version 1.16.9
- Added `DeletedNotification` class
- Added `DELETEDNOTIFICATION` in `MessageType` interface
- Added @Type for `DeletedNotification` in `MessageBody`
- Renamed `replyToMessageId` to `originalMessageId` property in `MessageHeader`
- Added `REPLY_TO` and `UPDATE` in `MessageIntent` enum

==============================================================================================

Version 1.16.9.1
- Added `recordingUrl` field in `VoiceActivity`

==============================================================================================

Version 1.16.9.2
- Modified `CustomerWidgetConfig` class.
- Modified `WebRtcConfigurations` class.
- Added `CallbackConfigurations` class.
- Added `WebhookConfigurations` class.

==============================================================================================

Version 1.16.9.3 -> 1.16.9.3.1
- Modified `ChannelData` class. Added `customerFirstName` and `customerLastName` attribute in it.

==============================================================================================

Version 1.17.0
- Added `MrdType`, `MrdTypeName`
- Updated `MediaRoutingDomain` Object
- Updated `TaskDto` Object and Changed its name to `Task`
- Added `TaskMedia`, `TaskMediaState`
- Updated `AssignResourceRequest` Object
- Moved the task related Objects to the `task` package

Note: 1.16.9.1 and 1.16.9.2 are not merged in 1.17.0. Use 1.17.1.5 for stable usage

==============================================================================================

Version 1.17.1
- Added `agentRequestTtlTimerId` field in `Task`

Note: 1.16.9.2 is not merged in 1.17.1 Use 1.17.1.5 for stable usage

==============================================================================================

Version 1.17.1.1
- Revision of v-1.17.1 for multichannel implementation after testing for Chat media cases
- Use this release instead of v-1.17.0 and v-1.17.1

Note: 1.16.9.2 is not merged in 1.17.1.1 Use 1.17.1.5 for stable usage

==============================================================================================

Version 1.17.1.2
- Revision of v-1.17.1.1 for multichannel implementation
- v-1.16.9.2 is merged
- `TASK_MEDIA_STATE_CHANGED` removed from `CimEventName` enum 
- New Class `TaskStateChangedDto` added
- Added a couple of methods in the `Task` Class

Note: Use 1.17.1.5 for stable usage

==============================================================================================

Version 1.17.1.3
- Revision of v-1.17.1.2 for multichannel implementation
- Added `lastAssignedAgentId` field in `AssignResourceRequest` class

Note: Use 1.17.1.5 for stable usage

==============================================================================================

Version 1.17.3
- Added `EMAIL` in `ChannelTypeEnum`
- Added `EmailMessage` class
- Added `EMAIL` in `MessageType` interface
- Added @Type for `EmailMessage` in `MessageBody`

Note: 1.17.1.4 is not merged in this, Please use 1.17.1.5 for stable use.

==============================================================================================

Version 1.17.1.4
- Revision of v-1.17.1.3 for multichannel implementation
- Removed `markedForDeletion` field from `TaskMedia` class
- Added `answerTime` field in `TaskMedia` class
- Added wrap up reason codes in `Enums.TaskStateReasonCode` enum

Note: 1.17.3 is not merged into this, use 1.17.1.5 for stable use

==============================================================================================

Version 1.17.1.5
- 1.17.3 and 1.17.1.4 are merged

Note: Use this release instead of v-1.17.0, v-1.17.1, v-1.17.1.1, v-1.17.1.2, v-1-17.1.3, v-1.17.3, v-1.17.1.4

==============================================================================================

Version 1.17.2.x
- Add `agentSla` object in `Conversation` class.
- ADD `cachedAgentSlaDuration` in `Conversation` class
- Add `agentSlaDuration` in `PrecisionQueueEntity` class.
- ADD `AGENT_SLA_STARTED`, `AGENT_SLA_STOPPED`, `AGENT_SLA_EXPIRED`, `REMOVE_ALL_AGENTS`,
      `RESET_AGENT_SLA` in `CimEventName` class.
- ADD `AgentSla` object class.
- 1.17.1.4 is merged 
- 1.17.1.5 is merged (v-1.17.2.5)
- 1.16.9.3.1 is merged, (v-1.17.2.6)

latest: 1.17.2.6

==============================================================================================

Version 1.17.3.x (merge 1.17.2.x into rooms feature)
- Merge 1.17.2.6 (v-1.17.3.1)
- Refactoring Room Objects (v-1.17.3.2)
- Add mongo indexes in Room Object (v-1.17.3.3)
- Minor issues resolved, ConversationDTO added (v-1.17.3.4) 

latest 1.17.3.4

==============================================================================================

Version 1.17.5.0 (On top of 1.17.3.x)
- ADD `CONVERSATION_PAUSED`, `CONVERSATION_RESUMED` in `CimEventName` class.
- ADD `HoldTimerDetails` class.
- Add `HoldTimerDetails` in `ConversationDto` and `Conversation` object.
- Implement `Serializable` in multiple classes.

==============================================================================================

Version 1.17.8.0 (On top of 1.17.5.3)
- ADDED `WEB_RTC` in `ChannelTypeEnum` class.
- ADDED `SILENT_MONITOR` and `BARGE_IN` in `Enums` class for TaskTypeDirection.
- ADDED `CALL_HOLD` and `CALL_RESUME` in `MessageIntent` and `CimEventName` class.
- ADDED `WHISPER` type Participant Role in `ParticipantRole` class.
- ADDED `WRAPUPS` List<Object> and `HOLDTIME` double in `VoiceActivity` class.
==============================================================================================

Version 1.17.6.0
- Added `EMAIL` as new MRD TYPE
- Added `Email Signatures` class
- Added `queuePriority` attribute in `PrecisionQueueEntity` class
- Added `mediaLebel` and `mediaName` in Attachment class

==============================================================================================

Version 1.17.6.1
- Removed `queuePriority` attribute in `PrecisionQueueEntity` class
- This version contains all the EMAIL related changes till April End 2024

==============================================================================================

Version 1.17.5.4 (On top of 1.17.5.3)
- ADDED `permalinkUrl` field in `SocialMediaPost` class.

==============================================================================================

Version 1.17.5.5 (Merged 1.17.8.0(develop) into 1.17.5.3(FB Changes))
- ADDED `permalinkUrl` field in `SocialMediaPost` class.

==============================================================================================

Version 1.17.5.6 (Merged develop(1.17.5.5) into 1.17.6.1(Email))
- Added `EMAIL` as new MRD TYPE
- Added `Email Signatures` class
- Added `queuePriority` attribute in `PrecisionQueueEntity` class
- Added `mediaLebel` and `mediaName` in Attachment class
- Removed `queuePriority` attribute in `PrecisionQueueEntity` class

==============================================================================================

Version 1.18.0.0 (On top of 1.17.5.3)
- ADD `FormData`, and `ExtendedFormData` class.
- ADD `ConversationData` class and its subclasses like `BooleanDataType`, `IntDataType`, `FormDataType`.
- ADD `FormDataMessage`class as body of `CimMessage` class.

==============================================================================================

Version 1.17.6.2
- Added `customerSLa` in channel config for customer sla implementation'
- Added `AGENT_SLA`,`CUSTOMER_SLA_STARTED`,`CUSTOMER_SLA_EXPIRED`,`CUSTOMER_SLA_STOPPED`,
- `CUSTOMER_SLA`,`HOLD_TIMER` and `NO_RESPONSE_ENTITY` for communication b/w C_manager and C_Monitor

==============================================================================================

Version 1.17.5.7 (Merged develop(1.17.5.6) into (1.17.6.2 and 1.18.0.0))
- This is just a merged version

==============================================================================================