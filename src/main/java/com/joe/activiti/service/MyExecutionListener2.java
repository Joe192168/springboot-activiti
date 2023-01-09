package com.joe.activiti.service;

import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.StartEvent;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.impl.util.ProcessDefinitionUtil;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author xqh
 * @Title:
 * @Description:
 * @date 2023/1/513:48
 */
@Service
public class MyExecutionListener2 implements ExecutionListener, Serializable {


    private static final long serialVersionUID = 4537356885679758972L;
    private Expression message;

    @Override
    public void notify(DelegateExecution delegateExecution) {
        System.out.println("message" + message.getValue(delegateExecution).toString());
    }
}
