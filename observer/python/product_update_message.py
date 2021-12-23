class ProductUpdateMessage:
    product_name: str
    message: str

    def __str__(self):
        return f"{self.product_name} updated. Message: {self.message}"
