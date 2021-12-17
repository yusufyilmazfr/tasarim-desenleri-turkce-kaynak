# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 17.12.2021
from data_source import DataSource
from file_data_source import FileDataSource
from comporession_decorator import ComporessionDecorator

if __name__ == '__main__':
    data_source = FileDataSource("data.sql")
    compressed_data_source = ComporessionDecorator(data_source)
    compressed_data_source.read_data()

    # SYB: veri gönderimi önemli olmadığı için None ya da obje gönderilsin diye object() class'ından
    # bir instance gönderilmiştir.
    compressed_data_source.write_data(object())
    """
    output:
         data.sql readed.
         Data compressed.
         Compressed data was written to data.sql.
    """
