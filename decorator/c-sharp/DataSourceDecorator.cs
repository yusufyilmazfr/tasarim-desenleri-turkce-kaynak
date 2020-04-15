using System;
using System.Collections.Generic;
using System.Text;

namespace Decorator
{
    // UML diyagramındaki Component (IDataSource) arayüzünü uygular.
    // Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
    // Bu sınıftan türeyen sınıfların uygulamasını, değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
    // UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
    abstract class BaseDataSourceDecorator : IDataSource
    {
        protected IDataSource dataSource;

        public BaseDataSourceDecorator(IDataSource dataSource)
        {
            this.dataSource = dataSource;
        }

        public abstract string GetFileName();

        public abstract void ReadData();

        public abstract void WriteData(object data);
    }
}
