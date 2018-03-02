package pl.piotrrozanski.virtuallibrary.cucumber.stepdefs;

import pl.piotrrozanski.virtuallibrary.CloudConnectorApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CloudConnectorApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
