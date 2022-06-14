/*
 * Copyright Ericsson 2019
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 */
package com.example.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sds")
public class VappController {

    @GetMapping("/vapp")

	public Map<String, String> createVapp() {
    	
		Map <String, String> test = new HashMap<String, String>();
		test.put("name", "Pragathees");
		return test;
    }
	}
