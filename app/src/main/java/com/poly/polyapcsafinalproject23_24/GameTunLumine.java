package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameTunLumine extends GameActivity {

    // -------------------------------------- Public Class --------------------------------------

    //instance variables
    //   variables you plan to use throughout the adventure

    private int option;
    private boolean hasVial;
    private boolean hasBible;
    private boolean hasLance;
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("some priest game");
        tvSubtitle.setText("characters are ooc but i don't care for storytelling i just want an A in this class");

        String text = "some priest game\nas of may 5th 2024 i am coding this with a terrible stomach ache but i am thugging it out";
        tvStoryText.setText(text);
        start();
    };

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        // -------------------------------------- Story Prologue --------------------------------------


        String text = "???: \"Wake up...\""
                +"\nA droplet falls, landing on the hazy reflection of a priest looking back with sullen eyes."
                +"On top of that reflection was another priest, younger and a bit uglier in comparison."
                +"Is that rude to say? He's crying right now, but I don't think that stops me from calling him ugly."
                +"Draven: \"Waaah... You're stuck...\""
                +"Draven: \"You're stuck and I can't get you out!!! That pisses me off so much!!\""
                +"Is he stupid?"
                +"???: \"Can you wake up?\""
                +"Draven: \"Huh?\""
                +"Huaxu: \"WAKE UPPPPPPPPPPP\""
                +"Draven: \"$*@#&($(#$&*@#?!??@!\""
                +"Draven: \"Ouch?? I'm awake, stop-\""
                +"Huaxu: \"You stupid oaf. You slept through the entire prayer and you not being there caused the church to explode.\""
                +"Huaxu pulls Draven out of his bed and drags him towards his balcony."
                +"Draven: \"You're overexaggerating, the church couldn't have possibly explo-\""
                +"*fire crackling*"
                +"Draven: \"oh\""
                +"Draven: \"damn\""
                +"Huaxu: \"We're going to Lake Magia to get supplies. You're going to help me rebuild it.\"";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("I am not doing that.");
        btn2.setText("ok fine");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { endingOne(); }
        });









    // voids
        private void endingOne()
        {
            String text = "Draven: \"I am not doing that.\""
                    +"Draven: \"I'd rather throw myself headfirst into a wood chipper than rebuild the church again.\""
                    +"Huaxu: \"Suit yourself then.\""
                    +"Huaxu kicks Draven off the balcony."
                    +"ending 1: stupid oaf falls and dies";

            tvStoryText.setText(text);

            setAllBtnsVisible();
            btn1.setText("go back?");
            btn2.setText("back to title :/");
            btn3.setVisibility(View.INVISIBLE);
        }



    // options are DOWN THERE!!! BELOW THE TEXT!!! modify those into simple game mechanics like Walk. Sit. thats all



        System.out.println("Draven: \"ok fine\"");
        System.out.println("Huaxu: \"Good boy. Get yourself ready, I'll be waiting outside.\"");
        System.out.println("Huaxu jumps off the balcony.");




        System.out.println(TextColor.YELLOW + "\"Actually, you've never told me your name.\"" + TextColor.RESET);
        System.out.println(" ");

        System.out.println("The mortal pauses for a bit after grabbing his clothes, taking a few seconds to remember his name.");
        System.out.println("\"Keith.\"");
        System.out.println(" ");


        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Last name?\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Is that important to know?\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Please? We've known each other since forever and just now have I properly gotten the chance to talk to you.\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Because you've now fully gained your consciousness.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Exactly. So...\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"No.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("You let out a loud sigh from Keith's dismissiveness and turn back to your pile of clothes. What are you going to wear today?");
        System.out.println(" ");
        System.out.println("1. Gold Adorned Priest");
        System.out.println();
        option = Util.enterInt(1, 1);

        Util.clearConsole();
        System.out.println("\"Are you ready to go?\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("1. Why do you want me to go with you? \n2. I'm ready.");
        System.out.println();
        option = Util.enterInt(1, 2);
        if (option == 1)
        {
            Util.clearConsole();
            System.out.println(TextColor.YELLOW + "\"Why do you want me to go with you?\"" + TextColor.RESET);
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println("\"Hm.. Because you’re my favorite creation to be around.\"");
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println(TextColor.YELLOW + "\"Really?\"" + TextColor.RESET);
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println("\"Yeah. Take that however you want.\"");
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println("You haven’t been conscious for long, but you can tell that he’s not that good at talking to other people yet. Aside from that, you feel a bit warm from the minor praise. Keith walks past you and leaves the bathroom.");
            System.out.print("The two of you leave the apartment behind and begin heading straight for the temple.");

            System.out.println(" ");
            System.out.println(" ");
            Util.pauseConsole();

        }
        if (option == 2)
        {
            Util.clearConsole();
            System.out.println(TextColor.YELLOW + "\"I'm ready.\"" + TextColor.RESET);
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println("Keith nods, and calmly escorts you out.");
            System.out.print("The two of you leave the apartment behind and begin heading straight for the temple.");

            System.out.println(" ");
            System.out.println(" ");
            Util.pauseConsole();
        }
        Util.clearConsole();
        System.out.println("As the two of you exit, you notice how large the world around you looks, and how empty it is outside of the building. Everything around you feels cold, unstable, and barren, along with a looming feeling that something may pop out and attack you from beneath the ground, which cracks with every step you take.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("You look over at Keith, who bears a solemn and unwavering expression. With his walking posture being so dignified despite the ground breaking beneath him, you wonder if this is something he has already done with someone else before.");
        System.out.print("Thinking about him releases a slight warmth in your chest.");

        System.out.println(" ");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("The ground hardens and increasingly becomes stable, the energy you and Keith are exhibiting as you physically move is transferring itself to the environment. Approaching the sacred temple, you pause and take a few seconds to process the decaying, nature-ridden grove encasing your view.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.RED_BOLD + "Vices " + TextColor.RED + "In Exchange For " + TextColor.CYAN_BOLD + "Divinity" + TextColor.RESET + ": Prologue Complete");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.WHITE_BOLD + "Goal" + TextColor.RESET + ": Collect the following Medallions to power the Sacred Cathedral:");
        System.out.println("- Vial of Tears");
        System.out.println("- Documents of the Puppeteer's Scriptures");
        System.out.println("- Magic-Infused Lance");
        System.out.println("- Gold Adorned Cross");

        System.out.println(" ");
        System.out.println(" ");
        Util.pauseConsole();
        selection();
    }

    // -------------------------------------- Prologue END --------------------------------------

    // Choosing Route
    // IMPORTANT NOTE: Zen Garden and Fragment-Ridden Fountain are currently unplayable routes. It will be finished later though.....
    private void selection()
    {
        Util.clearConsole();
        System.out.println("You've entered the sacred temple. Where would you like to go through first?");
        System.out.println("1. The Grove's Surface \n2. Zen Garden (Unfinished) \n3. Fragment-Ridden Fountain (Unfinished) \n4. Puppet Effigies");
        System.out.println();
        option = Util.enterInt(1, 4);
        if (option == 1)
        {
            route1();
        }
        if (option == 2)
        {
            route2();
        }
        if (option == 3)
        {
            route3();
        }
        if (option == 4)
        {
            route4();
        }
    }
    // -------------------------------------- Route 1: Vial of Tears --------------------------------------
    private void route1()
    {
        System.out.println("Choose your path.");
        System.out.println("1. Turn left. \n2. Turn right.");
        System.out.println();
        option = Util.enterInt(1,2);
        if (option == 1)
        {
            System.out.println("Continue your path.");
            System.out.println("1. Head forward. \n" + TextColor.RED + "2. Turn left." + TextColor.RESET);
            System.out.println();
            option = Util.enterInt(1,2);
            if (option == 1)
            {
                System.out.println("The two of you venture further into the grove, eventually finding a thin path of realm fragments.");
                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"What is that...\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("A larger fragment appears in front of you. The magic within the fragment glows intensely, and soon disintergrate itself into the ground.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("The realm strengthens. Don't forget what you're looking for, time to find a new path.");
                System.out.println(" ");
                Util.pauseConsole();
                selection();
            }
            else
            {
                Util.clearConsole();
                System.out.println("You feel like you've strayed a bit too far into the grove. You've hit a dead end.");
                System.out.println("\"Try your best not to get us lost again.\"");
                System.out.println();
                Util.pauseConsole();
                selection();
            }

        }
        // second option VVV
        if (option == 2)
        {
            System.out.println("Continue your path.");
            System.out.println("1. Turn left. \n" + TextColor.YELLOW + "2. Head forward." + TextColor.RESET);
            System.out.println();
            option = Util.enterInt(1,2);
            if (option == 1)
            {
                Util.clearConsole();
                System.out.println("\"It's not much, but how do you like the grove?\"");
                System.out.println();
                System.out.println("1. It's very calming. \n2. The atmosphere is odd.");
                option = Util.enterInt(1,2);

                if (option == 1)
                {
                    Util.clearConsole();
                    System.out.print(TextColor.YELLOW + "\"It's very calming.\"" + TextColor.RESET);
                    System.out.println();
                    Util.pauseConsole();

                    Util.clearConsole();
                    System.out.println("\"I'm glad you think so. It took a bit of time recreating the former realm with just me and the fragments.\"");
                    System.out.println(" ");
                    Util.pauseConsole();

                    Util.clearConsole();
                    System.out.println(TextColor.YELLOW + "\"You've recreated the realm by memory, right?\"" + TextColor.RESET);
                    System.out.println(" ");
                    Util.pauseConsole();

                    Util.clearConsole();
                    System.out.println("\"Yeah. It's not that accurate but I much prefer it like this.\"");
                    System.out.println(" ");
                    Util.pauseConsole();

                    Util.clearConsole();
                    System.out.println("\"Do you know why, Draven?\"");
                    System.out.println(" ");
                    Util.pauseConsole();

                    System.out.println("1. ...... \n2. You didn't like the previous mortals.");
                    option = Util.enterInt(1,2);
                    if (option == 1)
                    {
                        keithtalk1();
                    }
                    else
                    {
                        keithtalk2();
                    }
                }
                else
                {
                    Util.clearConsole();
                    System.out.println("\"I guess so. It's not that accurate but I much prefer it like this.\"");
                    System.out.println(" ");
                    Util.pauseConsole();

                    Util.clearConsole();
                    System.out.println("\"Do you know why, Draven?\"");
                    System.out.println(" ");
                    Util.pauseConsole();

                    System.out.println("1. ...... \n2. You didn't like the previous mortals.");
                    option = Util.enterInt(1,2);
                    if (option == 1)
                    {
                        keithtalk1();
                    }
                    else
                    {
                        keithtalk2();
                    }

                }
            }
            else
            {
                Util.clearConsole();
                System.out.println("You walk across a path with small fragments scattered all over the flat, low-grass ground. The more you look around, the farther the amount of fragments seem to surround you. If you manage to step on one, it disintergrates into the ground.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("You jump, stomp, and softly kick the fragments in small groups. The shrill sound it makes when you interact with it makes you happy, and now the concept of entertainment is now engraved in your system.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("Suddenly, you kick a fragment that immediately disintergrates and forms into a closed, full vial.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "You've obtained Vial of Tears." + TextColor.RESET);
                System.out.println(" ");
                this.hasVial = true;
                Util.pauseConsole();

                if (this.hasVial == true && this.hasBible == true && this.hasLance == true && this.hasCross == true)
                {
                    end();
                }
                if (this.hasVial == true && this.hasBible == false && this.hasLance == false && this.hasCross == false)
                {
                    selection();
                }
            }
        }

    }
    // -------------------------------------------------------------------------------
    // the section where keith talks about whatever
    private void keithtalk1()
    {
        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"......\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"null.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"null.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Just like that?!\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Since you're here, I'll eventually have the power to recreate an entire population off of my magic and our energy. A population that will worship my... our every move.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"That means I'm glad you're here with me, Draven.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("The slight hesitation that came with regarding you made you question if he's actually happy to have your help or not. You decide not to question him and accept the praise.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Let's not get too off track. We haven't found what we were looking for yet.\"");
        System.out.println(" ");
        Util.pauseConsole();
        selection();
    }
    private void keithtalk2()
    {
        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"null.\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"null.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"null.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Just like that?!\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Since you're here, I'll eventually have the power to recreate an entire population off of my magic and our energy. A population that will worship my... our every move.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"That means I'm glad you're here with me, Draven.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("The slight hesitation that came with regarding you made you question if he's actually happy to have your help or not. You decide not to question him and accept the praise.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Let's not get too off track. We haven't found what we were looking for yet.\"");
        System.out.println(" ");
        Util.pauseConsole();
        selection();
    }
    // -------------------------------------- Route 2: DOTPS --------------------------------------
    private void route2()
    {
        Util.clearConsole();
        selection();
        // keithtalk concept = about keith and his involvement with the puppeteers
    }

    // -------------------------------------- Route 3: Magic-Infused Lance --------------------------------------
    private void route3()
    {
        Util.clearConsole();
        selection();
        // keithtalk concept = about the creation of the realm & the previous realm
    }

    // -------------------------------------- Route 4: Gold-Adorned Cross --------------------------------------

    private void route4()
    {
        System.out.println("Choose your path.");
        System.out.println("1. Lead the way. \n2. Follow the leader, maybe take a break?");
        System.out.println();
        option = Util.enterInt(1,2);

        if (option == 1)
        {
            Util.clearConsole();
            System.out.println("The roughness of the broken concrete ground aches your feet. In front of you stands five different statues, each representing unfamiliar puppet-like figures similar to Keith. If you were to investigate each one of them, surely you'd find something of interest.");
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println("Choose wisely.");
            System.out.println("1. Effigy 1\n2. Effigy 2\n3. Effigy 3\n4. Effigy 4\n5. Effigy 5");
            System.out.println();
            option = Util.enterInt(1,5);
            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Within a small crevice inside a puppet's statue, you find a cross-shaped material tucked inside of it.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "You've obtained Gold Adorned Cross." + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();
                this.hasCross = true;
                if (this.hasVial == true && this.hasBible == true && this.hasLance == true && this.hasCross == true)
                {
                    end();
                }
                if (this.hasVial == true && this.hasBible == false && this.hasLance == false && this.hasCross == true)
                {
                    selection();
                }
            }
            if (option == 1)
            {
                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"This statue creeps me out. Wait, that's new. I've never felt this odd before.\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("\"It is really dry here too, maybe you're not used to it yet.\"");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"That would just make things worse for me!\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("A strong crack forms on the statue at the slightest touch, and you back away out of shock. A fragment, none you've ever seen before suddenly bursts out of it. It has a distinctive rainbow hue instead of the usual gray ones. Keith stares at the glowing fragment for a brief second before turning over to you.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("\"Draven, have you heard of Super Sm... Huh.\"");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("\"I forgot what I was going to say.\"");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"My interest is sorta peaked, I'll probably check it out later.\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();
                selection();
            }
            else
            {
                Util.clearConsole();
                System.out.println("You investigate the statue, but nothing happened. Do something else?");
                System.out.println(" ");
                Util.pauseConsole();
                selection();
            }
        }
        else
        {
            keithtalk3();

            Util.clearConsole();
            System.out.println("The roughness of the broken concrete ground aches your feet. In front of you stands five different statues, each representing unfamiliar puppet-like figures similar to Keith. If you were to investigate each one of them, surely you'd find something of interest.");
            System.out.println(" ");
            Util.pauseConsole();

            Util.clearConsole();
            System.out.println("Choose wisely.");
            System.out.println("1. Effigy 1\n2. Effigy 2\n3. Effigy 3\n4. Effigy 4\n5. Effigy 5");
            System.out.println();
            option = Util.enterInt(1,5);
            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Within a small crevice inside a puppet's statue, you find a cross-shaped material tucked inside of it.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "You've obtained Gold Adorned Cross." + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();
                this.hasCross = true;
                if (this.hasVial == true && this.hasBible == true && this.hasLance == true && this.hasCross == true)
                {
                    end();
                }
                if (this.hasVial == true && this.hasBible == false && this.hasLance == false && this.hasCross == true)
                {
                    selection();
                }
            }
            if (option == 1)
            {
                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"This statue creeps me out. Wait, that's new. I've never felt this odd before.\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("\"It is really dry here too, maybe you're not used to it yet.\"");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"That would just make things worse for me!\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("A strong crack forms on the statue at the slightest touch, and you back away out of shock. A fragment, none you've ever seen before suddenly bursts out of it. It has a distinctive rainbow hue instead of the usual gray ones. Keith stares at the glowing fragment for a brief second before turning over to you.");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("\"Draven, have you heard of Super Sm... Huh.\"");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println("\"I forgot what I was going to say.\"");
                System.out.println(" ");
                Util.pauseConsole();

                Util.clearConsole();
                System.out.println(TextColor.YELLOW + "\"My interest is sorta peaked, I'll probably check it out later.\"" + TextColor.RESET);
                System.out.println(" ");
                Util.pauseConsole();
                selection();
            }
            else
            {
                Util.clearConsole();
                System.out.println("You investigate the statue, but nothing happened. Do something else?");
                System.out.println(" ");
                Util.pauseConsole();
                selection();
            }
        }
    }
// -------------------------------------------------------------------------------

    private void keithtalk3()
    {
        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"I feel a bit bothered by the lack of wind here.\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Like, the area is cool here and everything, but I'm starting to get unnerved, y'know?\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"You feel it too, right?\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"I'm not that convinced it is.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Huuuuh.... Seriously??? Actually, you're like God and everything, so I'm not surprised it doesn't bother you as much.\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("The duo goes silent for a brief moment, and Keith stops in his tracks.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"What are you doing?\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Trying to generate a small breeze in this area using the realm's current amount of energy.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("A short gust of air passes by them, causing you to be slightly pushed back from where you're standing. Keith remains poise in comparison.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("You kinda feel like a loser in this situation right now. Keith turns over to you with a small smirk plastered on his face.");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"A SMALL breeze of air??? What did you do??\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Tried to get a reaction out of you, that's what.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"Y'know, I've actually been very impressed with how you turned out as a vessel, Draven.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"You've only been alive for a few days yet you've been so responsive. For my first vessel, you've adapted quite well with the realm.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("\"I'm looking forward to spending more time like this with you.\"");
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println(TextColor.YELLOW + "\"Don't try to butter me up after you made me fall down like that.\"" + TextColor.RESET);
        System.out.println(" ");
        Util.pauseConsole();

        Util.clearConsole();
        System.out.println("You excessively hop up from the ground and dust yourself off, not before tumbling and falling back down on the ground again - face ");
        System.out.println(" ");
        Util.pauseConsole();
    }

// ----------------------------------------------------------------------

    private void end()
    {
        System.out.println(TextColor.WHITE_BOLD + "FUCK you for playing i hate this game");
        System.out.println();
        System.out.println("and i hate you too");
    }

}