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
public class MyExecutionListener implements ExecutionListener, Serializable {


    private static final long serialVersionUID = -6652133090538828006L;

    private Expression fixedValue;
    private Expression dynamicValue;
    @Override
    public void notify(DelegateExecution delegateExecution) {
        System.out.println("fixedValue" + fixedValue.getValue(delegateExecution).toString());
        System.out.println("dynamicValue" + dynamicValue.getValue(delegateExecution).toString());
        Collection<FlowElement> flowElements = ProcessDefinitionUtil.getProcess(delegateExecution.getProcessDefinitionId()).getFlowElements();
        for (FlowElement flowElement : flowElements) {
            if (flowElement instanceof StartEvent){
                System.out.println("this is startEvent node!");
            }
        }
    }
}
