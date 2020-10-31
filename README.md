# CSA-Portfolio

By Alex Titov, Andrew Pu, Sean Rollins, Eyaad Mir, and Neil Sahai


This portfolio is composed of a set of minilabs, which allow you to earn money in order to "buy" different functions of our calculator. 

Progress:

As of now, we have created our individual mini labs that we will integrate together for our final project. Last week, we had minilabs but we did not have a clear plan on how to put these together. Now, we have a full plan on how we are going to put together all of our assignments.

    Eyaad - Store
  
    Neil - ATM
    
    Andrew, Sean, Alex - Games
  
    Alex - Email receipt, XML file, and storing data
   
## Week 8 - Scrum Master Grades
Contributor | Grade (Out of 5) | Reasoning (Code Snippets Labelled in Project)
----------- | --------------------- | ---------------------------------------------
Neil Sahai | 5/5 | He worked on connecting his ATM to the [Main menu](https://github.com/alextitov19/CSA-Portfolio/blob/3e8eb7b29831f7b04d8b3398f58ac66254a12e15/src/Menu/MenuUI.java#L61) and he also added to the ATM.java file by creating the [main panel](https://github.com/alextitov19/CSA-Portfolio/blob/e144b5ac0077c6de00be99166d22e07244117647/src/ATM/ATM.java#L84) from where after you login, you deposit and withdraw money. He also added the logic to the [deposit and withdraw functions](https://github.com/alextitov19/CSA-Portfolio/blob/67655c410af48ecd705aa6327d9c2ffc20e38fba/src/ATM/ATM.java#L138) and made sure that the operations within the ATM are working with their intentded purposes. To use the ATM, the user logs in using the username CSA and the password test. Next week, he will be working with the group on integrating projects together with a global persistent variable money which will connect all of our code.
Eyaad Mir | 5/5 | I connected my store to the [Main menu](https://github.com/alextitov19/CSA-Portfolio/blob/3e8eb7b29831f7b04d8b3398f58ac66254a12e15/src/Menu/MenuUI.java#L55)















10/23/2020

Compendium of various mini-labs for AP CSA.

All of the labs are located in \CSA-Portfolio\src\. You can find the labs and run them here.

<b>Andrew Pu: (4/5)</b>

Goal: This week I plan on creating a higher or lower game where the user
predicts whether the next randomly generated number will be higher or lower
than the previous number. I am going to try to create the GUI through code
and without the physical form file.

My code for this week is in CSA-Portfolio\src\Games\HighLow

Completion: I manually created a higher/lower game where the user guesses
if the next number will be higher or lower than the last. I first learned
how to manually create a GUI (without a form file). I created the components
(<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L14">line 14</a>;
<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L118">line 118</a>),
specified their constraints 
(<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L160">line 160</a>),
and added them to the panel
(<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L129">line 129</a>).
Then I added action listeners for the buttons and the logic for the game
(<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L34">line 34</a>;
<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L180">line 180</a>).
At the end of the week, I also
learned how to set fonts
(<a href = "https://github.com/alextitov19/CSA-Portfolio/blob/2cb6a17fcfb3a25c4151ea12d7968ca5fd542570/src/Games/HighLow.java#L138">line 138</a>).

Overall, I would give myself a 4/5 because I completed my goals, but I
do them exceptionally well. I should've started my project earlier in the
instead of procrastinating until Wednesday. I also think my project was
pretty basic and I could have put in a lot more detail.


Alex Titov: (5/5)

This week I was able to complete both of the labs I set out to complete. The graphing calculator was an interesting concept and I decided to go at it without looking up someone else’s calculator and simply copying that. I decided to create an array in order to store the x and y coordinates for N amount of data points. I devised a formula that would calculate the y coordinates based on the given x input. The user also has an amount of variables they can alter, essentially making possible to graph most of the exponential functions. I could not figure out how to add labels in time and neigher how to center the graph, so it will look quite odd. 
The gmail lab was pretty simple. Most of the time was spent learning and finding the jar files. The tricky thing was, one of those files was no longer available to the proper website so I had to sneak around github and sort of pirate it off of someone else’s project. Apart from that, the lab was quite easy. I ended up looking up quite a bit of tutorials just because this code is very nuanced and there is a procedure of things you have to add to the code that I’ve never used before. This lab was probably my favorite java thing I’ve done so far just because it is actually useful. Unlike printing ascii art or making a simple calculator, this lab can actually send emails. Most likely no one will ever use it because you have to disable all of your security features on your gmail account in order to run it, but that’s besides the point.

Eyaad Mir: (4/5)

This week we started our individual projects while finishing up the calculator. For me, I worked on my store project. Even though we started last week, I wasn't used to Intellij so I watched some videos online to figure out how to program my GUI. While I finished my GUI, I did not have any code behind my buttons, which I think I should have done. I would give myself a 4/5.

Neil Sahai: (4/5)
This week I began to develop my individual mini project. My project intent over these next few weeks is to develop and login, deposit, and withdraw functions which a user can use after logging in to save their money. This week I began to develop the login function. This started with me building the necessary components to do so. This included the JFrame, JPanel, userfield, userlabel, passwordfield, passlabel, update label, and the login label. This is seen in the journal. After doing that part, I had to position the pieces and set the dimensions for them. This built up the main part of the GUI and the location of where the parts were. Finally, I added the logic behind the login button to make sure that the currently only username and password is accurate and did this by using an if else statement. I was having issues connecting the logic to the button, so I will have to work on this next week. This was also from where I got my AHA moment as I realized that getText() was not working for the password field. As a result, I had to do research, and I found out that you have to use the valueOf option as the password field is encrypted. My goals for the next week is to finish up the login UI and add a new user function to it and begin on the main UI where you deposit and withdraw. All in all, I would give myself a 4/5 this week as I was able to accomplish a lot but I could have done more.

Sean Rollins (4/5)
I got started with my animals minilab. The goal for this minilab is to adapt our previous animals group lab to a gui, using MVC principles, where the model is unchanged, but the view and control are changed. This week I worked on the view aspect of it. I created the GUI to be split between a display on the right, and buttons on the left for which animals to show, and in what quantity. I created a skeleton for this via IntelliJ Swing GUI, though it took me long to do so because I was not really familiar with GUI design(for the calculator, my partner did  all the gui, while my work was 100% backend). I only got started after various tutorials regarding Swing UI designer. There are some button listeners for some animals, but they only function by changing the label text on the right side, indicating the selected animal. I want to be able to work more on the view part next week. Mainly, I want to: add color to the program, and make the program able to display (multiple) images of animals instead of text. I would also hope to get part of the control done which allows the user to control the quantity of animals being printed.

