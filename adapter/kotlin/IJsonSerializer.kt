package Adapter

// UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
interface IJsonSerializer {
    fun serializeObject(obj: Any): String
}