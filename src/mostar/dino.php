<?php

namespace Debugging3\JetBrains;

use Composer\Autoload\ClassLoader;

$name = 'Maarten';
$fruits = array('apple', 'pear', 'lemon');
$currentFruit = '';

foreach ($fruits as $fruit) {
    echo $name . " likes " . $fruit . "\r\n";

    $currentFruit = $fruit;
}
