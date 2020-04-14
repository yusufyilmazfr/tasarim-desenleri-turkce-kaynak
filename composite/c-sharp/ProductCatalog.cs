using System;
using System.Collections.Generic;
using System.Text;

namespace Composite
{
    // Somut yapımızdır.
    // UML diyagramındaki Composite kısmına denk gelmektedir.
    // Component (ICatalogComponent) listesi tutmaktadır.
    public class ProductCatalog : ICatalogComponent
    {
        private string _name;

        private List<ICatalogComponent> _components;

        public ProductCatalog(string name)
        {
            _name = name;
            _components = new List<ICatalogComponent>();
        }

        public void Add(ICatalogComponent catalogComponent)
        {
            _components.Add(catalogComponent);
        }

        public void Remove(ICatalogComponent catalogComponent)
        {
            _components.Remove(catalogComponent);
        }

        public void DrawHierarchy()
        {
            Console.WriteLine(_name);
            foreach (ICatalogComponent component in _components)
            {
                component.DrawHierarchy();
            }
        }
    }
}
