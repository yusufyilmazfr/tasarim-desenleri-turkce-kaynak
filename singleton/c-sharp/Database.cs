using System;
using System.Collections.Generic;
using System.Text;

namespace Singleton
{
    public class Database
    {
        private static Database database;
        private static object lockObject = new Object();

        private Database()
        {

        }

        public static Database GetInstance()
        {
            if (database == null)
            {
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
