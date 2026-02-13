print """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
"""

print """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
"""

print """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""

int computerPoints = 0
int userPoints = 0
int raceToFinalPoints = 5

def choices = ['rock', 'paper', 'scissors']

while (true) {
    print "Choose one - Rock, Paper or Scissors (type 'q' to quit): "
    def userChoice = System.in.newReader().readLine().toLowerCase()

    // When user quit, it will display the final score
    if (userChoice == 'q') {
        println 'Game ended. You decided to quit.'
        println "Final Score -> You: ${userPoints} | Computer: ${computerPoints} \n"

        // If user quit message and who win the game
        if (userPoints > computerPoints) {
            print 'Congratulations! You won the game.'
        } else if (userPoints == computerPoints) {
            print "It's a tie. What a great game!"
        } else {
            print 'Better luck next time!'
        }
        break
    }

    // When the user did not choose rock paper scissors
    if (!choices.contains(userChoice)) {
        println 'Invalid choice! Choose rock, paper or scissors'
        continue
    }

    // Computer will randomly choose in list
    def computerChoice = choices[new Random().nextInt(choices.size())].toLowerCase()
    println "Computer choose ${computerChoice}"

    // Determine who will win the round
    if ((userChoice == 'rock' && computerChoice == 'scissors') ||
            (userChoice == 'paper' && computerChoice == 'rock') ||
            (userChoice == 'scissors' && computerChoice == 'paper')
    ) {
        println 'You win!'
        userPoints++
    } else if (userChoice == computerChoice) {
        println "It's a tie. No score!"
    } else {
        println 'Computer win!'
        computerPoints++
    }
    println "\n Current Score -> You: ${userPoints} | Computer: ${computerPoints}\n"

    // Race to final points (5 points)
    if (userPoints == raceToFinalPoints) {
        print "You reach ${raceToFinalPoints} points first. You win!"
        break
    } else if (computerPoints == raceToFinalPoints) {
        print "Computer reach ${raceToFinalPoints} points first. Computer win!"
        break
    }
}
