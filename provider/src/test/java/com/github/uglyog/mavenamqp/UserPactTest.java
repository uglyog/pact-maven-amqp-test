package com.github.uglyog.mavenamqp;

import au.com.dius.pact.provider.PactVerifyProvider;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit5.AmpqTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Collections;

@Provider("user-service")
@PactFolder("pacts")
public class UserPactTest {

  @TestTemplate
  @ExtendWith({PactVerificationInvocationContextProvider.class})
  public void pactVerificationTestTemplate(PactVerificationContext context) {
    context.verifyInteraction();
  }

  @BeforeEach
  public void setUp(PactVerificationContext context) {
    context.setTarget(new AmpqTestTarget(Collections.singletonList("com.github.uglyog.mavenamqp")));
  }

  @PactVerifyProvider("user created message")
  public String verifyUserCreatedMessage() {
    return "{\n\"testParam1\": \"value1\",\n\"testParam2\": \"value2\"\n}";
  }

  @State("SomeProviderState")
  public void someProviderState() {

  }
}
