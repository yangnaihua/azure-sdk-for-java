/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.TimeSeriesInsightsManager;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.AccessPolicyListResponseInner;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.AccessPolicyResourceInner;
import java.util.List;

/**
 * Type representing AccessPolicyListResponse.
 */
public interface AccessPolicyListResponse extends HasInner<AccessPolicyListResponseInner>, HasManager<TimeSeriesInsightsManager> {
    /**
     * @return the value value.
     */
    List<AccessPolicyResourceInner> value();

}
