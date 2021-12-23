from person import Person
from authenticatable_mask_order_proxy import AuthenticatableMaskOrderProxy

if __name__ == '__main__':
    tugce = Person("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz")
    orderable_mask = AuthenticatableMaskOrderProxy()
    orderable_mask.create_order(tugce)
