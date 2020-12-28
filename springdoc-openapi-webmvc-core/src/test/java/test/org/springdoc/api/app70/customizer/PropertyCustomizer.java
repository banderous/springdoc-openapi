/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package test.org.springdoc.api.app70.customizer;

import java.lang.annotation.Annotation;
import java.time.Duration;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.JavaType;
import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;

import org.springframework.stereotype.Component;

@Component
public class PropertyCustomizer implements org.springdoc.core.customizers.PropertyCustomizer {
	@Override
	public Schema customize(Schema property, AnnotatedType type) {
		type.getParent().addRequiredItem(type.getPropertyName());
		return property;
	}
}
