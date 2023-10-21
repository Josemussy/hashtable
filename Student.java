public class Student {
    private int id;
    private String name;
    private Student next; // Campo para encadeamento exterior

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null; // Inicializa o próximo como nulo
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter para o campo next
    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }
}
