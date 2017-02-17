<?php
$mainHeader = "h3";
$subHeader = "h4";
$codeClass = "";
$langDefList =  json_decode(file_get_contents("languageDefinitions.json"));
$index = json_decode(file_get_contents("index.json"));

$filter = ["es6-promise.js", "rx.java", "csharp.cs"];

foreach ($index as $pattern) {
    echo ("<$mainHeader>" . $pattern->patternName . "</$mainHeader>\n");

    foreach ($langDefList as $langDef) {
        if (!in_array($langDef->filename, $filter)) continue;
        $fullPath = $pattern->path . "/" . $langDef->filename;
        if (!file_exists($fullPath)) continue;
        echo ("<$subHeader>" . $langDef->name . "</$subHeader>\n");
        echo "<pre>[code language=\"". $langDef->wordPressLangName ."\"]\n";
        $code = file_get_contents($fullPath);
        echo $code;
        echo "[/code]</pre>\n\n\n";
    }
}




