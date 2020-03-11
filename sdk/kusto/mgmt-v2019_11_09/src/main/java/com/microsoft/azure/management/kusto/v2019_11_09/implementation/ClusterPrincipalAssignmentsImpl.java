/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.kusto.v2019_11_09.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2019_11_09.ClusterPrincipalAssignments;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.kusto.v2019_11_09.ClusterPrincipalAssignment;
import com.microsoft.azure.management.kusto.v2019_11_09.CheckNameResult;

class ClusterPrincipalAssignmentsImpl extends WrapperImpl<ClusterPrincipalAssignmentsInner> implements ClusterPrincipalAssignments {
    private final KustoManager manager;

    ClusterPrincipalAssignmentsImpl(KustoManager manager) {
        super(manager.inner().clusterPrincipalAssignments());
        this.manager = manager;
    }

    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public ClusterPrincipalAssignmentImpl define(String name) {
        return wrapModel(name);
    }

    private ClusterPrincipalAssignmentImpl wrapModel(ClusterPrincipalAssignmentInner inner) {
        return  new ClusterPrincipalAssignmentImpl(inner, manager());
    }

    private ClusterPrincipalAssignmentImpl wrapModel(String name) {
        return new ClusterPrincipalAssignmentImpl(name, this.manager());
    }

    @Override
    public Observable<ClusterPrincipalAssignment> listAsync(String resourceGroupName, String clusterName) {
        ClusterPrincipalAssignmentsInner client = this.inner();
        return client.listAsync(resourceGroupName, clusterName)
        .flatMap(new Func1<List<ClusterPrincipalAssignmentInner>, Observable<ClusterPrincipalAssignmentInner>>() {
            @Override
            public Observable<ClusterPrincipalAssignmentInner> call(List<ClusterPrincipalAssignmentInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ClusterPrincipalAssignmentInner, ClusterPrincipalAssignment>() {
            @Override
            public ClusterPrincipalAssignment call(ClusterPrincipalAssignmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ClusterPrincipalAssignment> getAsync(String resourceGroupName, String clusterName, String principalAssignmentName) {
        ClusterPrincipalAssignmentsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, principalAssignmentName)
        .flatMap(new Func1<ClusterPrincipalAssignmentInner, Observable<ClusterPrincipalAssignment>>() {
            @Override
            public Observable<ClusterPrincipalAssignment> call(ClusterPrincipalAssignmentInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ClusterPrincipalAssignment)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterName, String principalAssignmentName) {
        ClusterPrincipalAssignmentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, principalAssignmentName).toCompletable();
    }

    @Override
    public Observable<CheckNameResult> checkNameAvailabilityAsync(String resourceGroupName, String clusterName, String name) {
        ClusterPrincipalAssignmentsInner client = this.inner();
        return client.checkNameAvailabilityAsync(resourceGroupName, clusterName, name)
        .map(new Func1<CheckNameResultInner, CheckNameResult>() {
            @Override
            public CheckNameResult call(CheckNameResultInner inner) {
                return new CheckNameResultImpl(inner, manager());
            }
        });
    }

}
