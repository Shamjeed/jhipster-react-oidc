package com.demo.oidc.cucumber.stepdefs;

import com.demo.oidc.JhipsterOidcApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterOidcApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
