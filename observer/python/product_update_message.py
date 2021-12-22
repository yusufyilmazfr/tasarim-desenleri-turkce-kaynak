# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
class ProductUpdateMessage:
    product_name: str
    message: str

    def __str__(self):
        return f"{self.product_name} updated. Message: {self.message}"
