package com.github.uglyog.mavenamqp;

import au.com.dius.pact.provider.PactVerifyProvider;
import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.target.MessageTarget;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import au.com.dius.pact.provider.junitsupport.target.Target;
import au.com.dius.pact.provider.junitsupport.target.TestTarget;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@Provider("maven_message_provider")
@PactFolder("../consumer/target/pacts")
public class ProviderTest {
    @TestTarget
    public final Target target = new MessageTarget();

    @PactVerifyProvider("a test message")
    public String generateTestMessage() {
        return new MessageProvider().generateCostMessage(13412L);
    }
}
