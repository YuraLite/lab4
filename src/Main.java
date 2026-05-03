// Опис студента з першого варіанту
class Student {
    String surname;
    String name;
    String elective;
    int grade;

    public Student(String surname, String name, String elective, int grade) {
        this.surname = surname;
        this.name = name;
        this.elective = elective;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return surname + " " + name + " | Факультатиив: " + elective + " | Бал: " + grade;
    }
}

public class Main {


    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].grade < arr[j + 1].grade) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student("Козаченко", "Яна", "Комп'ютерні мережі", 91),
                new Student("Іваненко", "Максим", "Бази даних", 74),
                new Student("Лисенко", "Олена", "Комп'ютерна графіка", 96),
                new Student("Гримак", "Олег", "Алгоритми та СД", 65),
                new Student("Сидорук", "Андрій", "Архітектура ПЗ", 82)
        };


        System.out.println("--- Масив ДО сортування ---");
        for (Student student : students) {
            System.out.println(student);
        }


        bubbleSort(students);


        System.out.println("\n--- Масив ПІСЛЯ сортування (за спаданням бала) ---");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}