public class Main {
    public static void main(String[] args) {
        Hashtable studentLP = new Hashtable();
        Hashtable studentEC = new Hashtable();
        studentLP.setHashtable();
        studentEC.setHashtable();

        Student s0 = new Student(1,"José");
        Student s1 = new Student(22,"João");
        Student s2 = new Student(10,"Maria");
        Student s3 = new Student(14,"André");
        Student s4 = new Student(5,"Paulo");
        Student s5 = new Student(6,"Gabriela");
        Student s6 = new Student(133,"Roberta");


        studentLP.insertLinearProbing(s0);
        studentLP.insertLinearProbing(s1);
        studentLP.insertLinearProbing(s2);
        studentLP.insertLinearProbing(s3);
        studentLP.insertLinearProbing(s4);
        studentLP.insertLinearProbing(s5);
        studentLP.insertLinearProbing(s6);

        studentEC.insertChaining(s0);
        studentEC.insertChaining(s1);
        studentEC.insertChaining(s2);
        studentEC.insertChaining(s3);
        studentEC.insertChaining(s4);
        studentEC.insertChaining(s5);
        studentEC.insertChaining(s6);

        studentEC.printChaining();
        studentLP.printLinearProbing();


        studentEC.searchChaining(14);
        studentLP.searchLinearProbing(14);

        studentEC.removeChaining(133);
        studentLP.removeLinearProbing(133);
        studentEC.printChaining();
        studentLP.printLinearProbing();
    }
}
