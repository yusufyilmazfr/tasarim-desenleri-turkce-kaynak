import {FileDataSource} from "./file-data-source";
import {CompressionDecorator} from "./compression-decorator";

function main() {
  const dataSource = new FileDataSource('data.sql');

  const compressedDataSource = new CompressionDecorator(dataSource);

  compressedDataSource.readData();
  compressedDataSource.writeData({});

  // output:
  //      data.sql readed.
  //      Data compressed.
  //      Compressed data was written to data.sql.
}
