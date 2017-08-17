package ru.davidlevy.lesson4.homework;

public class Parametres {
    private String userName = "david";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void saveToXml(){
        // todo С элементов формы Settings берем значения и записываем их в поля класса Parametres
        // setUserName(Settings.textUserName.getText());
        // todo Сохранить из полей класса Parametres в xml-файл
        System.out.println("Сохраняю поля класса Parametres в xml-файл");

    }

    public void loadFromXml(){
        //
        //TODO написать код :: загружаем из XML-файла
        System.out.println("Заружаю из XML...");
        setUserName("David A. Lévy");
    }
}
