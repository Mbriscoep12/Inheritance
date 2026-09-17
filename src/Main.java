void main() {
    Person P1 = new Person();

//    Person P2 = new Person(43,22,"Yellow","Jack",140);
//    IO.println(P2.name);

    Person P2 = new Person(43,22);
    IO.println(P2.name);

    Person P4 = P1.Call_Private();
}
