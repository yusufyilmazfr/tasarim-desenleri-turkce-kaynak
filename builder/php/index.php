<?php

use Builder\NewStudentLessonBuilder;
use Builder\LessonDirector;

$lessonBuilder = new NewStudentLessonBuilder();

$lessonDirector = new LessonDirector($lessonBuilder);
$lessonDirector->make();

$lesson = $lessonBuilder->getResult();

echo $lesson->name ." - ". $lesson->price ." - ". $lesson->discountedPrice;
