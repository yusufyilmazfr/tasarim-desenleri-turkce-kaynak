class CustomSerializer:
    """
    Sisteme daha sonradan dahil olan yapı.
    Sistemin kullandığı arayüzü uygulamamaktadır.
    UML diyagramındaki Adaptee'ye denk gelmektedir.
    """

    def serialize(self, obj):
        """
        Gelen nesneyi serilize etmek için temel operasyonel işlemler..
        Daha sonradan da gerekli değerin geri döndürülmesi...
        """
        return "serialized with CustomSerializer"
