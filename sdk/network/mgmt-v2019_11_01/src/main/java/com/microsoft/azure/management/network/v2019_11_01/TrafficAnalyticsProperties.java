/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the configuration of traffic analytics.
 */
public class TrafficAnalyticsProperties {
    /**
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "networkWatcherFlowAnalyticsConfiguration")
    private TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration;

    /**
     * Get parameters that define the configuration of traffic analytics.
     *
     * @return the networkWatcherFlowAnalyticsConfiguration value
     */
    public TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration;
    }

    /**
     * Set parameters that define the configuration of traffic analytics.
     *
     * @param networkWatcherFlowAnalyticsConfiguration the networkWatcherFlowAnalyticsConfiguration value to set
     * @return the TrafficAnalyticsProperties object itself.
     */
    public TrafficAnalyticsProperties withNetworkWatcherFlowAnalyticsConfiguration(TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
        return this;
    }

}
