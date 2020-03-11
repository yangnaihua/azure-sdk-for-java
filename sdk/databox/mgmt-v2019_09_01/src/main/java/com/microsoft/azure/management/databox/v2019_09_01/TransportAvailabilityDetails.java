/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Transport options availability details for given region.
 */
public class TransportAvailabilityDetails {
    /**
     * Transport Shipment Type supported for given region. Possible values
     * include: 'CustomerManaged', 'MicrosoftManaged'.
     */
    @JsonProperty(value = "shipmentType", access = JsonProperty.Access.WRITE_ONLY)
    private TransportShipmentTypes shipmentType;

    /**
     * Get transport Shipment Type supported for given region. Possible values include: 'CustomerManaged', 'MicrosoftManaged'.
     *
     * @return the shipmentType value
     */
    public TransportShipmentTypes shipmentType() {
        return this.shipmentType;
    }

}
