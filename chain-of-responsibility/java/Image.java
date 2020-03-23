package ChainOfResponsibility;

// Uygulama süresince resimlerimizi temsil edecek sınıf.
class Image {
    public String name;
    public String extension;

    public Image(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }
}