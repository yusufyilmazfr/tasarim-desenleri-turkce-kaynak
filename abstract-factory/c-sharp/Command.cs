using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    // Soyut sınıfımızdır.
    public abstract class Command
    {
        public abstract void ExecuteCommand(string query);
    }
}
