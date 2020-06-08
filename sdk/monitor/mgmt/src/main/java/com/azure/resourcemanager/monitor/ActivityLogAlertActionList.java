// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ActivityLogAlertActionList model. */
@Fluent
public final class ActivityLogAlertActionList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActivityLogAlertActionList.class);

    /*
     * The list of activity log alerts.
     */
    @JsonProperty(value = "actionGroups")
    private List<ActivityLogAlertActionGroup> actionGroups;

    /**
     * Get the actionGroups property: The list of activity log alerts.
     *
     * @return the actionGroups value.
     */
    public List<ActivityLogAlertActionGroup> actionGroups() {
        return this.actionGroups;
    }

    /**
     * Set the actionGroups property: The list of activity log alerts.
     *
     * @param actionGroups the actionGroups value to set.
     * @return the ActivityLogAlertActionList object itself.
     */
    public ActivityLogAlertActionList withActionGroups(List<ActivityLogAlertActionGroup> actionGroups) {
        this.actionGroups = actionGroups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionGroups() != null) {
            actionGroups().forEach(e -> e.validate());
        }
    }
}