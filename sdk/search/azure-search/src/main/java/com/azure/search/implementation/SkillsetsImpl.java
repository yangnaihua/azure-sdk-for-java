// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.http.MatchConditions;
import com.azure.search.implementation.models.ListSkillsetsResult;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.SearchErrorException;
import com.azure.search.models.Skillset;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Skillsets.
 */
public final class SkillsetsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private SkillsetsService service;

    /**
     * The service client containing this operation class.
     */
    private SearchServiceRestClientImpl client;

    /**
     * Initializes an instance of SkillsetsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SkillsetsImpl(SearchServiceRestClientImpl client) {
        this.service = RestProxy.create(SkillsetsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SearchServiceRestClientSkillsets to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceRestClientSkillsets")
    private interface SkillsetsService {
        @Put("skillsets('{skillsetName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Skillset>> createOrUpdate(@PathParam("skillsetName") String skillsetName, @HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") Skillset skillset, @HeaderParam("Prefer") String prefer, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Delete("skillsets('{skillsetName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(@PathParam("skillsetName") String skillsetName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Get("skillsets('{skillsetName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Skillset>> get(@PathParam("skillsetName") String skillsetName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("skillsets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<ListSkillsetsResult>> list(@HostParam("endpoint") String endpoint, @QueryParam("$select") String select, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("skillsets")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Skillset>> create(@HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") Skillset skillset, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Creates a new skillset in a search service or updates the skillset if it already exists.
     *
     * @param skillsetName The name of the skillset to create or update.
     * @param skillset The skillset containing one or more skills to create or update in a search service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Skillset>> createOrUpdateWithRestResponseAsync(String skillsetName, Skillset skillset, Context context) {
        final String prefer = "return=representation";
        final UUID xMsClientRequestId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        return service.createOrUpdate(skillsetName, this.client.getEndpoint(), skillset, prefer, this.client.getApiVersion(), xMsClientRequestId, ifMatch, ifNoneMatch, context);
    }

    /**
     * Creates a new skillset in a search service or updates the skillset if it already exists.
     *
     * @param skillsetName The name of the skillset to create or update.
     * @param skillset The skillset containing one or more skills to create or update in a search service.
     * @param requestOptions Additional parameters for the operation.
     * @param accessCondition Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Skillset>> createOrUpdateWithRestResponseAsync(String skillsetName, Skillset skillset, RequestOptions requestOptions, MatchConditions accessCondition, Context context) {
        final String prefer = "return=representation";
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        String ifMatch = null;
        if (accessCondition != null) {
            ifMatch = accessCondition.getIfMatch();
        }
        String ifNoneMatch = null;
        if (accessCondition != null) {
            ifNoneMatch = accessCondition.getIfNoneMatch();
        }
        return service.createOrUpdate(skillsetName, this.client.getEndpoint(), skillset, prefer, this.client.getApiVersion(), xMsClientRequestId, ifMatch, ifNoneMatch, context);
    }

    /**
     * Deletes a skillset in a search service.
     *
     * @param skillsetName The name of the skillset to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String skillsetName, Context context) {
        final UUID xMsClientRequestId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        return service.delete(skillsetName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, ifMatch, ifNoneMatch, context);
    }

    /**
     * Deletes a skillset in a search service.
     *
     * @param skillsetName The name of the skillset to delete.
     * @param requestOptions Additional parameters for the operation.
     * @param accessCondition Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String skillsetName, RequestOptions requestOptions, MatchConditions accessCondition, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        String ifMatch = null;
        if (accessCondition != null) {
            ifMatch = accessCondition.getIfMatch();
        }
        String ifNoneMatch = null;
        if (accessCondition != null) {
            ifNoneMatch = accessCondition.getIfNoneMatch();
        }
        return service.delete(skillsetName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, ifMatch, ifNoneMatch, context);
    }

    /**
     * Retrieves a skillset in a search service.
     *
     * @param skillsetName The name of the skillset to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Skillset>> getWithRestResponseAsync(String skillsetName, Context context) {
        final UUID xMsClientRequestId = null;
        return service.get(skillsetName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves a skillset in a search service.
     *
     * @param skillsetName The name of the skillset to retrieve.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Skillset>> getWithRestResponseAsync(String skillsetName, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.get(skillsetName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * List all skillsets in a search service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListSkillsetsResult>> listWithRestResponseAsync(Context context) {
        final String select = null;
        final UUID xMsClientRequestId = null;
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * List all skillsets in a search service.
     *
     * @param select Selects which top-level properties of the skillsets to retrieve. Specified as a comma-separated list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListSkillsetsResult>> listWithRestResponseAsync(String select, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new skillset in a search service.
     *
     * @param skillset The skillset containing one or more skills to create in a search service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Skillset>> createWithRestResponseAsync(Skillset skillset, Context context) {
        final UUID xMsClientRequestId = null;
        return service.create(this.client.getEndpoint(), skillset, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new skillset in a search service.
     *
     * @param skillset The skillset containing one or more skills to create in a search service.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Skillset>> createWithRestResponseAsync(Skillset skillset, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.create(this.client.getEndpoint(), skillset, this.client.getApiVersion(), xMsClientRequestId, context);
    }
}
