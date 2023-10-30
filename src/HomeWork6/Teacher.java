package HomeWork6;

public abstract class Teacher {
//  сделала класс абстрактным
    protected String firstName;
    protected String lastName;
//  сделала поля защищёнными

    protected Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

// Убрала возможность получать и переписывать защищённые поля (класс закрыт для модификаций, открыт для расширений)
// Избавилась от неиспользуемых функций

}
