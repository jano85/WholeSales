package com.c2s.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.ManagedBean;
import java.io.Serializable;


@ManagedBean
@RequestScope
public class PruebaAction implements Serializable
{


    public void determineDayOfWeek()
    {
        System.out.println("determineDayOfWeek");

        String dayOfWeekName = "LUNES";

    }
}

