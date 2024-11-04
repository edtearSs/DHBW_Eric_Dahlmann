# FizzBuzz Kata

## Anforderungen
Schreibe eine Funktion, die die Zahlen von 1 bis 100 ausgibt. Dabei gelten folgende Regeln:

* Wenn die Zahl durch 3 teilbar ist, gib "Fizz" aus
* Wenn die Zahl durch 5 teilbar ist, gib "Buzz" aus
* Wenn die Zahl durch 3 und 5 teilbar ist, gib "FizzBuzz" aus
* In allen anderen Fällen gib die Zahl selbst aus

## Beispiele
```java
1       -> "1"
2       -> "2"
3       -> "Fizz"
5       -> "Buzz"
15      -> "FizzBuzz"
```

## Zusatzanforderungen

1. **Erweiterte Basisregeln**
   * Wenn die Zahl durch 7 teilbar ist, gib "Whizz" aus
   * Wenn die Zahl durch 11 teilbar ist, gib "Bang" aus
   * Die Ausgaben sollen kombiniert werden (z.B. "FizzWhizz" für Zahlen teilbar durch 3 und 7)

2. **Konfigurierbare Regeln**
   * Die Zahlen 3, 5, 7 und 11 sollen als Parameter übergeben werden können
   * Die Ausgabewörter "Fizz", "Buzz", "Whizz" und "Bang" sollen konfigurierbar sein

3. **Erweiterung der Logik**
   * Füge eine neue Regel hinzu: Wenn die Zahl eine 3 enthält, gib "Fizz" aus
   * Füge eine neue Regel hinzu: Wenn die Zahl eine 5 enthält, gib "Buzz" aus
   * Diese Regeln gelten zusätzlich zu den bestehenden Teilbarkeitsregeln