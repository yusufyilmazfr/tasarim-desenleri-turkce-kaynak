from json_serializer import JsonSerializer
from custom_serializer import CustomSerializer


class CustomSerializerAdapter(JsonSerializer):
    """
    Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
    Sistemin kullandığı arayüzü uygular.
    Bu sayede IJsonSerializer'i uygulayan bir sınıf örneği istendiğinde
    bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
    sağlanır.
    UML diyagramındaki Adapter'a denk gelmektedir.
    """

    def serialize_object(self, obj):
        custom_serializer = CustomSerializer()
        return custom_serializer.serialize(obj)
