"# apbd-cw1-git-s33754" 

5.Gałąź feature-max wymagała prawdziwego merge commita, ponieważ zarówno main jak i feature-max miały nowe commity od momentu rozgałęzienia. Git musiał połączyć dwie różne linie historii i utworzył nowy commit z dwoma rodzicami.

6.Merge (feature-max)
Tworzy dodatkowy "merge commit" z dwoma rodzicami. Historia pokazuje rozgałęzienie - widać że gałęzie były rozwijane równolegle.

Rebase (feature-min)
Przepisuje commity z feature-min tak jakby powstawały po commicie na main. Brak merge commita i rozgałęzień. Łatwiejsza do czytania.