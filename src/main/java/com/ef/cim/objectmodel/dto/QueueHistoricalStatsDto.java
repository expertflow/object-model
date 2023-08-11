package com.ef.cim.objectmodel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QueueHistoricalStatsDto {
    private QueueDto queue;
    private int averageWaitTime;
    private int averageHandleTime;

    /**
     * Constructs a new QueueHistoricalStatsDto object with the specified parameters.
     * This constructor is used to create a data transfer object (DTO) representing historical statistics
     * for a queue. It encapsulates information such as the queue's identifier, name, average wait time,
     * and average handle time.
     *
     * @param queueId           The unique identifier of the queue.
     * @param queueName         The name of the queue.
     * @param averageWaitTime   The average wait time for the queue in milliseconds.
     * @param averageHandleTime The average handle time for the queue in milliseconds.
     */
    public QueueHistoricalStatsDto(String queueId, String queueName, int averageWaitTime, int averageHandleTime) {
        this.queue = new QueueDto(queueId, queueName);
        this.averageWaitTime = averageWaitTime;
        this.averageHandleTime = averageHandleTime;
    }
}
