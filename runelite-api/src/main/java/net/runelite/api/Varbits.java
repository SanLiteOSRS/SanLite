/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

/**
 * Server controlled "content-developer" integers.
 *
 * @see VarPlayer
 * <p>
 * These differ from a {@link VarPlayer} in that VarBits can be
 * less than 32 bits. One or more VarBits can be assigned to a
 * backing VarPlayer, each with a static range of bits that it is
 * allowed to access. This allows a more compact representation
 * of small values, like booleans
 */
public final class Varbits
{
	/* Custom varbits */
	/**
	 * Grand Exchange
	 */
	GRAND_EXCHANGE_PRICE_PER_ITEM(4398),
	GRAND_EXCHANGE_UNKNOWN_1(4399),

	RIGOUR_UNLOCKED(5451),
	AUGURY_UNLOCKED(5452),
	PRESERVE_UNLOCKED(5453),

	/**
	 * Value for the current encounter state ranging from 0 to 3,
	 * Maiden | start 0 -> 1 | end 1 -> 0
	 * Bloat | start 0 -> 1 | end 1 -> 0
	 * Nylocas | start 0 -> 1 | end 1 -> 0
	 * Sotetseg | start 0 -> 1 | maze active 1 -> 2 | maze inactive 2 -> 1 | end 1 -> 0
	 * Xarpus | start 0 -> 2 | healing phase end 2 -> 1 | end 1 -> 0
	 * Verzik | start 0 -> 3 | pillar phase end 3 -> 1 | end 1 -> 0
	 */
	TOB_ENCOUNTER_STATE(6447), // Range from 0-3, values depend on encounter
	TOB_ENCOUNTER_HEALTH_BAR_CURRENT_VALUE(6448), // Value is current health percentage (eg. 839 is 83,9%)
	TOB_ENCOUNTER_HEALTH_BAR_MAX_VALUE(6449), // Max value health percentage (eg. 1000 for 100% and 0 for 0%)

	/**
	 * Theatre of Blood orb varbits each number stands for the player's health on a scale of 1-27,
	 * 0 hides the orb, 31 turns the orb yellow
	 */
	THEATRE_OF_BLOOD_ORB_1(6442),
	THEATRE_OF_BLOOD_ORB_2(6443),
	THEATRE_OF_BLOOD_ORB_3(6444),
	THEATRE_OF_BLOOD_ORB_4(6445),
	THEATRE_OF_BLOOD_ORB_5(6446),

	/**
	 * Nightmare Zone
	 */
	NMZ_OVERLOAD(3955),


	IN_THE_WILDERNESS(5963),

	/**
	 * 0 = Sir Bedivere
	 * 1 = Sir Pelleas
	 * 2 = Sir Tristram
	 * 3 = Sir Palomedes
	 * 4 = Sir Lucan
	 * 5 = Sir Gawain
	 * 6 = Sir Kay
	 * 7 = Sir Lancelot
	 * 8 = Completed (Chivalry and Piety are unlocked)
	 */
	CAMELOT_TRAINING_ROOM_STATUS(3909),

	/**
	 * Varbit used for Slayer reward points
	 */
	SLAYER_REWARD_POINTS(4068),

	/**
	 * 0 = withdraw/deposit 1
	 * 1 = withdraw/deposit 5
	 * 2 = withdraw/deposit 10
	 * 3 = withdraw/deposit X
	 * 4 = withdraw/deposit all
	 */
	BANK_QUANTITY_MODE(6590),

	WORLDHOPPER_FAVORITE_1(4597),
	WORLDHOPPER_FAVORITE_2(4598),

	/**
	 * 0 = standard
	 * 1 = ancients
	 * 2 = lunars
	 * 3 = arceuus
	 **/
	SPELLBOOK_ID(4070),

	/**
	 * 0 = no
	 * 1 = yes
	 **/
	SPELLBOOK_HIDDEN(6718),


	/**
	 * Spells being auto-casted
	 */
	AUTO_CAST_SPELL(276),

	/**
	 * Temple Trekking
	 */
	TREK_POINTS(1955),
	TREK_STARTED(1956),
	TREK_EVENT(1958),
	TREK_STATUS(6719),
	BLOAT_ENTERED_ROOM(6447),

	/**
	 * f2p Quest varbits, these don't hold the completion value.
	 */
	QUEST_DEMON_SLAYER(2561),
	QUEST_GOBLIN_DIPLOMACY(2378),
	QUEST_MISTHALIN_MYSTERY(3468),
	QUEST_THE_CORSAIR_CURSE(6071),
	QUEST_X_MARKS_THE_SPOT(8063),

	/**
	 * member Quest varbits, these don't hold the completion value.
	 */
	QUEST_ANIMAL_MAGNETISM(3185),
	QUEST_BETWEEN_A_ROCK(299),
	QUEST_CONTACT(3274),
	QUEST_ZOGRE_FLESH_EATERS(487),
	QUEST_DARKNESS_OF_HALLOWVALE(2573),
	QUEST_DEATH_TO_THE_DORGESHUUN(2258),
	QUEST_DESERT_TREASURE(358),
	QUEST_DEVIOUS_MINDS(1465),
	QUEST_EAGLES_PEAK(2780),
	QUEST_ELEMENTAL_WORKSHOP_II(2639),
	QUEST_ENAKHRAS_LAMENT(1560),
	QUEST_ENLIGHTENED_JOURNEY(2866),
	QUEST_THE_EYES_OF_GLOUPHRIE(2497),
	QUEST_FAIRYTALE_I_GROWING_PAINS(1803),
	QUEST_FAIRYTALE_II_CURE_A_QUEEN(2326),
	QUEST_THE_FEUD(334), // 14 = able to pickpocket
	QUEST_FORGETTABLE_TALE(822),
	QUEST_GARDEN_OF_TRANQUILLITY(961),
	QUEST_GHOSTS_AHOY(217),
	QUEST_THE_GIANT_DWARF(571),
	QUEST_THE_GOLEM(346),
	QUEST_HORROR_FROM_THE_DEEP(34),
	QUEST_ICTHLARINS_LITTLE_HELPER(418),
	QUEST_IN_AID_OF_THE_MYREQUE(1990),
	QUEST_THE_LOST_TRIBE(532),
	QUEST_LUNAR_DIPLOMACY(2448),
	QUEST_MAKING_HISTORY(1383),
	QUEST_MOUNTAIN_DAUGHTER(260),
	QUEST_MOURNINGS_END_PART_II(1103),
	QUEST_MY_ARMS_BIG_ADVENTURE(2790),
	QUEST_RATCATCHERS(1404),
	QUEST_RECIPE_FOR_DISASTER(1850),
	QUEST_RECRUITMENT_DRIVE(657),
	QUEST_ROYAL_TROUBLE(2140),
	QUEST_THE_SLUG_MENACE(2610),
	QUEST_SHADOW_OF_THE_STORM(1372),
	QUEST_A_SOULS_BANE(2011),
	QUEST_SPIRITS_OF_THE_ELID(1444),
	QUEST_SWAN_SONG(2098),
	QUEST_A_TAIL_OF_TWO_CATS(1028),
	QUEST_TEARS_OF_GUTHIX(451),
	QUEST_WANTED(1051),
	QUEST_COLD_WAR(3293),
	QUEST_THE_FREMENNIK_ISLES(3311),
	QUEST_TOWER_OF_LIFE(3337),
	QUEST_WHAT_LIES_BELOW(3523),
	QUEST_OLAFS_QUEST(3534),
	QUEST_ANOTHER_SLICE_OF_HAM(3550),
	QUEST_DREAM_MENTOR(3618),
	QUEST_GRIM_TALES(2783),
	QUEST_KINGS_RANSOM(3888),
	QUEST_MONKEY_MADNESS_II(5027),
	QUEST_CLIENT_OF_KOUREND(5619),
	QUEST_BONE_VOYAGE(5795),
	QUEST_THE_QUEEN_OF_THIEVES(6037),
	QUEST_THE_DEPTHS_OF_DESPAIR(6027),
	QUEST_DRAGON_SLAYER_II(6104),
	QUEST_TALE_OF_THE_RIGHTEOUS(6358),
	QUEST_A_TASTE_OF_HOPE(6396),
	QUEST_MAKING_FRIENDS_WITH_MY_ARM(6528),
	QUEST_THE_ASCENT_OF_ARCEUUS(7856),
	QUEST_THE_FORSAKEN_TOWER(7796),
	QUEST_SONG_OF_THE_ELVES(7796),

	/**
	 * mini-quest varbits, these don't hold the completion value.
	 */
	QUEST_ARCHITECTURAL_ALLIANCE(4982),
	QUEST_BEAR_YOUR_SOUL(5078),
	QUEST_CURSE_OF_THE_EMPTY_LORD(821),
	QUEST_ENCHANTED_KEY(1391),
	QUEST_THE_GENERALS_SHADOW(3330),
	QUEST_SKIPPY_AND_THE_MOGRES(1344),
	QUEST_LAIR_OF_TARN_RAZORLOR(3290),
	QUEST_FAMILY_PEST(5347),
	QUEST_THE_MAGE_ARENA_II(6067),
	QUEST_IN_SEARCH_OF_KNOWLEDGE(6067),

	/**
	 * Active spellbook (see enumID)
	 */
	SPELLBOOK(4070),

	/**
	 * Spellbook filtering (1 = unfiltered, 0 = filtered)
	 */
	FILTER_SPELLBOOK(6718),

	/**
	 * POH Building mode (1 = yes, 0 = no)
	 */
	BUILDING_MODE(2176),

	/**
	 * 1 if in game, 0 if not
	 */
	LMS_IN_GAME(5314),

	/**
	 * Amount of pvp kills in current game
	 */
	LMS_KILLS(5315),

	/**
	 * The x coordinate of the final safespace (world coord)
	 */
	LMS_SAFE_X(5316),

	/**
	 * Starts at 100, counts down every 10 ticks (6 seconds)
	 */
	LMS_POISON_PROGRESS(5317),

	/**
	 * The y coordinate of the final safespace (world coord)
	 */
	LMS_SAFE_Y(5320),

	/**
	 * 1 is true, 0 is false.
	 */
	GAUNTLET_FINAL_ROOM_ENTERED(9177),

	/**
	 * 1 is true, 0 is false.
	 */
	GAUNTLET_ENTERED(9178),

	WITHDRAW_X_AMOUNT(3960),

	CLAN_WARS_ARENA_UNKNOWN_1(4285),
	/**
	 * The value of this equals the remaining ticks till the countdown finished.
	 * Starts at 204 (~2 minutes) in a normal Clan Wars match. Value decreases by 3 every 3 ticks.
	 */
	CLAN_WARS_ARENA_COUNTDOWN_TIMER(4286),
	CLAN_WARS_ARENA_UNKNOWN_2(4287),
	CLAN_WARS_ARENA_UNKNOWN_3(4288),
	CLAN_WARS_ARENA_UNKNOWN_4(4289),

	/**
	 * The amount of minutes since the start of the day (UTC). Updates every minute.
	 */
	GAME_TIME_MINUTES_COUNT(8354),

	/**
	 * Whether the player is in the buffer zone between the Wilderness and Ferox's Enclave.
	 */
	FEROX_ENCLAVE_BUFFER_ZONE(10530),

	/* RuneLite varbits */

	/*
	 * If chatbox is transparent or not
	 */
	public static final int TRANSPARENT_CHATBOX = 4608;

	/*
	 * If the player has an active stamina potion effect or not
	 */
	public static final int RUN_SLOWED_DEPLETION_ACTIVE = 25;

	/**
	 * If scrollbar in resizable mode chat is on the left
	 */
	public static final int CHAT_SCROLLBAR_ON_LEFT = 6374;

	/**
	 * Runepouch
	 */
	public static final int RUNE_POUCH_RUNE1 = 29;
	public static final int RUNE_POUCH_RUNE2 = 1622;
	public static final int RUNE_POUCH_RUNE3 = 1623;
	public static final int RUNE_POUCH_AMOUNT1 = 1624;
	public static final int RUNE_POUCH_AMOUNT2 = 1625;
	public static final int RUNE_POUCH_AMOUNT3 = 1626;

	/**
	 * Prayers
	 */
	public static final int QUICK_PRAYER = 4103;
	public static final int PRAYER_THICK_SKIN = 4104;
	public static final int PRAYER_BURST_OF_STRENGTH = 4105;
	public static final int PRAYER_CLARITY_OF_THOUGHT = 4106;
	public static final int PRAYER_SHARP_EYE = 4122;
	public static final int PRAYER_MYSTIC_WILL = 4123;
	public static final int PRAYER_ROCK_SKIN = 4107;
	public static final int PRAYER_SUPERHUMAN_STRENGTH = 4108;
	public static final int PRAYER_IMPROVED_REFLEXES = 4109;
	public static final int PRAYER_RAPID_RESTORE = 4110;
	public static final int PRAYER_RAPID_HEAL = 4111;
	public static final int PRAYER_PROTECT_ITEM = 4112;
	public static final int PRAYER_HAWK_EYE = 4124;
	public static final int PRAYER_MYSTIC_LORE = 4125;
	public static final int PRAYER_STEEL_SKIN = 4113;
	public static final int PRAYER_ULTIMATE_STRENGTH = 4114;
	public static final int PRAYER_INCREDIBLE_REFLEXES = 4115;
	public static final int PRAYER_PROTECT_FROM_MAGIC = 4116;
	public static final int PRAYER_PROTECT_FROM_MISSILES = 4117;
	public static final int PRAYER_PROTECT_FROM_MELEE = 4118;
	public static final int PRAYER_EAGLE_EYE = 4126;
	public static final int PRAYER_MYSTIC_MIGHT = 4127;
	public static final int PRAYER_RETRIBUTION = 4119;
	public static final int PRAYER_REDEMPTION = 4120;
	public static final int PRAYER_SMITE = 4121;
	public static final int PRAYER_CHIVALRY = 4128;
	public static final int PRAYER_PIETY = 4129;
	public static final int PRAYER_PRESERVE = 5466;
	public static final int PRAYER_RIGOUR = 5464;
	public static final int PRAYER_AUGURY = 5465;

	/**
	 * Diary Entries
	 */
	public static final int DIARY_ARDOUGNE_EASY = 4458;
	public static final int DIARY_ARDOUGNE_MEDIUM = 4459;
	public static final int DIARY_ARDOUGNE_HARD = 4460;
	public static final int DIARY_ARDOUGNE_ELITE = 4461;

	public static final int DIARY_DESERT_EASY = 4483;
	public static final int DIARY_DESERT_MEDIUM = 4484;
	public static final int DIARY_DESERT_HARD = 4485;
	public static final int DIARY_DESERT_ELITE = 4486;

	public static final int DIARY_FALADOR_EASY = 4462;
	public static final int DIARY_FALADOR_MEDIUM = 4463;
	public static final int DIARY_FALADOR_HARD = 4464;
	public static final int DIARY_FALADOR_ELITE = 4465;

	public static final int DIARY_FREMENNIK_EASY = 4491;
	public static final int DIARY_FREMENNIK_MEDIUM = 4492;
	public static final int DIARY_FREMENNIK_HARD = 4493;
	public static final int DIARY_FREMENNIK_ELITE = 4494;

	public static final int DIARY_KANDARIN_EASY = 4475;
	public static final int DIARY_KANDARIN_MEDIUM = 4476;
	public static final int DIARY_KANDARIN_HARD = 4477;
	public static final int DIARY_KANDARIN_ELITE = 4478;

	public static final int DIARY_KARAMJA_EASY = 3578;
	public static final int DIARY_KARAMJA_MEDIUM = 3599;
	public static final int DIARY_KARAMJA_HARD = 3611;
	public static final int DIARY_KARAMJA_ELITE = 4566;

	public static final int DIARY_KOUREND_EASY = 7925;
	public static final int DIARY_KOUREND_MEDIUM = 7926;
	public static final int DIARY_KOUREND_HARD = 7927;
	public static final int DIARY_KOUREND_ELITE = 7928;

	public static final int DIARY_LUMBRIDGE_EASY = 4495;
	public static final int DIARY_LUMBRIDGE_MEDIUM = 4496;
	public static final int DIARY_LUMBRIDGE_HARD = 4497;
	public static final int DIARY_LUMBRIDGE_ELITE = 4498;

	public static final int DIARY_MORYTANIA_EASY = 4487;
	public static final int DIARY_MORYTANIA_MEDIUM = 4488;
	public static final int DIARY_MORYTANIA_HARD = 4489;
	public static final int DIARY_MORYTANIA_ELITE = 4490;

	public static final int DIARY_VARROCK_EASY = 4479;
	public static final int DIARY_VARROCK_MEDIUM = 4480;
	public static final int DIARY_VARROCK_HARD = 4481;
	public static final int DIARY_VARROCK_ELITE = 4482;

	public static final int DIARY_WESTERN_EASY = 4471;
	public static final int DIARY_WESTERN_MEDIUM = 4472;
	public static final int DIARY_WESTERN_HARD = 4473;
	public static final int DIARY_WESTERN_ELITE = 4474;

	public static final int DIARY_WILDERNESS_EASY = 4466;
	public static final int DIARY_WILDERNESS_MEDIUM = 4467;
	public static final int DIARY_WILDERNESS_HARD = 4468;
	public static final int DIARY_WILDERNESS_ELITE = 4469;

	/**
	 * Kourend house favours
	 */
	public static final int KOUREND_FAVOR_ARCEUUS = 4896;
	public static final int KOUREND_FAVOR_HOSIDIUS = 4895;
	public static final int KOUREND_FAVOR_LOVAKENGJ = 4898;
	public static final int KOUREND_FAVOR_PISCARILIUS = 4899;
	public static final int KOUREND_FAVOR_SHAYZIEN = 4894;

	/**
	 * Equipped weapon type
	 */
	public static final int EQUIPPED_WEAPON_TYPE = 357;

	/**
	 * Defensive casting mode
	 */
	public static final int DEFENSIVE_CASTING_MODE = 2668;

	/**
	 * Options
	 */
	public static final int SIDE_PANELS = 4607;

	/**
	 * Herbiboar Trails
	 */
	public static final int HB_TRAIL_31303 = 5737;
	public static final int HB_TRAIL_31306 = 5738;
	public static final int HB_TRAIL_31309 = 5739;
	public static final int HB_TRAIL_31312 = 5740;
	public static final int HB_TRAIL_31315 = 5741;
	public static final int HB_TRAIL_31318 = 5742;
	public static final int HB_TRAIL_31321 = 5743;
	public static final int HB_TRAIL_31324 = 5744;
	public static final int HB_TRAIL_31327 = 5745;
	public static final int HB_TRAIL_31330 = 5746;

	public static final int HB_TRAIL_31333 = 5768;
	public static final int HB_TRAIL_31336 = 5769;
	public static final int HB_TRAIL_31339 = 5770;
	public static final int HB_TRAIL_31342 = 5771;
	public static final int HB_TRAIL_31345 = 5772;
	public static final int HB_TRAIL_31348 = 5773;
	public static final int HB_TRAIL_31351 = 5774;
	public static final int HB_TRAIL_31354 = 5775;
	public static final int HB_TRAIL_31357 = 5776;
	public static final int HB_TRAIL_31360 = 5777;

	public static final int HB_TRAIL_31363 = 5747;
	public static final int HB_TRAIL_31366 = 5748;
	public static final int HB_TRAIL_31369 = 5749;
	public static final int HB_TRAIL_31372 = 5750;

	public static final int HB_FINISH = 5766;

	/**
	 * Started hunting Herbiboar.
	 * <br>
	 * NOTE: This value remains at 0 even after starting a Herbiboar trail up until searching the first object along the
	 * hunting path.
	 */
	public static final int HB_STARTED = 5767;

	/**
	 * Barbarian Assault
	 */
	public static final int IN_GAME_BA = 3923;
	public static final int BA_GC = 4768;

	/**
	 * 0 = Outside wilderness
	 * 1 = In wilderness
	 */
	public static final int IN_WILDERNESS = 5963;

	/**
	 * Fishing Trawler
	 * FISHING_TRAWLER_ACTIVITY Expected values: 0-255
	 */
	public static final int FISHING_TRAWLER_ACTIVITY = 3377;

	/**
	 * Blast Furnace Bar Dispenser
	 * <p>
	 * These are the expected values:
	 * 0 = No bars being processed
	 * 1 = Ores are being processed on the conveyor belt, bar dispenser cannot be checked
	 * 2 = Bars are cooling down
	 * 3 = Bars can be collected
	 */
	public static final int BAR_DISPENSER = 936;

	/**
	 * Motherlode mine sack
	 */
	public static final int SACK_NUMBER = 5558;
	public static final int SACK_UPGRADED = 5556;

	/**
	 * Experience tracker
	 * <p>
	 * EXPERIENCE_TRACKER_POSITION expected values:
	 * 0 = Right
	 * 1 = Middle
	 * 2 = Left
	 */
	public static final int EXPERIENCE_TRACKER_POSITION = 4692;
	public static final int EXPERIENCE_TRACKER_COUNTER = 4697;
	public static final int EXPERIENCE_TRACKER_PROGRESS_BAR = 4698;

	/**
	 * Experience drop color
	 */
	public static final int EXPERIENCE_DROP_COLOR = 4695;

	/**
	 * Tithe Farm
	 */
	public static final int TITHE_FARM_SACK_AMOUNT = 4900;
	public static final int TITHE_FARM_SACK_ICON = 5370;
	public static final int TITHE_FARM_POINTS = 4893;

	/**
	 * Blast Mine
	 */
	public static final int BLAST_MINE_COAL = 4924;
	public static final int BLAST_MINE_GOLD = 4925;
	public static final int BLAST_MINE_MITHRIL = 4926;
	public static final int BLAST_MINE_ADAMANTITE = 4921;
	public static final int BLAST_MINE_RUNITE = 4922;

	/**
	 * Raids
	 */
	public static final int IN_RAID = 5432;
	public static final int TOTAL_POINTS = 5431;
	public static final int PERSONAL_POINTS = 5422;
	public static final int RAID_PARTY_SIZE = 5424;

	// 0 = raid not started, >0 = raid started
	public static final int RAID_STATE = 5425;
    public static final int RAID_DURATI	RAID_DURATION_TICK_COUNT(6386);

	/**
	 * Making Friends with My Arm fire pits
	 * <p>
	 * Expected values:
	 * 0 = Not built
	 * 1 = Built
	 */
	public static final int FIRE_PIT_GIANT_MOLE = 6532;
	public static final int FIRE_PIT_LUMBRIDGE_SWAMP = 6533;
	public static final int FIRE_PIT_MOS_LE_HARMLESS = 6534;

	/**
	 * Theatre of Blood 1=In Party, 2=Inside/Spectator, 3=Dead Spectating
	 */
	public static final int THEATRE_OF_BLOOD = 6440;
	/**
	 * Theatre of Blood orb healths
	 * 0=hide 1-27=% of health - 27 is 100% health and 1 is 0% health, 30=dead
	 */
	public static final int THEATRE_OF_BLOOD_ORB1 = 6442;
	public static final int THEATRE_OF_BLOOD_ORB2 = 6443;
	public static final int THEATRE_OF_BLOOD_ORB3 = 6444;
	public static final int THEATRE_OF_BLOOD_ORB4 = 6445;
	public static final int THEATRE_OF_BLOOD_ORB5 = 6446;

	/**
	 * Nightmare Zone
	 */
	public static final int NMZ_ABSORPTION = 3956;
	public static final int NMZ_POINTS = 3949;

	/**
	 * Blast Furnace
	 */
	public static final int BLAST_FURNACE_COPPER_ORE = 959;
	public static final int BLAST_FURNACE_TIN_ORE = 950;
	public static final int BLAST_FURNACE_IRON_ORE = 951;
	public static final int BLAST_FURNACE_COAL = 949;
	public static final int BLAST_FURNACE_MITHRIL_ORE = 952;
	public static final int BLAST_FURNACE_ADAMANTITE_ORE = 953;
	public static final int BLAST_FURNACE_RUNITE_ORE = 954;
	public static final int BLAST_FURNACE_SILVER_ORE = 956;
	public static final int BLAST_FURNACE_GOLD_ORE = 955;

	public static final int BLAST_FURNACE_BRONZE_BAR = 941;
	public static final int BLAST_FURNACE_IRON_BAR = 942;
	public static final int BLAST_FURNACE_STEEL_BAR = 943;
	public static final int BLAST_FURNACE_MITHRIL_BAR = 944;
	public static final int BLAST_FURNACE_ADAMANTITE_BAR = 945;
	public static final int BLAST_FURNACE_RUNITE_BAR = 946;
	public static final int BLAST_FURNACE_SILVER_BAR = 948;
	public static final int BLAST_FURNACE_GOLD_BAR = 947;

	public static final int BLAST_FURNACE_COFFER = 5357;

	/**
	 * Pyramid plunder
	 */
	public static final int PYRAMID_PLUNDER_ROOM_LOCATION = 2365;
	public static final int PYRAMID_PLUNDER_TIMER = 2375;
	public static final int PYRAMID_PLUNDER_THIEVING_LEVEL = 2376;
	public static final int PYRAMID_PLUNDER_ROOM = 2377;

	/**
	 * Barrows
	 */
	public static final int BARROWS_KILLED_AHRIM = 457;
	public static final int BARROWS_KILLED_DHAROK = 458;
	public static final int BARROWS_KILLED_GUTHAN = 459;
	public static final int BARROWS_KILLED_KARIL = 460;
	public static final int BARROWS_KILLED_TORAG = 461;
	public static final int BARROWS_KILLED_VERAC = 462;
	public static final int BARROWS_REWARD_POTENTIAL = 463;
	public static final int BARROWS_NPCS_SLAIN = 464;

	/**
	 * Spicy stew ingredients
	 */
	public static final int SPICY_STEW_RED_SPICES = 1879;
	public static final int SPICY_STEW_YELLOW_SPICES = 1880;
	public static final int SPICY_STEW_BROWN_SPICES = 1881;
	public static final int SPICY_STEW_ORANGE_SPICES = 1882;

	/**
	 * Multicombat area
	 */
	public static final int MULTICOMBAT_AREA = 4605;

	/**
	 * Kingdom of Miscellania Management
	 * Kingdom Approval is represented as a 7-bit unsigned integer; 127 corresponds to 100% approval
	 */
	public static final int KINGDOM_APPROVAL = 72;
	public static final int KINGDOM_COFFER = 74;

	/**
	 * The Hand in the Sand quest status
	 */
	public static final int QUEST_THE_HAND_IN_THE_SAND = 1527;

	/**
	 * Daily Tasks =Collection availability)
	 */
	public static final int DAILY_HERB_BOXES_COLLECTED = 3961;
	public static final int DAILY_STAVES_COLLECTED = 4539;
	public static final int DAILY_ESSENCE_COLLECTED = 4547;
	public static final int DAILY_RUNES_COLLECTED = 4540;
	public static final int DAILY_SAND_COLLECTED = 4549;
	public static final int DAILY_FLAX_STATE = 4559;
	public static final int DAILY_ARROWS_STATE = 4563;
	/**
	 * This varbit tracks how much bonemeal has been redeemed from Robin
	 * The player gets 13 for each diary completed above and including Medium, for a maxiumum of 39
	 */
	public static final int DAILY_BONEMEAL_STATE = 4543;

	public static final int DAILY_DYNAMITE_COLLECTED = 7939;

	/**
	 * Fairy Ring
	 */
	public static final int FAIR_RING_LAST_DESTINATION = 5374;
	public static final int FAIRY_RING_DIAL_ADCB = 3985; //Left dial
	public static final int FAIRY_RIGH_DIAL_ILJK = 3986; //Middle dial
	public static final int FAIRY_RING_DIAL_PSRQ = 3987; //Right dial

	/**
	 * Transmog controllers for farming
	 */
	public static final int FARMING_4771 = 4771;
	public static final int FARMING_4772 = 4772;
	public static final int FARMING_4773 = 4773;
	public static final int FARMING_4774 = 4774;
	public static final int FARMING_4775 = 4775;
	public static final int FARMING_7904 = 7904;
	public static final int FARMING_7905 = 7905;
	public static final int FARMING_7906 = 7906;
	public static final int FARMING_7907 = 7907;
	public static final int FARMING_7908 = 7908;
	public static final int FARMING_7909 = 7909;
	public static final int FARMING_7910 = 7910;
	public static final int FARMING_7911 = 7911;
	public static final int FARMING_7912 = 7912;

	/**
	 * Transmog controllers for grapes
	 */
	public static final int GRAPES_4953 = 4953;
	public static final int GRAPES_4954 = 4954;
	public static final int GRAPES_4955 = 4955;
	public static final int GRAPES_4956 = 4956;
	public static final int GRAPES_4957 = 4957;
	public static final int GRAPES_4958 = 4958;
	public static final int GRAPES_4959 = 4959;
	public static final int GRAPES_4960 = 4960;
	public static final int GRAPES_4961 = 4961;
	public static final int GRAPES_4962 = 4962;
	public static final int GRAPES_4963 = 4963;
	public static final int GRAPES_4964 = 4964;

	/**
	 * Automatically weed farming patches
	 */
	public static final int AUTOWEED = 5557;

	/**
	 * The varbit that stores the players {@code AccountType}.
	 */
	public static final int ACCOUNT_TYPE = 1777;

	/**
	 * The varbit that stores the oxygen percentage for player
	 */
	public static final int OXYGEN_LEVEL = 5811;

	/**
	 * Drift net status
	 * <p>
	 * Expected values
	 * 0 = Unset
	 * 1 = Set up
	 * 2 = Caught some fish
	 * 3 = Full
	 */
	public static final int NORTH_NET_STATUS = 5812;
	public static final int SOUTH_NET_STATUS = 5814;

	/**
	 * Drift net catch count
	 */
	public static final int NORTH_NET_CATCH_COUNT = 5813;
	public static final int SOUTH_NET_CATCH_COUNT = 5815;

	/**
	 * Drift net collect interface
	 * <p>
	 * Expected values:
	 * 0 = Not open
	 * 1 = North interface open
	 * 2 = South interface open
	 */
	public static final int DRIFT_NET_COLLECT = 5933;

	/**
	 * Corp beast damage
	 */
	public static final int CORP_DAMAGE = 999;

	/**
	 * Toggleable slayer unlocks
	 */
	public static final int SUPERIOR_ENABLED = 5362;
	public static final int FOSSIL_ISLAND_WYVERN_DISABLE = 6251;

	public static final int BANK_REARRANGE_MODE = 3959;
	public static final int CURRENT_BANK_TAB = 4150;

	public static final int WORLDHOPPER_FAVROITE_1 = 4597;
	public static final int WORLDHOPPER_FAVROITE_2 = 4598;

	/**
	 * Vengeance is active
	 */
	public static final int VENGEANCE_ACTIVE = 2450;

	/**
	 * Spell cooldowns
	 */
	public static final int VENGEANCE_COOLDOWN = 2451;
	public static final int CORRUPTION_COOLDOWN = 12288;

	/**
	 * Imbued Heart cooldown
	 * Number of game tick remaining on cooldown in intervals of 10; for a value X there are 10 * X game ticks remaining.
	 * The heart regains its power once this reaches 0.
	 */
	public static final int IMBUED_HEART_COOLDOWN = 5361;

	/**
	 * Amount of items in each bank tab
	 */
	public static final int BANK_TAB_ONE_COUNT = 4171;
	public static final int BANK_TAB_TWO_COUNT = 4172;
	public static final int BANK_TAB_THREE_COUNT = 4173;
	public static final int BANK_TAB_FOUR_COUNT = 4174;
	public static final int BANK_TAB_FIVE_COUNT = 4175;
	public static final int BANK_TAB_SIX_COUNT = 4176;
	public static final int BANK_TAB_SEVEN_COUNT = 4177;
	public static final int BANK_TAB_EIGHT_COUNT = 4178;
	public static final int BANK_TAB_NINE_COUNT = 4179;

	/**
	 * Type of GE offer currently being created
	 * 0 = buy
	 * 1 = sell
	 */
	public static final int GE_OFFER_CREATION_TYPE = 4397;

	/**
	 * The active tab within the quest interface
	 */
	public static final int QUEST_TAB = 8168;

	/**
	 * Explorer ring
	 */
	public static final int EXPLORER_RING_ALCHTYPE = 5398;
	public static final int EXPLORER_RING_TELEPORTS = 4552;
	public static final int EXPLORER_RING_ALCHS = 4554;
	public static final int EXPLORER_RING_RUNENERGY = 4553;

	public static final int WINTERTODT_TIMER = 7980;

	/**
	 * League relics
	 */
	public static final int LEAGUE_RELIC_1 = 10049;
	public static final int LEAGUE_RELIC_2 = 10050;
	public static final int LEAGUE_RELIC_3 = 10051;
	public static final int LEAGUE_RELIC_4 = 10052;
	public static final int LEAGUE_RELIC_5 = 10053;
	public static final int LEAGUE_RELIC_6 = 11696;

	/**
	 * Muted volume restore values
	 */
	public static final int MUTED_MUSIC_VOLUME = 9666;
	public static final int MUTED_SOUND_EFFECT_VOLUME = 9674;
	public static final int MUTED_AREA_EFFECT_VOLUME = 9675;

	/**
	 * Parasite infection status during nightmare of ashihama bossfight
	 * <p>
	 * 0 = not infected
	 * 1 = infected
	 */
	public static final int PARASITE = 10151;

	/**
	 * Whether the vanilla wiki entity lookup is displayed under the minimap
	 * <p>
	 * 0 = Enabled
	 * 1 = Disabled
	 */
	public static final int WIKI_ENTITY_LOOKUP = 10113;

	/**
	 * Whether the Special Attack orb is disabled due to being in a PvP area
	 * <p>
	 * 0 = Enabled =player is not in PvP)
	 * 1 = Disabled =player in in PvP)
	 *
	 * @see <a href="https://oldschool.runescape.wiki/w/Minimap#Special_attack_orb">The OSRS Wiki's Minimap page</a>
	 */
	public static final int PVP_SPEC_ORB = 8121;

	/**
	 * Collection Log notification settings whenever a new item is added
	 * <p>
	 * 0 = no notification
	 * 1 = chat notification only
	 * 2 = popup notification only
	 * 3 = chat and popup
	 */
	public static final int COLLECTION_LOG_NOTIFICATION = 11959;

	/**
	 * Combat Achievements popup settings whenever a new task is completed
	 * <p>
	 * 0 = popup notification enabled
	 * 1 = popup notification disabled
	 */
	public static final int COMBAT_ACHIEVEMENTS_POPUP = 12455;

	/**
	 * Show boss health overlay setting
	 * 0 = on
	 * 1 = off
	 */
	public static final int BOSS_HEALTH_OVERLAY = 12389;

	/**
	 * Whether the PVP kill-death stats widget should be drawn while in the wilderness or in PVP worlds.
	 * <p>
	 * 0 = Disabled
	 * 1 = Enabled
	 */
	public static final int SHOW_PVP_KDR_STATS = 4143;
}
