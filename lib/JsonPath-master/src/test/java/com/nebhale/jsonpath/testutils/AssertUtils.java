/*
 * Copyright 2013 the original author or authors.
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

package com.nebhale.jsonpath.testutils;

import static org.junit.Assert.assertEquals;

import com.nebhale.jsonpath.internal.parser.ProblemContainer;

public final class AssertUtils {

    private AssertUtils() {
    }

    public static void assertNoProblems(ProblemContainer problemContainer) {
        assertProblemCount(problemContainer, 0);
    }

    public static void assertProblemCount(ProblemContainer problemContainer, int count) {
        assertEquals(problemContainer.getProblems().toString(), count, problemContainer.getProblems().size());
    }
}
