from text_originator import TextOriginator

if __name__ == '__main__':
    text_originator = TextOriginator()
    text_originator.text = "asm"
    text_originator.cursor_position = 3

    # Anlık durum yığına ekleniyor.
    text_originator.save()

    text_originator.text = "asmi"
    text_originator.cursor_position = 4

    # Anlık durum yığına ekleniyor.

    text_originator.save()

    text_originator.text = "asmin"
    text_originator.cursor_position = 5

    # Anlık durum yığına ekleniyor.
    text_originator.save()

    # Yığındaki bir önceki duruma geçiyor.
    text_originator.undo()
    print(text_originator)

    # Yığındaki bir önceki duruma geçiyor.
    text_originator.undo()
    print(text_originator)

    # Yığındaki bir önceki duruma geçiyor.
    text_originator.undo()
    print(text_originator)

    """
    output:
    text: asmin, cursor position: 5
    text: asmi, cursor position: 4
    text: asm, cursor position: 3
    """
