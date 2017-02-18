<?php
$codeClass = "";
$langDefList =  json_decode(file_get_contents("languageDefinitions.json"));
$index = json_decode(file_get_contents("index.json"));

$filter = ["es6-promise.js", "rx.java", "csharp.cs", "kotlin-co.kt"];

$i = 0;
$j = 0;
foreach ($index as $pattern) {
    $i++;
    echo ("\n<!-- PATTERN START: --->\n");
    echo ("<p><h3 style='display:inline-block'>" . $pattern->patternName . "</h3>\n");
    $groupName = "group" . $i;
    echo "<div class=\"tabbed\">";
    $checked = "checked";

    foreach ($langDefList as $langDef) {
        if (!in_array($langDef->filename, $filter)) continue;
        $j++;
        $fullPath = $pattern->path . "/" . $langDef->filename;
        if (!file_exists($fullPath)) continue;
        $code = file_get_contents($fullPath);
				$code = str_replace("<", "&lt;", $code);
				$code = str_replace(">", "&gt;", $code);

        // Output
        $tabId = "tabbed$j";
        $tabTitle = $langDef->name;
        $langDefName = $langDef->wordPressLangName;
        ?>
            <input name='<?=$groupName?>' id='<?=$tabId?>' type='radio' <?=$checked?>>
            <section>
                <h5><label for='<?=$tabId?>'><?=$tabTitle?></label></h5>
                <div>
                    <pre><code class="<?=$langDefName?>"><?=$code?></code></pre>
                </div>
            </section>
        <?php
        $checked = "";
    }
    echo '</div></p>';
}




