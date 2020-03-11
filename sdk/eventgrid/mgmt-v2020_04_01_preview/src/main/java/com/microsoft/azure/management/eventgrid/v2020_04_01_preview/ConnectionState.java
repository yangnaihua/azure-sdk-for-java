/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectionState Information.
 */
public class ConnectionState {
    /**
     * Status of the connection. Possible values include: 'Pending',
     * 'Approved', 'Rejected', 'Disconnected'.
     */
    @JsonProperty(value = "status")
    private PersistedConnectionStatus status;

    /**
     * Description of the connection state.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Actions required (if any).
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get status of the connection. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @return the status value
     */
    public PersistedConnectionStatus status() {
        return this.status;
    }

    /**
     * Set status of the connection. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @param status the status value to set
     * @return the ConnectionState object itself.
     */
    public ConnectionState withStatus(PersistedConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get description of the connection state.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the connection state.
     *
     * @param description the description value to set
     * @return the ConnectionState object itself.
     */
    public ConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get actions required (if any).
     *
     * @return the actionsRequired value
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set actions required (if any).
     *
     * @param actionsRequired the actionsRequired value to set
     * @return the ConnectionState object itself.
     */
    public ConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }

}
