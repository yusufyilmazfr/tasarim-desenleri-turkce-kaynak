<?php

namespace Builder;

use Builder\LessonBuilder;
use Builder\Lesson;

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
class OldStudentLessonBuilder extends LessonBuilder
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

    // Burada eski öğrenciler için geçerli derste herhangi bir indirim yapılmadı.
    public function applyDiscount()
    {
        $this->lesson->discountedPrice = $this->lesson->price;
        $this->lesson->discountedApplied = false;
    }

    public function addLessonNote()
    {
        $this->lesson->lessonNote = "";
    }

    public function getResult(): Lesson
    {
        return $this->lesson;
    }
}
