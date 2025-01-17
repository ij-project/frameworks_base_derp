/*
 * Copyright (C) 2023 The Android Open Source Project
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

package android.platform.test.ravenwood;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RavenwoodRuleImpl {
    public static void init(RavenwoodRule rule) {
        // No-op when running on a real device
    }

    public static void reset(RavenwoodRule rule) {
        // No-op when running on a real device
    }

    public static void logTestRunner(String label, Description description) {
        // No-op when running on a real device
    }

    public static void validate(Statement base, Description description,
            boolean enableOptionalValidation) {
    }

    public static long realCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
