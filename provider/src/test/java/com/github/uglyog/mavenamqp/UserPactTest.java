package com.github.uglyog.mavenamqp;

import au.com.dius.pact.provider.PactVerifyProvider;
import au.com.dius.pact.provider.junit5.MessageTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.util.Collections;

@Provider("user-service")
@PactFolder("pacts")
@JsonTest
public class UserPactTest {

    @Autowired
    private ObjectMapper mapper;

    @TestTemplate
    @ExtendWith({PactVerificationInvocationContextProvider.class})
    public void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }

    @BeforeEach
    public void setUp(PactVerificationContext context) {
        context.setTarget(new MessageTestTarget(Collections.singletonList("com.github.uglyog.mavenamqp")));
    }

    @PactVerifyProvider("user created message")
    public String verifyUserCreatedMessage() throws JsonProcessingException {
        return mapper.writeValueAsString(new JavaMessage());
    }

    @State("SomeProviderState")
    public void someProviderState() {

    }

    public static class JavaMessage {
        public String testParam1 = "value1";
        public String testParam2 = "value2";
        // jackson use fields, here no need for getters and setters
    }
}
