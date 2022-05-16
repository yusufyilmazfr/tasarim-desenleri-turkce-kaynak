package Adapter

// Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede IJsonSerializer'i uygulayan bir sınıf örneği istendiğinde
// bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlanır.
// UML diyagramındaki Adapter'a denk gelmektedir.
internal class CustomSerializerAdapter : IJsonSerializer {
    override fun serializeObject(obj: Any): String {
        val customSerializer = CustomSerializer()
        return customSerializer.serialize(obj)
    }
}
