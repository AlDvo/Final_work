package yandex.step;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.page.ProductSearchPages;

public class ProductSearchStep {

    @Step("Поле {0} заполняем значением {1}")
    public void stepFillField(String field , String value){
        new ProductSearchPages(BaseStep.getDriver()).fillField(field,value);
    }

    @Step("Выбрали производителя {0}")
    public void stepSelectMaker(String menuItem) throws InterruptedException {
        new ProductSearchPages(BaseStep.getDriver()).selectMaker(menuItem);
    }
    @Step("Ввели в поисковую строку первый элемент")
    public void stepRemember() throws InterruptedException {
       new ProductSearchPages(BaseStep.getDriver()).remember();
    }

    @Step("Проверяем что наименование товара соответствует запомненному значению")
    public void stepContrast() throws InterruptedException {
        new ProductSearchPages(BaseStep.getDriver()).contrast();
    }
}
