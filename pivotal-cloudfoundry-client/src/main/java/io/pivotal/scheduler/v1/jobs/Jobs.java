/*
 * Copyright 2018-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.pivotal.scheduler.v1.jobs;

import reactor.core.publisher.Mono;

/**
 * Main entry point to the Jobs API
 */
public interface Jobs {

    /**
     * Makes the <a href="http://docs.pivotal.io/pcf-scheduler/1-1/api/#create-job">Create Job</a> request
     *
     * @param request the Create Job request
     * @return the response to the Create Job request
     */
    Mono<CreateJobResponse> create(CreateJobRequest request);

    /**
     * Makes the <a href="http://docs.pivotal.io/pcf-scheduler/1-1/api/#delete-a-job">Delete a Job</a> request
     *
     * @param request the Delete a Job request
     * @return the response to the Delete a Job request
     */
    Mono<Void> delete(DeleteJobRequest request);

    /**
     * Makes the <a href="http://docs.pivotal.io/pcf-scheduler/1-1/api/#get-a-job">Get a Job</a> request
     *
     * @param request the Get a Job request
     * @return the response to the Get a Job request
     */
    Mono<GetJobResponse> get(GetJobRequest request);

}
