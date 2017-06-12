import java.util.ListResourceBundle;

/**
 * Created by Денис on 12.06.2017.
 */
public class LocalizedResources extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"removeButton", "Удалить"},
                {"addButton", "Добавить"},
                {"removeLowerButton", "Удалить меньшие"},
                {"importButton", "Импортировать"},
                {"saveButton", "Сохранить"},
                {"refreshButton", "Обновить"},
                {"windowTitle", "Лаба №8"},
                {"error1", "Поле \"Локация\" не может являться пустым. В локации могут содержаться лишь символы кириллицы, латинского алфавита, цифры, \"-\" и \"_\""},
                {"error2", "Поле \"Имя\" не может являться пустым.В имени могут содержаться только символы кириллицы и латинского алфавита"},
                {"error3", "Возраст может быть только в пределах от 0 до 120 лет"},
                {"filterButton","Отфильтровать"},
                {"loc","RU"}
        };
    }
}