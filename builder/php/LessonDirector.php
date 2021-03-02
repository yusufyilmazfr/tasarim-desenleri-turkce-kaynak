<?php

namespace Builder;

use Builder\LessonBuilder;

// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
class LessonDirector
{
    private LessonBuilder $lessonBuilder;

    public function __construct(LessonBuilder $lessonBuilder)
    {
        $this->lessonBuilder = $lessonBuilder;
    }

    public function make()
    {
        $this->lessonBuilder->getLesson();
        $this->lessonBuilder->applyDiscount();
        $this->lessonBuilder->addLessonNote();
    }
}
