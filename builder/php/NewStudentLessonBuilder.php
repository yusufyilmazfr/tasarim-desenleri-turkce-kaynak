<?php

namespace Builder;

use Builder\LessonBuilder;
use Builder\Lesson;

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
class NewStudentLessonBuilder extends LessonBuilder
{

    // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
    // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
    // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
    public function getLesson()
    {
        $this->lesson = new Lesson();
        $this->lesson->id = 1;
        $this->lesson->name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        $this->lesson->price = 49.99;
    }

    // Burada yeni öğrenciler için geçerli derste %50'lik bir indirim mevcut.
    public function applyDiscount()
    {
        $this->lesson->discountedPrice = $this->lesson->price *0.5;
        $this->lesson->discountedApplied = true;
    }

    public function addLessonNote()
    {
        $this->lesson->lessonNote = "Hey, welcome. Your discount code has been applied!";
    }

    public function getResult(): Lesson
    {
        return $this->lesson;
    }
}
