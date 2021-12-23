from employee import Employee

if __name__ == '__main__':
    gulizar = Employee("Gülizar", "Yılmaz")
    clone_gulizar = gulizar.clone()

    print(gulizar == clone_gulizar)
