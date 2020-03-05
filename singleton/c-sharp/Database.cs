using System;
using System.Collections.Generic;
using System.Text;

namespace Singleton
{
    public class Database
    {
        private static Database database;

        private Database()
        {

        }

        public static Database GetInstance()
        {
            if (database == null)
            {
                var lockObject = new object();

                lock (lockObject)
                {
                    if (database == null)
                    {
                        database = new Database();
                    }
                }
            }

            return database;
        }
    }
}
