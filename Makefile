Guesser.class: Guesser.java
	javac -g Guesser.java

run: Guesser.class
	java Guesser

debug: Guesser.class
	jdb Guesser

clean:
	rm -f *.class
