public class Hashtable {
    Student[] hashtable = new Student[7];
    int size = hashtable.length;
    int usedPosition = 0;
    public void setHashtable(){
        for (int i=0; i<size; i++){
            hashtable[i]= new Student(-1," ");
        }
    }

    public int hashcode(int key){
        int result = 31;
        result = (17*(result+key))%size;
        return result;
    }

    public void insertLinearProbing (Student student){
        int pos= hashcode(student.getId());
        while (hashtable[pos].getId() > 0){
            pos = (pos+1)%size;
        }
        hashtable[pos]= student;
        usedPosition++;
    }

    public Student searchLinearProbing(int id) {
        int pos = hashcode(id);
        int iterations = 0;
        boolean found = false;

        while (hashtable[pos].getId() != -1) {
            iterations++;
            if (hashtable[pos].getId() == id) {
                found = true;
                break;
            }
            pos = (pos + 1) % size;
        }

        if (found) {
            System.out.println("Número de iterações com sondagem linear: " + iterations);
            return hashtable[pos];
        } else {
            System.out.println("Número de iterações com sondagem linear: " + iterations);
            return null;
        }
    }

    public void removeLinearProbing(int id){
        int pos = hashcode(id);
        boolean test = false;
        while (hashtable[pos].getId() != -1){
            if (hashtable[pos].getId() == id){
                System.out.println("Estudante: "+hashtable[pos].getName()+" removido com sucesso!");
                hashtable[pos] = new Student(-2, " ");
                usedPosition--;
                test = true;
                break;
            }
            pos = (pos+1)%size;
        }
        if (!test){
            System.out.println("O estudante não foi encontrado na tabela!");
        }
        printLinearProbing();
    }

    public void printLinearProbing(){
        System.out.println("\nTabela Hash com Tratamento de sondagem linear:");
        for(int i = 0; i<size;i++){
            if(hashtable[i].getId()>0){
                System.out.print(i+" ||Id:"+hashtable[i].getId()+" ");
                System.out.println(" Nome:"+hashtable[i].getName()+"||");
            }
        }
    }

    public void insertChaining(Student student) {
        int pos = hashcode(student.getId());

        if (hashtable[pos].getId() == -1) {
            hashtable[pos] = student;
        } else {
            Student current = hashtable[pos];
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(student);
        }

        usedPosition++;
    }

    public Student searchChaining(int id) {
        int pos = hashcode(id);
        int iterations = 0;

        Student current = hashtable[pos];
        while (current != null && current.getId() != -1) {
            iterations++;
            if (current.getId() == id) {
                System.out.println("\nNúmero de iterações com Encadeamento exterior: " + iterations);
                return current;
            }
            current = current.getNext();
        }

        System.out.println("\nNúmero de iterações com Encadeamento exterior: " + iterations);
        return null;
    }

    public void removeChaining(int id) {
        int pos = hashcode(id);

        if (hashtable[pos].getId() == id) {
            System.out.println("Estudante: "+hashtable[pos].getName()+" removido com sucesso!");
            hashtable[pos] = new Student(-1, " ");
            usedPosition--;
        } else {
            Student current = hashtable[pos];
            while (current.getNext() != null) {
                if (current.getNext().getId() == id) {
                    current.setNext(current.getNext().getNext());
                    usedPosition--;
                    break;
                }
                current = current.getNext();
            }
        }
        printChaining();
    }

    public void printChaining() {
        System.out.println("Tabela Hash com Encadeamento Exterior:");
        for (int i = 0; i < size; i++) {
            Student current = hashtable[i];
            System.out.print(i);
            while (current != null && current.getId() != -1) {
                System.out.print(" ||Id:"+current.getId()+" Nome: "+current.getName() + "|| -> ");
                current = current.getNext();
            }
            System.out.println(" ");
        }
    }
}


