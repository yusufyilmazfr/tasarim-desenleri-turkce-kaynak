import database

def main():
    first_instance_request = database.Database()
    second_instance_request = database.Database()

    is_equals = first_instance_request == second_instance_request

    print(f'Database referance is equals: {is_equals}')

if __name__ == '__main__':
    main()