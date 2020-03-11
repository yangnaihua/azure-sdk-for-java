/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_11_01.VpnConnectionStatus;
import com.microsoft.azure.management.network.v2019_11_01.VirtualNetworkGatewayConnectionProtocol;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * VpnConnection Resource.
 */
@JsonFlatten
public class VpnConnectionInner extends SubResource {
    /**
     * Id of the connected vpn site.
     */
    @JsonProperty(value = "properties.remoteVpnSite")
    private SubResource remoteVpnSite;

    /**
     * Routing weight for vpn connection.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /**
     * The connection status. Possible values include: 'Unknown', 'Connecting',
     * 'Connected', 'NotConnected'.
     */
    @JsonProperty(value = "properties.connectionStatus")
    private VpnConnectionStatus connectionStatus;

    /**
     * Connection protocol used for this connection. Possible values include:
     * 'IKEv2', 'IKEv1'.
     */
    @JsonProperty(value = "properties.vpnConnectionProtocolType")
    private VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType;

    /**
     * Ingress bytes transferred.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /**
     * Egress bytes transferred.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /**
     * Expected bandwidth in MBPS.
     */
    @JsonProperty(value = "properties.connectionBandwidth")
    private Integer connectionBandwidth;

    /**
     * SharedKey for the vpn connection.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /**
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /**
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /**
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableRateLimiting")
    private Boolean enableRateLimiting;

    /**
     * Enable internet security.
     */
    @JsonProperty(value = "properties.enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /**
     * Use local azure ip to initiate connection.
     */
    @JsonProperty(value = "properties.useLocalAzureIpAddress")
    private Boolean useLocalAzureIpAddress;

    /**
     * The provisioning state of the VPN connection resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * List of all vpn site link connections to the gateway.
     */
    @JsonProperty(value = "properties.vpnLinkConnections")
    private List<VpnSiteLinkConnectionInner> vpnLinkConnections;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get id of the connected vpn site.
     *
     * @return the remoteVpnSite value
     */
    public SubResource remoteVpnSite() {
        return this.remoteVpnSite;
    }

    /**
     * Set id of the connected vpn site.
     *
     * @param remoteVpnSite the remoteVpnSite value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRemoteVpnSite(SubResource remoteVpnSite) {
        this.remoteVpnSite = remoteVpnSite;
        return this;
    }

    /**
     * Get routing weight for vpn connection.
     *
     * @return the routingWeight value
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the connection status. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     *
     * @return the connectionStatus value
     */
    public VpnConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Set the connection status. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     *
     * @param connectionStatus the connectionStatus value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withConnectionStatus(VpnConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    /**
     * Get connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'.
     *
     * @return the vpnConnectionProtocolType value
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType;
    }

    /**
     * Set connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withVpnConnectionProtocolType(VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        return this;
    }

    /**
     * Get ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get egress bytes transferred.
     *
     * @return the egressBytesTransferred value
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value
     */
    public Integer connectionBandwidth() {
        return this.connectionBandwidth;
    }

    /**
     * Set expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withConnectionBandwidth(Integer connectionBandwidth) {
        this.connectionBandwidth = connectionBandwidth;
        return this;
    }

    /**
     * Get sharedKey for the vpn connection.
     *
     * @return the sharedKey value
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set sharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get enableBgp flag.
     *
     * @return the enableBgp value
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set enableBgp flag.
     *
     * @param enableBgp the enableBgp value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get enableBgp flag.
     *
     * @return the enableRateLimiting value
     */
    public Boolean enableRateLimiting() {
        return this.enableRateLimiting;
    }

    /**
     * Set enableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableRateLimiting(Boolean enableRateLimiting) {
        this.enableRateLimiting = enableRateLimiting;
        return this;
    }

    /**
     * Get enable internet security.
     *
     * @return the enableInternetSecurity value
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get use local azure ip to initiate connection.
     *
     * @return the useLocalAzureIpAddress value
     */
    public Boolean useLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress;
    }

    /**
     * Set use local azure ip to initiate connection.
     *
     * @param useLocalAzureIpAddress the useLocalAzureIpAddress value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        return this;
    }

    /**
     * Get the provisioning state of the VPN connection resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get list of all vpn site link connections to the gateway.
     *
     * @return the vpnLinkConnections value
     */
    public List<VpnSiteLinkConnectionInner> vpnLinkConnections() {
        return this.vpnLinkConnections;
    }

    /**
     * Set list of all vpn site link connections to the gateway.
     *
     * @param vpnLinkConnections the vpnLinkConnections value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withVpnLinkConnections(List<VpnSiteLinkConnectionInner> vpnLinkConnections) {
        this.vpnLinkConnections = vpnLinkConnections;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
