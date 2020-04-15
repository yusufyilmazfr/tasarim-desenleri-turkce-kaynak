using System;

namespace Decorator
{
    class Program
    {
        static void Main(string[] args)
        {
            IDataSource dataSource = new FileDataSource("data.sql");

            IDataSource compressedDataSource = new ComporessionDecorator(dataSource);

            compressedDataSource.ReadData();
            compressedDataSource.WriteData(new object());

            // output:
            //      data.sql readed.
            //      Data compressed.
            //      Compressed data was written to data.sql.
        }
    }
}
