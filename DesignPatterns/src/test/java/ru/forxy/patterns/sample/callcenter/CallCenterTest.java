package ru.forxy.patterns.sample.callcenter;

import org.junit.Assert;
import org.junit.Test;
import ru.forxy.sample.callcenter.CallCenter;
import ru.forxy.sample.callcenter.Customer;
import ru.forxy.sample.callcenter.Fresher;
import ru.forxy.sample.callcenter.ProjectManager;
import ru.forxy.sample.callcenter.Severity;
import ru.forxy.sample.callcenter.TechnicalLead;

/**
 * Unit test for CallCenter
 */
public class CallCenterTest {

    @Test
    public void testCallCenterHappyPath() throws InterruptedException {
        ProjectManager projectManager = new ProjectManager("PM");
        TechnicalLead technicalLead = new TechnicalLead("TL", projectManager);
        CallCenter callCenter = new CallCenter();

        callCenter.registerOperator(new Fresher("F1", technicalLead));
        callCenter.registerOperator(new Fresher("F2", technicalLead));

        callCenter.call(new Customer("C1", Severity.LOW));
        callCenter.call(new Customer("C2", Severity.MEDIUM));
        callCenter.call(new Customer("C3", Severity.HIGH));

        Thread.sleep(1000);
        callCenter.stopWorking(1);
        Assert.assertEquals(3, callCenter.getRecorder().getLog().size());
    }
}
