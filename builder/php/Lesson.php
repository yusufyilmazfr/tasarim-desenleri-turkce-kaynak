<?php

namespace Builder;

// UML diyagramındaki Product sınıfına denk gelmektedir.
// Farklı sunumları olan sınıfımız budur.
class Lesson
{
    public int $id;
    public string $name;
    public float $price;
    public float $discountedPrice;
    public bool $discountedApplied;
    public string $lessonNote;
}
