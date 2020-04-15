using System;
using System.Collections.Generic;
using System.Text;

namespace Decorator
{
    // Yeni davranışların tanımlandığı sınıftır.
    // UML diyagramındaki BaseDecorator (BaseDataSourceDecorator) sınıfından türer.
    // UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.
    class ComporessionDecorator : BaseDataSourceDecorator
    {
        public ComporessionDecorator(IDataSource dataSource) : base(dataSource)
        {
        }

        public override string GetFileName()
        {
            return base.dataSource.GetFileName();
        }

        public override void ReadData()
        {
            // Veriyi okurken referansını tuttuğumuz sınıfın kendi davranışını sergilemesini istiyoruz.
            base.dataSource.ReadData();
        }

        public override void WriteData(object data)
        {
            // Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
            Console.WriteLine("Data compressed.");

            // Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
            Console.WriteLine($"Compressed data was written to {base.dataSource.GetFileName()}.");
        }
    }
}
