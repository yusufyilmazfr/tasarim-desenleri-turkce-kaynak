package Adapter;

// UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
interface IJsonSerializer {
    public String serializeObject(Object obj);
}