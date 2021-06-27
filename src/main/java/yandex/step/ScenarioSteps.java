package yandex.step;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainStep mainStep = new MainStep();
    ProductSearchStep productSearchStep = new ProductSearchStep();

    @When("^выбран пункт основного меню Яндекс \"(.+)\"$")
    public void stepSelectMarket(String menuItem) throws InterruptedException {
        mainStep.stepSelectMarket(menuItem);
    }

    @When("^выбран каталог \"(.+)\"$")
    public void stepSelectCatalog(String menuItem) throws InterruptedException {
        mainStep.stepSelectCatalog(menuItem);
    }

    @When("^выбран раздел \"(.+)\"$")
    public void stepSelectRazdel(String menuItem) throws InterruptedException {
        mainStep.stepSelectRazdel(menuItem);
    }

    @When("^заполняются поля Цена от$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class ,String.class).forEach( (key,value) ->productSearchStep.stepFillField(key,value));
    }

    @When("^выбран производитель \"(.+)\"$")
    public void stepSelectMaker(String menuItem) throws InterruptedException {
        productSearchStep.stepSelectMaker(menuItem);
    }

    @When("^В поисковую строку ввести первый элемент списка$")
    public void stepRemember() throws InterruptedException {
        productSearchStep.stepRemember();
    }

    @When("^наименование товара соответствует запомненному значению$")
    public void stepContrast() throws InterruptedException {
        productSearchStep.stepContrast();
    }

}
