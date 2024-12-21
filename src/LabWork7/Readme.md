Лабораторна робота №7
ТЗ-21 Клюс Анна
В даній роботі нам необхідно дослідити та реалізувати три програми за допомогою колекцій в Java

Відповіді на контрольні питання:
1. Для чого призначений Collections Framework?
Collections Framework в Java призначений для роботи з колекціями об’єктів, надаючи зручний набір інтерфейсів і класів для зберігання, обробки та маніпулювання даними. Це включає такі колекції, як списки, множини, черги, мапи, і різні алгоритми (сортування, пошук, тощо). Framework забезпечує ефективну та стандартну реалізацію структур даних для спрощення коду.

2. В чому полягає різниця між масивами та колекціями?
Масиви мають фіксований розмір, визначений під час створення, і можуть зберігати тільки елементи одного типу. Колекції (списки, множини, мапи) мають динамічний розмір, дозволяють додавати та видаляти елементи під час виконання програми, а також підтримують різні структури даних і методи для роботи з ними.

3. Які особливі властивості є у списків порівняно з іншими типами колекцій?
Списки (наприклад, ArrayList, LinkedList) мають:

Порядок елементів: елементи впорядковані в порядку їх додавання.
Доступ за індексом: можна отримати елемент за його позицією.
Можливість зберігати дублікатні значення: на відміну від множин (Set), списки дозволяють зберігати дублікати.
4. Чим списки відрізняються від масивів?
Динамічний розмір: списки можуть автоматично змінювати розмір, в той час, як масиви мають фіксований розмір.
Методи для роботи з даними: списки мають більше методів для додавання, видалення і пошуку елементів.
Абстракція: списки є частиною Collections Framework, тому їх можна легко комбінувати з іншими колекціями, і використовувати спільні інтерфейси та алгоритми.
5. Чим ArrayList відрізняється від LinkedList? Який з них у яких випадках краще використовувати?
ArrayList:

Зберігає елементи в динамічному масиві.
Переваги: швидкий доступ за індексом.
Недоліки: повільне видалення та вставка елементів у середині списку, оскільки доводиться зсувати елементи.
Використовується для частого доступу за індексом, наприклад, коли переважно потрібно зчитувати елементи, а не додавати/видаляти їх.
LinkedList:

Зберігає елементи у вигляді двозв'язного списку.
Переваги: швидке додавання та видалення елементів на початку чи середині списку.
Недоліки: повільний доступ за індексом, оскільки необхідно проходити список від початку до потрібної позиції.
Використовується для частого додавання/видалення елементів, особливо коли немає необхідності в частому доступі за індексом.
6. Що таке Iterator? В чому полягають переваги використання ітератора у порівнянні з класичним циклом ”for(int i=0; i<collection.size(); i++) { /* ... */ }”?
Iterator — це об'єкт, який дозволяє послідовно проходити по елементах колекції без необхідності знати її внутрішню структуру.

Переваги:

Дозволяє видаляти елементи під час ітерації без виникнення ConcurrentModificationException.
Забезпечує універсальний спосіб ітерації для різних типів колекцій (списки, множини).
Легший та більш безпечний спосіб роботи з колекціями, особливо якщо колекція змінюється під час ітерації.
7. Що таке типізовані та нетипізовані колекції?
Типізовані колекції визначають тип елементів, які можуть у них зберігатися (наприклад, List), що забезпечує перевірку типів під час компіляції. Нетипізовані колекції (сирі типи) не мають специфічного типу для елементів (наприклад, List), тому будь-який об'єкт може бути доданий, що збільшує ризик виникнення помилок під час виконання програми.

8. Для чого потрібен інтерфейс RandomAccess?
Інтерфейс RandomAccess позначає колекції, що підтримують швидкий доступ до елементів за індексом. Реалізації, які використовують цей інтерфейс (наприклад, ArrayList), дозволяють ефективно виконувати операції get(i). Це допомагає визначити, чи підходить колекція для випадкового доступу до елементів, що дозволяє оптимізувати алгоритми для роботи з нею.

9. Чим Collection відрізняється від Collections?
Collection — це інтерфейс, який є базовим для всіх колекцій в Java, таких як списки, множини, черги. Він визначає основні методи для роботи з колекціями (додавання, видалення елементів). Collections — це клас, що надає статичні методи для роботи з колекціями, такі як sort(), reverse(), shuffle(), binarySearch(). Він слугує набором утиліт для виконання різних операцій над об'єктами, що реалізують інтерфейс Collection.