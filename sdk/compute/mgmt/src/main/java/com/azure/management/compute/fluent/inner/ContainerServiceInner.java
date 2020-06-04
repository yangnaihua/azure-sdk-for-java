// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.compute.models.ContainerServiceAgentPoolProfile;
import com.azure.management.compute.models.ContainerServiceCustomProfile;
import com.azure.management.compute.models.ContainerServiceDiagnosticsProfile;
import com.azure.management.compute.models.ContainerServiceLinuxProfile;
import com.azure.management.compute.models.ContainerServiceMasterProfile;
import com.azure.management.compute.models.ContainerServiceOrchestratorProfile;
import com.azure.management.compute.models.ContainerServicePrincipalProfile;
import com.azure.management.compute.models.ContainerServiceWindowsProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ContainerService model. */
@JsonFlatten
@Fluent
public class ContainerServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceInner.class);

    /*
     * the current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Properties of the orchestrator.
     */
    @JsonProperty(value = "properties.orchestratorProfile")
    private ContainerServiceOrchestratorProfile orchestratorProfile;

    /*
     * Properties for custom clusters.
     */
    @JsonProperty(value = "properties.customProfile")
    private ContainerServiceCustomProfile customProfile;

    /*
     * Properties for cluster service principals.
     */
    @JsonProperty(value = "properties.servicePrincipalProfile")
    private ContainerServicePrincipalProfile servicePrincipalProfile;

    /*
     * Properties of master agents.
     */
    @JsonProperty(value = "properties.masterProfile")
    private ContainerServiceMasterProfile masterProfile;

    /*
     * Properties of the agent pool.
     */
    @JsonProperty(value = "properties.agentPoolProfiles")
    private List<ContainerServiceAgentPoolProfile> agentPoolProfiles;

    /*
     * Properties of Windows VMs.
     */
    @JsonProperty(value = "properties.windowsProfile")
    private ContainerServiceWindowsProfile windowsProfile;

    /*
     * Properties of Linux VMs.
     */
    @JsonProperty(value = "properties.linuxProfile")
    private ContainerServiceLinuxProfile linuxProfile;

    /*
     * Properties of the diagnostic agent.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private ContainerServiceDiagnosticsProfile diagnosticsProfile;

    /**
     * Get the provisioningState property: the current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the orchestratorProfile property: Properties of the orchestrator.
     *
     * @return the orchestratorProfile value.
     */
    public ContainerServiceOrchestratorProfile orchestratorProfile() {
        return this.orchestratorProfile;
    }

    /**
     * Set the orchestratorProfile property: Properties of the orchestrator.
     *
     * @param orchestratorProfile the orchestratorProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile) {
        this.orchestratorProfile = orchestratorProfile;
        return this;
    }

    /**
     * Get the customProfile property: Properties for custom clusters.
     *
     * @return the customProfile value.
     */
    public ContainerServiceCustomProfile customProfile() {
        return this.customProfile;
    }

    /**
     * Set the customProfile property: Properties for custom clusters.
     *
     * @param customProfile the customProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withCustomProfile(ContainerServiceCustomProfile customProfile) {
        this.customProfile = customProfile;
        return this;
    }

    /**
     * Get the servicePrincipalProfile property: Properties for cluster service principals.
     *
     * @return the servicePrincipalProfile value.
     */
    public ContainerServicePrincipalProfile servicePrincipalProfile() {
        return this.servicePrincipalProfile;
    }

    /**
     * Set the servicePrincipalProfile property: Properties for cluster service principals.
     *
     * @param servicePrincipalProfile the servicePrincipalProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withServicePrincipalProfile(ContainerServicePrincipalProfile servicePrincipalProfile) {
        this.servicePrincipalProfile = servicePrincipalProfile;
        return this;
    }

    /**
     * Get the masterProfile property: Properties of master agents.
     *
     * @return the masterProfile value.
     */
    public ContainerServiceMasterProfile masterProfile() {
        return this.masterProfile;
    }

    /**
     * Set the masterProfile property: Properties of master agents.
     *
     * @param masterProfile the masterProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withMasterProfile(ContainerServiceMasterProfile masterProfile) {
        this.masterProfile = masterProfile;
        return this;
    }

    /**
     * Get the agentPoolProfiles property: Properties of the agent pool.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ContainerServiceAgentPoolProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set the agentPoolProfiles property: Properties of the agent pool.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Get the windowsProfile property: Properties of Windows VMs.
     *
     * @return the windowsProfile value.
     */
    public ContainerServiceWindowsProfile windowsProfile() {
        return this.windowsProfile;
    }

    /**
     * Set the windowsProfile property: Properties of Windows VMs.
     *
     * @param windowsProfile the windowsProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withWindowsProfile(ContainerServiceWindowsProfile windowsProfile) {
        this.windowsProfile = windowsProfile;
        return this;
    }

    /**
     * Get the linuxProfile property: Properties of Linux VMs.
     *
     * @return the linuxProfile value.
     */
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.linuxProfile;
    }

    /**
     * Set the linuxProfile property: Properties of Linux VMs.
     *
     * @param linuxProfile the linuxProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.linuxProfile = linuxProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Properties of the diagnostic agent.
     *
     * @return the diagnosticsProfile value.
     */
    public ContainerServiceDiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Properties of the diagnostic agent.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestratorProfile() != null) {
            orchestratorProfile().validate();
        }
        if (customProfile() != null) {
            customProfile().validate();
        }
        if (servicePrincipalProfile() != null) {
            servicePrincipalProfile().validate();
        }
        if (masterProfile() != null) {
            masterProfile().validate();
        }
        if (agentPoolProfiles() != null) {
            agentPoolProfiles().forEach(e -> e.validate());
        }
        if (windowsProfile() != null) {
            windowsProfile().validate();
        }
        if (linuxProfile() != null) {
            linuxProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
    }
}