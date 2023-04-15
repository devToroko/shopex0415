package shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.SupportingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingApplication.class })
public class CucumberSpingConfiguration {}
