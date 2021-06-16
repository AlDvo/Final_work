package yandex.step;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.page.MainPages;

public class MainStep {

    @Step("Выбран пункт меню {0}")
    public void stepSelectMarket(String menuItem) throws InterruptedException {
        new MainPages(BaseStep.getDriver()).selectMarket(menuItem);
    }

    @Step("Выбран каталог {0}")
    public void stepSelectCatalog(String menuItem) throws InterruptedException {
        new MainPages(BaseStep.getDriver()).selectCatalog(menuItem);
    }

    @Step("Выбран раздел {0}")
    public void stepSelectRazdel(String menuItem) throws InterruptedException {
        new MainPages(BaseStep.getDriver()).selectRazdel(menuItem);
    }
}
