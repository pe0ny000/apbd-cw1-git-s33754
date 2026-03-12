"# apbd-cw1-git-s33754" 
1.Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?
Fast-forward występuje gdy main nie miał nowych commitów od rozgałęzienia Merge commit powstaje gdy obie gałęzie miały nowe commity i Git musi połączyć dwie linie historii w jeden nowy commit z dwoma rodzicami.

2.Czym w praktyce różni się merge od rebase?
Merge zachowuje pełną historię rozgałęzień i tworzy merge commita, rebase przepisuje commity z gałęzi feature tak jakby powstawały po zmianach na main, dając liniową historię.

3.W jaki sposób został rozwiązany konflikt w Twoim repozytorium
Konflikt powstał w metodzie CalculateMin na feature-conflict zmieniono nazwę zmiennej na minimum, a na main zmieniono treść komunikatu wyjątku. Rozwiązano go świadomie łącząc obie zmiany: zachowano nowy komunikat z main oraz nową nazwę zmiennej z feature-conflict.
