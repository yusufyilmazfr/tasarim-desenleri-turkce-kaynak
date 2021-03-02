<?php

namespace Builder;

use Builder\Lesson;

// UML diyagramındaki Product'a denk gelen Lesson sınıfına ait nesnenin oluşturulması için soyut arayüz sağlar.
// Yapılması gereken adımlar içerisinde tanımlıdır.
abstract class LessonBuilder
{
    public Lesson $lesson;

    public abstract function getLesson();
    public abstract function applyDiscount();
    public abstract function addLessonNote();
    public abstract function getResult(): Lesson;
}
