print"""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
"""

print"""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
"""

print"""
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""

int computerPoints = 0
int userPoints = 0

def choices = ['rock', 'paper', 'scissors']

while (true) {
    print "Choose one - Rock, Paper, Scissors (type 'q' to quit): "
    def userChoice = System.in.newReader().readLine().toLowerCase()

    // When user quits, it will display the final score
    if (userChoice == 'q') {
        println 'Game ended'
        println "Final Score -> You: ${userPoints} | Computer: ${computerPoints}"
        break
    }

    // When the user's choice did not choose rock paper scissors
    if (!choices.contains(userChoice)) {
        println 'Invalid choice! Choose rock, paper or scissors'
        continue
    }

    // Computer will randomly choose in list
    def computerChoice = choices[new Random().nextInt(choices.size())].toLowerCase()
    println "Computer chose ${computerChoice}"

    // Determine who will win
    if ((userChoice == 'rock' && computerChoice == 'scissors') || (userChoice == 'paper' && computerChoice == 'rock') ||
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
}
