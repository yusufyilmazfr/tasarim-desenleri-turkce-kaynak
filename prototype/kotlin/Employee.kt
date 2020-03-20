package Prototype

// Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız arayüzü uyguladık.
class Employee : CloneablePrototype<Employee> {
    var firstName: String
    var lastName: String

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}