package itorchid.com.beautifulduwa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        textView= (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        if(bundle !=null)
        {
            toolbar.setTitle(bundle.getString("DUA"));
            if (toolbar.getTitle().toString().equalsIgnoreCase("When In Anger"))
            {
                textView.setText("“If a person reads (this) when he is angry, then his anger shall go away.\n" +
                        "\n" +
                        "اَعُوْذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ\n" +
                        "\n" +
                        "Transliteration – “A’oozu Bil’laahi Minash Shaitaanir Rajeem”\n" +
                        "Translation- “I seek refuge in Al’laah from Shaitaan the cursed” [Tirmizi Shareef Vol.2 Pg.183].");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Before And After Meal"))
            {
                textView.setText("Dua before the meal is:\n" +
                        "\n" +
                        "بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ\n" +
                        "\n" +
                        "Transliteration – “Bismil laahir Rahmaanir Raheem”\n" +
                        "Translation – “Al’laah’s Name we begin with, The Compassionate, Most Merciful.”\n" +
                        "\n" +
                        "When finished with eating, a Muslim must recite the following Dua:\n" +
                        "\n" +
                        "اَ لْحَمْدُ للهِ الَّذِىْ اَطْعَمَنَا وَسَقَاناَ وَجَعَلَناَ مِنَ الْمُسْلِمِيْنَ \n" +
                        "\n" +
                        "Transliteration – “Alhumdu lil laahil Lazee At’amana Wa Saqaana Wa Ja’alana Minal Muslimeen”.\n" +
                        "Translation – “All Praise is due to Al’laah, who has blessed us with food and drink and made us from amongst the Believers (Muslims)”. [Abu Dawood Pg.573]");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Entering And Exiting Masjid"))
            {
                textView.setText("Dua before entering the mosque is:\n" +
                        "\n" +
                        "اللّهُـمَّ افْتَـحْ لي أَبْوابَ رَحْمَتـِك\n" +
                        "\n" +
                        "Transliteration – “Allaahum-maf-Tahlee Abwaaba Rahmatika”.\n" +
                        "Translation – “O Allaah, open the doors of Your Mercy for me.” [Sahi'h Muslim]\n" +
                        "\n" +
                        "After prayer when a person exits Masjid, the following Dua should be recited:\n" +
                        "\n" +
                        "اللّهُـمَّ إِنّـي أَسْأَلُكَ مِـنْ فَضْـلِك\n" +
                        "\n" +
                        "Transliteration – “Allaahum-ma In-nee As`aluka Min Fadhlika”.\n" +
                        "Translation – “O Allaah, I seek of You Your Grace.” [Sahi'h Muslim]");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("When Sneezing"))
            {
                textView.setText(" The person who sneezes must recite the following Dua:\n" +
                        "\n" +
                        " الْحَمْدُ لِلَّهِ\n" +
                        "\n" +
                        "Transliteration – “Alhamdulillah”!\n" +
                        "Translation – “Thanks and all praise be to Allah”\n" +
                        "\n" +
                        "The person who listens to the sneeze and witnesses the other person reciting the Dua after sneezing, should say the following:\n" +
                        "\n" +
                        " يَرْحَمُكَ اللَّهُ\n" +
                        "\n" +
                        "Transliteration – “Yar Hamoo kall Lah”.\n" +
                        "Translation – “May Allah have mercy on you.” [Bukhari ,Mishkaat Shareef Pg.405]");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Entering And Leaving Home"))
            {
                textView.setText("بِسْمِ اللهِ تَوَكَّلْتُ عَلىَ اللهِ وَلاَ حَوْلَ وَلاَ قُوَّةَ اِلاَّ بِاللهِ ط\n" +
                        "\n" +
                        "Transliteration – “Bismil laahi Tawak’kaltu Alal laahi Wa Laa Hawla Wa Laa Quw’wata il’la bil’laah“\n" +
                        "Translation – “Al’laah’s Name we begin with, I place my (full) trust in Al’laah and there is no Might and Power except with Al’laah.” [Tirmizi Shareef Vol.2 Pg.180]\n" +
                        "\n" +
                        "When entering home, a Muslim must recite the following Dua:\n" +
                        "\n" +
                        "بِسْـمِ اللهِ وَلَجْنـا، وَبِسْـمِ اللهِ خَـرَجْنـا، وَعَلـى رَبِّنـا تَوَكّلْـنا\n" +
                        "\n" +
                        "Transliteration – “Bismillaahi walajnaa, wa bismillaahi kharajnaa, wa ‘alaaRabblnaa tawakkalnaa”\n" +
                        "Translation - “In the Name of Allah we enter, in the Name of Allah we leave, and upon our Lord we depend [then say As-Salaamu 'Alaykum to those present].” [Abu Dau'd]");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("When Feeling Stressed"))
            {
                textView.setText("لآَ اِلَهَ اِلاَّ اللهُ الْحَلِيْمُ الْحَكِيْمُ لآَ اِلَهَ اِلاَّ اللهُ رَبُّ الْعَرْشِ الْعَظِيْم\n" +
                        "\n" +
                        "لآَ اِلَهَ اِلاَّ اللهُ رَبُّ السَّمَاوَاتَ وَاْلاَرْضِ وَرَبُّ الْعَرْشِ الْكَرِيْمِ ط\n" +
                        "\n" +
                        "Transliteration – “Laa ilaaha il’lal laahul Haleemul Hakeemu – Laa ilaaha il’lal laahu Rab’bul Arshil Azeem – Laa ilaaha il’lal laahu Rab’bus Samawaati wal Ardi wa Rab’bul Arshil Kareem”.\n" +
                        "Translation – “There is none worthy of worship except Al’laah, The Fore-bearing, The All Wise. There is none worthy of worship except Al’laah, The Lord of the Exalted Throne. There is none worthy of worship except Al’laah, The Lord of the Skies and The Lord of the Earth and the Lord of the distinguished Throne”. [Tirmidhi Vol.2 Pg. 181]");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("While Traveling"))
            {
                textView.setText("سُبْحَنَ الَّذِىْ سَخَّرَلَنَا هَذَا وَ مَا كُنَّا لَهُ مُقْرِنِيْنْ وَ اِنَّا اِلَى رَبِّنَا لَمُنْقَلِبُوْنْ\n" +
                        "\n" +
                        "Transliteration -“Subhaanal lazee Sakh’khara Lana Haaza Wa Maa Kun’na Lahu Muqrineen. Wa In’na ilaa Rab’bina La Munqaliboon”.\n" +
                        "Translation -  “Glory be to Al’laah who has given us control over this (mode of transport) and without his Grace we would not have been able to control it and undoubtedly we are to return towards our Lord.” [Tirmizi, Abu Dawood]");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Dua Before Slepping"))
            {
                textView.setText("\n" +
                        "اَللَّهُمَّ بِاِسْمِكَ اَمُوْتُ وَاَحْيَ\n" +
                        "\n" +
                        "\n" +
                        "Al’laah hum’ma Bi Ismika Amootu Wa Ahyaa\n" +
                        "\n" +
                        "“O Al’laah! In Your Name I die and live”\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Dua When Waking From Sleep"))
            {
                textView.setText("اَلْحَمْدُ للهِ الَّذِىْ اَحْىَ نَفْسِىْ بَعْدَ مَااَمَاتَهَا وَ اِلَيْهِ النُّشُوْرُ\n" +
                        "\n" +
                        "\n" +
                        "Alhumdu Lil Laahil Lazee Ahyaa Nafsee Ba’da Maa Amaataha Wa ilaihin Nushoor \n" +
                        "\n" +
                        "All praise is due to Al’laah, Who has granted us life after taking it away from us and towards Him is our resurrection (Tirmizi Shareef Vol.2 Pg.178)\n" +
                        "\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("DUA ON ENTERING THE TOILET"))
            {
                textView.setText("\n" +
                        "اَللَّهُمَّ اِ نِّىْ اَعُوْذُ بِكَ مِنَ الْخُبْثِ وَالْخَبَائِثِ\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Al’laah hum’ma In’ni A’oozu bika minal Khubthi wal Khabaa’ith\n" +
                        "\n" +
                        "\n" +
                        "“O Allaah, I take refuge with you from all evil and evil-doers” (Sahih Bukhari Vol.2 Pg.936)\n" +
                        "\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("DUA TO REMOVE PAIN"))
            {
                textView.setText("اَعُوْذُ بِعِزَّ ةِ اللهِ وَقُدْرَ تِهِ مِنْ شَرِّ مَااَجِدُ\n" +
                        "\n" +
                        "\n" +
                        "A’oozu Bi Iz’zatil laahi Wa Qudratihi min Shar’ri Maa Ajidu.’\n" +
                        "\n" +
                        "\n" +
                        "“I seek refuge in Al’laah and His Divine Power from the harshness of what I feel and agonize about”\n" +
                        "\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("DUA DURING THUNDER AND LIGHTNING"))
            {
                textView.setText("اَللَّهُمَّ لاَ تَقْتُلْنَا بِغَضَبِكَ وَ لاَ تُهْلِكْنَا بِعَذَابِكَ وَعَافِنَا قَبْلَ ذَالِكَ\n" +
                        "\n" +
                        "\n" +
                        "Al’laah hum’ma Laa Taqtulna Bi Ghadabika Wa Laa Tuhlikna Bi Azaabika Wa Aafina Qabla Zaalika.\n" +
                        "\n" +
                        "“O Al’laah, Do not cause us death by Your Wrath and do not destroy us by Your punishment and forgive us before that happens”\n" +
                        "\n");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("DUA TO READ ON SHAB’BE QADR NIGHT OF POWER IN RAMADAAN"))
            {
                textView.setText("Huzur Nabi-e-paak Salla Allahu ta’ala ‘alayhi wa Sallam said on the night of Laylat aI qadr you must pray this du’a as much as possible:\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "” ALLAAHUMMA INNAKA AFUWUN TUHIBBUL AFWA F-AFL’ ANNAA”\n" +
                        "\n" +
                        "(0 Allah, you are the one who grants pardon for sins, you love to pardon so pardon us)\n" +
                        "\n" +
                        "Astagfar:\n" +
                        "” ASTAG FIRULLAA HULLAZI LAA-E-LAAHAA ILLAA HUWAL HAIYUL KAIYUM V-A-TUBU ILAIH”\n" +
                        "\n" +
                        "(I seek forgiveness from Allah, the Almighty, there is no god but He,\n" +
                        "He is the Self-existent, the eternal and I turn to Him)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("DUA TO READ ON SHAB’BE QADR NIGHT OF POWER IN RAMADAAN\n"))
            {
                textView.setText("اَللَّهُمَّ اِ نَّكَ عَفُوٌّ تُحِبُّ اْلعَفْوَ\n" +
                        "فَاعْفُ عَنِّىْ\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Al’laah hum’ma In’naka Afuw’wun Tuhib’bul Afwa Fa’fu An’ni.\n" +
                        "\n" +
                        "“O Al’laah! You are the Forgiver and You love forgiving, so (Please) forgive me” (Tirmizi Shareef Vol.2 Pg.190).\n" +
                        "\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("BENEFICIAL DUAS FOR MORNING AND EVENING"))
            {
                textView.setText("سُبْحَانَ اللهِ اَ لْحَمْدُللهِ لآَ اِلَهَ اِلاَّ اللهُ اَللهُ اَكْبَرُ \n" +
                        "\n" +
                        "\n" +
                        "Subhaanal’laahiAlhumdu lil laahi Laa ilaaha il’lal laahu Al’laahu Akbar\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("A TREE IN JAN’NAT"))
            {
                textView.setText("سُبْحَانَ اللهِ الْعَظِيْمِ وَ بِحَمْدِهِ\n" +
                        "\n" +
                        "\n" +
                        "Subhaanal laahil Azeem Wa Bi Humdihi.\n" +
                        "\n" +
                        "Glory be to Al’laah, The Most Supreme and Praises are due to Him\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("A BILLION REWARDS"))
            {
                textView.setText("اَشْهَدُ اَنْ لآَّ اِلَهَ اِلاَّ اللهُ وَحْدَه‘ لاَ شَرِيْكَ لَه‘ اِلَهًا وَّاحِدًا صَمَدًا لَّمْ يَتَّخِذْ صَاحِبَةً وَّلاَ وَلَدًا وَّلَمْ يَكُنْ لَّه‘كُفُوًا اَحَدٌ ط\n" +
                        "\n" +
                        "\n" +
                        "‘Ash Hadu Al Laa ilaaha il’ lal laahu Wahdahu Laa Shareeka Lahu ilaahaw Waahidan Samadal Lum Yat’ ta khiz Saahibataw Wa Laa Waladaw Wa Lum Ya Kul lahu Kufuwan Ahad’ .\n" +
                        "\n" +
                        "\n" +
                        "“I testify that there is none worthy of worship except Al’laah, He is the One and Only. He has no partners. He is the only Al’laah. He has no needs. Neither is He begotten nor does He beget and there is none equal to Him\".\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("DUROOD-E-GHAUSIA"))
            {
                textView.setText("اَللَّهُمَّ صَلِّ عَلىَ سَيِّدِناَ وَ مَوْلاَناَ مُحَمَّدٍ مَّعْدِنِ الْجُوْدِ وَالْكَرَمِ وَ اَ لِهِ \n" +
                        "وَباَرِكْ وَسَلِّمْ\n" +
                        "\n" +
                        "Al’laah hum’ma Sal’li Alaa Say’yidina Wa Mawlaana Muhammadim Ma’dinil Joodi Wal Karami Wa Aalihi Wa Baarik Wa Sal’lim.\n" +
                        "\n" +
                        "O Allah, Send your Mercy and Blessings upon our Master Muhammad Sallal Laahu Ta'ala Alayhi Wa Aalihi Wa Sallam, the source of generosity and kindness and upon his Noble Family and (may there be) blessings and peace.\n" +
                        "\n");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("DUA AFTER AZAAN"))
            {
                textView.setText("اَللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَ ةِ التَّآ مَّةِ وَالصَّلَو ةِ الْقَآئِمَةِ اَتِ مُحَمَّدَ نِ الْوَسِيْلَةَ وَالْفَضِيْلَةَ وَالدَّرَجَةَ الرَّفِيْعَةَ وَابْعَثْهُ مَقَامًا مَّحْمُوْدَا نِ اَّلذِىْ وَعَدْ تَّه‘ وَارْزُقْناَ شَفَاعَتَه‘ يَوْمَ الْقِيَامَةِ اِ نَّكَ لاَ تُخْلِفُ الْمِيْعَادَ ط بِرَحْمَتِكَ يَا اَرْحَمَ الرَّاحِمِيْنَ ط\n" +
                        "\n" +
                        "\n" +
                        "Al’laah hum’ma Rab’ba Haazi hid Da’watit Taam’mati Was Salaatil Qaa’imati Aati Muhammadinil Waseelata Wal Fadeelata Wad Darajatar Rafi’ataa Wab’athoo Maqaamam Mahmoodanil laze wa At’tahoo war Zuqna Shafa’atahu Yaumal Qiyaamati. In’na Laa Tukhli ful Mi’aad.\n" +
                        "\n");
            }

            else if (toolbar.getTitle().toString().equalsIgnoreCase("At the time of visiting a dangerous place"))
            {
                textView.setText("if a person had to visit a place where he is afraid of something then he should recite the following ayat (verse):\n" +
                        "\n" +
                        "رَبِّ اَدْخِلْنِىْ مُدْخَلَ صِدْقٍ وَّ اَخْرِجْنِىْ مُخْرَجَ صِدْقٍ وَّ اجْعَلْ لِّىْ مِنْ لَّدُنْكَ سُلْطَانًا نَصِيْرًا.\n" +
                        "Transliteration:\n" +
                        "RABBE ADKHILNEE MUDKHALA SIDQIWN WA AKHRIJNEE MUKHRAJA SIDQIWN WAJ-A’L LEE MIL LADUNKA SULTAANAN NASEERAA.\n" +
                        "Translation:\n" +
                        "“O My Lord! Cause me to enter a goodly entrance and cause me to go out (of) a goodly exit, and grant me from unto Thee an authority to assist (me)”\n" +
                        "\n" +
                        "and when that thing or person comes in front of him, he should recite the Ayatul Kursi.");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Dua after every prayer"))
            {
                textView.setText("Hazrat Imam Mohammed Baqir (a.s.) says.\n" +
                        "\n" +
                        "“Whoever recites the following Dua thrice after finishing the prayer and without having moved, Allah will pardon all his sins even if these be as many as the foams of the sea.\n" +
                        "\n" +
                        "اَسْتَغْفَرُوْ ا اللهَ الَّذِيْ لَا اَلٰهَ اِلاَّ هُوَ الْحَيُّ الْقَيُّوْمُ ذُوْ الْجَلَالِ وَ الْاِكْرَامِ وَ اَتُوْبُ اِلَيْهِ.\n" +
                        "Transliteration:\n" +
                        "ASTAGHFERUL LAAHAL LAZEE LAA ELAAHA ILLAA HOWAL HAYYUL QAYYOOMO ZUL JALAALE WAL IKRAAME WA ATOOBO ELAYHE.\n" +
                        "Translation:\n" +
                        "I seek forgiveness of Allah Who, there is no deity other than He, the Ever-Living the Self-Subsistent the Glorious and the Gracious. I turn unto Him (repentant)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("For Sawab of whole Night Ibadat"))
            {
                textView.setText("The Holy Prophet (s.a.w.a.) says,\n" +
                        "\n" +
                        "“Whoever recites the following verses of Aal-e-Imraan (Chap. 3) every night, will get the heavenly reward equivalent to the Ibadat of the whole night”\n" +
                        "\n" +
                        "رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلاً، سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ. رَبَّنَآ اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهٗ، وَمَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ. رَبَّنَآ اِنَّنَا سَمِعْنَا مُنَادٍيًا يُّنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا، رَبَّنَا فَاغْفِرْ لَنَا ذُنُوْبَنَا وَ كَفِّرْعَنَّا سَيِّاٰتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ. رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَّنَا عَلٰي رُسُلِكَ وَلاَ تُخْزِنَا يَوْمَ الْقِيَامَةِ، اِنَّكَ لاَ تُخْلِفُ الْمِيْعَادَ.\n" +
                        "Transliteration:\n" +
                        "RABBANAA MAA KHALAQTA HAAZAA BAATELAA, SUBHAANAKA FAQENAA A’ZAABAN NAAR.\n"+" RABBANAA INNAKA MAN TUDKHELIN NAARA FAQAD AKHZAYTAHU, WA MAA LIZ-ZAALEMEENA MIN ANSAAR. RABBANAA INNANAA SAME’NAA MONAADEYAYN YONAADEE LIL-EEMAANE AN AAMENOO BE-RABBEKUM FA-AAMANNNAA, RABBANAA FAGH-FIR LANAA ZONOOBANAA WA KAFFIR A’NNAA SAYYE-AATENAA WA TAWAFFANAA MA-A’L ABRAAR. RABBANAA WA AATENAA MAA WA-A’DTANAA A’LAA ROSOLEKA WA LAA TUKHZENAA YAWMAL QEYAAMATE, INNAKA LAA TUKHLEFUL ME-A’AD.");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("For seeking forgiveness of sins "))
            {
                textView.setText("The most beloved one of Allah is he who often makes prostration and therein recites the following Doas.\n" +
                        "\n" +
                        "رَبِّ إِنِّي ظَلَمْتُ نَفْسِيْ فَاغْفِرْ لِيْ اِنَّهٗ لَا يَغْفِرُ الذُّنُوْبَ اِلاَّ اَنْتَ.\n" +
                        "Transliteration:\n" +
                        "RABBE INNEE ZALAMTO NAFSEE FAGHFIR LEE INNAHU LAA YAGHFERUZ ZONOOBA ILLAA ANTA.\n" +
                        "Translation:\n" +
                        "O My Lord! Verily I have been unjust to myself So forgive me (for it) Indeed none pardons the sins except Thee.");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("For protection from Hell"))
            {
                textView.setText("Hazrat Imam Ja’far-e-Sadiq (a.s.) says\n" +
                        "\n" +
                        "Every day recite the following Dua seven time.\n" +
                        "\n" +
                        "أَسْأَلُ اللَّهَ الْجَنَّةَ وَ أَعُوذُ بِاللَّهِ مِنَ النَّارِ.\n" +
                        "Transliteration:\n" +
                        "AS-ALUL LAAHAL JANNATA WA A-O’OZO BILLAAHE MENAN NAAR.\n" +
                        "Translation:\n" +
                        "I beseech Allah (to grant me) Paradise and I seek protection of Allah from the (Hell) Fire: at this the Hell Says: O Allah grant him/her Protection.");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Salatul Janaza"))
            {
                textView.setText("Sana:\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Glory be to You Oh Allah, and praise be to You, and blessed is Your name, and exalted is Your Majesty, and there is none to be served besides You.\n" +
                        "Duroode Ibraheemi:\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "O Allah! shower Your mercy upon Muhammad and the followers of Muhammad , as You showered Your mercy upon Ibrahim and the followers of Ibrahim. Behold, Your are Praiseworthy, Glorious.\n" +
                        "\n" +
                        "Oh Allah! Shower Your blessing upon Muhammad , and the followers of Muhammad as You showered Your blessings upon Ibrahim and the followers of Ibrahim. Behold, You are Praiseworthy, Glorious.\n" +
                        "\n" +
                        "Duaa for an adult man or woman:\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Oh Allah! Forgive those of us that are alive and those of us that are dead; those of us that are present and those of us who are absent; those of us who are young and those of us who are adults; our males and our females. Oh Allah! Whomsoever You keep alive, let him live as a follower of Islam and whomsoever You cause to die, let him die a Believer.\n" +
                        "\n" +
                        "Duaa for a boy:\n" +
                        "\n" +
                        "\n" +
                        "Oh! Allah, make him (this child) a source for our salvation and make him a source of reward and treasure for us and make him an intercessor for us and one whose intercession is accepted.\n" +
                        "\n" +
                        "Duaa for a girl:\n" +
                        "\n" +
                        "\n" +
                        "Oh! Allah, make her (this child) a source for our salvation and make her a source of reward and treasure for us and make her an intercessor for us and one whose intercession is accepted.");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Eid ul Fitr"))
            {
                textView.setText("نَوَايْتُ اَنْ اُصَلِّىَ لِلَّّهِ تَعَالَى رَكْعَتَىْ صَلَوةِ الْعِيْدِ الْفِطْرِ مَعَ سِتَّةِ تَكْبِرَاتِ وَاجِبُ اللَّهِ تَعَالَى اِِقْتَدَيْتُ بِهَذَا اْلاِمَامِ مُتَوَجِّهًا اِلَى جِهَةِ الْكَعْبَةِ الشَّرِيْفَةِ اَللَّهُ اَكْبَرُ\n" +
                        "\n" +
                        "Pronunciation:\n" +
                        "\n" +
                        "“Nawayatu Aan Usallia Lillahi Taalaa Rakatai Salatil ‘Idil Feetree Maa Sittati Taqberatee Wajibullahi Taala Ektadaaitu Bihazaal Imami Mutaouuazzihan Ila Zihatil Ka’batish Sharifati, Allahuu Akbar”\n" +
                        "\n" +
                        "Translation:\n" +
                        "\n" +
                        "(I Headed for ALLAH Intent to Pray with Extra 6 Taqbeer’s ‘Id–ul-Fitr’s 2 Rakat ALLAH Taala’s Wajib Prayer, By Following This Imam Facing towards Kabah, ALLAH is Most Great)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Eid ul Adha"))
            {
                textView.setText("نَوَايْتُ اَنْ اُصَلِّىَ لِلَّّهِ تَعَالَى رَكْعَتَىْ صَلَوةِ عِيْدِ اْلاَضْحَى مَعَ سِتَّةِ تَكْبِرَاتِ وَاجِبُ اللَّهِ تَعَالَى اِِقْتَدَيْتُ بِهَذَا اْلاِمَامِ مُتَوَجِّهًا اِلَى جِهَةِ الْكَعْبَةِ الشَّرِيْفَةِ اَللَّهُ اَكْبَرُ\n" +
                        "\n" +
                        "Pronunciation:\n" +
                        "\n" +
                        "“Nawayatu Aan Usallia Lillahi Taalaa Rakatai Salatee ‘Idil Aadhaa Maa Sittati Taqberatee Wajibullahi Taala Ektadaaitu Bihazaal Imami Mutaouuazzihan Ila Zihatil Ka’batish Sharifati, Allahuu Akbar”\n" +
                        "\n" +
                        "Translation:\n" +
                        "\n" +
                        "(I Headed for ALLAH Intent to Pray with Extra 6 Taqbeer’s ‘Id–ul-Adha’s 2 Rakat ALLAH Taala’s Wajib Prayer, By Following This Imam Facing towards Kabah, ALLAH is Most Great)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Lailat ul Barat Prayer"))
            {
                textView.setText("نَوَايْتُ اَنْ اُصَلِّىَ لِلَّّهِ تَعَالَى رَكْعَتَىْ صَلَوةِ لَيْلَةِ الْبَرَاتِ النَّفْلِ مُتَوَجِّهًا اِلَى جِهَةِ الْكَعْبَةِ الشَّرِيْفَةِ اَللَّهُ اَكْبَرُ\n" +
                        "\n" +
                        "Pronunciation:\n" +
                        "\n" +
                        "“Nawayatu Aan Usallia Lillahi Taalaa Rakatai Salatee Laailatil Barateen Naflee Mutaouuazzihan Ila Zihatil Ka’batish Sharifati, Allahuu Akbar”\n" +
                        "\n" +
                        "Translation:\n" +
                        "\n" +
                        "(I Headed for ALLAH Intent to Pray Lailatul Barat’s 2 Rakat Nafl Prayer Facing towards Kabah, ALLAH is Most Great)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Lailat ul Qadr Prayer"))
            {
                textView.setText("نَوَايْتُ اَنْ اُصَلِّىَ لِلَّّهِ تَعَالَى رَكْعَتَىْ صَلَوةِ لَيْلَةِ الْقَدْرِِ النَّفْلِ مُتَوَجِّهًا اِلَى جِهَةِ الْكَعْبَةِ الشَّرِيْفَةِ اَللَّهُ اَكْبَرُ\n" +
                        "\n" +
                        "Pronunciation:\n" +
                        "\n" +
                        "“Nawayatu Aan Usallia Lillahi Taalaa Rakatai Salatee Laailatil Qaadreen Naflee Mutaouuazzihan Ila Zihatil Ka’batish Sharifati, Allahuu Akbar”\n" +
                        "\n" +
                        "Translation:\n" +
                        "\n" +
                        "(I Headed for ALLAH Intent to Pray Lailatul Qadr’s 2 Raka Nafl Prayer Facing towards Kabah, ALLAH is Most Great)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Lailat ul Miraj Prayer"))
            {
                textView.setText("نَوَايْتُ اَنْ اُصَلِّىَ لِلَّّهِ تَعَالَى رَكْعَتَىْ صَلَوةِ لَيْلَةِ الْمِعْارَجِ النَّفْلِ مُتَوَجِّهًا اِلَى جِهَةِ الْكَعْبَةِ الشَّرِيْفَةِ اَللَّهُ اَكْبَرُ\n" +
                        "\n" +
                        "Pronunciation:\n" +
                        "\n" +
                        "“Nawayatu Aan Usallia Lillahi Taalaa Rakatai Salatee Laailatil Merajeen Naflee Mutaouuazzihan Ila Zihatil Ka’batish Sharifati, Allahuu Akbar”\n" +
                        "\n" +
                        "Translation:\n" +
                        "\n" +
                        "(I Headed for ALLAH Intent to Pray Lailatul Miraj’s 2 Rakat Nafl Prayer Facing towards Kabah, ALLAH is Most Great)\n" +
                        "\n" +
                        " ");
            }

            else if (toolbar.getTitle().toString().equalsIgnoreCase("For recovery of misplaced or lost thing"))
            {
                textView.setText("Sometimes it so happens that something is lost or misplaced and then because one cannot find it one gets perplexed. In case something is lost or misplaced, and one has to search it before mid-day, one should recite the following Dua thrice, and after each recitation Allah the thing will be found out.\n" +
                        "\n" +
                        "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ اَصْبَحْتُ فِيْ اَمَانِ اللهِ وَ اَمْسَيْتُ فِيْ جَوَارِ اللهِ.\n" +
                        "Transliteration:\n" +
                        "BISMIL LAAHIR RAHMAANIR RAHEEM ASBAHTO FEE AMAANIL LAAHE WA AMSAYTO FEE JAWAARIL LAAHE.\n" +
                        "Translation:\n" +
                        "In the name of Allah, the Beneficent, the Merciful. I have entered upon the morning in the protection of Allah, and I shall enter in to the evening in the refuge of Allah.\n" +
                        "\n" +
                        "If the search is to be made after mid-day the following Dua is to be recited 3 times, clapping each time.\n" +
                        "\n" +
                        "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ اَمْسَيْتُ فِيْ اَمَانِ اللهِ وَ اَصْبَحْتُ فِيْ جَوَارِ اللهِ.\n" +
                        "Transliteration:\n" +
                        "BISMIL LAAHIR RAHMAANIR RAHEEM AMSAYTO FEE AMAANIL LAAHE WA ASBAHTO FEE JAWAARIL LAAHE.\n" +
                        "Translation:\n" +
                        "In the name of Allah, the Beneficent, the Merciful. I have entered into the evening in the protection of Allah and I shall enter upon the morning in the refuge of Allah.");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Follow the Prophet’s Advice"))
            {
                textView.setText("Assuming that you’re asking for something good and halal (allowed in Islam), the next thing to keep in mind is to make dua the way the Prophet (peace be upon him) taught us how to make dua.\n" +
                        "\n" +
                        "Please read this beautiful Hadith (tradition) from Prophet Muhammad (peace be upon him):\n" +
                        "\n" +
                        "The supplication of every one of His slaves will be granted so long as he does not get impatient and says “I supplicated my Lord again and again but I do not think my prayers will be answered.” (Bukhari and Muslim)");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Some Final Tips"))
            {
                textView.setText("There are many little things we can do to make our duas more impactful. Here are some brief pointers to keep in mind:\n" +
                        "\n" +
                        "Pray for your parents when you make dua.\n" +
                        "Pray for another Muslim in their absence without them knowing.\n" +
                        "Make wudu before making dua.\n" +
                        "Make dua when it’s raining.\n" +
                        "Make dua in the last moments of daylight on Fridays.\n" +
                        "Use authentic duas from the Quran and sunnah in Arabic (though it’s perfectly okay to make dua in your native tongue also).\n" +
                        "Call upon Allah using the word “Rabbee (My Lord).”\n" +
                        "Call upon Allah by His names (Ar-Rahman, Al-Ghafur, etc.)\n" +
                        "Ask Allah based upon some good deed you’ve done in the past.\n" +
                        "Inshallah, these ideas will help your duas become more meaningful and in turn, Allah will bless you with an improved life. May Allah accept all of your good supplications. Ameen!");
            }

        }

    }
}