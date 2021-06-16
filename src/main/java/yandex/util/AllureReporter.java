package yandex.util;

import gherkin.formatter.model.Result;
import yandex.step.BaseStep;


public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {

        @Override
        public void result(Result result){
            if(result.getStatus().equals("failed")){
            BaseStep.takeScreenshot();}
            super.result(result);
        }

    }

