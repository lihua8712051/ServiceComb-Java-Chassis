/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.samples.springmvc.provider;


import io.servicecomb.provider.rest.common.RestSchema;
import io.servicecomb.samples.common.schema.Hello;
import io.servicecomb.samples.common.schema.models.Person;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestSchema(schemaId = "springmvcHello")
@RequestMapping(path = "/springmvchello", produces = MediaType.APPLICATION_JSON)
public class SpringmvcHelloImpl implements Hello {

  @Override
  @RequestMapping(path = "/sayhi", method = RequestMethod.POST)
  public String sayHi(@RequestParam(name = "name") String name) {
    return "Hello " + name;
  }

  @Override
  @RequestMapping(path = "/sayhello", method = RequestMethod.POST)
  public String sayHello(@RequestBody Person person) {
    return "Hello person " + person.getName();
  }
}
