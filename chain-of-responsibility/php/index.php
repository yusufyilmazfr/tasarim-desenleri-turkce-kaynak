<?php

$image = new Image("tatil-fotografim", "JPG");

$jpegHandler = new JPEGHandler();
$jpgHandler = new JPGHandler();
$customHandler = new CustomHandler();

// Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
// JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
$jpegHandler->setNextHandler($jpgHandler);
$jpgHandler->setNextHandler($customHandler);

$jpegHandler->handle($image); // output: JPG to PNG
