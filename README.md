# Guesser

## Algorithms

### Guesser.java
Every method uses the same Scanner (input) for keyboard input.

#### main
- make a new Guesser

#### Guesser constructor
- set keepGoing to true
- loop while keepGoing
  - get a choice from menu
  - 0: set keepGoing to false
  - 1: humanGuesser
  - 2: computerGuesser
  - anything else: print invalid choice

#### menu
- print options 0 through 2
- read the choice as a string
- convert it to an int with Integer.parseInt
  - if it isn't a number, set choice to -1
- return the choice

#### humanGuesser
- pick a random target from 1 to 100
- set turns to 1
- loop until the guess is right
  - ask for a number and read it as a string
  - convert it with Integer.parseInt
    - if it isn't a number, print an error and ask again
  - if guess is less than target, print too low
  - if guess is more than target, print too high
  - otherwise print got it and stop looping
  - add 1 to turns
- print Very good

#### computerGuesser
- set low to 1, high to 100, and turns to 1
- loop until the user says correct
  - set guess to (low + high) / 2
  - print the guess
  - ask if it's too high, too low, or correct
  - h: set high to guess - 1
  - l: set low to guess + 1
  - c: stop looping
  - anything else: print an error and ask again
  - if low is greater than high, print an error and stop looping
  - add 1 to turns

## Extra
- Menu and human guesser don't crash on non-number input
- H, L, and C work in upper or lower case
- Computer guesser stops if the answers don't make sense instead of looping forever
