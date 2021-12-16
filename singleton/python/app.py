from database import Database

if __name__ == '__main__':
    con_1 = Database()
    con_2 = Database()
    print(f"Check value of id's is the same or not: {id(con_1)} - {id(con_2)}")
